/*******************************************************************************
 * Copyright 2009-2015 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * MWS Finances Service
 * API Version: 2015-05-01
 * Library Version: 2015-09-03
 * Generated: Thu Sep 03 17:55:19 GMT 2015
 */
package com.amazonservices.mws.finances._2015_05_01.samples;

import javax.xml.datatype.XMLGregorianCalendar;
import com.amazonservices.mws.client.*;
import com.amazonservices.mws.finances._2015_05_01.*;
import com.amazonservices.mws.finances._2015_05_01.model.*;


/** Sample call for ListFinancialEvents. */
public class ListFinancialEvents {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static ListFinancialEventsResponse invokeListFinancialEvents(
            MWSFinancesService client, 
            ListFinancialEventsRequest request) {
        ListFinancialEventsResponse response = null;
        try {
            // Call the service.此操作的最大请求配额为30，每两秒钟恢复一个请求的速率。
            Thread.sleep(1000 * 2); //wait for 2 seconds to check the first time

            response = client.listFinancialEvents(request);
            ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
            // We recommend logging every the request id and timestamp of every call.
            System.out.println("Response:");
            System.out.println("RequestId: "+rhmd.getRequestId());
            System.out.println("Timestamp: "+rhmd.getTimestamp());
            System.out.println("NextToken: "+response.getListFinancialEventsResult().getNextToken());
            String responseXml = response.toXML();
//            System.out.println("==================================");
//            System.out.println(responseXml);
//            System.out.println("==================================");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (MWSFinancesServiceException ex) {
            // Exception properties are important for diagnostics.
            System.out.println("Service Exception:");
            ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
            if(rhmd != null) {
                System.out.println("RequestId: "+rhmd.getRequestId());
                System.out.println("Timestamp: "+rhmd.getTimestamp());
            }
            System.out.println("Message: "+ex.getMessage());
            System.out.println("StatusCode: "+ex.getStatusCode());
            System.out.println("ErrorCode: "+ex.getErrorCode());
            System.out.println("ErrorType: "+ex.getErrorType());
            throw ex;
        }
        return response;
    }

    /**
     *  Command line entry point.
     */
    public static ListFinancialEventsResponse runListFinancialEvents(MWSFinancesServiceClient client, String sellerId, Integer maxResultsPerPage, String amazonOrderId, String financialEventGroupId,
                                              XMLGregorianCalendar postedAfter, XMLGregorianCalendar postedBefore) {

        // Get a client connection.
        // Make sure you've set the variables in MWSFinancesServiceSampleConfig.
//        MWSFinancesServiceClient client = MWSFinancesServiceClient.getClient();

        // Create a request.
        ListFinancialEventsRequest request = new ListFinancialEventsRequest();
//        String sellerId = "example";
        request.setSellerId(sellerId);
//        String mwsAuthToken = "example";
//        request.setMWSAuthToken(mwsAuthToken);
//        Integer maxResultsPerPage = 1;
        if(maxResultsPerPage != null) {
            request.setMaxResultsPerPage(maxResultsPerPage);
        }
//        String amazonOrderId = "example";
        if(amazonOrderId != null && amazonOrderId.length() > 0) {
            request.setAmazonOrderId(amazonOrderId);
        }
//        String financialEventGroupId = "example";
        if(financialEventGroupId != null && financialEventGroupId.length() > 0) {
            request.setFinancialEventGroupId(financialEventGroupId);
        }
//        XMLGregorianCalendar postedAfter = MwsUtl.getDTF().newXMLGregorianCalendar();
        if(postedAfter != null) {
            request.setPostedAfter(postedAfter);
        }
//        XMLGregorianCalendar postedBefore = MwsUtl.getDTF().newXMLGregorianCalendar();
        if(postedAfter != null) {
            request.setPostedBefore(postedBefore);
        }

        // Make the call.
        int i = 0;
        ListFinancialEventsResponse listFinancialEventsResponse = null;
        do{
            i++;
            if(i > 5){
                break;
            }
            listFinancialEventsResponse = ListFinancialEvents.invokeListFinancialEvents(client, request);
        }while (listFinancialEventsResponse == null);

        return listFinancialEventsResponse;
    }

}