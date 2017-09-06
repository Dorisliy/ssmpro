package cn.ssm.project.service.impl;

import com.amazonaws.mws.model.GetReportListResponse;
import com.amazonaws.mws.model.ReportInfo;
import com.amazonservices.mws.finances._2015_05_01.MWSFinancesServiceAsyncClient;
import com.amazonservices.mws.finances._2015_05_01.MWSFinancesServiceClient;
import com.amazonservices.mws.finances._2015_05_01.model.*;
import com.amazonservices.mws.finances._2015_05_01.model.Currency;
import com.amazonservices.mws.finances._2015_05_01.samples.ListFinancialEvents;
import com.amazonservices.mws.finances._2015_05_01.samples.ListFinancialEventsByNextToken;
import com.amazonservices.mws.finances._2015_05_01.samples.MWSFinancesServiceSampleConfig;
import cn.ssm.project.mapper.*;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import cn.ssm.project.pojo.*;
import cn.ssm.project.service.ImportAmPaymentService;
import cn.ssm.project.utils.AmazonReportUtil;
import cn.ssm.project.utils.AmazonUtil;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2017/9/1 0001.
 */
@Service
public class ImportAmPaymentServiceImpl implements ImportAmPaymentService {
    @Autowired
    private AmazonImportConfigureMapper amazonImportConfigureMapper;
    @Autowired
    private AmazonImportPaymentLogMapper amazonImportPaymentLogMapper;
    @Autowired
    private AmazonOrderMapper amazonOrderMapper;
    @Autowired
    private AmazonPaymentMapper amazonPaymentMapper;
    @Autowired
    private BaAreaMapper baAreaMapper;

    private int m_Row_Org = 0;

    @Override
    public String downloadAmazonFinancialEventsByOrg(Timestamp startDate, Timestamp endDate, int orgID) {
        String result = "";

        if ((startDate == null || endDate == null)) {
            DateTime beforeYesterday = DateTime.now().minusDays(5);
            String strBeforeYesterday = beforeYesterday.toString("yyyy-MM-dd") + " 00:00:00";
            DateTime yesterday = DateTime.now().minusDays(4);
            String strYesterday = yesterday.toString("yyyy-MM-dd") + " 00:00:00";
            startDate = AmazonUtil.str2Timestamp(strBeforeYesterday, "yyyy-MM-dd HH:mm:ss");
            endDate = AmazonUtil.str2Timestamp(strYesterday, "yyyy-MM-dd HH:mm:ss");
        }

        List<AmazonImportConfigure> amazonImportConfigureArrayList = new ArrayList<AmazonImportConfigure>();
        AmazonImportConfigureExample example = new AmazonImportConfigureExample();
        AmazonImportConfigureExample.Criteria criteria = example.createCriteria();
        if (orgID != 0) {
            criteria.andOrgIdEqualTo(orgID);
        }
        criteria.andIsNonamazonIncludedEqualTo("Y");
        amazonImportConfigureArrayList = amazonImportConfigureMapper.selectByExample(example);

        if (amazonImportConfigureArrayList != null && amazonImportConfigureArrayList.size() > 0) {
            for (AmazonImportConfigure configure : amazonImportConfigureArrayList) {
                result = downloadAmazonPayment(startDate, endDate, configure);

//                runHistoryFailRecord(configure);
            }
        }
        result = result + "\nfinish importPayment";
        System.out.println(result);
        return result;
    }

