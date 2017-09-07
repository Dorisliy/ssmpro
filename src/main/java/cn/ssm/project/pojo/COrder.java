package cn.ssm.project.pojo;

import java.util.Date;

public class COrder {
    private Integer id;

    private Date createdAt;

    private Integer createdId;

    private Date updatedAt;

    private Integer updatedId;

    private String state;

    private String isactive;

    private Integer clientId;

    private Integer orgId;

    private String isSotrx;

    private String documentNo;

    private String amazonOrderId;

    private String amazonMerchantOrderId;

    private Date amazonPurchaseDate;

    private Date amazonLastupdatedDate;

    private String amazonOrderStatus;

    private String amazonSalesChannel;

    private String amazonFulfillmentChannel;

    private String amazonShipServiceLevel;

    private String amazonShipState;

    private String amazonShipPostalCode;

    private String amazonShipCountry;

    private String amazonShipCity;

    private String amazonIsBusinessOrder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedId() {
        return createdId;
    }

    public void setCreatedId(Integer createdId) {
        this.createdId = createdId;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUpdatedId() {
        return updatedId;
    }

    public void setUpdatedId(Integer updatedId) {
        this.updatedId = updatedId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive == null ? null : isactive.trim();
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getIsSotrx() {
        return isSotrx;
    }

    public void setIsSotrx(String isSotrx) {
        this.isSotrx = isSotrx == null ? null : isSotrx.trim();
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo == null ? null : documentNo.trim();
    }

    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId == null ? null : amazonOrderId.trim();
    }

    public String getAmazonMerchantOrderId() {
        return amazonMerchantOrderId;
    }

    public void setAmazonMerchantOrderId(String amazonMerchantOrderId) {
        this.amazonMerchantOrderId = amazonMerchantOrderId == null ? null : amazonMerchantOrderId.trim();
    }

    public Date getAmazonPurchaseDate() {
        return amazonPurchaseDate;
    }

    public void setAmazonPurchaseDate(Date amazonPurchaseDate) {
        this.amazonPurchaseDate = amazonPurchaseDate;
    }

    public Date getAmazonLastupdatedDate() {
        return amazonLastupdatedDate;
    }

    public void setAmazonLastupdatedDate(Date amazonLastupdatedDate) {
        this.amazonLastupdatedDate = amazonLastupdatedDate;
    }

    public String getAmazonOrderStatus() {
        return amazonOrderStatus;
    }

    public void setAmazonOrderStatus(String amazonOrderStatus) {
        this.amazonOrderStatus = amazonOrderStatus == null ? null : amazonOrderStatus.trim();
    }

    public String getAmazonSalesChannel() {
        return amazonSalesChannel;
    }

    public void setAmazonSalesChannel(String amazonSalesChannel) {
        this.amazonSalesChannel = amazonSalesChannel == null ? null : amazonSalesChannel.trim();
    }

    public String getAmazonFulfillmentChannel() {
        return amazonFulfillmentChannel;
    }

    public void setAmazonFulfillmentChannel(String amazonFulfillmentChannel) {
        this.amazonFulfillmentChannel = amazonFulfillmentChannel == null ? null : amazonFulfillmentChannel.trim();
    }

    public String getAmazonShipServiceLevel() {
        return amazonShipServiceLevel;
    }

    public void setAmazonShipServiceLevel(String amazonShipServiceLevel) {
        this.amazonShipServiceLevel = amazonShipServiceLevel == null ? null : amazonShipServiceLevel.trim();
    }

    public String getAmazonShipState() {
        return amazonShipState;
    }

    public void setAmazonShipState(String amazonShipState) {
        this.amazonShipState = amazonShipState == null ? null : amazonShipState.trim();
    }

    public String getAmazonShipPostalCode() {
        return amazonShipPostalCode;
    }

    public void setAmazonShipPostalCode(String amazonShipPostalCode) {
        this.amazonShipPostalCode = amazonShipPostalCode == null ? null : amazonShipPostalCode.trim();
    }

    public String getAmazonShipCountry() {
        return amazonShipCountry;
    }

    public void setAmazonShipCountry(String amazonShipCountry) {
        this.amazonShipCountry = amazonShipCountry == null ? null : amazonShipCountry.trim();
    }

    public String getAmazonShipCity() {
        return amazonShipCity;
    }

    public void setAmazonShipCity(String amazonShipCity) {
        this.amazonShipCity = amazonShipCity == null ? null : amazonShipCity.trim();
    }

    public String getAmazonIsBusinessOrder() {
        return amazonIsBusinessOrder;
    }

    public void setAmazonIsBusinessOrder(String amazonIsBusinessOrder) {
        this.amazonIsBusinessOrder = amazonIsBusinessOrder == null ? null : amazonIsBusinessOrder.trim();
    }
}