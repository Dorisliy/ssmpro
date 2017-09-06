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

import com.amazonservices.mws.finances._2015_05_01.MWSFinancesServiceAsyncClient;
import com.amazonservices.mws.finances._2015_05_01.MWSFinancesServiceClient;
import com.amazonservices.mws.finances._2015_05_01.MWSFinancesServiceConfig;

/**
 * Configuration for MWSFinancesService samples.
 */
public class MWSFinancesServiceSampleConfig {

    /** Developer AWS access key. */
    private String accessKey = "replaceWithAccessKey";

    /** Developer AWS secret key. */
    private String secretKey = "replaceWithSecretKey";

    /** The client application name. */
    private String appName = "replaceWithAppName";

    /** The client application version. */
    private String appVersion = "replaceWithAppVersion";

    /**
     * The endpoint for region service and version.
     * ex: serviceURL = MWSEndpoint.NA_PROD.toString();
     */
    private String serviceURL = "replaceWithServiceURL";

    /** The client, lazy initialized. Async client is also a sync client. */
    private MWSFinancesServiceAsyncClient client = null;

    public void  setAccessKey(String accessKey){
        this.accessKey = accessKey;
    }

    public String  getAccessKey(){
        return  this.accessKey;
    }

    public void  setSecretKey(String secretKey){
        this.secretKey = secretKey;
    }

    public String  getSecretKey(){
        return  this.secretKey;
    }

    public void  setAppName(String appName){
        this.appName = appName;
    }

    public String  getAppName(){
        return  this.appName;
    }

    public void  setAppVersion(String appVersion){
        this.appVersion = appVersion;
    }

    public String  getAppVersion(){
        return  this.appVersion;
    }

    public void  setServiceURL(String serviceURL){
        this.serviceURL = serviceURL;
    }

    public String  getServiceURL(){
        return  this.serviceURL;
    }

    /**
     * Get a client connection ready to use.
     *
     * @return A ready to use client connection.
     */
    public static MWSFinancesServiceClient getClient() {
        return null;
    }

    /**
     * Get an async client connection ready to use.
     *
     * @return A ready to use client connection.
     */
    public synchronized MWSFinancesServiceAsyncClient getAsyncClient() {
        if (client==null) {
            MWSFinancesServiceConfig config = new MWSFinancesServiceConfig();
            config.setServiceURL(serviceURL);
            // Set other client connection configurations here.
            client = new MWSFinancesServiceAsyncClient(accessKey, secretKey, 
                    appName, appVersion, config, null);
        }
        return client;
    }

}
