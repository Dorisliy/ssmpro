package cn.ssm.project.utils;

import com.amazonaws.mws.MarketplaceWebServiceException;
import com.amazonaws.mws.model.GetReportListResponse;
import com.amazonaws.mws.model.GetReportRequestListResponse;
import com.amazonaws.mws.model.ReportInfo;
import com.amazonaws.mws.model.RequestReportResponse;
import com.amazonaws.mws.samples.GetReport;
import com.amazonaws.mws.samples.GetReportList;
import com.amazonaws.mws.samples.GetReportRequestList;
import com.amazonaws.mws.samples.RequestReport;
import org.joda.time.DateTime;
import cn.ssm.project.pojo.AmazonImportConfigure;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

public class AmazonReportUtil {
    private String m_ErrorMsg = null;
    private AmazonImportConfigure configure = null;

    //RequestReport --> 请求参数
    private String strReportType = null; // 所请求的 ReportType 值。                     必须有值
    private Timestamp timeStartDate = null;//用于选择待报告数据日期范围的起始日期。     默认值：现在
    private Timestamp timeEndDate = null;//用于选择待报告数据日期范围的结束日期。        默认值：现在
    private String strReportOptions = null;//传递给报告的其他信息。                     可不传值
//    private IdList marketplaceIdList = null;//一个包含您所注册的一个或多个商城编号的列表。生成的报告将包含您指定的所有商城的信息。   可不传值

    //报表信息
    private String strReportRequestId = null;
    private String strGeneratedReportId = null;
    private String strReportFileName = null;
    private Timestamp timeRequestTimeStamp = null;
    private String strReportProcessingStatus = null;

    public AmazonReportUtil(AmazonImportConfigure Configure) {
        this.configure = Configure;
    }

    public void setConfigure(AmazonImportConfigure configure) {
        this.configure = configure;
    }

    public AmazonImportConfigure getConfigure() {
        return this.configure;
    }

    public void setStrReportType(String strReportType) {
        this.strReportType = strReportType;
    }

    public String getErrorMsg() {
        return this.m_ErrorMsg;
    }

    public String getStrReportType() {
        return this.strReportType;
    }

    public void setTimeStartDate(Timestamp timeStartDate) {
        this.timeStartDate = timeStartDate;
    }

    public Timestamp getTimeStartDate() {
        return this.timeStartDate;
    }

    public Timestamp getTimesEndDate() {
        return this.timeEndDate;
    }

    public void setTimeEndDate(Timestamp timeEndDate) {
        this.timeEndDate = timeEndDate;
    }

    public void setReportOptions(String strReportOptions) {
        this.strReportOptions = strReportOptions;
    }

    public String getReportOptions() {
        return this.strReportOptions;
    }

//    public void setMarketplaceIdList (IdList marketplaceIdList){
//        this.marketplaceIdList = marketplaceIdList;
//    }
//
//    public IdList getMarketplaceIdList(){
//        return  this.marketplaceIdList;
//    }

    public String getStrReportRequestId() {
        return strReportRequestId;
    }

    public String getStrGeneratedReportId() {
        return strGeneratedReportId;
    }

    public void setStrGeneratedReportId(String strGeneratedReportId) {
        this.strGeneratedReportId = strGeneratedReportId;
    }

    public String getStrReportFileName() {
        return strReportFileName;
    }

    public void setStrReportFileName(String strReportFileName) {
        this.strReportFileName = strReportFileName;
    }

    public String getStrReportProcessingStatus() {
        return strReportProcessingStatus;
    }

    public Timestamp getTimeRequestTimeStamp() {
        return timeRequestTimeStamp;
    }

    public boolean runReport() {
        boolean isResult = false;
        if (configure == null) {
            m_ErrorMsg = "Parameter configure is null";
            return isResult;
        }
        //1. requetReport - submit request
        RequestReportResponse requestReportResponse = runRequestReport(this);

        if (this.strReportRequestId != null && this.strReportRequestId.length() > 0) {
            //2. getReportRequestList  - check status
            GetReportRequestListResponse getReportRequestListResponse = runGetReportRequestList(this);

            //3. GetReport(GeneratedReportId)
            if (this.strGeneratedReportId != null && this.strGeneratedReportId.length() > 0) {
                isResult = AmazonReportUtil.runGetReport(this);
            }
        }
        return isResult;
    }

