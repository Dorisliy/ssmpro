package com.amazonservices.mws.FulfillmentInventory._2010_10_01.samples;

import com.amazonservices.mws.FulfillmentInventory._2010_10_01.FBAInventoryServiceMWSAsyncClient;
import com.amazonservices.mws.FulfillmentInventory._2010_10_01.FBAInventoryServiceMWSClient;

/**
 * Created by KangMin on 2017/2/16.
 */
public class FBAInventoryServiceMWSClientConfig {
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
    private FBAInventoryServiceMWSAsyncClient client = null;

    public void setAccessKey(String accessKey){
        this.accessKey = accessKey;
    }

    public void setSecretKey(String secretKey){
        this.secretKey = secretKey;
    }

    public void setAppName(String appName){
        this.appName = appName;
    }

    public void setAppVersion(String appVersion){
        this.appVersion = appVersion;
    }

    public void setServiceURL(String serviceURL){
        this.serviceURL = serviceURL;
    }

    /**
     * Get a client connection ready to use.
     *
     * @return A ready to use client connection.
     */
    public FBAInventoryServiceMWSClient getClient() {
        return getAsyncClient();
    }

    /**
     * Get an async client connection ready to use.
     *
     * @return A ready to use client connection.
     */
    public synchronized FBAInventoryServiceMWSAsyncClient getAsyncClient() {
        if (client==null) {
            com.amazonservices.mws.FulfillmentInventory._2010_10_01.FBAInventoryServiceMWSConfig config = new com.amazonservices.mws.FulfillmentInventory._2010_10_01.FBAInventoryServiceMWSConfig();
            config.setServiceURL(serviceURL);
            // Set other client connection configurations here.
            client = new FBAInventoryServiceMWSAsyncClient(accessKey, secretKey,
                    appName, appVersion, config, null);
        }
        return client;
    }

}