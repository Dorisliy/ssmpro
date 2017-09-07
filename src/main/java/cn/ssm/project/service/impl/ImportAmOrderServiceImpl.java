package cn.ssm.project.service.impl;

import com.amazonaws.mws.model.GetReportRequestListResponse;
import com.amazonaws.mws.model.RequestReportResponse;
import cn.ssm.project.mapper.*;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.SAXException;
import cn.ssm.project.pojo.*;
import cn.ssm.project.service.*;
import cn.ssm.project.utils.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2017/8/29 0029.
 */
@Service
public class ImportAmOrderServiceImpl implements ImportAmOrderService {
    @Autowired
    private AmazonImportConfigureMapper amazonImportConfigureMapper;
    @Autowired
    private AmazonImportOrderLogMapper amazonImportOrderLogMapper;
    @Autowired
    private AmazonOrderMapper amazonOrderMapper;
    @Autowired
    private COrderMapper cOrderMapper;

    private static String FULFILLMENTCHANNEL_AMAZON = "Amazon";

    @Override
    public String downloadAmazonOrderByOrg(Timestamp startDate, Timestamp endDate, int orgID) {
        //TODO format date
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if ((startDate == null || endDate == null)) {
            //set updatedAfter to yesetday 00-00-00, updatedBefore to today 00-00-00
            DateTime beforeYesterday = DateTime.now().minusDays(2);
            String strBeforeYesterday = beforeYesterday.toString("yyyy-MM-dd") + " 00:00:00";
            DateTime yesterday = DateTime.now().minusDays(1);
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

        String result = "";
        for (AmazonImportConfigure configure : amazonImportConfigureArrayList) {
            System.out.println(configure.toString());
            result += downloadAmazonOrder(startDate, endDate, configure, null);

//            configure.setClientId(1000);
//            amazonImportConfigureMapper.updateByPrimaryKey(configure);

//            runHistoryFailRecord(configure);
//            UpdateSKUSaleStatusUtil.updateSKUSaleInfo(configure.getAD_Org_ID(),configure.getC_Project_ID());
//            PurchaseProposalUtil.calPurchaseProposalQty(configure.getAD_Org_ID(),configure.getC_Project_ID());
        }
        System.out.println();
        String s = "finish country:" + amazonImportConfigureArrayList.size() + "------------" + "result:" + result;
        System.out.println(s);
        System.out.println();
        return s;
    }

    /**
     * @param startDate
     * @param endDate
     * @return
     */
    public String downloadAmazonOrder(Timestamp startDate, Timestamp endDate, AmazonImportConfigure configure, AmazonImportOrderLog historyLog) {
        String result = "";
        try {
            String reportType = AmazonUtil.MWS_REPORT_ORDER_TRACKING;
            result = downloadOrderReportByUpdatedDate(startDate, endDate, reportType, configure, historyLog);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * the api use to download amazon order into our system db
     *
     * @param startDate
     * @param endDate
     * @param reportType
     */
    public String downloadOrderReportByUpdatedDate(Timestamp startDate, Timestamp endDate, String reportType, AmazonImportConfigure configure, AmazonImportOrderLog historyLog) {
        String result = "";
        try {
            if (historyLog == null) {
                historyLog = saveImportOrderHistory(configure, startDate, endDate);
            }
            //TODO 1. requetReport - submit request
            AmazonReportUtil amazonReportUtil = new AmazonReportUtil(configure);
            amazonReportUtil.setStrReportType(reportType);
            amazonReportUtil.setTimeStartDate(startDate);
            amazonReportUtil.setTimeEndDate(endDate);
            RequestReportResponse requestReportResponse = AmazonReportUtil.runRequestReport(amazonReportUtil);
            historyLog.setReportRequestedId(amazonReportUtil.getStrReportRequestId());
            historyLog.setRequestTimestamp(amazonReportUtil.getTimeRequestTimeStamp());
            historyLog.setReportProcessingStatus(amazonReportUtil.getStrReportProcessingStatus());
            historyLog.setGeneratedReportId(amazonReportUtil.getStrGeneratedReportId());
            if (amazonReportUtil.getErrorMsg() != null) {
                historyLog.setErrorMessage(amazonReportUtil.getErrorMsg());
            }
            amazonImportOrderLogMapper.updateByPrimaryKey(historyLog);

            //TODO 2. getReportRequestList  - check status
            GetReportRequestListResponse reportRequestListResponse = AmazonReportUtil.runGetReportRequestList(amazonReportUtil);
            historyLog.setReportProcessingStatus(amazonReportUtil.getStrReportProcessingStatus());
            historyLog.setGeneratedReportId(amazonReportUtil.getStrGeneratedReportId());
            if (amazonReportUtil.getErrorMsg() != null) {
                historyLog.setErrorMessage(amazonReportUtil.getErrorMsg());
            }
            amazonImportOrderLogMapper.updateByPrimaryKey(historyLog);

            if (amazonReportUtil.getStrGeneratedReportId() != null && amazonReportUtil.getStrGeneratedReportId().length() > 0) {//GENERATED_REPORT_ID不为NULL
                //TODO 3. GetReport(GeneratedReportId)
                boolean isGetReportFile = AmazonReportUtil.runGetReport(amazonReportUtil);
                if (amazonReportUtil.getErrorMsg() != null) {
                    historyLog.setErrorMessage(amazonReportUtil.getErrorMsg());
                    amazonImportOrderLogMapper.updateByPrimaryKey(historyLog);
                }
                if (isGetReportFile) {
                    historyLog.setReportFilename(amazonReportUtil.getStrReportFileName());
                    amazonImportOrderLogMapper.updateByPrimaryKey(historyLog);

                    //TODO 4. Parse XML report file
                    result = ImportOrderToDB(configure, historyLog);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * import order from xml file to db record
     */
    private String ImportOrderToDB(AmazonImportConfigure configure, AmazonImportOrderLog historyLog) {
        // save order to temp table: amazon_order as text, and same time save to c_order
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        Document doc = null;
        int totalOrder = 0, successNo = 0, failNo = 0;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            File reportFile = new File(historyLog.getReportFilename());
            if (!reportFile.exists()) {
                return "ReportFile error Report File can't open: " + historyLog.getReportFilename();
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
                ByteArrayInputStream stream = new ByteArrayInputStream((strBuffer.toString().replace("CP932", "ISO-8859-1")).getBytes("ISO-8859-1"));
                doc = dBuilder.parse(stream);
            } else {
                doc = dBuilder.parse(reportFile);
            }

            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            System.out.println("root element: " + doc.getDocumentElement().getNodeName());

            NodeList messageList = doc.getElementsByTagName("Message");
            if (messageList == null || messageList.getLength() == 0) {
                return "there is no order in the xml file.";
            }

            // save history to amazon_order_import_log table
//            X_Amazon_Import_Order_Log historyLog = saveImportOrderHistory(configure);
            int History_Record_ID = historyLog.getId();
            if (History_Record_ID <= 0) {
                return "historyLog saveError - AD_Org_ID=" + configure.getOrgId();
            }

            totalOrder = messageList.getLength();
//            List<MAmazonOrder> amazonOrderList = new ArrayList<MAmazonOrder>();
            Map<String, Element> xmlOrderList = new HashMap<String, Element>();
            for (int i = 0; i < totalOrder; i++) {
                AmazonOrder amazonOrder = null;
                String amazonOrderId = "";
                try {
                    Element message = (Element) messageList.item(i);

                    if (message != null) {
                        Element xmlOrder = (Element) message.getElementsByTagName("Order").item(0);
                        Node node = xmlOrder.getElementsByTagName("SalesChannel").item(0);
                        String AmazonSalesChannel = node == null ? null : node.getTextContent();
                        if (AmazonSalesChannel == null) {
                            continue;
                        }
                        if (configure.getAmazonSalesChannel() == null || AmazonSalesChannel.equals(configure.getAmazonSalesChannel()) || ("Y".equalsIgnoreCase(configure.getIsNonamazonIncluded()) && AmazonSalesChannel.equals("Non-Amazon"))) {
                            amazonOrderId = xmlOrder.getElementsByTagName("AmazonOrderID").item(0).getTextContent();
                            //temp table: amazon_order
                            boolean isNewSaveAmazonOrder = isNewSaveAmazonOrder(xmlOrder, configure);//AmazonOrderId = ? AND AmazonLastUpdatedDate >= ?  不存在记录才新建保存
                            if (isNewSaveAmazonOrder) {
                                amazonOrder = saveXmlOrderToDBTempOrder(xmlOrder, History_Record_ID, configure);
                                if (amazonOrder == null) {
                                    System.out.println("can't saveXmlOrderToDBTempOrder(), amazonOrderId=" + amazonOrderId);
                                    historyLog.setDescription("can't saveXmlOrderToDBTempOrder(), amazonOrderId=" + amazonOrderId);
                                    historyLog.setErrorMessage("can't saveXmlOrderToDBTempOrder(), amazonOrderId=" + amazonOrderId);
                                    amazonImportOrderLogMapper.updateByPrimaryKey(historyLog);
                                    return "can't saveXmlOrderToDBTempOrder(), amazonOrderId=" + amazonOrderId;
                                }
                                xmlOrderList.put(amazonOrder.getAmazonOrderId(), xmlOrder);
                            }
                        }
//                        amazonOrderList.add(amazonOrder);
                    }
                } catch (Exception e) {
                    historyLog.setDescription(e.getMessage());
                    historyLog.setErrorMessage(e.getMessage());
                    amazonImportOrderLogMapper.updateByPrimaryKey(historyLog);
                    return e.getMessage();
                }
            }

            //TODO 亚马逊拉取的订单和本地订单相关联
            //amazonOrderMapper.updateCOrderIdByAmzonOrderId(historyLog);

            //TODO 更新本地订单信息
            List<AmazonOrder> amazonOrderList = new ArrayList<AmazonOrder>();
            AmazonOrderExample example = new AmazonOrderExample();
            AmazonOrderExample.Criteria criteria = example.createCriteria();
            criteria.andAmazonImportOrderLogIdEqualTo(History_Record_ID);
            amazonOrderList = amazonOrderMapper.selectByExample(example);
            for (AmazonOrder amazonOrder : amazonOrderList) {
                COrder cOrder = null;
                if (amazonOrder == null) {
                    continue;
                }
                Element xmlOrder = xmlOrderList.get(amazonOrder.getAmazonOrderId());
                if (xmlOrder == null) {
                    continue;
                }
                boolean success = true;
                String logMsg = "Imported successfully!";
                try {
                    cOrder = saveXmlOrderToDB_C_Order(xmlOrder, amazonOrder, configure);
                    if (cOrder == null) {
                        System.out.println("MOrder Error can't saveXmlOrderToDB_C_Order()");
                        logMsg = "MOrder is null. Can't saveXmlOrderToDB_C_Order()";
                        success = false;
                    }

                    //save back the order id to history
                    if (amazonOrder != null && cOrder != null && amazonOrder.getcOrderId() == 0) {
                        amazonOrder.setcOrderId(cOrder.getId());
                        amazonOrder.setIsImported("Y");
                    }
                    //amazonOrder.setDescription(logMsg);

                    if (success) {
                        amazonOrder.setImportStatus("success");
                    } else {
                        amazonOrder.setImportStatus("fail");
                    }
                    amazonOrderMapper.updateByPrimaryKey(amazonOrder);
                    //save the success log
                    if (success) {
                        successNo++;
                    } else {
                        failNo++;
                    }
                } catch (Exception e) {
                    failNo++;
                    logMsg = e.getMessage();
                    //save the fail log
                    //amazonOrder.setDescription(logMsg);
                    amazonOrder.setImportStatus("fail");
                    amazonOrderMapper.updateByPrimaryKey(amazonOrder);
                }
            }
            //save the successNo, failNo back to history log
            updateImportOrderHistory(historyLog, totalOrder, successNo, failNo);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return " Result - Total orders: " + totalOrder + ", Success orders: " + successNo + ", Fail orders: " + failNo + "\n";
    }

    private void updateImportOrderHistory(AmazonImportOrderLog historyLog, int totalOrder, int successNo, int failNo) {
        try {
            if (historyLog == null) {
                return;
            }
            historyLog.setTotalOrderNum(new BigDecimal(totalOrder));
            historyLog.setSuccessNum(new BigDecimal(successNo));
            historyLog.setFailNum(new BigDecimal(failNo));
            amazonImportOrderLogMapper.updateByPrimaryKey(historyLog);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * save each xml order information to MOrder instance
     *
     * @param xmlOrder
     * @return
     */
    public COrder saveXmlOrderToDB_C_Order(Element xmlOrder, AmazonOrder amazonOrder, AmazonImportConfigure configure) throws Exception {
        COrder cOrder = null;
        boolean newOrder = false;
        String amazonOrderStatus = null;
        boolean success = true;

        //c_order
        Map<String, Object> result = saveOrderHeader(xmlOrder, amazonOrder, configure);
        cOrder = (COrder) result.get("order");
        newOrder = (Boolean) result.get("new");
        amazonOrderStatus = (String) result.get("status");
        success = (Boolean) result.get("result");
        if (!success) {
            System.out.println("order error saveOrderHeader() failed.");
            throw new Exception("saveOrderHeader() failed.");
        }

        //c_orderline
        if (newOrder) {
            //create amazon order line
            success = saveOrderLineWithXMLOrder(xmlOrder, cOrder);
            if (!success) {
                cOrderMapper.deleteByPrimaryKey(cOrder.getId());
                System.out.println("orderline error saveOrderLineWithXMLOrder() failed.");
                throw new Exception("saveOrderLineWithXMLOrder() failed");
            }
        }
        /*//process The order only if it's status is shipped
        if(cOrder.getDateOrdered().after(new Timestamp((new DateTime("2015-12-31")).getMillis())) && cOrder.getAmazonOrderStatus().toLowerCase().contains("shipped") &&
                !cOrder.getDocStatus().equals("CO") &&
                cOrder.getLines().length > 0){
            if(cOrder.getDocStatus().equals("IN")){
                cOrder.setDocAction("PR"); //set the doc action to complete the document
                if(!cOrder.processIt("PR")){
                    logger.warning("Failed: " + cOrder); //failed if there is a confirmation
                }
            }
            cOrder.setDocAction("CO"); //set the doc action to complete the document
            if(!cOrder.processIt("CO")){
                logger.warning("Failed: " + cOrder); //failed if there is a confirmation
            }
        }
        if(!cOrder.getAmazonOrderStatus().toLowerCase().contains("shipped")){
            //set document status if it's not shipped
            cOrder.setOrderStatus(cOrder.getAmazonOrderStatus());
        }
        cOrder.saveEx();

        //generate shipment if the status is shipped and shipmentGenerated = N
        if(success && FULFILLMENTCHANNEL_AMAZON.equals(cOrder.getAmazonFulfillmentChannel())){
//            if(generateShipment(cOrder)){
            String documentNo = cOrder.getDocumentNo();
            if(documentNo.startsWith("amm-")){
                documentNo = documentNo.substring(4);
                MOrder oldOrder = MOrder.getOrderByAmazonId(documentNo);
                if(oldOrder != null && oldOrder.getC_Order_ID() > 0){
                    if(oldOrder.getAmazonOrderStatus().toLowerCase().contains("shipped") &&
                            !oldOrder.getDocStatus().equals("CO") &&
                            oldOrder.getLines().length > 0){
                        if(cOrder.getDocStatus().equals("IN")){
                            cOrder.setDocAction("PR"); //set the doc action to complete the document
                            if(!cOrder.processIt("PR")){
                                logger.warning("Failed: " + cOrder); //failed if there is a confirmation
                            }
                        }
                        oldOrder.setDocAction("CO"); //set the doc action to complete the document
                        if(!oldOrder.processIt("CO")){
                            logger.warning("Failed: " + cOrder); //failed if there is a confirmation
                        }
                    }
                }
            }
//            }
        }*/

        return cOrder;
    }

    /**
     * save order line with xml order information
     *
     * @param xmlOrder
     * @param cOrder
     */
    private boolean saveOrderLineWithXMLOrder(Element xmlOrder, COrder cOrder) throws Exception {
        boolean result = true;

        NodeList itemList = xmlOrder.getElementsByTagName("OrderItem");
        if (itemList == null || itemList.getLength() == 0) {
            System.out.println("there is no order item in this Order.");
            throw new Exception("there is no order item in this Order xml.");
        }

        int totalOrderItems = itemList.getLength();
        HashMap<Integer, Integer> productLines = new HashMap<Integer, Integer>();
        for (int i = 0; i < totalOrderItems; i++) {
            Node orderItem = itemList.item(i);
            if (orderItem != null && orderItem.getNodeType() == Node.ELEMENT_NODE) {
                Element xmlOrderItem = (Element) orderItem;
                result &= saveOrderLineToDBOrder(xmlOrderItem, cOrder, (productLines.size() * 10) + 10, productLines);
            }
        }

        return result;
    }

    /**
     * the low level method to do the order line creation work
     *
     * @param orderItem
     * @param cOrder
     * @param lineNo
     */
    //TODO: maybe have to call the callout manually in code to ensure everything is fine with inventory
    private boolean saveOrderLineToDBOrder(Element orderItem, COrder cOrder, int lineNo, HashMap<Integer, Integer> productLines) throws Exception {
/*
//        BigDecimal principalPrice = new BigDecimal(0);
//        BigDecimal shippingPrice = new BigDecimal(0);
//        BigDecimal giftWrapPrice = new BigDecimal(0);
//        BigDecimal itemPromotionDiscount = new BigDecimal(0);
//        BigDecimal shipPromotionDiscount = new BigDecimal(0);

        Node node = orderItem.getElementsByTagName("SKU").item(0);
        String amazonSKU = node == null ? "" : node.getTextContent();
        node = orderItem.getElementsByTagName("Quantity").item(0);
        BigDecimal amazonQty = node == null ? BigDecimal.ZERO : new BigDecimal(node.getTextContent());
//        MProduct product = MProduct.getProductByOrgAmazonSKU(amazonSKU, cOrder.getAD_Org_ID());
        MProduct product = MProduct.getProductFromMapping(amazonSKU, cOrder.getAD_Org_ID());
        if (product == null) {
            //TODO: maybe can consider import the new product automatically in our sytem
            //Otherwise, always make sure the product exists before import
            logger.saveError("Product", "Can't getProductByAmazonSKU(" + amazonSKU + ")");
            return false;
        }
        int M_Product_ID = product.getM_Product_ID();
        int C_OrderLine_ID = productLines.get(M_Product_ID) == null ? 0 : productLines.get(M_Product_ID);
        MOrderLine orderLine = null;
        if (C_OrderLine_ID > 0) {
            orderLine = new MOrderLine(Env.getCtx(), C_OrderLine_ID, null);
            orderLine.setAmazonQuantity(orderLine.getAmazonQuantity().add(amazonQty));
            orderLine.setQty(orderLine.getAmazonQuantity());
            orderLine.saveEx();
            return true;
        }

        orderLine = new MOrderLine(Env.getCtx(), 0, null);
        //amazon fields
        orderLine.setC_Order_ID(cOrder.getC_Order_ID());
        orderLine.setM_Product_ID(M_Product_ID);
        orderLine.setAmazonQuantity(amazonQty);
        node = orderItem.getElementsByTagName("ASIN").item(0);
        orderLine.setAmazonASIN(node == null ? null : node.getTextContent());
        orderLine.setAmazonSKU(amazonSKU);
        node = orderItem.getElementsByTagName("ItemStatus").item(0);
        orderLine.setAmazonItemStatus(node == null ? null : node.getTextContent());
        node = orderItem.getElementsByTagName("ProductName").item(0);
        orderLine.setAmazonProductName(node == null ? null : node.getTextContent());
        if (orderItem.getElementsByTagName("Promotion") != null && orderItem.getElementsByTagName("Promotion").getLength() > 0) {
            Element promotion = (Element) orderItem.getElementsByTagName("Promotion").item(0);
            if (promotion != null) {
                if (promotion.getElementsByTagName("PromotionIDs") != null && promotion.getElementsByTagName("PromotionIDs").item(0) != null) {
                    orderLine.setAmazonPromotionID(promotion.getElementsByTagName("PromotionIDs").item(0).getTextContent());
                }
                if (promotion.getElementsByTagName("ShipPromotionDiscount") != null && promotion.getElementsByTagName("ShipPromotionDiscount").item(0) != null) {
                    orderLine.set_ValueOfColumn("ShipPromotionDiscount", new BigDecimal(promotion.getElementsByTagName("ShipPromotionDiscount").item(0).getTextContent()));
//                    shipPromotionDiscount = new BigDecimal(orderLine.get_Value("ShipPromotionDiscount").toString());
                }
                if (promotion.getElementsByTagName("ItemPromotionDiscount") != null && promotion.getElementsByTagName("ItemPromotionDiscount").item(0) != null) {
                    orderLine.set_ValueOfColumn("ItemPromotionDiscount", new BigDecimal(promotion.getElementsByTagName("ItemPromotionDiscount").item(0).getTextContent()));
//                    itemPromotionDiscount = new BigDecimal(orderLine.get_Value("ItemPromotionDiscount").toString());
                }
            }
        }

        //order line fields
        orderLine.setAD_Org_ID(cOrder.getAD_Org_ID());
        orderLine.setC_BPartner_ID(cOrder.getC_BPartner_ID());
        orderLine.setC_BPartner_Location_ID(cOrder.getC_BPartner_Location_ID());
        orderLine.setDatePromised(cOrder.getDatePromised());
        orderLine.setDateOrdered(cOrder.getDateOrdered());
        orderLine.setLine(lineNo);
        orderLine.setM_Warehouse_ID(cOrder.getM_Warehouse_ID());
        orderLine.setQty(orderLine.getAmazonQuantity());
        orderLine.setQtyReserved(new BigDecimal(0));
        orderLine.setQtyInvoiced(new BigDecimal(0));
        orderLine.setQtyDelivered(new BigDecimal(0));

//        MProductPricing pp = new MProductPricing (M_Product_ID, orderLine.getC_BPartner_ID(), orderLine.getQtyOrdered(), true);
//        orderLine.setC_UOM_ID(pp.getC_UOM_ID());
        orderLine.setC_UOM_ID(1000001);
        //amounts
        orderLine.setPriceList(new BigDecimal(0));
        orderLine.setPriceLimit(new BigDecimal(0));
        orderLine.setPriceEntered(new BigDecimal(0));
        orderLine.setC_Tax_ID(1000000);
        orderLine.setQtyLostSales(new BigDecimal(0));
        orderLine.setLineNetAmt(new BigDecimal(0));
        //project
        if (cOrder.getC_Project_ID() > 0) {
            orderLine.setC_Project_ID(cOrder.getC_Project_ID());
        }

        orderLine.saveEx(); //save the order line now
        productLines.put(M_Product_ID, orderLine.getC_OrderLine_ID());
        //order line price
//        if(orderItem.getElementsByTagName("ItemPrice") != null && orderItem.getElementsByTagName("ItemPrice").getLength() >0){
//            Element itemPrice = (Element)orderItem.getElementsByTagName("ItemPrice").item(0);
//            if(itemPrice != null){
//                NodeList componentNodeList = itemPrice.getElementsByTagName("Component");
//                if(componentNodeList != null && componentNodeList.getLength() >0){
//                    for(int i=0; i< componentNodeList.getLength(); i++){
//                        Element component = (Element)componentNodeList.item(i);
//                        //create new order line price record
//                        X_Amazon_C_OrderLine_Price orderLinePrice = new X_Amazon_C_OrderLine_Price(Env.getCtx(), 0, null);
//                        orderLinePrice.setC_OrderLine_ID(orderLine.getC_OrderLine_ID());
//
//                        //amazon all kinds of price
//                        orderLinePrice.setAmazonComponentType(component.getElementsByTagName("Type").item(0).getTextContent());
//                        orderLinePrice.setAmazonComponentAmount(new BigDecimal(component.getElementsByTagName("Amount").item(0).getTextContent()));
//                        Element amountElement = (Element)component.getElementsByTagName("Amount").item(0);
//                        orderLinePrice.setAmazonComponentCurrency(amountElement.getAttribute("currency"));
//                        if(orderLinePrice.getAmazonComponentType().equals("Principal")){
//                            principalPrice = orderLinePrice.getAmazonComponentAmount();
//                        }else if(orderLinePrice.getAmazonComponentType().equals("Shipping")){
//                            shippingPrice = orderLinePrice.getAmazonComponentAmount();
//                        }else if(orderLinePrice.getAmazonComponentType().equals("GiftWrap")){
//                            giftWrapPrice = orderLinePrice.getAmazonComponentAmount();
//                        }
//                        orderLinePrice.saveEx();
//                    }
//                }
//            }
//        }
//
//        //计算金额
//        if(orderLine.getQtyOrdered() != null && orderLine.getQtyOrdered().compareTo(BigDecimal.ZERO) != 0){
//            BigDecimal amount = principalPrice.add(shippingPrice).subtract(giftWrapPrice).subtract(itemPromotionDiscount).subtract(itemPromotionDiscount);
//            MathContext mathContext = new MathContext(16, RoundingMode.HALF_UP);
//            BigDecimal price = amount.divide(orderLine.getQtyOrdered(),mathContext);
//            price = price.setScale(cOrder.getM_PriceList().getPricePrecision(),BigDecimal.ROUND_HALF_UP);
//            orderLine.setPrice(price);
//            orderLine.saveEx();
//        }
*/

        return true;
    }

    /**
     * save order header from xml
     *
     * @param xmlOrder
     * @return
     */
    private Map<String, Object> saveOrderHeader(Element xmlOrder, AmazonOrder amazonOrder, AmazonImportConfigure configure) throws Exception {
        boolean newOrder = false;
        String amazonOrderStatus = null;
//        MOrder cOrder = MOrder.getOrderByAmazonId(xmlOrder.getElementsByTagName("AmazonOrderID").item(0).getTextContent());
        COrder cOrder = null;
        int C_Order_ID = amazonOrder.getcOrderId();
        if (C_Order_ID <= 0) {
            //create a new c_order
            cOrder = new COrder();
            newOrder = true;
        } else {
            cOrder = cOrderMapper.selectByPrimaryKey(C_Order_ID);
        }
        amazonOrderStatus = xmlOrder.getElementsByTagName("OrderStatus").item(0).getTextContent();
        cOrder.setAmazonOrderStatus(amazonOrderStatus);

        if (newOrder) {
            //amazon related info
            String strPurchaseDate = xmlOrder.getElementsByTagName("PurchaseDate").item(0).getTextContent();
            /*MOrg org = new MOrg(Env.getCtx(), configure.getAD_Org_ID(), null);
            String timeZone = org.get_Value("TimeZone") == null ? null : org.get_Value("TimeZone").toString();*/
            String timeZone = "America/Los_Angeles";
//        if(configure.getAD_Org_ID() == 1000002){ //美国
//            /*美国2015年夏令时将于2015年03月09日当地时间早上02:00开始，至2015年11月2日结束,欧洲国家将于3月30日格林威治时间早上01:00开始实施夏令时，至2015年10月26日结束
//            那么3月9日到3月29日  时间上会差7个小时, 而10月26日到11月2日   也是相差7个小时,其他时间段都是相差8个小时
//             */
//            timeZone = "America/Los_Angeles";
//        }
            cOrder.setAmazonPurchaseDate(AmazonUtil.UTCStr2TimestampMinusHours(strPurchaseDate, timeZone));
            cOrder.setAmazonLastupdatedDate(AmazonUtil.UTCStr2TimestampMinusHours(xmlOrder.getElementsByTagName("LastUpdatedDate").item(0).getTextContent(), timeZone));
            cOrder.setAmazonSalesChannel(xmlOrder.getElementsByTagName("SalesChannel").item(0).getTextContent());
            if (xmlOrder.getElementsByTagName("FulfillmentData") != null && xmlOrder.getElementsByTagName("FulfillmentData").getLength() > 0) {
                Element fulfillment = (Element) xmlOrder.getElementsByTagName("FulfillmentData").item(0);
                if (fulfillment != null) {
                    Node node = fulfillment.getElementsByTagName("FulfillmentChannel").item(0);
                    cOrder.setAmazonFulfillmentChannel(node == null ? null : node.getTextContent());
                    node = fulfillment.getElementsByTagName("ShipServiceLevel").item(0);
                    cOrder.setAmazonShipServiceLevel(node == null ? null : node.getTextContent());
                    Element address = (Element) fulfillment.getElementsByTagName("Address").item(0);
                    node = address.getElementsByTagName("State").item(0);
                    cOrder.setAmazonShipState(node == null ? null : node.getTextContent());
                    node = address.getElementsByTagName("Country").item(0);
                    cOrder.setAmazonShipCountry(node == null ? null : node.getTextContent());
                    node = address.getElementsByTagName("PostalCode").item(0);
                    cOrder.setAmazonShipPostalCode(node == null ? null : node.getTextContent());
                    node = address.getElementsByTagName("City").item(0);
                    cOrder.setAmazonShipCity(node == null ? null : node.getTextContent());
                }
            }
            //order fields
            cOrder.setAmazonOrderId(xmlOrder.getElementsByTagName("AmazonOrderID").item(0).getTextContent());

            cOrder.setOrgId(configure.getOrgId());

            //delivery





            //project
            int c_project_id = configure.getProjectId();
            String salesChannel = xmlOrder.getElementsByTagName("SalesChannel").item(0).getTextContent();
            if (salesChannel.contains("ca")) {
                /*MProject mProject = new Query(Env.getCtx(), I_C_Project.Table_Name, "value like 'CA%' and platformclassification = 'Amazon'", null).setClient_ID().setOnlyActiveRecords(true).first();
                c_project_id = mProject.getC_Project_ID();*/
            }
        }
        if (newOrder) {
            cOrderMapper.insert(cOrder);
        } else {
            cOrderMapper.updateByPrimaryKey(cOrder);
        }

        Map<String, Object> result = new LinkedHashMap<String, Object>();
        result.put("order", cOrder);
        result.put("new", newOrder);
        result.put("status", amazonOrderStatus);
        result.put("result", true);

        return result;
    }

    private AmazonOrder saveXmlOrderToDBTempOrder(Element xmlOrder, int History_Record_ID, AmazonImportConfigure configure) {
        AmazonOrder amazonOrder = null;
        try {
            //temp table: amazon_order
            DOMImplementationLS lsImpl = (DOMImplementationLS) xmlOrder.getOwnerDocument().getImplementation().getFeature("LS", "3.0");
            LSSerializer serializer = lsImpl.createLSSerializer();
            serializer.getDomConfig().setParameter("xml-declaration", false); //by default its true, so set it to false to get String without xml-declaration
            String orderContentText = serializer.writeToString(xmlOrder); //save the whole xml raw data
            String amazonOrderId = xmlOrder.getElementsByTagName("AmazonOrderID").item(0).getTextContent();
            amazonOrder = new AmazonOrder();
            amazonOrder.setOrgId(configure.getOrgId());
            amazonOrder.setAmazonOrderId(amazonOrderId);
            Node node = xmlOrder.getElementsByTagName("PurchaseDate").item(0);
            //amazonOrder.setAmazonPurchaseDate(node == null ? null : AmazonUtil.UTCStr2Timestamp(node.getTextContent()));
            node = xmlOrder.getElementsByTagName("LastUpdatedDate").item(0);
            //amazonOrder.setAmazonLastupdatedDate(node == null ? null : AmazonUtil.UTCStr2Timestamp(node.getTextContent()));
            node = xmlOrder.getElementsByTagName("OrderStatus").item(0);
            //amazonOrder.setAmazonOrderStatus(node == null ? null : node.getTextContent());
            node = xmlOrder.getElementsByTagName("SalesChannel").item(0);
            //amazonOrder.setAmazonSalesChannel(node == null ? null : node.getTextContent());

            if (xmlOrder.getElementsByTagName("FulfillmentData") != null && xmlOrder.getElementsByTagName("FulfillmentData").getLength() > 0) {
                Element fulfillment = (Element) xmlOrder.getElementsByTagName("FulfillmentData").item(0);
                if (fulfillment != null) {
                    Element address = (Element) fulfillment.getElementsByTagName("Address").item(0);
                    Node stateNode = address.getElementsByTagName("State").item(0);
                    //amazonOrder.setAmazonOrderStatus(stateNode == null ? null : stateNode.getTextContent());
                }
            }
            //amazonOrder.setContentText(orderContentText);
            amazonOrder.setName(amazonOrder.getAmazonOrderId());
            amazonOrder.setAmazonImportOrderLogId(History_Record_ID);
            //amazonOrderMapper.insert(amazonOrder);
        } catch (Exception e) {
            amazonOrder = null;
            e.printStackTrace();
        }

        return amazonOrder;
    }

    private boolean isNewSaveAmazonOrder(Element xmlOrder, AmazonImportConfigure configure) {
        boolean isNewSaveAmazonOrder = true;
        String amazonOrderId = xmlOrder.getElementsByTagName("AmazonOrderID").item(0).getTextContent();
        Node node = xmlOrder.getElementsByTagName("PurchaseDate").item(0);
        node = xmlOrder.getElementsByTagName("LastUpdatedDate").item(0);
        Timestamp amazonLastUpdatedDate = (node == null ? null : AmazonUtil.UTCStr2Timestamp(node.getTextContent()));

        AmazonOrderExample example = new AmazonOrderExample();
        AmazonOrderExample.Criteria criteria = example.createCriteria();
        //criteria.andAmazonLastupdatedDateGreaterThanOrEqualTo(amazonLastUpdatedDate);
        criteria.andOrgIdEqualTo(configure.getOrgId());
        criteria.andAmazonOrderIdEqualTo(amazonOrderId);
        List<AmazonOrder> amazonOrderList = amazonOrderMapper.selectByExample(example);
        if (amazonOrderList != null && amazonOrderList.size() > 0) {
            isNewSaveAmazonOrder = false;
        }
        return isNewSaveAmazonOrder;
    }

    /**
     * save the import file history with key information
     */
    private AmazonImportOrderLog saveImportOrderHistory(AmazonImportConfigure configure, Timestamp queryStartDate, Timestamp queryEndDate) {
        AmazonImportOrderLog history = null;
        Integer record = null;
        try {
            history = new AmazonImportOrderLog();
            history.setOrgId(configure.getOrgId());
            history.setName(AmazonUtil.MWS_REPORT_ORDER_TRACKING);
            history.setAmazonImportConfigureId(configure.getId());
            history.setQueryStartDate(queryStartDate);
            history.setQueryEndDate(queryEndDate);
            amazonImportOrderLogMapper.insert(history);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return history;
    }

}
