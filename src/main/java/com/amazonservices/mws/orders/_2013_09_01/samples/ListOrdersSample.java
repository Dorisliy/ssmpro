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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import cn.ssm.project.utils.AmazonUtil;
import com.amazonservices.mws.client.AbstractMwsObject;
import com.amazonservices.mws.client.MwsUtl;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrders;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersClient;
import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersException;
import com.amazonservices.mws.orders._2013_09_01.model.*;
import org.joda.time.DateTime;


/**
 * Sample call for ListOrders.
 */
public class ListOrdersSample {
    public static String SELLERID = "ASGE5N8Y3OYHT";
    public static String MARKETID = "ATVPDKIKX0DER";
    private static MarketplaceWebServiceOrdersClient client = null;
    private static List<Order> orderList = new ArrayList<Order>();

    /**
     * Call the service, log response and exceptions.
     *
     * @param client
     * @param request
     * @return The response.
     */
    public static ListOrdersResponse invokeListOrders(
            MarketplaceWebServiceOrders client,
            ListOrdersRequest request) {
        try {
            // Call the service.
            ListOrdersResponse response = client.listOrders(request);
            ResponseHeaderMetadata rhmd = response.getResponseHeaderMetadata();
            // We recommend logging every the request id and timestamp of every call.
            System.out.println("Response:");
            System.out.println("RequestId: " + rhmd.getRequestId());
            System.out.println("Timestamp: " + rhmd.getTimestamp());
            String responseXml = response.toXML();
            System.out.println(responseXml);
            return response;
        } catch (MarketplaceWebServiceOrdersException ex) {
            // Exception properties are important for diagnostics.
            System.out.println("Service Exception:");
            ResponseHeaderMetadata rhmd = ex.getResponseHeaderMetadata();
            if (rhmd != null) {
                System.out.println("RequestId: " + rhmd.getRequestId());
                System.out.println("Timestamp: " + rhmd.getTimestamp());
            }
            System.out.println("Message: " + ex.getMessage());
            System.out.println("StatusCode: " + ex.getStatusCode());
            System.out.println("ErrorCode: " + ex.getErrorCode());
            System.out.println("ErrorType: " + ex.getErrorType());
            throw ex;
        }
    }

    public static MarketplaceWebServiceOrdersClient getClient() {
        if (client == null) {
            client = MarketplaceWebServiceOrdersSampleConfig.getClient();
        }

        return client;
    }

    public static ListOrdersRequest getListOrdersRequest(String lastUpdatedAfter, String lastUpdatedBefore) {
        // Create a request.
        ListOrdersRequest request = new ListOrdersRequest();
        request.setSellerId(SELLERID);
//        String mwsAuthToken = "example";
//        request.setMWSAuthToken(mwsAuthToken);
//        XMLGregorianCalendar createdAfter = MwsUtl.getDTF().newXMLGregorianCalendar();
//        request.setCreatedAfter(long2Gregorian(str2Date("2014-03-01 15:00:00")));
//        XMLGregorianCalendar createdBefore = MwsUtl.getDTF().newXMLGregorianCalendar();
//        request.setCreatedBefore(createdBefore);
//        XMLGregorianCalendar lastUpdatedAfter = MwsUtl.getDTF().newXMLGregorianCalendar();
        request.setLastUpdatedAfter(AmazonUtil.long2Gregorian(AmazonUtil.str2Date(lastUpdatedAfter)));
//        XMLGregorianCalendar lastUpdatedBefore = MwsUtl.getDTF().newXMLGregorianCalendar();
        request.setLastUpdatedBefore(AmazonUtil.long2Gregorian(AmazonUtil.str2Date(lastUpdatedBefore)));
//        List<String> orderStatus = new ArrayList<String>();
//        request.setOrderStatus(orderStatus);
        List<String> marketplaceId = new ArrayList<String>();
        marketplaceId.add(MARKETID);
        request.setMarketplaceId(marketplaceId);
//        List<String> fulfillmentChannel = new ArrayList<String>();
//        request.setFulfillmentChannel(fulfillmentChannel);
//        List<String> paymentMethod = new ArrayList<String>();
//        request.setPaymentMethod(paymentMethod);
//        String buyerEmail = "example";
//        request.setBuyerEmail(buyerEmail);
//        String sellerOrderId = "example";
//        request.setSellerOrderId(sellerOrderId);
//        Integer maxResultsPerPage = 10;
//        request.setMaxResultsPerPage(maxResultsPerPage);
//        List<String> tfmShipmentStatus = new ArrayList<String>();
//        request.setTFMShipmentStatus(tfmShipmentStatus);

        return request;
    }

