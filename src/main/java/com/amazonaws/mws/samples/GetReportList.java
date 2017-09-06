package com.amazonaws.mws.samples;

import cn.ssm.project.utils.AmazonUtil;
import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.MarketplaceWebServiceClient;
import com.amazonaws.mws.MarketplaceWebServiceConfig;
import com.amazonaws.mws.MarketplaceWebServiceException;
import com.amazonaws.mws.model.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Arrays;

/**
 * Created by KangMin on 2017/3/10.
 */
public class GetReportList  {

    /**
     * Just add a few required parameters, and try the service
     * Get Report List functionality
     *
     */
    public static GetReportListResponse runGetReportList(String merchantId, String accessKeyId, String secretAccessKey, String url, String reportType, XMLGregorianCalendar availableFromDate,XMLGregorianCalendar availableToDate) {

        /************************************************************************
         * Access Key ID and Secret Access Key ID, obtained from:
         * http://aws.amazon.com
         ***********************************************************************/
//        String accessKeyId = "<Your Access Key ID>";
//        String secretAccessKey = "<Your Secret Access Key>";
//        String merchantId = "<Your Merchant ID>";
//        String sellerDevAuthToken = "<Merchant Developer MWS Auth Token>";

        final String appName = AmazonUtil.MWS_APP_NAME;
        final String appVersion = AmazonUtil.MWS_APP_VERSION;

        MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();

        /************************************************************************
         * Uncomment to set the appropriate MWS endpoint.
         ************************************************************************/
        config.setServiceURL(url);


        /************************************************************************
         * Instantiate Http Client Implementation of Marketplace Web Service
         ***********************************************************************/

        MarketplaceWebService service = new MarketplaceWebServiceClient(
                accessKeyId, secretAccessKey, appName, appVersion, config);

        GetReportListRequest request = new GetReportListRequest();
        request.setMaxCount(new Integer(99));//非负整数，表明待返回报告请求的最大数量。如果指定一个大于 100 的数字，请求将被拒绝。
        request.setMerchant( merchantId );
        TypeList reportTypeList = new TypeList(Arrays.asList(reportType));
        request.setReportTypeList(reportTypeList);//ReportTypeList
        request.setAvailableFromDate(availableFromDate);//AvailableFromDate
        request.setAvailableToDate(availableToDate);//AvailableToDate
        //request.setMWSAuthToken(sellerDevAuthToken);

        // @TODO: set request parameters here
        GetReportListResponse getReportListResponse= null;
        getReportListResponse = invokeGetReportList(service, request);
        return getReportListResponse;
    }



    /**
     * Get Report List  request sample
     * returns a list of reports; by default the most recent ten reports,
     * regardless of their acknowledgement status
     *
     * @param service instance of MarketplaceWebService service
     * @param request Action to invoke
     */
    public static GetReportListResponse invokeGetReportList(MarketplaceWebService service, GetReportListRequest request) {
        GetReportListResponse response = null;
        try {
            response = service.getReportList(request);

            System.out.println ("GetReportList Action Response");
            System.out.println ("=============================================================================");
            System.out.println ();

            System.out.print("    GetReportListResponse");
            System.out.println();
            if (response.isSetGetReportListResult()) {
                System.out.print("        GetReportListResult");
                System.out.println();
                GetReportListResult getReportListResult = response.getGetReportListResult();
                if (getReportListResult.isSetNextToken()) {
                    System.out.print("            NextToken");
                    System.out.println();
                    System.out.print("                " + getReportListResult.getNextToken());
                    System.out.println();
                }
                if (getReportListResult.isSetHasNext()) {
                    System.out.print("            HasNext");
                    System.out.println();
                    System.out.print("                " + getReportListResult.isHasNext());
                    System.out.println();
                }
                java.util.List<ReportInfo> reportInfoListList = getReportListResult.getReportInfoList();
                for (ReportInfo reportInfoList : reportInfoListList) {
                    System.out.print("            ReportInfoList");
                    System.out.println();
                    if (reportInfoList.isSetReportId()) {
                        System.out.print("                ReportId");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.getReportId());
                        System.out.println();
                    }
                    if (reportInfoList.isSetReportType()) {
                        System.out.print("                ReportType");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.getReportType());
                        System.out.println();
                    }
                    if (reportInfoList.isSetReportRequestId()) {
                        System.out.print("                ReportRequestId");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.getReportRequestId());
                        System.out.println();
                    }
                    if (reportInfoList.isSetAvailableDate()) {
                        System.out.print("                AvailableDate");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.getAvailableDate());
                        System.out.println();
                    }
                    if (reportInfoList.isSetAcknowledged()) {
                        System.out.print("                Acknowledged");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.isAcknowledged());
                        System.out.println();
                    }
                    if (reportInfoList.isSetAcknowledgedDate()) {
                        System.out.print("                AcknowledgedDate");
                        System.out.println();
                        System.out.print("                    " + reportInfoList.getAcknowledgedDate());
                        System.out.println();
                    }
                }
            }
            if (response.isSetResponseMetadata()) {
                System.out.print("        ResponseMetadata");
                System.out.println();
                ResponseMetadata responseMetadata = response.getResponseMetadata();
                if (responseMetadata.isSetRequestId()) {
                    System.out.print("            RequestId");
                    System.out.println();
                    System.out.print("                " + responseMetadata.getRequestId());
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println(response.getResponseHeaderMetadata());
            System.out.println();


        } catch (MarketplaceWebServiceException ex) {

            System.out.println("Caught Exception: " + ex.getMessage());
            System.out.println("Response Status Code: " + ex.getStatusCode());
            System.out.println("Error Code: " + ex.getErrorCode());
            System.out.println("Error Type: " + ex.getErrorType());
            System.out.println("Request ID: " + ex.getRequestId());
            System.out.print("XML: " + ex.getXML());
            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
        }
        return response;
    }

}