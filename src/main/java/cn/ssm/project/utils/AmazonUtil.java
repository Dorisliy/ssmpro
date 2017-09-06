package cn.ssm.project.utils;


import com.amazonservices.mws.orders._2013_09_01.MarketplaceWebServiceOrdersClient;
import com.amazonservices.mws.orders._2013_09_01.samples.MarketplaceWebServiceOrdersSampleConfig;
import org.joda.time.DateTime;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by ayang on 11/7/15.
 */
public class AmazonUtil {
    private static MarketplaceWebServiceOrdersClient client = null;

    /** amazon identity **/
//    public final static String MWS_SELLER_ID = "ASGE5N8Y3OYHT";
//    public final static String MWS_MARKET_PLACE_ID = "ATVPDKIKX0DER";
//    public final static String MWS_ACCESS_KEY = "AKIAIV4LJOLMKO6YK2EA";
//    public final static String MWS_SECRET_KEY = "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";
    public final static String MWS_SELLER_ID = "A26IMHULYH7PHY";
    public final static String MWS_MARKET_PLACE_ID = "ATVPDKIKX0DER";
    public final static String MWS_ACCESS_KEY = "AKIAIHOAQ6CFMBH35O7Q";
    public final static String MWS_SECRET_KEY = "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";
    public final static String MWS_APP_NAME = "Yunzhou";
    public final static String MWS_APP_VERSION = "1.0.1";

    /** amazon order **/
    public final static String MWS_REPORT_ORDER_TRACKING = "_GET_XML_ALL_ORDERS_DATA_BY_LAST_UPDATE_";
    /** amazon payment **/
    public final static String MWS_REPORT_TRANSACTION = "_GET_FLAT_FILE_OFFAMAZONPAYMENTS_SETTLEMENT_DATA_";

    /** amazon inventory receipt **/
    public final static String MWS_REPORT_INVENTORY_RECEIPT = "_GET_FBA_FULFILLMENT_INVENTORY_RECEIPTS_DATA_";

    //制表符分隔的文本文件。报告内容接近实时更新。仅针对亚马逊物流卖家。针对商城和卖家平台卖家。
    public final static String MWS_REPORT_AFN_INVENTORY = "_GET_AFN_INVENTORY_DATA_";//亚马逊物流库存报告

    //制表符分隔的文本文件。报告内容接近实时更新。仅针对亚马逊物流卖家。针对商城和卖家平台卖家。
    public final static String MWS_REPORT_SETTLEMENT_REPORT_DATA_FLAT_FILE_V2= "_GET_V2_SETTLEMENT_REPORT_DATA_FLAT_FILE_V2_";//结算报告

    //亚马逊自动计划生成的 XML 文件格式的结算报告；不能通过 RequestReport 请求生成。针对卖家平台卖家。
    public final static String MWS_REPORT_SETTLEMENT_REPORT_DATA_XML= "_GET_V2_SETTLEMENT_REPORT_DATA_XML_";//结算报告

    //制表符分隔的文本文件。报告内容接近实时更新。仅针对亚马逊物流卖家。针对商城和卖家平台卖家。
    public final static String MWS_REPORT_SETTLEMENT_REPORT_DATA_FLAT_FILE_= "_GET_V2_SETTLEMENT_REPORT_DATA_FLAT_FILE_";//结算报告



    private static TimeZone USER_TIMEZONE = TimeZone.getTimeZone("PRC");

    private static TimeZone GMT_TIMEZONE = TimeZone.getTimeZone("GMT");


    public static MarketplaceWebServiceOrdersClient getClient() {
        if (client == null) {
            client = MarketplaceWebServiceOrdersSampleConfig.getClient();
        }

        return client;
    }

