package com.ebay.importData;

import com.ebay.sdk.call.GetOrdersCall;
import com.ebay.soap.eBLBaseComponents.*;
import com.ebay.util.EBayUtil;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by km on 2017/1/6.
 */
public class EBayOrderImport {
/*
    Trx m_Trx = null;
    int lineLineNo = 10;

    public String downloadEBayOrderByOrg(Timestamp dateImportFrom, Timestamp dateImportTo, int AD_Org_ID){
        String result = "";
        int AD_Client_ID = Env.getAD_Client_ID(Env.getCtx());
        if(AD_Client_ID != 1000001){
            Env.setContext(Env.getCtx(), "#AD_Client_ID", 1000001);
        }

        if(dateImportFrom == null || dateImportTo == null){
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = null;
            DateTime today = DateTime.now();
            DateTime dayBeforeYesterday = today.minusDays(2);

            String strImportFrom  = dayBeforeYesterday.toString("yyyy-MM-dd") + " 00:00:00";
            String strImportTo  = today.toString("yyyy-MM-dd") + " 00:00:00";
            try {
                date = format.parse(strImportFrom);
                dateImportFrom = new Timestamp(date.getTime());

                date = format.parse(strImportTo);
                dateImportTo = new Timestamp(date.getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        m_Trx = Trx.get("EBayOrderImport", true);
        String trxName = m_Trx.getTrxName();
        List<X_Amazon_Import_Configure> list = null;
        if(AD_Org_ID > 0){
            list = new Query(Env.getCtx(), X_Amazon_Import_Configure.Table_Name, "AD_Org_ID="+AD_Org_ID + " AND type='EB'", trxName).setOnlyActiveRecords(true).setClient_ID().list();
        }else{
            list = new Query(Env.getCtx(), X_Amazon_Import_Configure.Table_Name, "type='EB'", trxName).setOnlyActiveRecords(true).setClient_ID().list();
        }
        if(list != null && list.size() > 0) {
            for(X_Amazon_Import_Configure configure : list) {
                MEbayImportOrderInfo ebayImportOrderInfo = downloadEBayOrder(dateImportFrom, dateImportTo, configure);//
            }
        }
        m_Trx.commit();
        m_Trx.close();
        m_Trx = null;
        return result;
    }

    public MEbayImportOrderInfo downloadEBayOrder(Timestamp dateImportFrom, Timestamp dateImportTo, X_Amazon_Import_Configure configure) {
        String strToken = configure.getTokenEB();
        List<MEbayImportOrder>  ebayImportOrderList = new ArrayList();
        if(strToken == null || strToken.length() <= 0 ){
            return null;
        }

        if(m_Trx == null){
            m_Trx = Trx.get("EBayOrderImport", true);
        }
        String trxName = m_Trx.getTrxName();

        GetOrdersCall api = new GetOrdersCall(EBayUtil.getApiContext(strToken));//
        api.setOrderRole(TradingRoleCodeType.SELLER);//下载卖家订单（店铺销售单，还可以指定店铺采购单）
//        api.setOrderStatus(OrderStatusCodeType.ACTIVE);//下载订单状态
//        api.setSite(SiteCodeType.UK);//下载订单站点

        Calendar calFrom = Calendar.getInstance();//new Calendar();// java.util.Calendar.getInstance();
        calFrom.setTime(dateImportFrom);
        Calendar calTo = Calendar.getInstance();
        calTo.setTime(dateImportTo);

//        api.setCreateTimeFrom(calFrom);//下载订单的创建日期范围
//        api.setCreateTimeTo(calTo);//下载订单的创建日期范围
        api.setModTimeFrom(calFrom);//下载订单的修改日期范围
        api.setModTimeTo(calTo);//下载订单的修改日期范围

        MEbayImportOrderInfo ebayImportOrderInfo = genMEbayImportOrderInfo(configure, dateImportFrom, dateImportTo, trxName);
        try {
            //设置页码，  eBay取数据是按分页进行
            boolean isRun = true;
            int intPage = 1;
            OrderType[] orders;
            int line = 10;
            while(isRun){
                PaginationType pagination = new PaginationType();
                pagination.setPageNumber(new Integer(intPage++));//
                api.setPagination(pagination);
                orders = api.getOrders();
//                api.getResponseXml();//取到orders里订单集合XML内容

                if(orders != null) {
                    for (OrderType order : orders) {
                        MEbayImportOrder eBayImportOrder = genMEbayImportOrder( ebayImportOrderInfo, order, line, trxName);
                        if(eBayImportOrder != null){
                            ebayImportOrderList.add(eBayImportOrder);
                            line += 10;
                        }
                    }
                }
                isRun = api.getReturnedHasMoreOrders();
            }
            ebayImportOrderInfo.setQtyTotal(new BigDecimal(api.getReturnedPaginationResult().getTotalNumberOfEntries().intValue()));
            ebayImportOrderInfo.save();
            m_Trx.commit();

            //同步到ERP銷售訂單
            for(MEbayImportOrder ebayImportOrder:ebayImportOrderList){
                genSO(ebayImportOrderInfo, ebayImportOrder, configure);
            }
            ebayImportOrderInfo.save();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            m_Trx.rollback();
            m_Trx.close();
            m_Trx = null;
            e.printStackTrace();
        }
        if(m_Trx != null){
            m_Trx.commit();
        }

        return ebayImportOrderInfo;
    }

    public MEbayImportOrderInfo genMEbayImportOrderInfo(X_Amazon_Import_Configure configure, Timestamp dateImportFrom, Timestamp dateImportTo, String trxName){
        String name = "";
        MOrg org = new MOrg(Env.getCtx(), configure.getAD_Org_ID(), trxName);
        Timestamp nowDate = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        name = org.getValue() + "-" + formatter.format(nowDate);
        MEbayImportOrderInfo ebayImportOrderInfo = new MEbayImportOrderInfo(Env.getCtx(), 0, trxName);
        ebayImportOrderInfo.setAD_Org_ID(configure.getAD_Org_ID());
        ebayImportOrderInfo.setName(name);
        ebayImportOrderInfo.setDateImportFrom(dateImportFrom);
        ebayImportOrderInfo.setDateImportTo(dateImportTo);
        ebayImportOrderInfo.setDateImportRun(nowDate);
        ebayImportOrderInfo.setQtyTotal(BigDecimal.ZERO);
        ebayImportOrderInfo.setQtySuccess(BigDecimal.ZERO);
        ebayImportOrderInfo.setQtyExist(BigDecimal.ZERO);
        ebayImportOrderInfo.save();
        return ebayImportOrderInfo;
    }

    public boolean isQueryMEbayImportOrder(MEbayImportOrderInfo ebayImportOrderInfo, OrderType order, String trxName){
        boolean  isExist = false;
        String whereSQL = "AD_Org_ID=" + ebayImportOrderInfo.getAD_Org_ID() + " AND OrderId='" + order.getOrderID() + "' " +
                " AND OrderStatus='" + order.getOrderStatus().value() + "'";
        List<MEbayImportOrder> list = new Query(Env.getCtx(), MEbayImportOrder.Table_Name, whereSQL, trxName).setOnlyActiveRecords(true).setClient_ID().list();
        if(list != null && list.size() > 0){
            isExist = true;
        }
        return isExist;
    }

    public MEbayImportOrder genMEbayImportOrder(MEbayImportOrderInfo ebayImportOrderInfo, OrderType order, int line, String trxName){
        if(isQueryMEbayImportOrder(ebayImportOrderInfo, order, trxName)){
            ebayImportOrderInfo.setQtyExist(ebayImportOrderInfo.getQtyExist().add(new BigDecimal(1)));
            return null;
        }
        MEbayImportOrder ebayImportOrder = new MEbayImportOrder(Env.getCtx(), 0, trxName);
        ebayImportOrder.setAD_Org_ID(ebayImportOrderInfo.getAD_Org_ID());
        ebayImportOrder.setEbay_Import_OrderInfo_ID(ebayImportOrderInfo.getEbay_Import_OrderInfo_ID());
        ebayImportOrder.setLine(line);//行号
        ebayImportOrder.setOrderId(order.getOrderID());//eBay销售单ID
        ebayImportOrder.setOrderStatus(order.getOrderStatus().value());//eBay销售单状态
        ebayImportOrder.setCreatedTime(new Timestamp(order.getCreatedTime().getTimeInMillis()));//订单创建日期
        ebayImportOrder.setCurrencyID(order.getTotal().getCurrencyID().value());//订单总金额的币别
        if(order.getPaymentMethods()!= null && order.getPaymentMethods().length > 0){
            ebayImportOrder.setPaymentMethods(order.getPaymentMethods()[0].value());//订单支付方式
        }
        ebayImportOrder.setSubtotal(new BigDecimal(order.getSubtotal().getValue()));//订单的小计金额是所有订单项次料品的总成本。此值不包括任何运费/手续费，运费保险或销售税费用
        ebayImportOrder.setTotal(new BigDecimal(order.getTotal().getValue()));//总金额等于小计值加上运费/处理，运输保险，营业税成本。
        CheckoutStatusType checkoutStatus= order.getCheckoutStatus();
        if(checkoutStatus != null){
            PaymentStatusCodeType paymentStatusCodeType = checkoutStatus.getEBayPaymentStatus();
            if(paymentStatusCodeType != null){
                ebayImportOrder.setEbayPaymentStatus(paymentStatusCodeType.value());//CheckoutStatus ->付款状态
            }
            if(checkoutStatus.getLastModifiedTime() != null){
                ebayImportOrder.setLastModifiedTime(new Timestamp(checkoutStatus.getLastModifiedTime().getTimeInMillis()));//付款状态时间
            }
        }
        AmountType amountPaid = order.getAmountPaid();
        if(amountPaid != null){
            ebayImportOrder.setAmountPaid(new BigDecimal(amountPaid.getValue()));//订单的支付总金额。包括每个订单项的销售价格，运费和手续费，运输保险（如果买方提供和选择），附加服务和任何应用销售税。买方已完成结账后，返回此值
        }

        ebayImportOrder.setBuyerUserID(order.getBuyerUserID());//eBay订单买方的用户ID
        Calendar paidTime = order.getPaidTime();//订单付款的日期和时间。在买方付款之前，不会返回此字段。对于买家已收到部分或全部退款的订单，不会返回此字段。
        if(paidTime != null){
            ebayImportOrder.setPaidTime(new Timestamp(paidTime.getTimeInMillis()));
        }
        Calendar shippedTime = order.getShippedTime();//订单发货的日期和时间。在订单已标记为已发货之前，不会返回此字段。请注意，卖方能够将发货时间设置为将来的三个日历日。
        if(shippedTime != null){
            ebayImportOrder.setShippedTime(new Timestamp(shippedTime.getTimeInMillis()));
        }
        ebayImportOrder.save();

        TransactionArrayType transactionArrayType = order.getTransactionArray();
        TransactionType[] transactions = transactionArrayType.getTransaction();
        int lineline = 10;
        for(TransactionType transaction:transactions){
            genMEbayImportOrderLine(ebayImportOrder, transaction, lineline,trxName);
            lineline += 10;
        }

        return ebayImportOrder;
    }

    public MEbayImportOrderLine genMEbayImportOrderLine(MEbayImportOrder ebayImportOrder, TransactionType transaction, int line, String trxName){
        MEbayImportOrderLine ebayImportOrderLine = new MEbayImportOrderLine(Env.getCtx(), 0, trxName);
        ebayImportOrderLine.setAD_Org_ID(ebayImportOrder.getAD_Org_ID());
        ebayImportOrderLine.setEbay_Import_Order_ID(ebayImportOrder.getEbay_Import_Order_ID());
        ebayImportOrderLine.setLine(line);
        ebayImportOrderLine.setDateCreated(new Timestamp(transaction.getCreatedDate().getTimeInMillis()));//订单行项目的创建时间
        ItemType itemType = transaction.getItem();
        if(itemType != null){
//            ebayImportOrderLine.setApplicationData(itemType.getApplicationData());
            ebayImportOrderLine.setItemID(itemType.getItemID());//Item->唯一标识项目列表的ID
            SiteCodeType siteCodeType = itemType.getSite();//Item->列出项目的网站的名称。
            if(siteCodeType != null){
                ebayImportOrderLine.setSite(siteCodeType.value());
            }
            ebayImportOrderLine.setTitle(itemType.getTitle());//Item->商品或搜索结果中显示的商品的名称。
            String strSKU = itemType.getSKU();
            if(strSKU != null){
                ebayImportOrderLine.setSKU(itemType.getSKU());
            }else {
                VariationType variationType = transaction.getVariation();  //Variation
                if(variationType != null){
                    ebayImportOrderLine.setSKU(variationType.getSKU());
                }
            }
            if(itemType.getConditionID() != null) {
                ebayImportOrderLine.setConditionID(itemType.getConditionID().toString());//Item->状态标识
            }
            ebayImportOrderLine.setConditionDisplayName(itemType.getConditionDisplayName());//Item->状态显示名称
        }
        ebayImportOrderLine.setQuantityPurchased(new BigDecimal(transaction.getQuantityPurchased().doubleValue()));//购买数量
        ebayImportOrderLine.setTransactionID(transaction.getTransactionID());//订单行项目（事务）的唯一标识符
        ebayImportOrderLine.setTransactionPrice(new BigDecimal(transaction.getTransactionPrice().getValue()));//订单行项目（交易）的价格。此金额不考虑航运，销售税，以及其他有关订单行项目的费用。
        ebayImportOrderLine.setCurrencyID(transaction.getTransactionPrice().getCurrencyID().value());//订单行项目（交易）的价格币别
        ebayImportOrderLine.setTransactionSiteID(transaction.getTransactionSiteID().value());//创建订单行项目（交易）的站点。
        ebayImportOrderLine.setOrderLineItemID(transaction.getOrderLineItemID());//单行项目的唯一标识符
        ebayImportOrderLine.setExtendedOrderID(transaction.getExtendedOrderID());
        ebayImportOrderLine.save();
        return ebayImportOrderLine;
    }

    public void genSO(MEbayImportOrderInfo ebayImportOrderInfo, MEbayImportOrder ebayImportOrder, X_Amazon_Import_Configure configure){
        String trxName = m_Trx.getTrxName();
        MOrder so = genOrder(ebayImportOrderInfo, ebayImportOrder, configure, trxName);
        m_Trx.commit();
        String strDocStatus = getDocStatusOfEBay(ebayImportOrder.getOrderStatus());
        if(strDocStatus != null && strDocStatus.length() > 0 && !so.getDocStatus().equals(strDocStatus)){
            so.setDocAction(strDocStatus); //set the doc action to complete the document
            so.setProcessing(false);
            so.save();
            m_Trx.commit();
            if(so.processIt(strDocStatus)){
                so.save();
            }
        }
        m_Trx.commit();
    }

    public String getDocStatusOfEBay(String strOrderStatus){
        String docStatus ="";
        if(strOrderStatus == null){
            docStatus ="";
        }else if(strOrderStatus.equalsIgnoreCase("Active")){//活跃
            docStatus ="DR";
        }else if(strOrderStatus.equalsIgnoreCase("All")){//所有
            docStatus ="DR";
        }else if(strOrderStatus.equalsIgnoreCase("Authenticated")){//认证
            docStatus ="DR";
        }else if(strOrderStatus.equalsIgnoreCase("Cancelled")){//取消
            docStatus ="VO";
        }else if(strOrderStatus.equalsIgnoreCase("CancelPending")){//买方已启动对订单的取消请求,等待卖家批准或拒绝取消请求
            docStatus ="";
        }else if(strOrderStatus.equalsIgnoreCase("Completed")){//已完成
            docStatus ="CO";
        }else if(strOrderStatus.equalsIgnoreCase("CustomCode")){//自定义代码
            docStatus ="DR";
        }else if(strOrderStatus.equalsIgnoreCase("Default")){//默认值
            docStatus ="DR";
        }else if(strOrderStatus.equalsIgnoreCase("Inactive")){//非活动
            docStatus ="DR";
        }else if(strOrderStatus.equalsIgnoreCase("InProcess")){//进程
            docStatus ="";
        }else if(strOrderStatus.equalsIgnoreCase("Invalid")){//无效
            docStatus ="VO";
        }else if(strOrderStatus.equalsIgnoreCase("Shipped")){////发货
            docStatus ="CO";
        }
        return docStatus;
    }

    public  int queryCurrencyID(String strISOCode, String trxName){
        int currencyID = 0;
        List<MCurrency> list = new Query(Env.getCtx(), MCurrency.Table_Name, "iso_code='" + strISOCode + "' ", trxName).setOnlyActiveRecords(true).setClient_ID().list();
        if(list != null && list.size() > 0){
            currencyID = list.get(1).getC_Currency_ID();
        }
        return currencyID;
    }

    private MOrder genOrder(MEbayImportOrderInfo ebayImportOrderInfo, MEbayImportOrder ebayImportOrder, X_Amazon_Import_Configure configure, String trxName){
        MOrder so = MOrder.getOrderByAmazonId(ebayImportOrder.getOrderId());//根据eBay.OrderId 查找ERP里是否已经存在
        if(so == null) {
            so = new MOrder(Env.getCtx(), 0, trxName);
            so.setAD_OrgTrx_ID(configure.getAD_Org_ID());
            so.setAD_Org_ID(configure.getAD_Org_ID());
            so.setC_DocTypeTarget_ID(configure.getC_DocTypeTarget_ID()); //
            so.setC_DocType_ID(configure.getC_DocType_ID()); //
            so.setC_BPartner_ID(configure.getC_BPartner_ID()); //
            so.setC_Project_ID(configure.getC_Project_ID()); //project
            //1byone erp system client
            so.setC_PaymentTerm_ID(1000000); //immediate
            if (configure.getSalesRep_ID() > 0) {
                so.setSalesRep_ID(configure.getSalesRep_ID());
            } else {
                so.setSalesRep_ID(1000002);
            }
            so.setM_Warehouse_ID(configure.getM_Warehouse_ID());
            if (configure.getM_PriceList_ID() > 0) {
                MPriceList priceList = new MPriceList(Env.getCtx(), configure.getM_PriceList_ID(), trxName);
                so.setM_PriceList_ID(configure.getM_PriceList_ID());//hard code to sales
                if (so.getC_Currency_ID() == 0) {
                    so.setC_Currency_ID(priceList.getC_Currency_ID()); //USD
                }
            }
            //delivery
            so.setDeliveryRule("F"); //hard code to Force
            so.setDeliveryViaRule("P"); //hard code to Pickup
            so.setFreightCostRule("I"); //hard code to included
            so.setPriorityRule("5"); //hard code to Medium
            so.setInvoiceRule("D"); //hard code to after delivery//set invoicing

            so.setAmazonOrderID(ebayImportOrder.getOrderId());//订单ID
            so.setAmazonParchaseDate(ebayImportOrder.getCreatedTime());//创建日期
            so.setDateOrdered(so.getAmazonParchaseDate());
            so.setDatePromised(so.getAmazonParchaseDate());

            so.setDocStatus("DR"); //always set the document to Draft status as new
        }
        int currency_ID = queryCurrencyID(ebayImportOrder.getCurrencyID(), trxName);
        if (currency_ID > 0) {
            so.setC_Currency_ID(currency_ID);
        }
        so.setAmazonOrderStatus(ebayImportOrder.getOrderStatus());//状态
        so.setAmazonLastUpdatedDate(ebayImportOrder.getLastModifiedTime());//付款状态时间
        so.setTotalLines(ebayImportOrder.getSubtotal());//小计金额
        so.setGrandTotal(ebayImportOrder.getTotal());//total
        so.save();
        ebayImportOrder.setC_Order_ID(so.getC_Order_ID());
        ebayImportOrder.save();

        lineLineNo = 10;
        MOrderLine[] scLines = so.getLines (null, "");
        if(scLines != null && scLines.length > 0){
            lineLineNo = (10 * scLines.length) + 10;
        }
        String strWhereClause = "Ebay_Import_Order_ID ="+ebayImportOrder.getEbay_Import_Order_ID();
        List<MEbayImportOrderLine> ebayImportOrderLineList = MEbayImportOrder.getMEbayImportOrderLine(strWhereClause, null, true);
        if(ebayImportOrderLineList != null) {
            for (MEbayImportOrderLine ebayImportOrderLine:ebayImportOrderLineList) {
                genOrderLine(ebayImportOrderInfo, so, ebayImportOrderLine, null, null, trxName);
            }
        }
        return so;
    }

    */
/****
     * @param so
     * @param  ebayImportOrderLine
     * @param  coboProduct   组合商品(SKU)，例：ebayImportOrderLine.SKU 对应多个ChildSKU
     * @param  trxName
     * @return
     *//*

    private MOrderLine genOrderLine(MEbayImportOrderInfo ebayImportOrderInfo, MOrder so, MEbayImportOrderLine ebayImportOrderLine, MOBOCoboProduct  coboProduct, BigDecimal priceChild, String trxName){
        MOrderLine soLine = null;
        String SKU = ebayImportOrderLine.getSKU();
        BigDecimal quantityPurchased = ebayImportOrderLine.getQuantityPurchased();
        BigDecimal price = ebayImportOrderLine.getTransactionPrice();
        String strType = "EB";

        List<MOBOCoboProduct> coboProductList = null;
        if(coboProduct == null){
            coboProductList = MOBOCoboProduct.getCoboProRecordList(Env.getCtx(), so.getAD_Org_ID(), SKU,null,strType,trxName);
        }else{
            SKU = coboProduct.getChildSKU();
            quantityPurchased = quantityPurchased.multiply(coboProduct.getQuantity());
            price = priceChild;
        }
        if(coboProductList != null && coboProductList.size() > 0){//组合商品需要使用递归此方法创建销售订单行
            BigDecimal price_2 = price;
            for(MOBOCoboProduct coboProduct2:coboProductList){
                if(price_2 != null && price_2.compareTo(BigDecimal.ZERO) != 0 && coboProduct2.getQuantity().compareTo(BigDecimal.ONE) != 0){
                    price_2 = price_2.divide(coboProduct2.getQuantity(), 4, BigDecimal.ROUND_HALF_UP);
                }
                soLine = genOrderLine(ebayImportOrderInfo, so, ebayImportOrderLine, coboProduct2, price_2, trxName);//递归调用
                price_2 = BigDecimal.ZERO; //
            }
        }else{
            MProduct product = MProduct.getProductFromMapping(SKU, strType, so.getAD_Org_ID());
            if(product == null){
                ebayImportOrderInfo.setQtyFail(ebayImportOrderInfo.getQtyFail().add(BigDecimal.ONE));
                return null;
            }
            String strWhereClause = " AND AmazonASIN='" + ebayImportOrderLine.getItemID() + "' AND M_Product_ID=" + product.getM_Product_ID();//一个订单多个组合商品里有相同商品
            MOrderLine[] scLines = so.getLines (strWhereClause, "");
            if(scLines != null && scLines.length > 0){
                soLine = scLines[0];
            }
            if(soLine == null) {
                soLine = new MOrderLine(Env.getCtx(), 0, trxName);
                soLine.setAD_Org_ID(so.getAD_Org_ID());
                soLine.setC_Order_ID(so.getC_Order_ID());
                soLine.setLine(lineLineNo);
                soLine.setM_Product_ID(product.getM_Product_ID());
                soLine.setC_UOM_ID(product.getC_UOM_ID());
                soLine.setC_BPartner_ID(so.getC_BPartner_ID());
                soLine.setC_BPartner_Location_ID(so.getC_BPartner_Location_ID());
                soLine.setDatePromised(so.getDatePromised());
                soLine.setDateOrdered(so.getDateOrdered());
                soLine.setM_Warehouse_ID(so.getM_Warehouse_ID());

                soLine.setAmazonASIN(ebayImportOrderLine.getItemID());
                soLine.setAmazonSKU(ebayImportOrderLine.getSKU());//eBay->SKU

                soLine.setC_Tax_ID(1000000);
                soLine.setQtyLostSales(new BigDecimal(0));

                if(so.getC_Project_ID() > 0){  //project
                    soLine.setC_Project_ID(so.getC_Project_ID());
                }
                lineLineNo += 10;
            }
            soLine.setQty(quantityPurchased);
            soLine.setAmazonQuantity(quantityPurchased);//采购数量
            soLine.setAmazonItemStatus(ebayImportOrderLine.getConditionID() );//Item->状态标识
            soLine.setPrice(price);
//            scLine.setLineNetAmt(ebayImportOrderLine.getTransactionPrice());

            if(soLine.save()){
                ebayImportOrderInfo.setQtySuccess(ebayImportOrderInfo.getQtySuccess().add(BigDecimal.ONE));
                genEbayImportOrderLineMap(ebayImportOrderLine, soLine, coboProduct, trxName);
            }else{
                ebayImportOrderInfo.setQtyFail(ebayImportOrderInfo.getQtyFail().add(BigDecimal.ONE));
            }; //save the order line now
        }
        return  soLine;
    }

    private X_Ebay_Import_OrderLineMapp genEbayImportOrderLineMap(MEbayImportOrderLine ebayImportOrderLine, MOrderLine soLine, MOBOCoboProduct  coboProduct, String trxName){
        X_Ebay_Import_OrderLineMapp orderLineMapp = null;
        String whereClause = "Ebay_Import_OrderLine_ID=" + ebayImportOrderLine.getEbay_Import_OrderLine_ID() + " AND C_OrderLine_ID=" + soLine.getC_OrderLine_ID();
        List<X_Ebay_Import_OrderLineMapp> list = new Query(Env.getCtx(), X_Ebay_Import_OrderLineMapp.Table_Name, whereClause, trxName).list();
        if(list != null && list.size() > 0){
            orderLineMapp = list.get(0);
        }
        if(orderLineMapp == null){
            orderLineMapp = new X_Ebay_Import_OrderLineMapp(Env.getCtx(), 0, trxName);
            orderLineMapp.setAD_Org_ID(ebayImportOrderLine.getAD_Org_ID());
            orderLineMapp.setEbay_Import_OrderLine_ID(ebayImportOrderLine.getEbay_Import_OrderLine_ID());
            orderLineMapp.setC_OrderLine_ID(soLine.getC_OrderLine_ID());
        }

        orderLineMapp.setQuantity(soLine.getQtyEntered());
        if(coboProduct != null){
            orderLineMapp.setOBO_CoboProduct_ID(coboProduct.getOBO_CoboProduct_ID());
            orderLineMapp.setSKU(coboProduct.getSKU());
            orderLineMapp.setChildSKU(coboProduct.getChildSKU());
        }else{
            orderLineMapp.setSKU(soLine.getAmazonSKU());
        }
        orderLineMapp.save();
        return  orderLineMapp;
    }

*/
}
