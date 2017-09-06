package com.ebay.util;

/**
 * Created by km on 2016/12/30.
 */

import com.ebay.sdk.ApiAccount;
import com.ebay.sdk.ApiContext;
import com.ebay.sdk.ApiCredential;

public class EBayUtil {

    public static ApiContext getApiContext(String strToken){
        String strApplicationID = "kangmin-1ByOneAP-PRD-945f0c763-2ec60cdd";
        String strDeveloperID = "ffc5293a-efd3-44ba-b48b-81635d22fed3";
        String strCertificateID = "PRD-45f0c7631be3-9a06-498e-92c5-8e15";
        ApiContext apiContext = new ApiContext();

        //set Api Token to access eBay Api Server
        ApiCredential cred = apiContext.getApiCredential();
        cred.seteBayToken(strToken);
        ApiAccount apa = new ApiAccount();
        apa.setApplication(strApplicationID);
        apa.setDeveloper(strDeveloperID);
        apa.setCertificate(strCertificateID);
        cred.setApiAccount(apa);

        apiContext.setApiServerUrl("https://api.ebay.com/wsapi");
        return apiContext;
    }
}