    //1. requetReport - submit request
    public static synchronized RequestReportResponse runRequestReport(AmazonReportUtil amazonReportUtil) {
        if (amazonReportUtil.configure == null) {
            amazonReportUtil.m_ErrorMsg = "Parameter configure is null";
            return null;
        }
        String accessKeyId = amazonReportUtil.configure.getMwsAccessKey();
        String secretAccessKey = amazonReportUtil.configure.getMwsSecretKey();
        String merchantId = amazonReportUtil.configure.getMwsSellerId();
        String marketplaceId = amazonReportUtil.configure.getMwsMarketplaceId();
        String url = amazonReportUtil.configure.getUrl();
        XMLGregorianCalendar startDate = null;  //参数可以为NULL ; 默认值：现在
        XMLGregorianCalendar endDate = null;     //参数可以为NULL ;  默认值：现在
        if (amazonReportUtil.timeStartDate != null) {
            Calendar localTime = Calendar.getInstance();
            localTime.setTimeInMillis(amazonReportUtil.timeStartDate.getTime());
            startDate = AmazonUtil.long2Gregorian(AmazonUtil.convertCNTimeToGMT(localTime).getTime());
        }
        if (amazonReportUtil.timeEndDate != null) {
            Calendar localTime = Calendar.getInstance();
            localTime.setTimeInMillis(amazonReportUtil.timeEndDate.getTime());
            endDate = AmazonUtil.long2Gregorian(AmazonUtil.convertCNTimeToGMT(localTime).getTime());
        }

        //RequestReport 操作的最大请求限额为 15 个，恢复速率为每分钟 1 个请求。
        try {
            Thread.sleep(1000 * 60); //wait for 60 seconds to check the first time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1. requetReport - submit request");
        System.out.println("REQUESTTIME : updatedAfter = " + amazonReportUtil.timeStartDate + "/updatedBefore = " + amazonReportUtil.timeEndDate);
        System.out.println("DATA : ad_org_id = " + amazonReportUtil.configure.getOrgId() + "/accessKeyId = " + accessKeyId +
                "/secretAccessKey = " + secretAccessKey + "/merchantId = " + merchantId + "/marketplaceId = " + marketplaceId + "/url = " + url);
        RequestReportResponse requestReportResponse = RequestReport.requestReport(startDate, endDate, amazonReportUtil.strReportType, accessKeyId, secretAccessKey, merchantId, marketplaceId, url);
        if (requestReportResponse == null ||
                requestReportResponse.getRequestReportResult().getReportRequestInfo() == null ||
                requestReportResponse.getRequestReportResult().getReportRequestInfo().getReportRequestId() == null) {
            try {
                amazonReportUtil.m_ErrorMsg = "Error when doing 'RequestReport.requestReport()'" + amazonReportUtil.configure.getOrgId();
                throw new Exception("Error when doing 'RequestReport.requestReport()'" + amazonReportUtil.configure.getOrgId());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        amazonReportUtil.strReportRequestId = requestReportResponse.getRequestReportResult().getReportRequestInfo().getReportRequestId();
        amazonReportUtil.timeRequestTimeStamp = new Timestamp(AmazonUtil.convertGMTToCNTime(requestReportResponse.getRequestReportResult().getReportRequestInfo().getSubmittedDate().toGregorianCalendar()).getTime().getTime());

        return requestReportResponse;
    }

    //2. getReportRequestList  - check status
    public static synchronized GetReportRequestListResponse runGetReportRequestList(AmazonReportUtil amazonReportUtil) {
        if (amazonReportUtil.configure == null) {
            amazonReportUtil.m_ErrorMsg = "Parameter configure is null";
            return null;
        }
        GetReportRequestListResponse reportRequestListResponse = null;
        String accessKeyId = amazonReportUtil.configure.getMwsAccessKey();
        String secretAccessKey = amazonReportUtil.configure.getMwsSecretKey();
        String merchantId = amazonReportUtil.configure.getMwsSellerId();
        String marketplaceId = amazonReportUtil.configure.getMwsMarketplaceId();
        String url = amazonReportUtil.configure.getUrl();
        long startTime = DateTime.now().getMillis();
        System.out.println("Start checking report processing status: " + DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        try {
            System.out.println("wait for 60 seconds to check the first time");
            int row_GetReportRequestList = 0;
            int rowReportProcessingStatus_CANCELLED = 0;
            do {
                //GetReportRequestList操作的最大请求限额为 10 个，恢复速率为每 45 秒 1 个请求。  库存请求除外
                Thread.sleep(1000 * 60); //wait for 60 seconds to check the first time
                reportRequestListResponse = GetReportRequestList.getOrderReportRequestList(amazonReportUtil.strReportRequestId, merchantId, accessKeyId, secretAccessKey, url);
                if (reportRequestListResponse == null ||
                        reportRequestListResponse.getGetReportRequestListResult().getReportRequestInfoList() == null ||
                        reportRequestListResponse.getGetReportRequestListResult().getReportRequestInfoList().size() <= 0) {
                    row_GetReportRequestList++;
                    amazonReportUtil.m_ErrorMsg = "Error when doing 'GetReportRequestList.getReportRequestList()' is null。reportRequestListResponse = " + reportRequestListResponse;
                    amazonReportUtil.strReportProcessingStatus = "GetReportRequestList:_IS_NULL_";
                    if (row_GetReportRequestList >= 6) {//重复取5次都为NULL，截止运行并抛出异常
                        throw new Exception("Error when doing 'GetReportRequestList.getReportRequestList()'");
                    }
                } else {
                    amazonReportUtil.strReportProcessingStatus = reportRequestListResponse.getGetReportRequestListResult().getReportRequestInfoList().get(0).getReportProcessingStatus();
                    if (amazonReportUtil.strReportProcessingStatus.equalsIgnoreCase("_CANCELLED_")) {//亚马逊取消请求
                        if (rowReportProcessingStatus_CANCELLED >= 5) {
                            break;
                        } else {
                            Thread.sleep(1000 * 120); //wait for 120 seconds to check the first time
                        }
                        rowReportProcessingStatus_CANCELLED++;
                    }
                }
            } while (!amazonReportUtil.strReportProcessingStatus.equalsIgnoreCase("_DONE_")  //报表生成完成，有数据
                    && !amazonReportUtil.strReportProcessingStatus.equalsIgnoreCase("_DONE_NO_DATA_"));//报表生成完成，不存在数据

            if (reportRequestListResponse != null && reportRequestListResponse.getGetReportRequestListResult() != null && reportRequestListResponse.getGetReportRequestListResult().getReportRequestInfoList() != null) {
                amazonReportUtil.strGeneratedReportId = reportRequestListResponse.getGetReportRequestListResult().getReportRequestInfoList().get(0).getGeneratedReportId();
            }
        } catch (Exception e) {
            e.printStackTrace();
            amazonReportUtil.m_ErrorMsg = e.getMessage();
            reportRequestListResponse = null;
        }
        long endTime = DateTime.now().getMillis();
        System.out.println("End checking report processing status: " + DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        System.out.println("Total time for amazon processing: " + (endTime - startTime) / (1000 * 60) + " minutes");
        return reportRequestListResponse;
    }

    //1. GetReportList  结算报告
    public static synchronized GetReportListResponse runGetReportList(AmazonReportUtil amazonReportUtil) {
        if (amazonReportUtil.configure == null) {
            amazonReportUtil.m_ErrorMsg = "Parameter configure is null";
            return null;
        }
        XMLGregorianCalendar startDate = null;  //参数可以为NULL ; 默认值：现在
        XMLGregorianCalendar endDate = null;     //参数可以为NULL ;  默认值：现在
        if (amazonReportUtil.timeStartDate != null) {
            Calendar localTime = Calendar.getInstance();
            localTime.setTimeInMillis(amazonReportUtil.timeStartDate.getTime());
            startDate = AmazonUtil.long2Gregorian(AmazonUtil.convertCNTimeToGMT(localTime).getTime());
        }
        if (amazonReportUtil.timeEndDate != null) {
            Calendar localTime = Calendar.getInstance();
            localTime.setTimeInMillis(amazonReportUtil.timeEndDate.getTime());
            endDate = AmazonUtil.long2Gregorian(AmazonUtil.convertCNTimeToGMT(localTime).getTime());
        }

        GetReportListResponse getReportListResponse = null;
        String accessKeyId = amazonReportUtil.configure.getMwsAccessKey();
        String secretAccessKey = amazonReportUtil.configure.getMwsSecretKey();
        String merchantId = amazonReportUtil.configure.getMwsSellerId();
        String marketplaceId = amazonReportUtil.configure.getMwsMarketplaceId();
        String url = amazonReportUtil.configure.getUrl();
        long startTime = DateTime.now().getMillis();
        System.out.println("Start checking report processing status: " + DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        try {
            System.out.println("wait for 60 seconds to check the first time");
            int row_GetReportRequestList = 0;
            do {
                //GetReportList 操作的最大请求限额为 10 个，恢复速率为每分钟 1 个请求。
                Thread.sleep(1000 * 60); //wait for 60 seconds to check the first time
                getReportListResponse = GetReportList.runGetReportList(merchantId, accessKeyId, secretAccessKey, url, amazonReportUtil.strReportType, startDate, endDate);
                if (getReportListResponse == null) {
                    row_GetReportRequestList++;
                    amazonReportUtil.m_ErrorMsg = "Error when doing 'GetReportList.runGetReportList' is null。strReportType = " + amazonReportUtil.strReportType;
                    amazonReportUtil.strReportProcessingStatus = "getReportListResponse:_IS_NULL_";
                    if (row_GetReportRequestList >= 6) {//重复取5次都为NULL，截止运行并抛出异常
                        throw new Exception("Error when doing 'GetReportRequestList.getReportRequestList()'");
                    }
                }
            } while (getReportListResponse == null);//亚马逊取消请求
            List<ReportInfo> reportInfo = getReportListResponse.getGetReportListResult().getReportInfoList();
            System.out.println("***************** NextToken ===" + getReportListResponse.getGetReportListResult().getNextToken());
            System.out.println("*****************reportInfo.size()===" + reportInfo.size());
            if (reportInfo.size() > 0) {
                amazonReportUtil.strGeneratedReportId = getReportListResponse.getGetReportListResult().getReportInfoList().get(0).getReportId();
            }

        } catch (Exception e) {
            e.printStackTrace();
            amazonReportUtil.m_ErrorMsg = e.getMessage();
            getReportListResponse = null;
        }
        long endTime = DateTime.now().getMillis();
        System.out.println("End checking report processing status: " + DateTime.now().toString("yyyy-MM-dd HH:mm:ss"));
        System.out.println("Total time for amazon processing: " + (endTime - startTime) / (1000 * 60) + " minutes");
        return getReportListResponse;
    }

    //3. GetReport(GeneratedReportId)
    public static synchronized boolean runGetReport(AmazonReportUtil amazonReportUtil) {
        //GetReport 操作的最大请求限额为 15 个，恢复速率为每分钟 1 个请求。
        try {
            Thread.sleep(1000 * 60); //wait for 60 seconds to check the first time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3. GetReport(GeneratedReportId)");
        boolean isResult = false;
        String accessKeyId = amazonReportUtil.configure.getMwsAccessKey();
        String secretAccessKey = amazonReportUtil.configure.getMwsSecretKey();
        String merchantId = amazonReportUtil.configure.getMwsSellerId();
        String marketplaceId = amazonReportUtil.configure.getMwsMarketplaceId();
        String url = amazonReportUtil.configure.getUrl();
//        MOrg org = new MOrg(Env.getCtx(), amazonReportUtil.configure.getAD_Org_ID(), null);
        amazonReportUtil.upateDate();
        String updatedAfter = amazonReportUtil.timeStartDate.toString();
        String updatedBefore = amazonReportUtil.timeEndDate.toString();
        if (amazonReportUtil.strReportFileName == null) {
            amazonReportUtil.strReportFileName = AmazonUtil.setReportFileName(updatedAfter, updatedBefore, amazonReportUtil.strReportType, amazonReportUtil.configure.getOrgId()+"country");
        }
        OutputStream report_OutputStream = null;
        try {
            report_OutputStream = GetReport.getReport(amazonReportUtil.strGeneratedReportId, amazonReportUtil.strReportFileName, accessKeyId, secretAccessKey, merchantId, url);
            isResult = true;
        } catch (MarketplaceWebServiceException e) {
            isResult = false;
            e.printStackTrace();
            amazonReportUtil.m_ErrorMsg = e.getMessage();
        }
        return isResult;
    }

    public void upateDate() {
        DateTime today = DateTime.now();
        if (timeStartDate == null) {
            timeStartDate = new Timestamp(today.getMillis());
        }
        if (timeEndDate == null) {
            timeEndDate = new Timestamp(today.getMillis());
        }
    }

}
