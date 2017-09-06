/******************************************************************************* 
 *  Copyright 2009 Amazon Services.
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  
 *  You may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 *  This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 *  CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 *  specific language governing permissions and limitations under the License.
 * ***************************************************************************** 
 *
 *  Marketplace Web Service Java Library
 *  API Version: 2009-01-01
 *  Generated: Wed Feb 18 13:28:48 PST 2009 
 * 
 */



package com.amazonaws.mws.samples;

import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;

import cn.ssm.project.utils.AmazonUtil;
import com.amazonaws.mws.*;
import com.amazonaws.mws.model.*;
import com.amazonaws.mws.mock.MarketplaceWebServiceMock;

/**
 *
 * Get Report  Samples
 *
 *
 */
public class GetReport {

    /**
     * Just add a few required parameters, and try the service
     * Get Report functionality
     *
     * @param args unused
     */
//    public static void main(String... args) {
//
//        getReport(null, null);
//    }

    public static OutputStream getReport(String generatedReportId, String reportFile,String accessKeyId, String secretAccessKey, String merchantId, String url) throws MarketplaceWebServiceException{

        /************************************************************************
         * Access Key ID and Secret Access Key ID, obtained from:
         * http://aws.amazon.com
         ***********************************************************************/
//        final String accessKeyId = AmazonUtil.MWS_ACCESS_KEY;
//        final String secretAccessKey = AmazonUtil.MWS_SECRET_KEY;

        final String appName = AmazonUtil.MWS_APP_NAME;
        final String appVersion = AmazonUtil.MWS_APP_VERSION;

        MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();

        /************************************************************************
         * Uncomment to set the appropriate MWS endpoint.
         ************************************************************************/
        config.setServiceURL(url);
        // US
//        config.setServiceURL("https://mws.amazonservices.com");
        // UK
        // config.setServiceURL("https://mws.amazonservices.co.uk");
        // Germany
        // config.setServiceURL("https://mws.amazonservices.de");
        // France
        // config.setServiceURL("https://mws.amazonservices.fr");
        // Italy
        // config.setServiceURL("https://mws.amazonservices.it");
        // Japan
        // config.setServiceURL("https://mws.amazonservices.jp");
        // China
        // config.setServiceURL("https://mws.amazonservices.com.cn");
        // Canada
        // config.setServiceURL("https://mws.amazonservices.ca");
        // India
        // config.setServiceURL("https://mws.amazonservices.in");

        /************************************************************************
         * You can also try advanced configuration options. Available options are:
         *
         *  - Signature Version
         *  - Proxy Host and Proxy Port
         *  - User Agent String to be sent to Marketplace Web Service
         *
         ***********************************************************************/

        /************************************************************************
         * Instantiate Http Client Implementation of Marketplace Web Service
         ***********************************************************************/

        MarketplaceWebService service = new MarketplaceWebServiceClient(
                accessKeyId, secretAccessKey, appName, appVersion, config);

        /************************************************************************
         * Setup request parameters and uncomment invoke to try out
         * sample for Get Report
         ***********************************************************************/

        /************************************************************************
         * Marketplace and Merchant IDs are required parameters for all
         * Marketplace Web Service calls.
         ***********************************************************************/
//        final String merchantId = AmazonUtil.MWS_SELLER_ID;
//        final String sellerDevAuthToken = "<Merchant Developer MWS Auth Token>";

        GetReportRequest request = new GetReportRequest();
        request.setMerchant( merchantId );
        //request.setMWSAuthToken(sellerDevAuthToken);

        request.setReportId( generatedReportId );

        // Note that depending on the type of report being downloaded, a report can reach
        // sizes greater than 1GB. For this reason we recommend that you _always_ program to
        // MWS in a streaming fashion. Otherwise, as your business grows you may silently reach
        // the in-memory size limit and have to re-work your solution.
        //
        OutputStream report = null;
        try {
            File f = new File("amazon_reports");
            if (!f.exists() ) {
                f.mkdir();
            }
            f = new File("inventoryReceipt");
            if (!f.exists() ) {
                f.mkdir();
            }
            f = new File("settlementReceipt");
            if (!f.exists() ) {
                f.mkdir();
            }
            report = new FileOutputStream( reportFile );
            request.setReportOutputStream( report );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        invokeGetReport(service, request);
        return report;
    }


    /**
     * Get Report  request sample
     * The GetReport operation returns the contents of a report. Reports can potentially be
     * very large (>100MB) which is why we only return one report at a time, and in a
     * streaming fashion.
     *   
     * @param service instance of MarketplaceWebService service
     * @param request Action to invoke
     */
    public static void invokeGetReport(MarketplaceWebService service, GetReportRequest request) throws MarketplaceWebServiceException{
//        try {

            GetReportResponse response = service.getReport(request);

            System.out.println ("GetReport Action Response");
            System.out.println ("=============================================================================");
            System.out.println ();

            System.out.print("    GetReportResponse");
            System.out.println();
            System.out.print("    GetReportResult");
            System.out.println();
            System.out.print("            MD5Checksum");
            System.out.println();
            System.out.print("                " + response.getGetReportResult().getMD5Checksum());
            System.out.println();
            if (response.isSetResponseMetadata()) {
                System.out.print("        ResponseMetadata");
                System.out.println();
                ResponseMetadata  responseMetadata = response.getResponseMetadata();
                if (responseMetadata.isSetRequestId()) {
                    System.out.print("            RequestId");
                    System.out.println();
                    System.out.print("                " + responseMetadata.getRequestId());
                    System.out.println();
                }
            } 
            System.out.println();

            System.out.println("Report");
            System.out.println ("=============================================================================");
            System.out.println();
            System.out.println( request.getReportOutputStream().toString() );
            System.out.println();

            System.out.println(response.getResponseHeaderMetadata());
            System.out.println();


//        } catch (MarketplaceWebServiceException ex) {
//
//            System.out.println("Caught Exception: " + ex.getMessage());
//            System.out.println("Response Status Code: " + ex.getStatusCode());
//            System.out.println("Error Code: " + ex.getErrorCode());
//            System.out.println("Error Type: " + ex.getErrorType());
//            System.out.println("Request ID: " + ex.getRequestId());
//            System.out.print("XML: " + ex.getXML());
//            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
//        }
    }

}
