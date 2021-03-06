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
 * Marketplace Web Service Orders
 * API Version: 2013-09-01
 * Library Version: 2015-03-05
 * Generated: Tue Mar 03 22:11:23 GMT 2015
 */
package com.amazonservices.mws.orders._2013_09_01.samples;

import java.util.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.amazonservices.mws.client.*;
import com.amazonservices.mws.orders._2013_09_01.*;
import com.amazonservices.mws.orders._2013_09_01.model.*;


/** Sample call for ListOrdersByNextToken. */
public class ListOrdersByNextTokenSample {

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     *
     * @return The response.
     */
    public static ListOrdersByNextTokenResponse invokeListOrdersByNextToken(
            MarketplaceWebServiceOrders client, 
            ListOrdersByNextTokenRequest request) {
        try {
            // Call the service.
            ListOrdersByNextTokenResponse response = client.listOrdersByNextToken(request);
            ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
            // We recommend logging every the request id and timestamp of every call.
            System.out.println("Response:");
            System.out.println("RequestId: "+rhmd.getRequestId());
            System.out.println("Timestamp: "+rhmd.getTimestamp());
            String responseXml = response.toXML();
            System.out.println(responseXml);
            return response;
        } catch (MarketplaceWebServiceOrdersException ex) {
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
    }

    /**
     *  Command line entry point.
     */
    public static void main(String[] args) {

        // Get a client connection.
        // Make sure you've set the variables in MarketplaceWebServiceOrdersSampleConfig.
        MarketplaceWebServiceOrdersClient client = MarketplaceWebServiceOrdersSampleConfig.getClient();

        // Create a request.
        ListOrdersByNextTokenRequest request = new ListOrdersByNextTokenRequest();
        String sellerId = "ASGE5N8Y3OYHT";
        request.setSellerId(sellerId);
//        String mwsAuthToken = "example";
//        request.setMWSAuthToken(mwsAuthToken);
        String nextToken = "q56JyzWQr8GaJqJYLDm0ZIfVkJJPpovRblaUixPnhWd0if6gYlEQOrQzazHyYVyLqBXdLk4iogxpJASl2BeRe2qf7VdDD8CXMJfkjkmB/KGLuyHPV8c8DSJ0wMvlylZkWQWPqGlbsnOf1o9BEOqRQbTmDFouT/EQOnlPu9Fd1x4EqKSCpJblubuZIF9n45mtnrZ4AbBdBTdJQpgkdloGbgX0nivHYIuRJhtsYk77sea5HmwX5IAmwKfxnqm3JqvZfwylPI5qZH4R/NauObWi0Voenh9ps2qNmNmeoQkNOgX8gFC3cVBDMik1wrsqCXYc+f3uqSHIhCc8CbpdPsuu8C9t1T10Pi0tpYC0VcAgzXGLpM6GhG94jYEDUrIQbaP8eeFDq7Ajem85J+mGnr8JMtEwnHe+2Rlq";
        request.setNextToken(nextToken);

        // Make the call.
        ListOrdersByNextTokenSample.invokeListOrdersByNextToken(client, request);

    }

}