    /**
     * @param startDate
     * @param endDate
     * @return
     */
    public String downloadAmazonPayment(Timestamp startDate, Timestamp endDate, AmazonImportConfigure configure) {
        String result = "";
        try {
            result = runDownloadData(configure, startDate, endDate, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public String runDownloadData(AmazonImportConfigure configure, Timestamp timeStartDate, Timestamp timeEndDate, AmazonImportPaymentLog historyLog) {
//        String sellerId = configure.getMwsSellerId();
//        Integer maxResultsPerPage = null;
//        String amazonOrderId = null;//S01-2917912-0633335";//"103-2308211-8796246";//null;
//        String financialEventGroupId = null;
        boolean isProcessSuccess = true;

        if (historyLog == null) {
            historyLog = saveImportPaymentHistory(configure, timeStartDate, timeEndDate);
        }

        MWSFinancesServiceSampleConfig config = new MWSFinancesServiceSampleConfig();
        config.setAccessKey(configure.getMwsAccessKey());
        config.setSecretKey(configure.getMwsSecretKey());
        config.setAppName(AmazonUtil.MWS_APP_NAME);
        config.setAppVersion(AmazonUtil.MWS_APP_VERSION);
        config.setServiceURL(configure.getUrl());
        MWSFinancesServiceAsyncClient client = config.getAsyncClient();

        int daysBetween = 0;
        try {
            daysBetween = AmazonUtil.daysBetween(timeStartDate, timeEndDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Timestamp timeStartDate_Day = null;
        Timestamp timeEndDate_Day = null;
        for (int i = 0; i < daysBetween; i++) {//为了提供性能分每天抓取数据
            timeStartDate_Day = AmazonUtil.addDay(timeStartDate, i);
            if ((i + 1) == daysBetween) {
                timeEndDate_Day = timeEndDate;
            } else {
                timeEndDate_Day = AmazonUtil.addDay(timeStartDate, (i + 1));
            }
            isProcessSuccess = runListFinancialEvents(client, configure, null, null, null, timeStartDate_Day, timeEndDate_Day, historyLog);
            if (!isProcessSuccess) {
//                m_Trx.rollback();
                historyLog.setTotalImportNum(BigDecimal.ZERO);
                amazonImportPaymentLogMapper.updateByPrimaryKey(historyLog);
                return "fail";
            }
        }
        historyLog.setTotalImportNum(new BigDecimal(m_Row_Org));
        amazonImportPaymentLogMapper.updateByPrimaryKey(historyLog);
//        m_Trx.commit();
        isProcessSuccess = runReport(configure, timeStartDate, timeEndDate, historyLog);//报告不需要分每天处理
        return "success";
    }

    public boolean runListFinancialEvents(MWSFinancesServiceClient client, AmazonImportConfigure configure, Integer maxResultsPerPage, String amazonOrderId, String financialEventGroupId,
                                          Timestamp timeStartDate, Timestamp timeEndDate, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        XMLGregorianCalendar postedAfter = null;
        XMLGregorianCalendar postedBefore = null;
        if (timeStartDate != null) {
            Calendar localTime = Calendar.getInstance();
            localTime.setTimeInMillis(timeStartDate.getTime());
            postedAfter = AmazonUtil.long2Gregorian(AmazonUtil.convertCNTimeToGMT(localTime).getTime());
        }
        if (timeEndDate != null) {
            Calendar localTime = Calendar.getInstance();
            localTime.setTimeInMillis(timeEndDate.getTime());
            postedBefore = AmazonUtil.long2Gregorian(AmazonUtil.convertCNTimeToGMT(localTime).getTime());
        }

        String sellerId = configure.getMwsSellerId();
        ListFinancialEventsResponse listFinancialEventsResponse = ListFinancialEvents.runListFinancialEvents(client, sellerId, maxResultsPerPage, amazonOrderId, financialEventGroupId, postedAfter, postedBefore);
        if (listFinancialEventsResponse != null) {
            ListFinancialEventsResult listFinancialEventsResult = listFinancialEventsResponse.getListFinancialEventsResult();
            String strNextToken = listFinancialEventsResult.getNextToken();
            FinancialEvents financialEvents = listFinancialEventsResult.getFinancialEvents();

            if (financialEvents != null) {
                isProcessSuccess = processFinancialEvents(financialEvents, historyLog);
            }

            if (isProcessSuccess && strNextToken != null) {//下页
                isProcessSuccess = runListFinancialEventsByNextToken(client, configure, strNextToken, historyLog);//递归调用
            }
        } else {//发送请求失败
            isProcessSuccess = false;
        }
        return isProcessSuccess;
    }

    public boolean runListFinancialEventsByNextToken(MWSFinancesServiceClient client, AmazonImportConfigure configure, String strNextToken, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        String sellerId = configure.getMwsSellerId();
        ListFinancialEventsByNextTokenResponse nextTokenResponse = null;
        nextTokenResponse = ListFinancialEventsByNextToken.runListFinancialEventsByNextToken(client, sellerId, strNextToken);
        if (nextTokenResponse != null) {
            ListFinancialEventsByNextTokenResult listFinancialEventsByNextTokenResult = nextTokenResponse.getListFinancialEventsByNextTokenResult();
            strNextToken = listFinancialEventsByNextTokenResult.getNextToken();
            FinancialEvents financialEvents = listFinancialEventsByNextTokenResult.getFinancialEvents();
            if (financialEvents != null) {//
                isProcessSuccess = processFinancialEvents(financialEvents, historyLog);
            }

            if (isProcessSuccess && strNextToken != null) {//下页
                isProcessSuccess = runListFinancialEventsByNextToken(client, configure, strNextToken, historyLog);//递归调用
            }
        } else {//发送下页请求失败
            isProcessSuccess = false;
        }
        return isProcessSuccess;
    }

    /************************************  报告方式抓取费用  *****************************************/
    public boolean runReport(AmazonImportConfigure configure, Timestamp timeStartDate, Timestamp timeEndDate, AmazonImportPaymentLog historyLog) {
        m_Row_Org = 0;
        boolean isProcessSuccess = true;
        ////1. requetReport - submit request
        AmazonReportUtil amazonReportUtil = new AmazonReportUtil(configure);
        amazonReportUtil.setStrReportType(AmazonUtil.MWS_REPORT_SETTLEMENT_REPORT_DATA_XML);//制表符分隔的文本文件。报告内容接近实时更新。仅针对亚马逊物流卖家。针对商城和卖家平台卖家。
        amazonReportUtil.setTimeStartDate(timeStartDate);
        amazonReportUtil.setTimeEndDate(timeEndDate);

        ////1. getReportRequestList  - check status
        GetReportListResponse getReportListResponse = AmazonReportUtil.runGetReportList(amazonReportUtil);

        if (getReportListResponse != null) {
            List<ReportInfo> reportInfo_List = getReportListResponse.getGetReportListResult().getReportInfoList();
            if (reportInfo_List != null && reportInfo_List.size() > 0) {
                String strReportFileName = null;
                String strGeneratedReportID = null;
                BaArea baArea = baAreaMapper.selectByPrimaryKey(configure.getOrgId());
                for (ReportInfo reportInfo : reportInfo_List) {
                    amazonReportUtil.setStrGeneratedReportId(reportInfo.getReportId());
                    amazonReportUtil.setStrReportFileName(AmazonUtil.setReportFileName(amazonReportUtil.getTimeStartDate().toString(), amazonReportUtil.getTimesEndDate().toString(), amazonReportUtil.getStrReportType(), baArea.getCode()));
                    if (amazonReportUtil.getStrGeneratedReportId() != null) {
                        if (strGeneratedReportID != null) {
                            strGeneratedReportID += (";" + amazonReportUtil.getStrGeneratedReportId());
                        } else {
                            strGeneratedReportID = amazonReportUtil.getStrGeneratedReportId();
                        }
                        ////3. GetReport(GeneratedReportId)
                        boolean isGetReportFile = AmazonReportUtil.runGetReport(amazonReportUtil);
                        if (isGetReportFile) {
                            isProcessSuccess = ImportPaymentToDB(configure, historyLog, amazonReportUtil.getStrReportFileName());
                            if (!isProcessSuccess) {
                                strReportFileName = null;
                                break;
                            }
                            if (strReportFileName != null) {
                                strReportFileName += (";" + amazonReportUtil.getStrReportFileName());
                            } else {
                                strReportFileName = amazonReportUtil.getStrReportFileName();
                            }
                        } else {
                            isProcessSuccess = false;
                            strReportFileName = null;
                            break;
                        }
                    }
                }
                if (isProcessSuccess) {
                    historyLog.setTotalImportNum(historyLog.getTotalImportNum().add(new BigDecimal(m_Row_Org)));
//                    m_Trx.commit();
                } else {
                    strReportFileName = null;
//                    m_Trx.rollback();
                }
                historyLog.setGeneratedReportId(strGeneratedReportID);
                historyLog.setReportFilename(strReportFileName);
                amazonImportPaymentLogMapper.updateByPrimaryKey(historyLog);
            }
        }
        return isProcessSuccess;
    }

    public boolean ImportPaymentToDB(AmazonImportConfigure configure, AmazonImportPaymentLog historyLog, String strFilePath) {
        boolean isProcessSuccess = true;
        if (strFilePath == null) {
            return false;
        }
        // save order to temp table: amazon_order as text, and same time save to c_order
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        Document doc = null;
        int totalMessage = 0, totalSettlementReport = 0, successNo = 0, failNo = 0;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            File reportFile = new File(strFilePath);
            if (!reportFile.exists()) {
                System.out.println("ReportFile warning Report File can't open: " + historyLog.getReportFilename());
                return false;
            }

            if (configure.getOrgId() == 1000004) {//英国 出现EUR币别需要处理
                StringBuffer strBuffer = new StringBuffer();
                FileInputStream fileIn = new FileInputStream(reportFile);
                byte[] buf = new byte[1024];
                int len = 0;
                while ((len = fileIn.read(buf)) > 0) {
                    String str = new String(buf, 0, len);
                    strBuffer.append(str);
                }
                if (strBuffer.toString().contains("currency=\"EUR\"")) {
                    return isProcessSuccess;
                }
                fileIn.close();
                strBuffer = null;
                fileIn = null;
            }

            if (configure.getOrgId() == 1000005) {//日本
                StringBuffer strBuffer = new StringBuffer();
                FileInputStream fileIn = new FileInputStream(reportFile);
                byte[] buf = new byte[1024];
                int len = 0;
                while ((len = fileIn.read(buf)) > 0) {
                    String str = new String(buf, 0, len);
                    strBuffer.append(str);
                }
                ByteArrayInputStream stream = new ByteArrayInputStream((strBuffer.toString().replace("UTF-8", "ISO-8859-1")).getBytes("UTF-8"));
                doc = dBuilder.parse(stream);
                fileIn.close();
                fileIn = null;
            } else {
                doc = dBuilder.parse(reportFile);
            }

            doc.getDocumentElement().normalize();

            NodeList messageXMLList = doc.getElementsByTagName("Message");
            if (messageXMLList == null || messageXMLList.getLength() == 0) {
                System.out.println("there is no Message in the xml file.");
                return false;
            }

            totalMessage = messageXMLList.getLength();
            for (int i = 0; i < totalMessage; i++) {
                Element messageXML = (Element) messageXMLList.item(i);
                NodeList settlementReport_List = messageXML.getElementsByTagName("SettlementReport");
                if (settlementReport_List == null || settlementReport_List.getLength() == 0) {
                    System.out.println("there is no Settlement Report in the xml file.");
                    return false;
                }
                totalSettlementReport = settlementReport_List.getLength();
                for (int j = 0; j < totalSettlementReport; j++) {
                    Element settlementReportXML = (Element) settlementReport_List.item(j);

                    NodeList childNodes_SettlementReport = settlementReportXML.getChildNodes();
                    if (childNodes_SettlementReport == null || childNodes_SettlementReport.getLength() == 0) {
                        System.out.println("there is no Settlement Report is Child Node in the xml file.");
                        return false;
                    }

                    int row_ChildNodes = childNodes_SettlementReport.getLength();
                    for (int g = 0; g < row_ChildNodes; g++) {
                        Node childNodesXML = childNodes_SettlementReport.item(g);
                        String strNodeName = childNodesXML.getNodeName();
                        if (strNodeName != null && !strNodeName.equalsIgnoreCase("#text")) {
                            processChildNodes(childNodesXML, historyLog);
                        }
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            isProcessSuccess = false;
            e.printStackTrace();
        } catch (SAXException e) {
            isProcessSuccess = false;
            e.printStackTrace();
        } catch (IOException e) {
            isProcessSuccess = false;
            e.printStackTrace();
        } catch (Exception e) {
            isProcessSuccess = false;
            e.printStackTrace();
        }

        return isProcessSuccess;
    }

    public boolean processChildNodes(Node childNodesXML, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        if (childNodesXML == null) {
            return isProcessSuccess;
        }
        if (childNodesXML.getNodeName().equalsIgnoreCase("SettlementData")) {

        } else if (childNodesXML.getNodeName().equalsIgnoreCase("Order")) {

        } else if (childNodesXML.getNodeName().equalsIgnoreCase("Refund")) {

        } else if (childNodesXML.getNodeName().equalsIgnoreCase("OtherTransaction")) {
            isProcessSuccess = processOtherTransaction((Element) childNodesXML, historyLog);
        } else if (childNodesXML.getNodeName().equalsIgnoreCase("SellerDealPayment")) {
            isProcessSuccess = processSellerDealPayment((Element) childNodesXML, historyLog);
        } else if (childNodesXML.getNodeName().equalsIgnoreCase("AdvertisingTransactionDetails")) {
            isProcessSuccess = processAdvertisingTransactionDetails((Element) childNodesXML, historyLog);
        } else {
            System.out.println("**************childNodesXML.getTagName()==" + childNodesXML.getNodeName());
        }
        return isProcessSuccess;
    }

    public boolean processOtherTransaction(Element childNodesXML, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        if (childNodesXML == null) {
            return isProcessSuccess;
        }
        String strType = "Adjustment";
        String strAmazonOrderID = getValuetByTagName_Element(childNodesXML, "AmazonOrderID");
        String strTransactionType = getValuetByTagName_Element(childNodesXML, "TransactionType");
        String strTransactionID = getValuetByTagName_Element(childNodesXML, "TransactionID");
        String strPostedDate = getValuetByTagName_Element(childNodesXML, "PostedDate");
        String strAmount = getValuetByTagName_Element(childNodesXML, "Amount");
        String strDescription = strTransactionType;
        Timestamp Date_Time = new Timestamp(historyLog.getRequestTimestamp().getTime());
        BigDecimal amountTotal = BigDecimal.ZERO;
        BigDecimal amountOthe = BigDecimal.ZERO;

        if (strTransactionType != null && strTransactionType.equalsIgnoreCase("BuyerRecharge")) {
            strType = "Adjustment";
        } else if (strTransactionType != null && strTransactionType.equalsIgnoreCase("INCORRECT_FEES_NON_ITEMIZED")) {
            strType = "Adjustment";
            strDescription = "FBA Inventory Reimbursement - Fee Correction";
        } else if (strTransactionType != null && strTransactionType.contains("INCORRECT_FEES_NON_ITEMIZED")) {
            strType = "Adjustment";
            strDescription = "FBA Inventory Reimbursement - Fee Correction";
        } else if (strTransactionType != null && strTransactionType.contains("Subscription")) {
            strType = "Service Fee";
            strDescription = strTransactionType;
        } else if (strTransactionType != null && strTransactionType.contains("Storage Fee")) {
            strType = "FBA Inventory Fee";
            strDescription = strTransactionType;
        } else if (strTransactionType != null && strTransactionType.contains("RemovalComplete")) {
            strType = "FBA Inventory Fee";
            strDescription = "FBA Return Fee";
        } else {
            return isProcessSuccess;
        }

        if (strPostedDate != null) {
            try {
                Date_Time = AmazonUtil.receiptTimeStr2TimeStamp(strPostedDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (strAmount != null) {
            amountOthe = new BigDecimal(strAmount);
        }
        amountTotal = amountOthe;

        HashMap<String, Object> map_ValueOfColumn = new HashMap();
        map_ValueOfColumn.put("Date_Time", Date_Time);
        map_ValueOfColumn.put("Order_Id", strAmazonOrderID);
        map_ValueOfColumn.put("Type", strType);
        map_ValueOfColumn.put("Description", strDescription);
        map_ValueOfColumn.put("Other", amountOthe);
        map_ValueOfColumn.put("Total", amountTotal);
        isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);

        return isProcessSuccess;
    }

    public boolean processSellerDealPayment(Element childNodesXML, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        if (childNodesXML == null) {
            return isProcessSuccess;
        }

        String strPostedDate = getValuetByTagName_Element(childNodesXML, "PostedDate");
        String strTransactionType = getValuetByTagName_Element(childNodesXML, "TransactionType");
        String strPaymentReason = getValuetByTagName_Element(childNodesXML, "PaymentReason");
        String strDealDescription = getValuetByTagName_Element(childNodesXML, "DealDescription");
        String strDealID = getValuetByTagName_Element(childNodesXML, "DealID");
        String strMarketplaceName = getValuetByTagName_Element(childNodesXML, "MarketplaceName");


        String strType_DealFee = null;
        String strAmount_DealFee = "0";
        if (childNodesXML.getElementsByTagName("DealFee") != null && childNodesXML.getElementsByTagName("DealFee").getLength() > 0) {
            Element elementDealFee = (Element) childNodesXML.getElementsByTagName("DealFee").item(0);
            strType_DealFee = getValuetByTagName_Element(elementDealFee, "Type");
            strAmount_DealFee = getValuetByTagName_Element(elementDealFee, "Amount");
        }

        Timestamp Date_Time = new Timestamp(historyLog.getRequestTimestamp().getTime());
        String strDescription = strTransactionType;
        String Type = "Lightning Deal Fee";
        BigDecimal amountTotal = BigDecimal.ZERO;
        BigDecimal other_Transaction_Fees = BigDecimal.ZERO;
        if (strPostedDate != null) {
            try {
                Date_Time = AmazonUtil.receiptTimeStr2TimeStamp(strPostedDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (strAmount_DealFee != null) {
            other_Transaction_Fees = new BigDecimal(strAmount_DealFee);
        }
        amountTotal = other_Transaction_Fees;

        HashMap<String, Object> map_ValueOfColumn = new HashMap();
        map_ValueOfColumn.put("Date_Time", Date_Time);
        map_ValueOfColumn.put("Type", Type);
        map_ValueOfColumn.put("Description", strDescription);
        map_ValueOfColumn.put("MarketPlace", strMarketplaceName);
        map_ValueOfColumn.put("Other_Transaction_Fees", other_Transaction_Fees);
        map_ValueOfColumn.put("Total", amountTotal);
        isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
        return isProcessSuccess;
    }

    public boolean processAdvertisingTransactionDetails(Element childNodesXML, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        if (childNodesXML == null) {
            return isProcessSuccess;
        }

        String strTransactionType = getValuetByTagName_Element(childNodesXML, "TransactionType");
        String strPostedDate = getValuetByTagName_Element(childNodesXML, "PostedDate");
        String strInvoiceId = getValuetByTagName_Element(childNodesXML, "InvoiceId");
        String strBaseAmount = getValuetByTagName_Element(childNodesXML, "BaseAmount");
        String strTransactionAmount = getValuetByTagName_Element(childNodesXML, "TransactionAmount");

        Timestamp Date_Time = new Timestamp(historyLog.getRequestTimestamp().getTime());
        String strDescription = strTransactionType;
        String Type = "Service Fee";
        BigDecimal amountTotal = BigDecimal.ZERO;
        BigDecimal amountOther = BigDecimal.ZERO;
        BigDecimal other_Transaction_Fees = BigDecimal.ZERO;
        if (strPostedDate != null) {
            try {
                Date_Time = AmazonUtil.receiptTimeStr2TimeStamp(strPostedDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (strTransactionAmount != null && strTransactionType != null) {
            if (strTransactionType.contains("Subscription")) {
                amountOther = new BigDecimal(strTransactionAmount);
            } else {
                other_Transaction_Fees = new BigDecimal(strTransactionAmount);
            }
        }
        amountTotal = amountOther.add(other_Transaction_Fees);

        HashMap<String, Object> map_ValueOfColumn = new HashMap();
        map_ValueOfColumn.put("Date_Time", Date_Time);
        map_ValueOfColumn.put("Type", Type);
        map_ValueOfColumn.put("Description", strDescription);
        map_ValueOfColumn.put("Other_Transaction_Fees", other_Transaction_Fees);
        map_ValueOfColumn.put("Other", amountOther);
        map_ValueOfColumn.put("Total", amountTotal);
        isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
        return isProcessSuccess;
    }

    public String getValuetByTagName_Element(Element childNodesXML, String strTagName) {
        String strValue = null;
        NodeList nodeList = childNodesXML.getElementsByTagName(strTagName);
        if (nodeList != null && nodeList.getLength() > 0) {
            strValue = nodeList.item(0).getTextContent();
        }
        return strValue;
    }

    public boolean processFinancialEvents(FinancialEvents financialEvents, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        List<AdjustmentEvent> list_AdjustmentEvent = financialEvents.getAdjustmentEventList();//调整帐户。   OK
        if (list_AdjustmentEvent != null && list_AdjustmentEvent.size() > 0) {
            processFinancialEvents_AdjustmentEventList(list_AdjustmentEvent, historyLog);
        }

        List<ShipmentEvent> list_ShipmentEvent_Chargeback = financialEvents.getChargebackEventList();//扣费
        if (list_ShipmentEvent_Chargeback != null && list_ShipmentEvent_Chargeback.size() > 0) {
            isProcessSuccess = processFinancialEvents_ChargebackEventList(list_ShipmentEvent_Chargeback, historyLog);
        }

        if (isProcessSuccess) {
            List<DebtRecoveryEvent> list_DebtRecoveryEvent = financialEvents.getDebtRecoveryEventList();//债务偿还或债务调整。
            if (list_DebtRecoveryEvent != null && list_DebtRecoveryEvent.size() > 0) {
                isProcessSuccess = processFinancialEvents_DebtRecoveryEventList(list_DebtRecoveryEvent, historyLog);
            }
        }

        if (isProcessSuccess) {
            List<ShipmentEvent> list_ShipmentEvent_GuaranteeClaim = financialEvents.getGuaranteeClaimEventList();//担保索赔
            if (list_ShipmentEvent_GuaranteeClaim != null && list_ShipmentEvent_GuaranteeClaim.size() > 0) {
                isProcessSuccess = processFinancialEvents_GuaranteeClaimEventList(list_ShipmentEvent_GuaranteeClaim, historyLog);
            }
        }

        if (isProcessSuccess) {
            List<LoanServicingEvent> list_LoanServicingEvent = financialEvents.getLoanServicingEventList();//贷款预付、贷款付款或贷款退款。
            if (list_LoanServicingEvent != null && list_LoanServicingEvent.size() > 0) {
                isProcessSuccess = processFinancialEvents_LoanServicingEventList(list_LoanServicingEvent, historyLog);
            }
        }

        if (isProcessSuccess) {
            List<PayWithAmazonEvent> list_PayWithAmazonEvent = financialEvents.getPayWithAmazonEventList();//与您的支付有关的事件与亚马逊帐户。
            if (list_PayWithAmazonEvent != null && list_PayWithAmazonEvent.size() > 0) {
                isProcessSuccess = processFinancialEvents_PayWithAmazonEventList(list_PayWithAmazonEvent, historyLog);
            }
        }

        if (isProcessSuccess) {
            List<PerformanceBondRefundEvent> list_PerformanceBondRefundEvent = financialEvents.getPerformanceBondRefundEventList();//退还卖方履约保证金，发出时，在中国的卖方停止在某些类别的销售。
            if (list_PerformanceBondRefundEvent != null && list_PerformanceBondRefundEvent.size() > 0) {
                isProcessSuccess = processFinancialEvents_PerformanceBondRefundEventList(list_PerformanceBondRefundEvent, historyLog);
            }
        }

        if (isProcessSuccess) {
            List<ShipmentEvent> list_ShipmentEvent_Refund = financialEvents.getRefundEventList();//退款   OK
            if (list_ShipmentEvent_Refund != null && list_ShipmentEvent_Refund.size() > 0) {
                isProcessSuccess = processFinancialEvents_RefundEventList(list_ShipmentEvent_Refund, historyLog);
            }
        }

        if (isProcessSuccess) {
            List<RentalTransactionEvent> list_RentalTransactionEvent = financialEvents.getRentalTransactionEventList();//与租赁交易有关的事件。
            if (list_RentalTransactionEvent != null && list_RentalTransactionEvent.size() > 0) {
                isProcessSuccess = processFinancialEvents_RentalTransactionEventList(list_RentalTransactionEvent, historyLog);
            }
        }

        if (isProcessSuccess) {
            List<RetrochargeEvent> list_RetrochargeEvent = financialEvents.getRetrochargeEventList();//  OK
            if (list_RetrochargeEvent != null && list_RetrochargeEvent.size() > 0) {
                isProcessSuccess = processFinancialEvents_RetrochargeEventList(list_RetrochargeEvent, historyLog);
            }
        }

        if (isProcessSuccess) {
            List<ServiceFeeEvent> list_ServiceFeeEvent = financialEvents.getServiceFeeEventList();//你的帐户上的服务费。
            if (list_ServiceFeeEvent != null && list_ServiceFeeEvent.size() > 0) {
                isProcessSuccess = processFinancialEvents_ServiceFeeEventList(list_ServiceFeeEvent, historyLog);
            }
        }

        if (isProcessSuccess) {
            List<ShipmentEvent> list_ShipmentEvent = financialEvents.getShipmentEventList();//货、退款，担保索赔，或退款。  OK
            if (list_ShipmentEvent != null && list_ShipmentEvent.size() > 0) {
                isProcessSuccess = processFinancialEvents_ShipmentEventList(list_ShipmentEvent, historyLog);
            }
        }

//        if (isProcessSuccess) {//无金额处理
//            List<SolutionProviderCreditEvent> list_SolutionProviderCreditEvent = financialEvents.getServiceProviderCreditEventList();//提供给解决方案提供者的信用。
//            if (list_SolutionProviderCreditEvent != null && list_SolutionProviderCreditEvent.size() > 0) {
//                processFinancialEvents_ServiceProviderCreditEventList(list_SolutionProviderCreditEvent, historyLog);
//            }
//        }

        return isProcessSuccess;
    }

    /***
     *
     * @param historyLog
     * @param map_ValueOfColumn:
     * Timestamp Date_Time, String Settlement_Id, String Type, String Order_Id, String SKU, String Description, BigDecimal Quantity, String MarketPlace, String FulFillment,
     * String Order_City, String Order_State, String Order_Postal, BigDecimal Product_Sales, BigDecimal Shipping_Credits,
     * BigDecimal Gift_Wrap_Credits, BigDecimal Promotional_Rebates,BigDecimal Sales_Tax_Collected, BigDecimal Selling_Fees, BigDecimal Fba_Fees, BigDecimal Other_Transaction_Fees,
     * BigDecimal Other, BigDecimal Total
     * @return
     */
    public boolean processShipmentItemList(List<ShipmentItem> ShipmentItem_List, AmazonImportPaymentLog historyLog, HashMap<String, Object> map_ValueOfColumn) {
        boolean isProcessSuccess = true;
        String strSellerSKU = null;
        String strOrderItemId = null;
        Integer quantity = null;
        BigDecimal amountOther = null;
        BigDecimal amountTotal = null;
        if (ShipmentItem_List != null) {
            for (ShipmentItem shipmentItem : ShipmentItem_List) {
                strSellerSKU = shipmentItem.getSellerSKU();
                strOrderItemId = shipmentItem.getOrderItemId();
                shipmentItem.getOrderAdjustmentItemId();
                quantity = shipmentItem.getQuantityShipped();
                amountOther = BigDecimal.ZERO;
                amountTotal = BigDecimal.ZERO;

                map_ValueOfColumn.put("SKU", strSellerSKU);
                map_ValueOfColumn.put("Settlement_Id", strOrderItemId);
                if (quantity != null) {
                    map_ValueOfColumn.put("Quantity", new BigDecimal(quantity.intValue()));
                }

                List<ChargeComponent> itemChargeList = shipmentItem.getItemChargeList();
                BigDecimal total_ItemChargeList = getBigDecimal_ChargeComponentList(itemChargeList);
                amountOther = amountOther.add(total_ItemChargeList);

                List<ChargeComponent> itemChargeAdjustmentList = shipmentItem.getItemChargeAdjustmentList();
                BigDecimal total_ItemChargeAdjustmentList = getBigDecimal_ChargeComponentList(itemChargeAdjustmentList);
                amountOther = amountOther.add(total_ItemChargeAdjustmentList);

                List<FeeComponent> itemFeeList = shipmentItem.getItemFeeList();
                BigDecimal total_ItemFeeList = getBigDecimal_FeeComponentList(itemFeeList);
                amountOther = amountOther.add(total_ItemFeeList);

                List<FeeComponent> itemFeeAdjustmentList = shipmentItem.getItemFeeAdjustmentList();
                BigDecimal total_ItemFeeAdjustmentList = getBigDecimal_FeeComponentList(itemFeeAdjustmentList);
                amountOther = amountOther.add(total_ItemFeeAdjustmentList);

                List<Promotion> promotionList = shipmentItem.getPromotionList();
                BigDecimal total_PromotionList = getBigDecimal_PromotionList(promotionList);
                amountOther = amountOther.add(total_PromotionList);

                List<Promotion> promotionAdjustmentList = shipmentItem.getPromotionAdjustmentList();
                BigDecimal total_PromotionAdjustmentList = getBigDecimal_PromotionList(promotionAdjustmentList);
                amountOther = amountOther.add(total_PromotionAdjustmentList);

                Currency costOfPointsGranted = shipmentItem.getCostOfPointsGranted();
                if (costOfPointsGranted != null) {
                    amountOther = amountOther.add(costOfPointsGranted.getCurrencyAmount());
                }

                Currency costOfPointsReturned = shipmentItem.getCostOfPointsReturned();
                if (costOfPointsReturned != null) {
                    amountOther = amountOther.add(costOfPointsReturned.getCurrencyAmount());
                }

                amountTotal = amountOther;
                map_ValueOfColumn.put("Other", amountOther);
                map_ValueOfColumn.put("Total", amountTotal);
                isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
                if (!isProcessSuccess) {
                    return isProcessSuccess;
                }
            }
        }
        return isProcessSuccess;
    }//End ShipmentItem


    //Start LoanServicingEventList
    public boolean processFinancialEvents_LoanServicingEventList(List<LoanServicingEvent> list_LoanServicingEvent, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        String strDescription = null;
        String Type = "Transfer";
        Currency currency = null;
        BigDecimal amountTotal = null;
        BigDecimal amountOther = null;
        HashMap<String, Object> map_ValueOfColumn = new HashMap();
        map_ValueOfColumn.put("Date_Time", historyLog.getRequestTimestamp());
        map_ValueOfColumn.put("Type", Type);
        for (LoanServicingEvent loanServicingEvent : list_LoanServicingEvent) {
            amountOther = BigDecimal.ZERO;
            amountTotal = BigDecimal.ZERO;
            strDescription = loanServicingEvent.getSourceBusinessEventType();
            currency = loanServicingEvent.getLoanAmount();
            if (currency != null) {
                amountOther = currency.getCurrencyAmount();
            }
            amountTotal = amountOther;
            map_ValueOfColumn.put("Description", strDescription);
            map_ValueOfColumn.put("Other", amountOther);
            map_ValueOfColumn.put("Total", amountTotal);

            isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
            if (!isProcessSuccess) {
                return isProcessSuccess;
            }
        }
        return isProcessSuccess;
    }
    //End LoanServicingEventList

    //PayWithAmazonEventList
    public boolean processFinancialEvents_PayWithAmazonEventList(List<PayWithAmazonEvent> list_PayWithAmazonEvent, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        String strSellerOrderId = null;
        String strDescription = null;
        String strAmountDescription = null;
        String strPaymentAmountType = null;
        XMLGregorianCalendar transactionPostedDate = null;
        String Type = "PayWithAmazonEventList";
        BigDecimal amountTotal = null;
        BigDecimal amountOther = null;
        HashMap<String, Object> map_ValueOfColumn = new HashMap();
        map_ValueOfColumn.put("Date_Time", historyLog.getRequestTimestamp());
        map_ValueOfColumn.put("Type", Type);
        for (PayWithAmazonEvent payWithAmazonEvent : list_PayWithAmazonEvent) {
            strSellerOrderId = payWithAmazonEvent.getSellerOrderId();
            transactionPostedDate = payWithAmazonEvent.getTransactionPostedDate();
            payWithAmazonEvent.getBusinessObjectType();
            payWithAmazonEvent.getSalesChannel();
            strPaymentAmountType = payWithAmazonEvent.getPaymentAmountType();
            strAmountDescription = payWithAmazonEvent.getAmountDescription();
            payWithAmazonEvent.getFulfillmentChannel();
            payWithAmazonEvent.getStoreName();

            amountTotal = BigDecimal.ZERO;
            amountOther = BigDecimal.ZERO;

            strDescription = strPaymentAmountType;
            if (strAmountDescription != null) {
                strDescription = (strDescription != null ? (strDescription + ": " + strAmountDescription) : strAmountDescription);
            }
            map_ValueOfColumn.put("Order_Id", strSellerOrderId);
            map_ValueOfColumn.put("Description", strDescription);
            if (transactionPostedDate != null) {
                Timestamp Date_Time = new Timestamp(AmazonUtil.convertGMTToCNTime(transactionPostedDate.toGregorianCalendar()).getTime().getTime());
                map_ValueOfColumn.put("Date_Time", Date_Time);
            }

            ChargeComponent chargeComponent = payWithAmazonEvent.getCharge();
            if (chargeComponent != null) {
                chargeComponent.getChargeType();
                chargeComponent.getChargeAmount();
                amountOther = amountOther.add(chargeComponent.getChargeAmount().getCurrencyAmount());
            }

            List<FeeComponent> feeList = payWithAmazonEvent.getFeeList();
            BigDecimal total_FeeList = getBigDecimal_FeeComponentList(feeList);
            amountOther = amountOther.add(total_FeeList);
            amountTotal = amountOther;

            map_ValueOfColumn.put("Other", amountOther);
            map_ValueOfColumn.put("Total", amountTotal);

            isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
            if (!isProcessSuccess) {
                return isProcessSuccess;
            }
        }
        return isProcessSuccess;
    }

    public boolean processFinancialEvents_PerformanceBondRefundEventList(List<PerformanceBondRefundEvent> list_PerformanceBondRefundEvent, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        String strDescription = null;
        String Type = "PerformanceBondRefundEventList";
        BigDecimal amountTotal = null;
        BigDecimal amountOther = null;
        Currency amount = null;
        BigDecimal currencyAmount = null;
        String strMarketplaceCountryCode = null;
        HashMap<String, Object> map_ValueOfColumn = new HashMap();
        map_ValueOfColumn.put("Date_Time", historyLog.getRequestTimestamp());
        map_ValueOfColumn.put("Type", Type);
        for (PerformanceBondRefundEvent performanceBondRefundEvent : list_PerformanceBondRefundEvent) {
            amountTotal = BigDecimal.ZERO;
            amountOther = BigDecimal.ZERO;

            strDescription = performanceBondRefundEvent.getMarketplaceCountryCode();
            List<String> productGroupList = performanceBondRefundEvent.getProductGroupList();
            if (productGroupList != null) {
                if (strDescription == null) {
                    strDescription = "";
                } else {
                    strDescription += ":";
                }
                for (String productGroup : productGroupList) {
                    strDescription += productGroup + ";";
                }
            }
            amount = performanceBondRefundEvent.getAmount();
            if (amount != null) {
                currencyAmount = amount.getCurrencyAmount();
                amountOther = currencyAmount;
            }
            amountTotal = amountOther;

            map_ValueOfColumn.put("Description", strDescription);
            map_ValueOfColumn.put("Other", amountOther);
            map_ValueOfColumn.put("Total", amountTotal);

            isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
            if (!isProcessSuccess) {
                return isProcessSuccess;
            }
        }
        return isProcessSuccess;
    }

    public boolean processFinancialEvents_RefundEventList(List<ShipmentEvent> list_ShipmentEvent_Refund, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        String Type = "Refund";
        BigDecimal amountTotal = null;
        BigDecimal amountOther = null;
        BigDecimal amountFba_Fees = null;
        BigDecimal amountSelling_Fees = null;
        BigDecimal amountSales_Tax_Collected = null;
        BigDecimal amountPromotional_Rebates = null;
        BigDecimal amountShipping_Credits = null;
        BigDecimal amountProduct_Sales = null;
        HashMap<String, Object> map_ValueOfColumn = null;
        for (ShipmentEvent shipmentEvent : list_ShipmentEvent_Refund) {
            String strAmazonOrderId = shipmentEvent.getAmazonOrderId();
            String strSellerOrderId = shipmentEvent.getSellerOrderId();
            String strMarketplaceName = shipmentEvent.getMarketplaceName();
            XMLGregorianCalendar PostedDate = shipmentEvent.getPostedDate();

            map_ValueOfColumn = new HashMap();
            map_ValueOfColumn.put("Order_Id", strAmazonOrderId);
            map_ValueOfColumn.put("MarketPlace", strMarketplaceName);
            map_ValueOfColumn.put("Type", Type);
            if (PostedDate != null) {
                Timestamp Date_Time = new Timestamp(AmazonUtil.convertGMTToCNTime(PostedDate.toGregorianCalendar()).getTime().getTime());
                map_ValueOfColumn.put("Date_Time", Date_Time);
            }

            List<ShipmentItem> shipmentItemAdjustmentList = shipmentEvent.getShipmentItemAdjustmentList();//
            if (shipmentItemAdjustmentList != null) {
                for (ShipmentItem shipmentItemAdjustment : shipmentItemAdjustmentList) {
                    amountTotal = BigDecimal.ZERO;
                    amountOther = BigDecimal.ZERO;
                    amountFba_Fees = BigDecimal.ZERO;
                    amountSelling_Fees = BigDecimal.ZERO;
                    amountSales_Tax_Collected = BigDecimal.ZERO;
                    amountPromotional_Rebates = BigDecimal.ZERO;
                    amountShipping_Credits = BigDecimal.ZERO;
                    amountProduct_Sales = BigDecimal.ZERO;

                    String strOrderItemId = shipmentItemAdjustment.getOrderItemId();
                    shipmentItemAdjustment.getOrderAdjustmentItemId();
                    String strSellerSKU = shipmentItemAdjustment.getSellerSKU();
                    Integer quantityShipped = shipmentItemAdjustment.getQuantityShipped();
                    map_ValueOfColumn.put("Settlement_Id", strOrderItemId);
                    map_ValueOfColumn.put("SKU", strSellerSKU);
                    if (quantityShipped != null) {
                        map_ValueOfColumn.put("Quantity", new BigDecimal(quantityShipped.intValue()));
                    }

                    List<ChargeComponent> itemChargeAdjustmentList = shipmentItemAdjustment.getItemChargeAdjustmentList();//
                    if (itemChargeAdjustmentList != null) {
                        for (ChargeComponent itemChargeAdjustment : itemChargeAdjustmentList) {
                            String strChargeType = itemChargeAdjustment.getChargeType();
                            Currency chargeAmount = itemChargeAdjustment.getChargeAmount();
                            BigDecimal amount = chargeAmount.getCurrencyAmount();

                            if (strChargeType != null && strChargeType.equalsIgnoreCase("Tax")) {
                                amountSales_Tax_Collected = amountSales_Tax_Collected.add(amount);
                            } else if (strChargeType != null && strChargeType.equalsIgnoreCase("ShippingTax")) {
                                amountShipping_Credits = amountShipping_Credits.add(amount);
                            } else if (strChargeType != null && strChargeType.equalsIgnoreCase("ShippingCharge")) {
                                amountShipping_Credits = amountShipping_Credits.add(amount);
                            } else if (strChargeType != null && strChargeType.equalsIgnoreCase("Principal")) {
                                amountProduct_Sales = amountProduct_Sales.add(amount);
                            } else if (strChargeType != null && strChargeType.equalsIgnoreCase("ShippingCharge")) {
                                amountSelling_Fees = amountSelling_Fees.add(amount);
                            } else if (strChargeType != null && strChargeType.equalsIgnoreCase("RestockingFee")) {
                                amountOther = amountOther.add(amount);
                            } else {
                                amountOther = amountOther.add(amount);
                            }
                            amountTotal = amountTotal.add(amount);
                        }
                    }

                    List<FeeComponent> itemFeeAdjustmentList = shipmentItemAdjustment.getItemFeeAdjustmentList();//
                    if (itemFeeAdjustmentList != null) {
                        for (FeeComponent itemFeeAdjustment : itemFeeAdjustmentList) {
                            String strFeeType = itemFeeAdjustment.getFeeType();
                            Currency feeAmount = itemFeeAdjustment.getFeeAmount();
                            BigDecimal amount = feeAmount.getCurrencyAmount();

                            if (strFeeType != null && strFeeType.toLowerCase().contains("commission")) {//Commission和RefundCommission
                                amountSelling_Fees = amountSelling_Fees.add(amount);
                            } else if (strFeeType != null && strFeeType.equalsIgnoreCase("ShippingChargeback")) {
                                amountFba_Fees = amountFba_Fees.add(amount);
                            } else {
                                amountOther = amountOther.add(amount);
                            }

                            amountTotal = amountTotal.add(amount);
                        }
                    }

                    List<Promotion> promotionAdjustmentList = shipmentItemAdjustment.getPromotionAdjustmentList();//
                    if (promotionAdjustmentList != null) {
                        for (Promotion promotionAdjustment : promotionAdjustmentList) {
                            String strPromotionType = promotionAdjustment.getPromotionType();
                            String strPromotionId = promotionAdjustment.getPromotionId();
                            Currency promotionAmount = promotionAdjustment.getPromotionAmount();
                            BigDecimal amount = promotionAmount.getCurrencyAmount();

                            amountPromotional_Rebates = amountPromotional_Rebates.add(amount);
                            amountTotal = amountTotal.add(amount);
                        }
                    }


                    List<Promotion> promotionList = shipmentItemAdjustment.getPromotionList();//不知如何处理（实际导出订单未发现此数据，模板里存在）
                    if (promotionList != null) {
                        BigDecimal total_PromotionList = getBigDecimal_PromotionList(promotionList);
                        amountOther = amountOther.add(total_PromotionList);
                        amountTotal = amountTotal.add(total_PromotionList);
                    }

                    List<ChargeComponent> itemChargeList = shipmentItemAdjustment.getItemChargeList();//不知如何处理（实际导出订单未发现此数据，模板里存在）
                    if (itemChargeList != null) {
                        BigDecimal total_ChargeComponentList = getBigDecimal_ChargeComponentList(itemChargeList);
                        amountOther = amountOther.add(total_ChargeComponentList);
                        amountTotal = amountTotal.add(total_ChargeComponentList);
                    }

                    List<FeeComponent> itemFeeList = shipmentItemAdjustment.getItemFeeList();//不知如何处理（实际导出订单未发现此数据，模板里存在）
                    if (itemFeeList != null) {
                        BigDecimal total_FeeComponent = getBigDecimal_FeeComponentList(itemFeeList);
                        amountOther = amountOther.add(total_FeeComponent);
                        amountTotal = amountTotal.add(total_FeeComponent);
                    }

                    Currency costOfPointsGranted = shipmentItemAdjustment.getCostOfPointsGranted();
                    if (costOfPointsGranted != null) {
                        BigDecimal currencyAmount = costOfPointsGranted.getCurrencyAmount();
                        amountOther = amountOther.add(currencyAmount);
                        amountTotal = amountTotal.add(currencyAmount);
                    }

                    Currency costOfPointsReturned = shipmentItemAdjustment.getCostOfPointsReturned();
                    if (costOfPointsReturned != null) {
                        BigDecimal currencyAmount = costOfPointsReturned.getCurrencyAmount();
                        amountOther = amountOther.add(currencyAmount);
                        amountTotal = amountTotal.add(currencyAmount);
                    }

                    map_ValueOfColumn.put("Product_Sales", amountProduct_Sales);
                    map_ValueOfColumn.put("Shipping_Credits", amountShipping_Credits);
                    map_ValueOfColumn.put("Promotional_Rebates", amountPromotional_Rebates);
                    map_ValueOfColumn.put("Sales_Tax_Collected", amountSales_Tax_Collected);
                    map_ValueOfColumn.put("Selling_Fees", amountSelling_Fees);
                    map_ValueOfColumn.put("Fba_Fees", amountFba_Fees);
                    map_ValueOfColumn.put("Other", amountOther);
                    map_ValueOfColumn.put("Total", amountTotal);
                    isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
                    if (!isProcessSuccess) {
                        return isProcessSuccess;
                    }
                }
            }

            map_ValueOfColumn = new HashMap();
            map_ValueOfColumn.put("Order_Id", strAmazonOrderId);
            map_ValueOfColumn.put("MarketPlace", strMarketplaceName);
            map_ValueOfColumn.put("Type", Type);
            if (PostedDate != null) {
                Timestamp Date_Time = new Timestamp(AmazonUtil.convertGMTToCNTime(PostedDate.toGregorianCalendar()).getTime().getTime());
                map_ValueOfColumn.put("Date_Time", Date_Time);
            }

            List<DirectPayment> directPaymentList = shipmentEvent.getDirectPaymentList();//不知如何处理（实际导出订单未发现此数据，模板里存在）
            if (isProcessSuccess && directPaymentList != null) {
                isProcessSuccess = genMAmazonPayment_DirectPaymentList(directPaymentList, historyLog, map_ValueOfColumn, "RefundEventList -> DirectPaymentList");
            }

            List<ChargeComponent> orderChargeList = shipmentEvent.getOrderChargeList();//不知如何处理（实际导出订单未发现此数据，模板里存在）
            if (isProcessSuccess && orderChargeList != null) {
                isProcessSuccess = genMAmazonPayment_ChargeComponentList(orderChargeList, historyLog, map_ValueOfColumn, "RefundEventList -> OrderChargeList");
            }

            List<FeeComponent> orderFeeList = shipmentEvent.getOrderFeeList();//不知如何处理（实际导出订单未发现此数据，模板里存在）
            if (isProcessSuccess && orderFeeList != null) {
                isProcessSuccess = genMAmazonPayment_FeeComponentList(orderFeeList, historyLog, map_ValueOfColumn, "RefundEventList -> OrderFeeList");
            }

            List<FeeComponent> shipmentFeeList = shipmentEvent.getShipmentFeeList();//不知如何处理（实际导出订单未发现此数据，模板里存在）
            if (isProcessSuccess && shipmentFeeList != null) {
                isProcessSuccess = genMAmazonPayment_FeeComponentList(shipmentFeeList, historyLog, map_ValueOfColumn, "RefundEventList -> ShipmentFeeList");
            }

            List<ChargeComponent> orderChargeAdjustmentList = shipmentEvent.getOrderChargeAdjustmentList();//不知如何处理（实际导出订单未发现此数据，模板里存在）
            if (isProcessSuccess && orderChargeAdjustmentList != null) {
                isProcessSuccess = genMAmazonPayment_ChargeComponentList(orderChargeAdjustmentList, historyLog, map_ValueOfColumn, "RefundEventList -> OrderChargeList");
            }

            List<FeeComponent> orderFeeAdjustmentList = shipmentEvent.getOrderFeeAdjustmentList();//不知如何处理（实际导出订单未发现此数据，模板里存在）
            if (isProcessSuccess && orderFeeAdjustmentList != null) {
                isProcessSuccess = genMAmazonPayment_FeeComponentList(orderFeeAdjustmentList, historyLog, map_ValueOfColumn, "RefundEventList -> OrderFeeAdjustmentList");
            }

            List<FeeComponent> shipmentFeeAdjustmentList = shipmentEvent.getShipmentFeeAdjustmentList();//不知如何处理（实际导出订单未发现此数据，模板里存在）
            if (isProcessSuccess && shipmentFeeAdjustmentList != null) {
                isProcessSuccess = genMAmazonPayment_FeeComponentList(shipmentFeeAdjustmentList, historyLog, map_ValueOfColumn, "RefundEventList -> ShipmentFeeAdjustmentList");
            }

            List<ShipmentItem> shipmentItemList = shipmentEvent.getShipmentItemList();//不知如何处理（实际导出订单未发现此数据，模板里存在）
            if (isProcessSuccess && shipmentItemList != null) {
                map_ValueOfColumn.remove("Other");
                map_ValueOfColumn.remove("Total");
                map_ValueOfColumn.put("Description", "RefundEventList -> ShipmentItemList");
                isProcessSuccess = processShipmentItemList(shipmentItemList, historyLog, map_ValueOfColumn);
            }
            if (!isProcessSuccess) {
                return isProcessSuccess;
            }
        }
        return isProcessSuccess;
    }

    /***
     *
     * @param historyLog
     * @param map_ValueOfColumn:
     * Timestamp Date_Time, String Settlement_Id, String Type, String Order_Id, String SKU, String Description, BigDecimal Quantity, String MarketPlace, String FulFillment,
     * String Order_City, String Order_State, String Order_Postal, BigDecimal Product_Sales, BigDecimal Shipping_Credits,
     * BigDecimal Gift_Wrap_Credits, BigDecimal Promotional_Rebates,BigDecimal Sales_Tax_Collected, BigDecimal Selling_Fees, BigDecimal Fba_Fees, BigDecimal Other_Transaction_Fees,
     * BigDecimal Other, BigDecimal Total
     * @return
     */
    public boolean genMAmazonPayment(AmazonImportPaymentLog historyLog, HashMap<String, Object> map_ValueOfColumn) {
        boolean isSaveSuccess = true;
        if (map_ValueOfColumn == null || map_ValueOfColumn.get("Total") == null || ((BigDecimal) map_ValueOfColumn.get("Total")).compareTo(BigDecimal.ZERO) == 0) {
            return isSaveSuccess;
        }

        AmazonPayment amazonPayment = new AmazonPayment();//trxName
        amazonPayment.setOrgId(historyLog.getOrgId());
        amazonPayment.setAmazonImportPaymentLogId(historyLog.getId());
        /*Object value = null;
        for (String key : map_ValueOfColumn.keySet()) {
            //TODO 遍历插入数据
            //amazonPayment.set_ValueOfColumn(key, map_ValueOfColumn.get(key));

            if (key.equalsIgnoreCase("Order_Id")) {
                value = map_ValueOfColumn.get(key);
                String strAmazonState = getAmazonStateOfAmazon_Order(historyLog, (String) value);
                if (strAmazonState != null) {
                    amazonPayment.setOrderState(strAmazonState);
                }
            }
        }*/
        amazonPayment.setDateTime((Date) map_ValueOfColumn.get("Date_Time"));
        amazonPayment.setType((String) map_ValueOfColumn.get("Type"));
        amazonPayment.setDescription((String) map_ValueOfColumn.get("Description"));
        amazonPayment.setOther((BigDecimal) map_ValueOfColumn.get("Other"));
        amazonPayment.setTotal((BigDecimal) map_ValueOfColumn.get("Total"));
        amazonPayment.setMarketplace((String) map_ValueOfColumn.get("MarketPlace"));
        amazonPayment.setOtherTransactionFees((BigDecimal) map_ValueOfColumn.get("Other_Transaction_Fees"));
        amazonPayment.setProductSales((BigDecimal) map_ValueOfColumn.get("Product_Sales"));
        amazonPayment.setShippingCredits((BigDecimal) map_ValueOfColumn.get("Shipping_Credits"));
        amazonPayment.setPromotionalRebates((BigDecimal) map_ValueOfColumn.get("Promotional_Rebates"));
        amazonPayment.setSalesTaxCollectd((BigDecimal) map_ValueOfColumn.get("Sales_Tax_Collected"));
        amazonPayment.setSellingFees((BigDecimal) map_ValueOfColumn.get("Selling_Fees"));
        amazonPayment.setFbaFees((BigDecimal) map_ValueOfColumn.get("Fba_Fees"));
        amazonPayment.setSku((String) map_ValueOfColumn.get("SKU"));
        amazonPayment.setOrderId((String) map_ValueOfColumn.get("Order_Id"));
        if (map_ValueOfColumn.get("Order_Id") != null) {
            String strAmazonState = getAmazonStateOfAmazon_Order(historyLog, (String) map_ValueOfColumn.get("Order_Id"));
            if (strAmazonState != null) {
                amazonPayment.setOrderState(strAmazonState);
            }
        }
        amazonPaymentMapper.insert(amazonPayment);
        /*if (mAmazonPayment.save()) {
            isSaveSuccess = true;

        } else {
            isSaveSuccess = false;
            System.out.println("***********  error  ***********");
        }*/
        if (amazonPayment.getId() != null) {
            isSaveSuccess = true;
            m_Row_Org++;
        } else {
            isSaveSuccess = false;
            System.out.println("***********  error  ***********");
        }
        return isSaveSuccess;
    }

    public String getAmazonStateOfAmazon_Order(AmazonImportPaymentLog historyLog, String AmazonOrderID) {
        String strAmazonState = null;
        List<AmazonOrder> list = null;
        AmazonOrderExample example = new AmazonOrderExample();
        AmazonOrderExample.Criteria criteria = example.createCriteria();

        criteria.andOrgIdEqualTo(historyLog.getOrgId());
        criteria.andAmazonOrderIdEqualTo(AmazonOrderID);
        list = amazonOrderMapper.selectByExample(example);

        if (list != null && list.size() > 0) {
            strAmazonState = list.get(0).getAmazonOrderStatus();
        }
        return strAmazonState;
    }

    public boolean genMAmazonPayment_FeeComponentList(List<FeeComponent> feeComponentList, AmazonImportPaymentLog historyLog, HashMap<String, Object> map_ValueOfColumn, String strDescription) {
        boolean isProcessSuccess = true;
        if (feeComponentList != null) {
            BigDecimal amountOther = BigDecimal.ZERO;
            BigDecimal amountTotal = BigDecimal.ZERO;
            map_ValueOfColumn.remove("Description");
            map_ValueOfColumn.remove("Other");
            map_ValueOfColumn.remove("Total");

            BigDecimal total_FeeComponent = getBigDecimal_FeeComponentList(feeComponentList);
            amountOther = amountOther.add(total_FeeComponent);
            amountTotal = amountOther;

            map_ValueOfColumn.put("Description", strDescription);
            map_ValueOfColumn.put("Other", amountOther);
            map_ValueOfColumn.put("Total", amountTotal);
            isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
        }
        return isProcessSuccess;
    }

    public boolean genMAmazonPayment_ChargeComponentList(List<ChargeComponent> chargeComponentList, AmazonImportPaymentLog historyLog, HashMap<String, Object> map_ValueOfColumn, String strDescription) {
        boolean isProcessSuccess = true;
        if (chargeComponentList != null) {
            BigDecimal amountOther = BigDecimal.ZERO;
            BigDecimal amountTotal = BigDecimal.ZERO;
            map_ValueOfColumn.remove("Description");
            map_ValueOfColumn.remove("Other");
            map_ValueOfColumn.remove("Total");

            BigDecimal total_ChargeComponent = getBigDecimal_ChargeComponentList(chargeComponentList);
            amountOther = amountOther.add(total_ChargeComponent);
            amountTotal = amountOther;

            map_ValueOfColumn.put("Description", strDescription);
            map_ValueOfColumn.put("Other", amountOther);
            map_ValueOfColumn.put("Total", amountTotal);
            isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
        }
        return isProcessSuccess;
    }

    public boolean genMAmazonPayment_DirectPaymentList(List<DirectPayment> directPaymentList, AmazonImportPaymentLog historyLog, HashMap<String, Object> map_ValueOfColumn, String strDescription) {
        boolean isProcessSuccess = true;
        if (directPaymentList != null) {
            BigDecimal amountOther = BigDecimal.ZERO;
            BigDecimal amountTotal = BigDecimal.ZERO;
            map_ValueOfColumn.remove("Description");
            map_ValueOfColumn.remove("Other");
            map_ValueOfColumn.remove("Total");

            BigDecimal total_DirectPaymentList = getBigDecimal_DirectPaymentList(directPaymentList);
            amountOther = amountOther.add(total_DirectPaymentList);
            amountTotal = amountOther;

            map_ValueOfColumn.put("Description", strDescription);
            map_ValueOfColumn.put("Other", amountOther);
            map_ValueOfColumn.put("Total", amountTotal);
            isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
        }
        return isProcessSuccess;
    }

    public boolean processFinancialEvents_RentalTransactionEventList(List<RentalTransactionEvent> list_RentalTransactionEvent, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        String strAmazonOrderId = null;
        String strMarketplaceName = null;
        String strDescription = null;
        String Type = "RentalTransactionEventList";
        XMLGregorianCalendar postedDate = null;
        BigDecimal amountTotal = null;
        BigDecimal amountOther = null;
        Currency rentalInitialValue = null;
        Currency rentalReimbursement = null;
        List<ChargeComponent> rentalChargeList = null;
        List<FeeComponent> rentalFeeList = null;
        HashMap<String, Object> map_ValueOfColumn = new HashMap();
        map_ValueOfColumn.put("Date_Time", historyLog.getRequestTimestamp());
        map_ValueOfColumn.put("Type", Type);


        for (RentalTransactionEvent rentalTransactionEvent : list_RentalTransactionEvent) {
            amountTotal = BigDecimal.ZERO;
            amountOther = BigDecimal.ZERO;

            strAmazonOrderId = rentalTransactionEvent.getAmazonOrderId();
            strDescription = rentalTransactionEvent.getRentalEventType();
            strMarketplaceName = rentalTransactionEvent.getMarketplaceName();
            rentalTransactionEvent.getExtensionLength();
            postedDate = rentalTransactionEvent.getPostedDate();

            if (postedDate != null) {
                Timestamp Date_Time = new Timestamp(AmazonUtil.convertGMTToCNTime(postedDate.toGregorianCalendar()).getTime().getTime());
                map_ValueOfColumn.put("Date_Time", Date_Time);
            }

            rentalInitialValue = rentalTransactionEvent.getRentalInitialValue();
            if (rentalInitialValue != null) {
                amountOther = amountOther.add(rentalInitialValue.getCurrencyAmount());
            }
            rentalReimbursement = rentalTransactionEvent.getRentalReimbursement();
            if (rentalReimbursement != null) {
                amountOther = amountOther.add(rentalReimbursement.getCurrencyAmount());
            }

            rentalChargeList = rentalTransactionEvent.getRentalChargeList();
            BigDecimal total_RentalChargeList = getBigDecimal_ChargeComponentList(rentalChargeList);
            amountOther = amountOther.add(total_RentalChargeList);

            rentalFeeList = rentalTransactionEvent.getRentalFeeList();
            BigDecimal total_RentalFeeList = getBigDecimal_FeeComponentList(rentalFeeList);
            amountOther = amountOther.add(total_RentalFeeList);

            amountTotal = amountOther;

            map_ValueOfColumn.put("Order_Id", strAmazonOrderId);
            map_ValueOfColumn.put("MarketPlace", strMarketplaceName);
            map_ValueOfColumn.put("Description", strDescription);
            map_ValueOfColumn.put("Other", amountOther);
            map_ValueOfColumn.put("Total", amountTotal);

            isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
            if (!isProcessSuccess) {
                return isProcessSuccess;
            }
        }
        return isProcessSuccess;
    }

    /**
     * 功能描述：1. BaseTax与ShippingTax 各产生对应Order_Retrocharge或Refund_Retrocharge记录（两条记录）
     * 2. BaseTax.CurrencyAmount金额为正为：BaseTax与ShippingTax为Order_Retrocharge记录
     * C否则为：BaseTax与ShippingTax为Refund_Retrocharge记录
     **/
    public boolean processFinancialEvents_RetrochargeEventList(List<RetrochargeEvent> list_RetrochargeEvent, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        HashMap<String, Object> map_ValueOfColumn = null;
        for (RetrochargeEvent retrochargeEvent : list_RetrochargeEvent) {
            String strAmazonOrderId = retrochargeEvent.getAmazonOrderId();
            String strRetrochargeEventType = retrochargeEvent.getRetrochargeEventType();
            String strMarketplaceName = retrochargeEvent.getMarketplaceName();
            XMLGregorianCalendar postedDate = retrochargeEvent.getPostedDate();
            Timestamp Date_Time = new Timestamp(historyLog.getRequestTimestamp().getTime());
            if (postedDate != null) {
                Date_Time = new Timestamp(AmazonUtil.convertGMTToCNTime(postedDate.toGregorianCalendar()).getTime().getTime());
            }
            String Type = "Order_Retrocharge";

            Currency currencyBaseTax = retrochargeEvent.getBaseTax();//
            if (currencyBaseTax != null) {//BaseTax记录
                map_ValueOfColumn = new HashMap();
                map_ValueOfColumn.put("Date_Time", Date_Time);
                map_ValueOfColumn.put("Order_Id", strAmazonOrderId);
                map_ValueOfColumn.put("MarketPlace", strMarketplaceName);

                BigDecimal currencyAmount = currencyBaseTax.getCurrencyAmount();
                if (currencyAmount.signum() < 0) {
                    Type = "Refund_Retrocharge";
                }
                map_ValueOfColumn.put("Type", Type);
                map_ValueOfColumn.put("Description", "Base Tax");
                map_ValueOfColumn.put("Sales_Tax_Collected", currencyAmount);
                map_ValueOfColumn.put("Total", currencyAmount);
                isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
                if (!isProcessSuccess) {
                    return isProcessSuccess;
                }
            }

            Currency currencyShippingTax = retrochargeEvent.getShippingTax();//
            if (currencyShippingTax != null) {//ShippingTax记录
                map_ValueOfColumn = new HashMap();
                map_ValueOfColumn.put("Date_Time", Date_Time);
                map_ValueOfColumn.put("Order_Id", strAmazonOrderId);
                map_ValueOfColumn.put("MarketPlace", strMarketplaceName);

                BigDecimal currencyAmount = currencyShippingTax.getCurrencyAmount();
                map_ValueOfColumn.put("Type", Type);
                map_ValueOfColumn.put("Description", "Shipping Tax");
                map_ValueOfColumn.put("Sales_Tax_Collected", currencyAmount);
                map_ValueOfColumn.put("Total", currencyAmount);
                isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
                if (!isProcessSuccess) {
                    return isProcessSuccess;
                }
            }
        }
        return isProcessSuccess;
    }

    //OK
    public boolean processFinancialEvents_ServiceFeeEventList(List<ServiceFeeEvent> list_ServiceFeeEvent, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        String strAmazonOrderId = null;
        String strSellerSKU = null;
        String strDescription = null;
        String strFeeDescription = null;
        String strFeeType = null;
        String Type = "FBA Inventory Fee";

        String strFeeReason = null;
        String strFnSKU = null;
        String strASIN = null;
        BigDecimal amountTotal = null;
        BigDecimal amountOther = null;
        HashMap<String, Object> map_ValueOfColumn = null;
        for (ServiceFeeEvent serviceFeeEvent : list_ServiceFeeEvent) {
            strAmazonOrderId = serviceFeeEvent.getAmazonOrderId();
            strFeeReason = serviceFeeEvent.getFeeReason();
            strSellerSKU = serviceFeeEvent.getSellerSKU();
            strFnSKU = serviceFeeEvent.getFnSKU();
            strFeeDescription = serviceFeeEvent.getFeeDescription();
            strASIN = serviceFeeEvent.getASIN();
            strDescription = null;
            amountOther = BigDecimal.ZERO;
            amountTotal = BigDecimal.ZERO;

            map_ValueOfColumn = new HashMap();
            map_ValueOfColumn.put("Date_Time", historyLog.getRequestTimestamp());
            map_ValueOfColumn.put("Order_Id", strAmazonOrderId);
            map_ValueOfColumn.put("Type", Type);
            map_ValueOfColumn.put("SKU", strSellerSKU);

            List<FeeComponent> feeList = serviceFeeEvent.getFeeList();
            if (feeList != null) {
                for (FeeComponent feeComponent : feeList) {
                    strFeeType = feeComponent.getFeeType();
                    BigDecimal currencyAmount = feeComponent.getFeeAmount().getCurrencyAmount();

                    if (strDescription != null && !strDescription.equals(strFeeType)) {//相同FeeType汇总一条记录：按API数据顺序
                        map_ValueOfColumn.put("Description", strDescription + (strFeeDescription != null ? (" : " + strFeeDescription) : ""));
                        map_ValueOfColumn.put("Other", amountOther);
                        map_ValueOfColumn.put("Total", amountTotal);
                        isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
                        if (isProcessSuccess) {
                            strDescription = null;
                            amountOther = BigDecimal.ZERO;
                            amountTotal = BigDecimal.ZERO;
                        } else {
                            return isProcessSuccess;
                        }
                    }
                    if (strDescription == null) {
                        strDescription = strFeeType;
                    }

                    amountOther = amountOther.add(currencyAmount);
                    amountTotal = amountTotal.add(currencyAmount);
                }
            }

            if (amountTotal != null && amountTotal.compareTo(BigDecimal.ZERO) == 1) {//创建记录
                map_ValueOfColumn.put("Description", strDescription + (strFeeDescription != null ? (" : " + strFeeDescription) : ""));
                map_ValueOfColumn.put("Other", amountOther);
                map_ValueOfColumn.put("Total", amountTotal);
                isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
                if (!isProcessSuccess) {
                    return isProcessSuccess;
                }
            }
        }
        return isProcessSuccess;
    }

    public boolean processFinancialEvents_ShipmentEventList(List<ShipmentEvent> list_ShipmentEvent, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        String Type = "Order";
        Timestamp Date_Time = new Timestamp(historyLog.getRequestTimestamp().getTime());
        BigDecimal amountTotal = null;
        BigDecimal amountOther = null;
        BigDecimal amountOther_Transaction_Fees = null;
        BigDecimal amountFba_Fees = null;
        BigDecimal amountSelling_Fees = null;
        BigDecimal amountSales_Tax_Collected = null;
        BigDecimal amountPromotional_Rebates = null;
        BigDecimal amountGift_Wrap_Credits = null;
        BigDecimal amountShipping_Credits = null;
        BigDecimal amountProduct_Sales = null;
        HashMap<String, Object> map_ValueOfColumn = null;
        for (ShipmentEvent shipmentEvent : list_ShipmentEvent) {
            String strAmazonOrderId = shipmentEvent.getAmazonOrderId();
            String strSellerOrderId = shipmentEvent.getSellerOrderId();
            String strMarketplaceName = shipmentEvent.getMarketplaceName();
            XMLGregorianCalendar PostedDate = shipmentEvent.getPostedDate();
            if (PostedDate != null) {
                Date_Time = new Timestamp(AmazonUtil.convertGMTToCNTime(PostedDate.toGregorianCalendar()).getTime().getTime());
            }

            amountTotal = BigDecimal.ZERO;
            amountOther = BigDecimal.ZERO;
            amountOther_Transaction_Fees = BigDecimal.ZERO;
            amountFba_Fees = BigDecimal.ZERO;
            amountSelling_Fees = BigDecimal.ZERO;
            amountSales_Tax_Collected = BigDecimal.ZERO;
            amountPromotional_Rebates = BigDecimal.ZERO;
            amountGift_Wrap_Credits = BigDecimal.ZERO;
            amountShipping_Credits = BigDecimal.ZERO;
            amountProduct_Sales = BigDecimal.ZERO;

            List<ShipmentItem> shipmentItemList = shipmentEvent.getShipmentItemList();//
            if (shipmentItemList != null) {
                map_ValueOfColumn = new HashMap();
                map_ValueOfColumn.put("Date_Time", Date_Time);
                map_ValueOfColumn.put("Order_Id", strAmazonOrderId);
                map_ValueOfColumn.put("MarketPlace", strMarketplaceName);
                map_ValueOfColumn.put("Type", Type);
                for (ShipmentItem shipmentItem : shipmentItemList) {
                    amountTotal = BigDecimal.ZERO;
                    amountOther = BigDecimal.ZERO;
                    amountOther_Transaction_Fees = BigDecimal.ZERO;
                    amountFba_Fees = BigDecimal.ZERO;
                    amountSelling_Fees = BigDecimal.ZERO;
                    amountSales_Tax_Collected = BigDecimal.ZERO;
                    amountPromotional_Rebates = BigDecimal.ZERO;
                    amountGift_Wrap_Credits = BigDecimal.ZERO;
                    amountShipping_Credits = BigDecimal.ZERO;
                    amountProduct_Sales = BigDecimal.ZERO;

                    String strOrderItemId = shipmentItem.getOrderItemId();
                    String strSellerSKU = shipmentItem.getSellerSKU();
                    Integer quantityShipped = shipmentItem.getQuantityShipped();
                    String strOrderAdjustmentItemId = shipmentItem.getOrderAdjustmentItemId();

                    Currency costOfPointsGranted = shipmentItem.getCostOfPointsGranted();
                    if (costOfPointsGranted != null) {
                        amountOther = amountOther.add(costOfPointsGranted.getCurrencyAmount());
                        amountTotal = amountTotal.add(costOfPointsGranted.getCurrencyAmount());
                    }
                    Currency costOfPointsReturned = shipmentItem.getCostOfPointsReturned();
                    if (costOfPointsReturned != null) {
                        amountOther = amountOther.add(costOfPointsReturned.getCurrencyAmount());
                        amountTotal = amountTotal.add(costOfPointsReturned.getCurrencyAmount());
                    }

                    List<FeeComponent> itemFeeAdjustmentList = shipmentItem.getItemFeeAdjustmentList();
                    if (itemFeeAdjustmentList != null) {
                        BigDecimal total_ItemFeeAdjustmentList = getBigDecimal_FeeComponentList(itemFeeAdjustmentList);
                        amountOther = amountOther.add(total_ItemFeeAdjustmentList);
                        amountTotal = amountTotal.add(total_ItemFeeAdjustmentList);
                    }

                    List<ChargeComponent> itemChargeAdjustmentList = shipmentItem.getItemChargeAdjustmentList();
                    if (itemChargeAdjustmentList != null) {
                        BigDecimal total_ItemChargeAdjustmentList = getBigDecimal_ChargeComponentList(itemChargeAdjustmentList);
                        amountOther = amountOther.add(total_ItemChargeAdjustmentList);
                        amountTotal = amountTotal.add(total_ItemChargeAdjustmentList);
                    }

                    List<Promotion> promotionAdjustmentList = shipmentItem.getPromotionAdjustmentList();
                    if (promotionAdjustmentList != null) {
                        BigDecimal total_PromotionAdjustmentList = getBigDecimal_PromotionList(promotionAdjustmentList);
                        amountOther = amountOther.add(total_PromotionAdjustmentList);
                        amountTotal = amountTotal.add(total_PromotionAdjustmentList);
                    }

                    List<ChargeComponent> itemChargeList = shipmentItem.getItemChargeList();
                    if (itemChargeList != null) {
                        for (ChargeComponent chargeComponent : itemChargeList) {
                            String strChargeType = chargeComponent.getChargeType();
                            BigDecimal chargeAmount = chargeComponent.getChargeAmount().getCurrencyAmount();

                            if (strChargeType.equalsIgnoreCase("Principal")) {
                                amountProduct_Sales = amountProduct_Sales.add(chargeAmount);
                            } else if (strChargeType.equalsIgnoreCase("Tax")) {
                                amountSales_Tax_Collected = amountSales_Tax_Collected.add(chargeAmount);
                            } else if (strChargeType.equalsIgnoreCase("GiftWrap")) {
                                amountGift_Wrap_Credits = amountGift_Wrap_Credits.add(chargeAmount);
                            } else if (strChargeType.equalsIgnoreCase("GiftWrapTax")) {
                                amountGift_Wrap_Credits = amountGift_Wrap_Credits.add(chargeAmount);
                            } else if (strChargeType.equalsIgnoreCase("ShippingCharge")) {
                                amountShipping_Credits = amountShipping_Credits.add(chargeAmount);
                            } else if (strChargeType.equalsIgnoreCase("ShippingTax")) {
                                amountShipping_Credits = amountShipping_Credits.add(chargeAmount);
                            } else {
                                amountOther = amountOther.add(chargeAmount);
                            }
                            amountTotal = amountTotal.add(chargeAmount);
                        }
                    }

                    List<FeeComponent> itemFeeList = shipmentItem.getItemFeeList();
                    if (itemFeeList != null) {
                        for (FeeComponent feeComponent : itemFeeList) {
                            String strFeeType = feeComponent.getFeeType();
                            BigDecimal feeAmount = feeComponent.getFeeAmount().getCurrencyAmount();

                            if (strFeeType.equalsIgnoreCase("FBAPerOrderFulfillmentFee")) {
                                amountFba_Fees = amountFba_Fees.add(feeAmount);
                            } else if (strFeeType.equalsIgnoreCase("FBAPerUnitFulfillmentFee")) {
                                amountFba_Fees = amountFba_Fees.add(feeAmount);
                            } else if (strFeeType.equalsIgnoreCase("FBAWeightBasedFee")) {
                                amountFba_Fees = amountFba_Fees.add(feeAmount);
                            } else if (strFeeType.toLowerCase().contains("commission")) {//Commission和RefundCommission
                                amountSelling_Fees = amountSelling_Fees.add(feeAmount);
                            } else if (strFeeType.equalsIgnoreCase("FixedClosingFee")) {
                                amountOther_Transaction_Fees = amountOther_Transaction_Fees.add(feeAmount);
                            } else if (strFeeType.equalsIgnoreCase("GiftwrapChargeback")) {
                                amountOther_Transaction_Fees = amountOther_Transaction_Fees.add(feeAmount);
                            } else if (strFeeType.equalsIgnoreCase("SalesTaxCollectionFee")) {
                                amountOther_Transaction_Fees = amountOther_Transaction_Fees.add(feeAmount);
                            } else if (strFeeType.equalsIgnoreCase("ShippingChargeback")) {
                                amountFba_Fees = amountFba_Fees.add(feeAmount);
                            } else if (strFeeType.equalsIgnoreCase("VariableClosingFee")) {
                                amountOther_Transaction_Fees = amountOther_Transaction_Fees.add(feeAmount);
                            } else {
                                amountOther = amountOther.add(feeAmount);
                            }
                            amountTotal = amountTotal.add(feeAmount);
                        }
                    }

                    List<Promotion> promotionList = shipmentItem.getPromotionList();
                    BigDecimal total_PromotionList = getBigDecimal_PromotionList(promotionList);
                    amountPromotional_Rebates.add(total_PromotionList);
                    amountTotal = amountTotal.add(total_PromotionList);

                    map_ValueOfColumn.put("Settlement_Id", strOrderItemId);
                    map_ValueOfColumn.put("SKU", strSellerSKU);
                    if (quantityShipped != null) {
                        map_ValueOfColumn.put("Quantity", new BigDecimal(quantityShipped.intValue()));
                    }

                    map_ValueOfColumn.put("Product_Sales", amountProduct_Sales);
                    map_ValueOfColumn.put("Shipping_Credits", amountShipping_Credits);
                    map_ValueOfColumn.put("Gift_Wrap_Credits", amountGift_Wrap_Credits);
                    map_ValueOfColumn.put("Promotional_Rebates", amountPromotional_Rebates);
                    map_ValueOfColumn.put("Sales_Tax_Collected", amountSales_Tax_Collected);
                    map_ValueOfColumn.put("Selling_Fees", amountSelling_Fees);
                    map_ValueOfColumn.put("Fba_Fees", amountFba_Fees);
                    map_ValueOfColumn.put("Other_Transaction_Fees", amountOther_Transaction_Fees);
                    map_ValueOfColumn.put("Total", amountTotal);
                    isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
                    if (!isProcessSuccess) {
                        return isProcessSuccess;
                    }
                }
            }

            List<FeeComponent> shipmentFeeList = shipmentEvent.getShipmentFeeList();
            if (isProcessSuccess && shipmentFeeList != null) {
                map_ValueOfColumn = new HashMap();
                map_ValueOfColumn.put("Date_Time", Date_Time);
                map_ValueOfColumn.put("Order_Id", strAmazonOrderId);
                map_ValueOfColumn.put("MarketPlace", strMarketplaceName);
                map_ValueOfColumn.put("Type", Type);

                isProcessSuccess = genMAmazonPayment_FeeComponentList(shipmentFeeList, historyLog, map_ValueOfColumn, "ShipmentEventList -> ShipmentFeeList");
                if (!isProcessSuccess) {
                    return isProcessSuccess;
                }
            }

            //Start ShipmentItemAdjustmentList     ////不知如何处理（实际导出订单未发现此数据，模板里存在）
            List<ShipmentItem> shipmentItemAdjustmentList = shipmentEvent.getShipmentItemAdjustmentList();//有SKU
            if (shipmentItemAdjustmentList != null) {
                map_ValueOfColumn = new HashMap();
                map_ValueOfColumn.put("Date_Time", Date_Time);
                map_ValueOfColumn.put("Order_Id", strAmazonOrderId);
                map_ValueOfColumn.put("MarketPlace", strMarketplaceName);
                map_ValueOfColumn.put("Type", Type);
                map_ValueOfColumn.put("Description", "ShipmentEventList -> ShipmentItemAdjustmentList");
                isProcessSuccess = processShipmentItemList(shipmentItemAdjustmentList, historyLog, map_ValueOfColumn);
                if (!isProcessSuccess) {
                    return isProcessSuccess;
                }
            }
            //end ShipmentItemAdjustmentList

            map_ValueOfColumn = new HashMap();
            map_ValueOfColumn.put("Date_Time", Date_Time);
            map_ValueOfColumn.put("Order_Id", strAmazonOrderId);
            map_ValueOfColumn.put("MarketPlace", strMarketplaceName);
            map_ValueOfColumn.put("Type", Type);
            List<ChargeComponent> orderChargeAdjustmentList = shipmentEvent.getOrderChargeAdjustmentList();////不知如何处理（实际导出订单未发现此数据，模板里存在）
            if (orderChargeAdjustmentList != null) {
                isProcessSuccess = genMAmazonPayment_ChargeComponentList(orderChargeAdjustmentList, historyLog, map_ValueOfColumn, "ShipmentEventList -> OrderChargeAdjustmentList");
                if (!isProcessSuccess) {
                    return isProcessSuccess;
                }
            }

            List<FeeComponent> orderFeeAdjustmentList = shipmentEvent.getOrderFeeAdjustmentList();////不知如何处理（实际导出订单未发现此数据，模板里存在）
            if (isProcessSuccess && orderFeeAdjustmentList != null) {
                isProcessSuccess = genMAmazonPayment_FeeComponentList(orderFeeAdjustmentList, historyLog, map_ValueOfColumn, "ShipmentEventList -> OrderFeeAdjustmentList");
                if (!isProcessSuccess) {
                    return isProcessSuccess;
                }
            }

            List<FeeComponent> shipmentFeeAdjustmentList = shipmentEvent.getShipmentFeeAdjustmentList();////不知如何处理（实际导出订单未发现此数据，模板里存在）
            if (isProcessSuccess && shipmentFeeAdjustmentList != null) {
                isProcessSuccess = genMAmazonPayment_FeeComponentList(shipmentFeeAdjustmentList, historyLog, map_ValueOfColumn, "ShipmentEventList -> ShipmentFeeAdjustmentList");
                if (!isProcessSuccess) {
                    return isProcessSuccess;
                }
            }

            List<FeeComponent> orderFeeList = shipmentEvent.getOrderFeeList();////不知如何处理（实际导出订单未发现此数据，模板里存在）
            if (isProcessSuccess && orderFeeList != null) {
                isProcessSuccess = genMAmazonPayment_FeeComponentList(orderFeeList, historyLog, map_ValueOfColumn, "ShipmentEventList -> OrderFeeList");
                if (!isProcessSuccess) {
                    return isProcessSuccess;
                }
            }

            List<DirectPayment> directPaymentList = shipmentEvent.getDirectPaymentList();////不知如何处理（实际导出订单未发现此数据，模板里存在）
            if (directPaymentList != null) {
                isProcessSuccess = genMAmazonPayment_DirectPaymentList(directPaymentList, historyLog, map_ValueOfColumn, "ShipmentEventList -> DirectPaymentList");
                if (!isProcessSuccess) {
                    return isProcessSuccess;
                }
            }

            List<ChargeComponent> orderChargeList = shipmentEvent.getOrderChargeList();////不知如何处理（实际导出订单未发现此数据，模板里存在）
            if (orderChargeList != null) {
                isProcessSuccess = genMAmazonPayment_ChargeComponentList(orderChargeList, historyLog, map_ValueOfColumn, "ShipmentEventList -> OrderChargeList");
                if (!isProcessSuccess) {
                    return isProcessSuccess;
                }
            }
        }
        return isProcessSuccess;
    }

    //无金额处理
    public void processFinancialEvents_ServiceProviderCreditEventList(List<SolutionProviderCreditEvent> list_SolutionProviderCreditEvent, AmazonImportPaymentLog historyLog) {
        for (SolutionProviderCreditEvent solutionProviderCreditEvent : list_SolutionProviderCreditEvent) {
            solutionProviderCreditEvent.getProviderTransactionType();
            solutionProviderCreditEvent.getSellerOrderId();
            solutionProviderCreditEvent.getMarketplaceId();
            solutionProviderCreditEvent.getMarketplaceCountryCode();
            solutionProviderCreditEvent.getSellerId();
            solutionProviderCreditEvent.getSellerStoreName();
            solutionProviderCreditEvent.getProviderId();
            solutionProviderCreditEvent.getProviderStoreName();
        }
    }


    public boolean processFinancialEvents_AdjustmentEventList(List<AdjustmentEvent> list_AdjustmentEvent, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        HashMap<String, Object> map_ValueOfColumn = null;
        for (AdjustmentEvent adjustmentEvent : list_AdjustmentEvent) {
            String strAdjustmentType = adjustmentEvent.getAdjustmentType();//
            Currency adjustmentAmount = adjustmentEvent.getAdjustmentAmount();
            BigDecimal currencyAmount = adjustmentAmount.getCurrencyAmount();//
            String Type = "Adjustment";

            if (strAdjustmentType != null && strAdjustmentType.equalsIgnoreCase("REVERSAL_REIMBURSEMENT")) {
                strAdjustmentType += ": FBA Inventory Reimbursement - Customer Return";
            }

            List<AdjustmentItem> list_AdjustmentItem = adjustmentEvent.getAdjustmentItemList();
            for (AdjustmentItem adjustmentItem : list_AdjustmentItem) {
                String strFnSKU = adjustmentItem.getFnSKU();//现在不需要
                String strQuantity = adjustmentItem.getQuantity();//
                String strSellerSKU = adjustmentItem.getSellerSKU();//
                BigDecimal currencyAmount_Item = adjustmentItem.getTotalAmount().getCurrencyAmount();//

                map_ValueOfColumn = new HashMap();
                map_ValueOfColumn.put("Date_Time", historyLog.getRequestTimestamp());
                map_ValueOfColumn.put("Type", Type);
                map_ValueOfColumn.put("SKU", strSellerSKU);
                map_ValueOfColumn.put("Description", strAdjustmentType);
                map_ValueOfColumn.put("Quantity", new BigDecimal(strQuantity));
                map_ValueOfColumn.put("Other", currencyAmount_Item);
                map_ValueOfColumn.put("Total", currencyAmount_Item);
                isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);
                if (!isProcessSuccess) {
                    return isProcessSuccess;
                }
            }
        }
        return isProcessSuccess;
    }

    //Start ChargebackEventList
    public boolean processFinancialEvents_ChargebackEventList(List<ShipmentEvent> list_ShipmentEvent_Chargeback, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        if (list_ShipmentEvent_Chargeback != null) {
            String strType = "ChargebackEventList";
            isProcessSuccess = processShipmentEventList(list_ShipmentEvent_Chargeback, historyLog, strType);
        }
        return isProcessSuccess;
    }
    //End ChargebackEventList

    //Start ShipmentEventList
    public boolean processShipmentEventList(List<ShipmentEvent> list_ShipmentEvent, AmazonImportPaymentLog historyLog, String strType) {
        boolean isProcessSuccess = true;
        if (list_ShipmentEvent != null) {
            String strAmazonOrderId = null;
            String strMarketplaceName = null;
            BigDecimal amountOther = null;
            BigDecimal amountTotal = null;
            XMLGregorianCalendar postedDate = null;
            HashMap<String, Object> map_ValueOfColumn = new HashMap();
            map_ValueOfColumn.put("Date_Time", historyLog.getRequestTimestamp());
            map_ValueOfColumn.put("Type", strType);
            for (ShipmentEvent shipmentEvent : list_ShipmentEvent) {
                strAmazonOrderId = shipmentEvent.getAmazonOrderId();
                shipmentEvent.getSellerOrderId();
                strMarketplaceName = shipmentEvent.getMarketplaceName();
                postedDate = shipmentEvent.getPostedDate();

                amountOther = BigDecimal.ZERO;
                amountTotal = BigDecimal.ZERO;

                map_ValueOfColumn.put("Order_Id", strAmazonOrderId);
                map_ValueOfColumn.put("MarketPlace", strMarketplaceName);
                map_ValueOfColumn.put("Description", strType);
                if (postedDate != null) {
                    Timestamp Date_Time = new Timestamp(AmazonUtil.convertGMTToCNTime(postedDate.toGregorianCalendar()).getTime().getTime());
                    map_ValueOfColumn.put("Date_Time", Date_Time);//覆盖
                }

                List<ChargeComponent> orderChargeList = shipmentEvent.getOrderChargeList();
                BigDecimal total_OrderChargeList = getBigDecimal_ChargeComponentList(orderChargeList);
                amountOther = amountOther.add(total_OrderChargeList);

                List<ChargeComponent> orderChargeAdjustmentList = shipmentEvent.getOrderChargeAdjustmentList();
                BigDecimal total_OrderChargeAdjustmentList = getBigDecimal_ChargeComponentList(orderChargeAdjustmentList);
                amountOther = amountOther.add(total_OrderChargeAdjustmentList);

                List<FeeComponent> shipmentFeeList = shipmentEvent.getShipmentFeeList();
                BigDecimal total_ShipmentFeeList = getBigDecimal_FeeComponentList(shipmentFeeList);
                amountOther = amountOther.add(total_ShipmentFeeList);

                List<FeeComponent> shipmentFeeAdjustmentList = shipmentEvent.getShipmentFeeAdjustmentList();
                BigDecimal total_ShipmentFeeAdjustmentList = getBigDecimal_FeeComponentList(shipmentFeeAdjustmentList);
                amountOther = amountOther.add(total_ShipmentFeeAdjustmentList);

                List<FeeComponent> orderFeeList = shipmentEvent.getOrderFeeList();
                BigDecimal total_OrderFeeList = getBigDecimal_FeeComponentList(orderFeeList);
                amountOther = amountOther.add(total_OrderFeeList);

                List<FeeComponent> orderFeeAdjustmentList = shipmentEvent.getOrderFeeAdjustmentList();
                BigDecimal total_OrderFeeAdjustmentList = getBigDecimal_FeeComponentList(orderFeeAdjustmentList);
                amountOther = amountOther.add(total_OrderFeeAdjustmentList);


                List<DirectPayment> directPaymentList = shipmentEvent.getDirectPaymentList();
                BigDecimal total_DirectPaymentList = getBigDecimal_DirectPaymentList(directPaymentList);
                amountOther = amountOther.add(total_DirectPaymentList);
                amountTotal = amountOther;

                if (amountOther != null && amountOther.compareTo(BigDecimal.ZERO) == 1) {
                    map_ValueOfColumn.put("Other", amountOther);
                    map_ValueOfColumn.put("Total", amountTotal);
                    isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);//无SKU
                }

                //Start ShipmentItemList
                if (isProcessSuccess) {
                    map_ValueOfColumn.remove("Other");
                    map_ValueOfColumn.remove("Total");
                    List<ShipmentItem> shipmentItemList = shipmentEvent.getShipmentItemList();//有SKU
                    map_ValueOfColumn.put("Description", strType + " -> ShipmentItemList");
                    isProcessSuccess = processShipmentItemList(shipmentItemList, historyLog, map_ValueOfColumn);
                }
                //End ShipmentItemList

                //Start ShipmentItemAdjustmentList
                if (isProcessSuccess) {
                    map_ValueOfColumn.remove("Other");
                    map_ValueOfColumn.remove("Total");
                    List<ShipmentItem> shipmentItemAdjustmentList = shipmentEvent.getShipmentItemAdjustmentList();//有SKU
                    map_ValueOfColumn.put("Description", strType + " -> ShipmentItemAdjustmentList");
                    isProcessSuccess = processShipmentItemList(shipmentItemAdjustmentList, historyLog, map_ValueOfColumn);
                }
                //end ShipmentItemAdjustmentList

                if (!isProcessSuccess) {
                    return isProcessSuccess;
                }
            }
        }
        return isProcessSuccess;
    }

    //Start DebtRecoveryEventList
    public boolean processFinancialEvents_DebtRecoveryEventList(List<DebtRecoveryEvent> list_DebtRecoveryEvent, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        String strType = "Debt Recovery Event List";
        String strDescription = null;
        BigDecimal amountOther = null;
        BigDecimal amountTotal = null;
        BigDecimal currencyAmount = null;
        Currency currency = null;
//        XMLGregorianCalendar postedDate = null;
        HashMap<String, Object> map_ValueOfColumn = new HashMap();
        map_ValueOfColumn.put("Date_Time", historyLog.getRequestTimestamp());
        map_ValueOfColumn.put("Type", strType);
        for (DebtRecoveryEvent debtRecoveryEvent : list_DebtRecoveryEvent) {
            strDescription = debtRecoveryEvent.getDebtRecoveryType();
            map_ValueOfColumn.put("Description", strDescription);
            amountOther = BigDecimal.ZERO;
            amountTotal = BigDecimal.ZERO;

            currency = debtRecoveryEvent.getRecoveryAmount();
            if (currency != null) {
                currencyAmount = currency.getCurrencyAmount();
                amountOther = amountOther.add(currencyAmount);
            }

            currency = debtRecoveryEvent.getOverPaymentCredit();
            if (currency != null) {
                currencyAmount = debtRecoveryEvent.getOverPaymentCredit().getCurrencyAmount();
                amountOther = amountOther.add(currencyAmount);
            }

            List<DebtRecoveryItem> debtRecoveryItemList = debtRecoveryEvent.getDebtRecoveryItemList();
            if (debtRecoveryItemList != null) {
                for (DebtRecoveryItem debtRecoveryItem : debtRecoveryItemList) {
                    debtRecoveryItem.getGroupBeginDate();
                    debtRecoveryItem.getGroupEndDate();
                    currency = debtRecoveryItem.getRecoveryAmount();
                    if (currency != null) {
                        currencyAmount = currency.getCurrencyAmount();
                        amountOther = amountOther.add(currencyAmount);
                    }

                    currency = debtRecoveryItem.getOriginalAmount();
                    if (currency != null) {
                        currencyAmount = currency.getCurrencyAmount();
                        amountOther = amountOther.add(currencyAmount);
                    }

                }
            }

            List<ChargeInstrument> chargeInstrumentList = debtRecoveryEvent.getChargeInstrumentList();
            if (chargeInstrumentList != null) {
                for (ChargeInstrument chargeInstrument : chargeInstrumentList) {
                    chargeInstrument.getDescription();
                    chargeInstrument.getTail();
                    currency = chargeInstrument.getAmount();
                    if (currency != null) {
                        currencyAmount = currency.getCurrencyAmount();
                        amountOther = amountOther.add(currencyAmount);
                    }
                }
            }
            amountTotal = amountOther;
            map_ValueOfColumn.put("Other", amountOther);
            map_ValueOfColumn.put("Total", amountTotal);
            isProcessSuccess = genMAmazonPayment(historyLog, map_ValueOfColumn);//无SKU
            if (!isProcessSuccess) {
                return isProcessSuccess;
            }
        }
        return isProcessSuccess;
    }
    //End DebtRecoveryEventList

    //start GuaranteeClaimEventList
    public boolean processFinancialEvents_GuaranteeClaimEventList(List<ShipmentEvent> list_ShipmentEvent_GuaranteeClaim, AmazonImportPaymentLog historyLog) {
        boolean isProcessSuccess = true;
        if (list_ShipmentEvent_GuaranteeClaim != null) {
            String strType = "GuaranteeClaimEventList";
            isProcessSuccess = processShipmentEventList(list_ShipmentEvent_GuaranteeClaim, historyLog, strType);
        }
        return isProcessSuccess;
    }
    //end GuaranteeClaimEventList

    public BigDecimal getBigDecimal_ChargeComponentList(List<ChargeComponent> chargeComponentList) {
        BigDecimal total = BigDecimal.ZERO;
        BigDecimal currencyAmount = BigDecimal.ZERO;
        if (chargeComponentList != null) {
            for (ChargeComponent chargeComponent : chargeComponentList) {
                chargeComponent.getChargeType();
                currencyAmount = chargeComponent.getChargeAmount().getCurrencyAmount();
                total = total.add(currencyAmount);
            }
        }
        return total;
    }

    public BigDecimal getBigDecimal_FeeComponentList(List<FeeComponent> feeComponentList) {
        BigDecimal total = BigDecimal.ZERO;
        BigDecimal currencyAmount = BigDecimal.ZERO;
        if (feeComponentList != null) {
            for (FeeComponent feeComponent : feeComponentList) {
                feeComponent.getFeeType();
                currencyAmount = feeComponent.getFeeAmount().getCurrencyAmount();
                total = total.add(currencyAmount);
            }
        }
        return total;
    }

    public BigDecimal getBigDecimal_DirectPaymentList(List<DirectPayment> directPaymentList) {
        BigDecimal total = BigDecimal.ZERO;
        BigDecimal currencyAmount = BigDecimal.ZERO;
        if (directPaymentList != null) {
            for (DirectPayment directPayment : directPaymentList) {
                directPayment.getDirectPaymentType();
                currencyAmount = directPayment.getDirectPaymentAmount().getCurrencyAmount();
                total = total.add(currencyAmount);
            }
        }
        return total;
    }

    public BigDecimal getBigDecimal_PromotionList(List<Promotion> promotionList) {
        BigDecimal total = BigDecimal.ZERO;
        BigDecimal currencyAmount = BigDecimal.ZERO;
        if (promotionList != null) {
            for (Promotion promotion : promotionList) {
                promotion.getPromotionType();
                currencyAmount = promotion.getPromotionAmount().getCurrencyAmount();
                total = total.add(currencyAmount);
            }
        }
        return total;
    }

    private AmazonImportPaymentLog saveImportPaymentHistory(AmazonImportConfigure configure, Timestamp requestTimestamp, Timestamp requestEndTimestamp) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        BaArea baArea = baAreaMapper.selectByPrimaryKey(configure.getOrgId());
        String name = baArea.getCode() + "-" + formatter.format(requestTimestamp);
        AmazonImportPaymentLog history = new AmazonImportPaymentLog();
        try {
            history.setOrgId(configure.getOrgId());
            history.setGeneratedReportId("");
            history.setReportRequestedId("");
            history.setRequestTimestamp(requestTimestamp);
            history.setRequestEndTimestamp(requestEndTimestamp);
//          history.setReportFileName(FILE_NAME);
            history.setName(name);
            amazonImportPaymentLogMapper.insert(history);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return history;
    }
}
