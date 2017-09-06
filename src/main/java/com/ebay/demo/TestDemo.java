package com.ebay.demo;

import com.ebay.sdk.call.GetOrdersCall;
import com.ebay.soap.eBLBaseComponents.OrderType;
import com.ebay.soap.eBLBaseComponents.PaginationType;
import com.ebay.soap.eBLBaseComponents.SiteCodeType;
import com.ebay.soap.eBLBaseComponents.TradingRoleCodeType;
import com.ebay.util.EBayUtil;




/**
 * Created by km on 2016/12/14.
 */
public class TestDemo {

    public static void run() {
        String strToken = "AgAAAA**AQAAAA**aAAAAA**84RcWA**nY+sHZ2PrBmdj6wVnY+sEZ2PrA2dj6AHlYOmCZaDpQ2dj6x9nY+seQ**0YoDAA**AAMAAA**EMqrM9AVX+R6Lww7HegRATXOqtNQxXj42jOZl+KueNCrndl8/HndrUA+etTXMe+KiaJ0t46+HQDBmW/PKQniqqaahSrptX14Dt1NJaME8o5u4n1qjxXnxlc98RBZN6XxFqxhBeV07z0qlDEk6aJjVaa5XUQ+gab2kyl5NSaXTKCXkQNMKi5ylPxPqWgnineIsGUg/u5TToww6PeP/wJNoDne206DifZ5q4LV6peVRtDUu01+EXmD677hFIU0ikpFmMc9cSCRYcMRBXPrWePEAo+Ow0bDICcd/x2tD+HQz3NbYBIc9tn3BG7V2Uqff7WQ4FlYa/Ev5cl0mp8D3tnrJtT8P39kWjZKSAhdmXzESu9tJP6kpYnoC9I5pV473/7BL/R0XzzQNpuQ3KKaSTqKALhRQp2tRpuweEFaSbl0B1O26b/zhdW690qVmvPUi2yP89I8p44N7MXZdexfCxcUr1WphTbrHF1bPAb88zUIINBt6getSg786j1T/wJ01I7BIS4+SdcZUnt6isMBjib6IFWV7u7MKozLDtueMhmE2+4jfKRfb1UbNyCxY96iC2K8yWNTRLN0++IfKMmtx3jaDuAhSHqYRKDCN/3CaxFnpvnWicdYiM+bep/ZL0Ipu8bRwgT31nvm7TlftISpeCM/68K1HO02nwuFUSe3fAn9BhAeXKfFRaTr0iH/gc+3scWUlkWzveWW8q4+94DI1+P/XPnmmaU0/cMangjXzN9GwHRwX5HSQFwomXrfGeBb2edh";
        GetOrdersCall api = new GetOrdersCall(EBayUtil.getApiContext(strToken));
        api.setOrderRole(TradingRoleCodeType.SELLER);
//        api.setOrderStatus(OrderStatusCodeType.ACTIVE);
        api.setSite(SiteCodeType.UK);

        java.util.Calendar calTo = java.util.Calendar.getInstance();
        java.util.Calendar calFrom = (java.util.Calendar)calTo.clone();
        calFrom.add(java.util.Calendar.DATE, -3);
//        calTo.add(java.util.Calendar.DATE, -3);
        System.out.println("*******************main 6 ********************calFrom=="+calFrom.getTime());
        api.setCreateTimeFrom(calFrom);
        api.setCreateTimeTo(calTo);
//        api.setModTimeFrom(calFrom);
//        api.setModTimeTo(calTo);
        System.out.println("*******************main 6 ********************calTo=="+calTo.getTime());

        // Make API call.
        try {

//        	api.execute(request)
//        	GetOrdersResponseType api.
//            PaginationResult
//            System.out.println("*******************A=="+api.getReturnedPaginationResult().getAnyLength());
//            System.out.println("*******************B=="+api.getReturnedPaginationResult().getTotalNumberOfEntries());
//            System.out.println("*******************C=="+api.getReturnedPaginationResult().getTotalNumberOfPages());

            PaginationType pagination = new PaginationType();
            pagination.setPageNumber(new Integer(20));
            System.out.println("*******************C=="+api.getReturnedHasMoreOrders());
            api.setPagination(pagination);

            OrderType[] orders = api.getOrders();
            System.out.println("*******************orders=1="+ orders);
            System.out.println("*******************orders.length=1="+ orders.length);

            System.out.println("*******************A=1="+api.getReturnedPaginationResult().getAnyLength());
            System.out.println("*******************B=1="+api.getReturnedPaginationResult().getTotalNumberOfEntries());
            System.out.println("*******************C=1="+api.getReturnedPaginationResult().getTotalNumberOfPages());

//            for(OrderType order:orders){
//                System.out.println("*******************orders=="+order.getOrderID());
//                order.getTransactionArray();
//
//            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



}
