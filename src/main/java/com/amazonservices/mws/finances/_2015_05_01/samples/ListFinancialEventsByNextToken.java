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

import java.util.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.amazonservices.mws.client.*;
import com.amazonservices.mws.finances._2015_05_01.*;
import com.amazonservices.mws.finances._2015_05_01.model.*;


/** Sample call for ListFinancialEventsByNextToken. */
public class ListFinancialEventsByNextToken {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static synchronized ListFinancialEventsByNextTokenResponse invokeListFinancialEventsByNextToken(
            MWSFinancesService client, 
            ListFinancialEventsByNextTokenRequest request) throws MWSFinancesServiceException{
        ListFinancialEventsByNextTokenResponse response = null;
        try {
            //This operation has a maximum request quota of 30 and a restore rate of one request every two seconds.
            Thread.sleep(1000 * 2);//wait for 2 seconds to check the first time

            // Call the service.
            response = client.listFinancialEventsByNextToken(request);
            ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
            // We recommend logging every the request id and timestamp of every call.
            System.out.println("Response:");
            System.out.println("RequestId: "+rhmd.getRequestId());
            System.out.println("Timestamp: "+rhmd.getTimestamp());
//            String responseXml = response.toXML();
//            System.out.println(responseXml);

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
            response = null;
        }
        return response;
    }

    /**
     *  Command line entry point.
     */
    public static ListFinancialEventsByNextTokenResponse runListFinancialEventsByNextToken(MWSFinancesServiceClient client, String sellerId, String nextToken) {

        // Get a client connection.
        // Make sure you've set the variables in MWSFinancesServiceSampleConfig.
//        MWSFinancesServiceClient client = MWSFinancesServiceSampleConfig.getClient();

        // Create a request.
        ListFinancialEventsByNextTokenRequest request = new ListFinancialEventsByNextTokenRequest();
//        String sellerId = "example";
        request.setSellerId(sellerId);
//        String mwsAuthToken = "example";
//        request.setMWSAuthToken(mwsAuthToken);
//        String nextToken = "example";
        request.setNextToken(nextToken);

        // Make the call.
        int i = 0;
        ListFinancialEventsByNextTokenResponse listFinancialEventsByNextTokenResponse = null;
        do{
            i++;
            if(i > 5){
                break;
            }
            listFinancialEventsByNextTokenResponse = ListFinancialEventsByNextToken.invokeListFinancialEventsByNextToken(client, request);
        }while (listFinancialEventsByNextTokenResponse == null);

        return  listFinancialEventsByNextTokenResponse;
    }

}