    public static XMLGregorianCalendar long2Gregorian(Date date) {
        DatatypeFactory dataTypeFactory;
        try {
            dataTypeFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTimeInMillis(date.getTime());
        return dataTypeFactory.newXMLGregorianCalendar(gc);
    }

    public static Timestamp str2Timestamp(String str,String formate) {
        SimpleDateFormat sdf = new SimpleDateFormat(formate);
        Date date = null;
        Timestamp timestamp = null;
        try {
            date = sdf.parse(str);
            timestamp = new Timestamp(date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return timestamp;
    }

    public static Date str2Date(String str) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Date UTCStr2Date(String str) {
        DateTime dateTime = new DateTime(str);
        return dateTime.toDate();
    }

    public static Timestamp UTCStr2Timestamp(String str) {
        DateTime dateTime = new DateTime(str);
        return new Timestamp(dateTime.getMillis());
    }

    public static Timestamp UTCStr2TimestampMinusHours(String str, String strTimeZone) {
        DateTime dateTime = new DateTime(str);
        if(strTimeZone != null){
            TimeZone timeZone = TimeZone.getTimeZone(strTimeZone);
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            outputFormat.setTimeZone(timeZone);
            str = outputFormat.format(dateTime.toDate());
            return Timestamp.valueOf(str);
        }
        return new Timestamp(dateTime.getMillis());
    }

    /**
     * 为了转换亚马逊的payment信息中的date/time
     * 格式为 Jan 1, 2016 2:01:56 AM PST”，将其转换
     * 为Timestamp，Locale为US
     * @param str eg: Jan 1, 2016 2:01:56 AM PST
     * @return
     */
    public static Timestamp PaymentStr2TimestampMinusHours(String str) throws ParseException {
        SimpleDateFormat sdf = null;
        if(str.contains("PST") || str.contains("PDT")) {
            String timeType = str.substring(str.length() - 3);
            sdf = new SimpleDateFormat("MMM dd',' yyyy HH:mm:ss a '" + timeType + "'", Locale.US);
        }else if(str.contains("GMT")){
            sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss 'GMT+00:00'", Locale.UK);
        }else if(str.contains("JST")){
            sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss'JST'", Locale.JAPAN);
        }
        Date date =sdf.parse(str);
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp;
    }

    public static String reviewTimeStr2TimeStamp(String str, String country){
        SimpleDateFormat sdf = null;
        if(country.equals("US")) {
            sdf = new SimpleDateFormat("MMM dd',' yyyy", Locale.US);
        }else if(country.equals("UK")){
            sdf = new SimpleDateFormat("dd MMM yyyy", Locale.UK);
        }else if(country.equals("DE")){
            sdf = new SimpleDateFormat("dd'.' MMM yyyy", Locale.GERMANY);
        }else if(country.equals("JP")){
            sdf = new SimpleDateFormat("yyyy年MM月dd日", Locale.JAPAN);
        }
        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return str;
        }
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp.toString().substring(0, 10);
    }

    public static Timestamp receiptTimeStr2TimeStamp (String str) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (str.indexOf("T") >= 0) {
            format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'+'00:00");
        }
        Date date = format.parse(str);
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp;
    }

    public static Timestamp receiptTimeStr2TimeStampByXerxes (String str) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (str.indexOf("T") >= 0) {
            format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
            StringBuilder sb=new StringBuilder();
            sb.append(str).insert(19, "GMT");
            str = sb.toString();
        }
        Date date = format.parse(str);
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp;
    }
    /**
     * @return
     */
    public static BigDecimal PaymentStr2BigDecimal(String str, NumberFormat nf) throws ParseException {
        Number number =nf.parse(str);
        BigDecimal amt = new BigDecimal(number.toString());
        return amt;
    }