    public static ListOrdersByNextTokenRequest getListOrdersByNextTokenRequest(String nextToken) {
        // Create a request.
        ListOrdersByNextTokenRequest request = new ListOrdersByNextTokenRequest();
        request.setSellerId(SELLERID);
//        String mwsAuthToken = "example";
//        request.setMWSAuthToken(mwsAuthToken);
        if (nextToken == null || nextToken.isEmpty()) {
            return null;
        }
        request.setNextToken(nextToken);
        return request;
    }

    public static void syncAmazonOrderByUpdatedDate(String updatedAfter, String updatedBefore) {
        if ((updatedAfter == null || updatedBefore == null) ||
                updatedAfter.compareToIgnoreCase(updatedBefore) > 0) {
            //set updatedAfter to yesetday 00-00-00, updatedBefore to today 00-00-00
            DateTime today = DateTime.now();
            DateTime yesterday = today.minusDays(1);

            updatedAfter = yesterday.toString("yyyy-MM-dd") + " 00:00:00";
            updatedBefore = today.toString("yyyy-MM-dd") + " 00:00:00";
        }

        // Get a client connection.
        // Make sure you've set the variables in MarketplaceWebServiceOrdersSampleConfig.
        MarketplaceWebServiceOrdersClient client = getClient();

        // Make the call.
        int callTimes = 0;
        ListOrdersByNextTokenRequest listOrdersByNextTokenRequest = null;
        ListOrdersResponse listOrdersResponse = null;
        ListOrdersRequest listOrdersRequest = null;
        ListOrdersByNextTokenResponse listOrdersByNextTokenResponse = null;
        try {
            listOrdersRequest = getListOrdersRequest(updatedAfter, updatedBefore);
            listOrdersResponse = ListOrdersSample.invokeListOrders(client, listOrdersRequest);
            callTimes++;
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (listOrdersResponse != null) {
            //Handle the result
            concatOrder(listOrdersResponse);

            if (listOrdersResponse.getListOrdersResult().isSetNextToken() &&
                    !listOrdersResponse.getListOrdersResult().getNextToken().isEmpty()) {
                String nextToken = listOrdersResponse.getListOrdersResult().getNextToken();

                //Prepare the request
                try {
                    listOrdersByNextTokenRequest = getListOrdersByNextTokenRequest(nextToken);
                    listOrdersByNextTokenResponse = ListOrdersByNextTokenSample.invokeListOrdersByNextToken(client, listOrdersByNextTokenRequest);
                    callTimes++;
                } catch (Exception e) {
                    e.printStackTrace();
                }


                while (listOrdersByNextTokenResponse != null) {
                    concatOrder(listOrdersByNextTokenResponse); //handle the result

                    if (listOrdersByNextTokenResponse.getListOrdersByNextTokenResult().isSetNextToken() &&
                            !listOrdersByNextTokenResponse.getListOrdersByNextTokenResult().getNextToken().isEmpty()) {
                        nextToken = listOrdersByNextTokenResponse.getListOrdersByNextTokenResult().getNextToken();

                        //Prepare the request
                        try {
                            listOrdersByNextTokenRequest = getListOrdersByNextTokenRequest(nextToken);
                            listOrdersByNextTokenResponse = ListOrdersByNextTokenSample.invokeListOrdersByNextToken(client, listOrdersByNextTokenRequest);
                            callTimes++;
                            if (callTimes >= 6) {
                                Thread.sleep(1000 * 60); //sleep 60 seconds for more than 6 times - max quota
                            }
                        } catch (MarketplaceWebServiceOrdersException e) {
                            System.out.println(e.getStackTrace().toString());
                            if (e.getStatusCode() == 503) {
                                try {
                                    Thread.sleep(1000 * 60); //sleep 1 minutes
                                } catch (InterruptedException e1) {
                                    e1.printStackTrace();
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        //handle the orders
        try {
            handleOrder();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Command line entry point.
     */
    public static void main(String[] args) {

        try {
            String updatedAfter = "2014-05-01 00:00:00";
            String updatedBefore = "2014-05-05 00:00:00";
            syncAmazonOrderByUpdatedDate(updatedAfter, updatedBefore);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * get all orders from amazonservices.mws
     *
     * @return
     */
    public static void concatOrder(AbstractMwsObject listOrdersResponse) {
        List<Order> orders = null;
        if (listOrdersResponse instanceof ListOrdersResponse) {
            ListOrdersResponse response = (ListOrdersResponse) listOrdersResponse;
            orders = response.getListOrdersResult().getOrders();
        } else if (listOrdersResponse instanceof ListOrdersByNextTokenResponse) {
            ListOrdersByNextTokenResponse response = (ListOrdersByNextTokenResponse) listOrdersResponse;
            orders = response.getListOrdersByNextTokenResult().getOrders();
        }

        if (orders != null && orders.size() > 0) {
            orderList.addAll(orders);
        }
    }

    /**
     * update the mws order to local DB
     *
     * @return
     */
    public static boolean handleOrder() {
        int cnt = orderList.size();
        return true;
    }





}