    public static String setReportFileName(String updatedAfter, String updatedBefore, String reportType, String orgName){
        String reportFileName = orgName + "_" + updatedAfter.substring(0, 10) + "_" + updatedBefore.substring(0, 10);
        String fileName = null;
        if(reportType.equals(MWS_REPORT_TRANSACTION)){
            reportFileName = reportFileName + "_payment.txt";
            fileName = "payment";
        }else if(reportType.equals(MWS_REPORT_ORDER_TRACKING)){
            reportFileName = reportFileName + "_order" + System.currentTimeMillis() + ".xml";
            fileName = "orders";
        }else if(reportType.equals(MWS_REPORT_INVENTORY_RECEIPT)){
            reportFileName = reportFileName + "_inventory_receipt" + System.currentTimeMillis() + ".csv";
            fileName = "inventoryReceipt";
        }else if(reportType.equals(MWS_REPORT_AFN_INVENTORY)){
            reportFileName = reportFileName + "_AFN_Inventory" + System.currentTimeMillis() + ".txt";
            fileName = "inventoryReceipt";
        }else if(reportType.equals(MWS_REPORT_SETTLEMENT_REPORT_DATA_FLAT_FILE_V2)){
            reportFileName = reportFileName + "_settlement_V2_" + System.currentTimeMillis() + ".txt";
            fileName = "settlementReceipt";
        }else if(reportType.equals(MWS_REPORT_SETTLEMENT_REPORT_DATA_XML)){
            reportFileName = reportFileName + "_settlement_XML_" + System.currentTimeMillis() + ".xml";
            fileName = "settlementReceipt";
        }else if(reportType.equals(MWS_REPORT_SETTLEMENT_REPORT_DATA_FLAT_FILE_)){
            reportFileName = reportFileName + "_settlement_" + System.currentTimeMillis() + ".txt";
            fileName = "settlementReceipt";
        }
        reportFileName = System.getProperty("user.dir") + "/amazon_reports/" + fileName + "/" + reportFileName;
        return reportFileName;
    }


    /**
     *convertagmtcalendartoalocalcalendarjustmodifyitstimezonebut
     *willnotchangeitstime
     *@paramtime
     *@return
     */
    public static Calendar convertGMTToCNTime(Calendar time) {
        time.setTimeZone(GMT_TIMEZONE);
        Calendar cnTime = Calendar.getInstance();
        int begin_year = time.get(Calendar.YEAR);
        int begin_month = time.get(Calendar.MONTH);
        int begin_day = time.get(Calendar.DAY_OF_MONTH);
        int begin_hour = time.get(Calendar.HOUR_OF_DAY);
        int begin_minute = time.get(Calendar.MINUTE);
        int begin_second = time.get(Calendar.SECOND);
        cnTime.set(Calendar.YEAR, begin_year);
        cnTime.set(Calendar.MONTH, begin_month);
        cnTime.set(Calendar.DAY_OF_MONTH, begin_day);
        cnTime.set(Calendar.HOUR_OF_DAY, begin_hour);
        cnTime.set(Calendar.MINUTE, begin_minute);
        cnTime.set(Calendar.SECOND, begin_second);
        return cnTime;
    }

    /**
     *convertalocalcalendartoagmtcalendaronlychangeitstimezonebut
     *willnotchangeitstime
     *@paramcnTime
     *@return
     */
    public static Calendar convertCNTimeToGMT(Calendar cnTime) {
        Calendar result = new GregorianCalendar(GMT_TIMEZONE);
        int year = cnTime.get(Calendar.YEAR);
        int month = cnTime.get(Calendar.MONTH);
        int day = cnTime.get(Calendar.DAY_OF_MONTH);
        int hour = cnTime.get(Calendar.HOUR_OF_DAY);
        int minute = cnTime.get(Calendar.MINUTE);
        int second = cnTime.get(Calendar.SECOND);
        result.set(Calendar.YEAR, year);
        result.set(Calendar.MONTH, month);
        result.set(Calendar.DAY_OF_MONTH, day);
        result.set(Calendar.HOUR_OF_DAY, hour);
        result.set(Calendar.MINUTE, minute);
        result.set(Calendar.SECOND, second);
        return result;
    }

    public static int daysBetween(Timestamp smdate,Timestamp bdate) throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = smdate.getTime();// cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = bdate.getTime();//cal.getTimeInMillis();
        double between_days=(time2-time1)/((double)(1000*24*60*60));
        return (int)Math.ceil(between_days);
    }

    public static Timestamp addDay(Timestamp date, int day) {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(date.getTime() + ((long) day) * 24 * 3600 * 1000);
        return new Timestamp(c.getTime().getTime());
    }

//    public static void main(String[] args){
//        System.out.println(UTCStr2TimestampMinusHours("2015-12-25T15:59:03+00:00", "America/Los_Angeles"));
//    }
}
