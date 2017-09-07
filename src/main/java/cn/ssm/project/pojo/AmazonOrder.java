package cn.ssm.project.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AmazonOrder {
    private Integer id;

    private Date createdAt;

    private Integer createdId;

    private Date updatedAt;

    private Integer updatedId;

    private String state;

    private String isactive;

    private Integer clinetId;

    private Integer orgId;

    private Integer cOrderId;

    private Integer amazonImportOrderLogId;

    private String name;

    private String amazonOrderId;

    private String merchantOrderId;

    private Date purchaseDate;

    private Date lastupdatedDate;

    private String orderStatus;

    private String salesChannel;

    private String fulfillFulfillmentChannel;

    private String fulfillShipServiceLevel;

    private String fulfillAddressCity;

    private String fulfillAddressState;

    private String fulfillAddressPostalCode;

    private String fulfillAddressCountry;

    private String isBusinessOrder;

    private String orderItemAsin;

    private String orderItemSku;

    private String orderItemItemStatus;

    private String orderItemProductName;

    private BigDecimal orderItemQuantity;

    private String isImported;

    private String importFailorderProcess;

    private String importStatus;

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

    public Integer getClinetId() {
        return clinetId;
    }

    public void setClinetId(Integer clinetId) {
        this.clinetId = clinetId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getcOrderId() {
        return cOrderId;
    }

    public void setcOrderId(Integer cOrderId) {
        this.cOrderId = cOrderId;
    }

    public Integer getAmazonImportOrderLogId() {
        return amazonImportOrderLogId;
    }

    public void setAmazonImportOrderLogId(Integer amazonImportOrderLogId) {
        this.amazonImportOrderLogId = amazonImportOrderLogId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId == null ? null : amazonOrderId.trim();
    }

    public String getMerchantOrderId() {
        return merchantOrderId;
    }

    public void setMerchantOrderId(String merchantOrderId) {
        this.merchantOrderId = merchantOrderId == null ? null : merchantOrderId.trim();
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getLastupdatedDate() {
        return lastupdatedDate;
    }

    public void setLastupdatedDate(Date lastupdatedDate) {
        this.lastupdatedDate = lastupdatedDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel == null ? null : salesChannel.trim();
    }

    public String getFulfillFulfillmentChannel() {
        return fulfillFulfillmentChannel;
    }

    public void setFulfillFulfillmentChannel(String fulfillFulfillmentChannel) {
        this.fulfillFulfillmentChannel = fulfillFulfillmentChannel == null ? null : fulfillFulfillmentChannel.trim();
    }

    public String getFulfillShipServiceLevel() {
        return fulfillShipServiceLevel;
    }

    public void setFulfillShipServiceLevel(String fulfillShipServiceLevel) {
        this.fulfillShipServiceLevel = fulfillShipServiceLevel == null ? null : fulfillShipServiceLevel.trim();
    }

    public String getFulfillAddressCity() {
        return fulfillAddressCity;
    }

    public void setFulfillAddressCity(String fulfillAddressCity) {
        this.fulfillAddressCity = fulfillAddressCity == null ? null : fulfillAddressCity.trim();
    }

    public String getFulfillAddressState() {
        return fulfillAddressState;
    }

    public void setFulfillAddressState(String fulfillAddressState) {
        this.fulfillAddressState = fulfillAddressState == null ? null : fulfillAddressState.trim();
    }

    public String getFulfillAddressPostalCode() {
        return fulfillAddressPostalCode;
    }

    public void setFulfillAddressPostalCode(String fulfillAddressPostalCode) {
        this.fulfillAddressPostalCode = fulfillAddressPostalCode == null ? null : fulfillAddressPostalCode.trim();
    }

    public String getFulfillAddressCountry() {
        return fulfillAddressCountry;
    }

    public void setFulfillAddressCountry(String fulfillAddressCountry) {
        this.fulfillAddressCountry = fulfillAddressCountry == null ? null : fulfillAddressCountry.trim();
    }

    public String getIsBusinessOrder() {
        return isBusinessOrder;
    }

    public void setIsBusinessOrder(String isBusinessOrder) {
        this.isBusinessOrder = isBusinessOrder == null ? null : isBusinessOrder.trim();
    }

    public String getOrderItemAsin() {
        return orderItemAsin;
    }

    public void setOrderItemAsin(String orderItemAsin) {
        this.orderItemAsin = orderItemAsin == null ? null : orderItemAsin.trim();
    }

    public String getOrderItemSku() {
        return orderItemSku;
    }

    public void setOrderItemSku(String orderItemSku) {
        this.orderItemSku = orderItemSku == null ? null : orderItemSku.trim();
    }

    public String getOrderItemItemStatus() {
        return orderItemItemStatus;
    }

    public void setOrderItemItemStatus(String orderItemItemStatus) {
        this.orderItemItemStatus = orderItemItemStatus == null ? null : orderItemItemStatus.trim();
    }

    public String getOrderItemProductName() {
        return orderItemProductName;
    }

    public void setOrderItemProductName(String orderItemProductName) {
        this.orderItemProductName = orderItemProductName == null ? null : orderItemProductName.trim();
    }

    public BigDecimal getOrderItemQuantity() {
        return orderItemQuantity;
    }

    public void setOrderItemQuantity(BigDecimal orderItemQuantity) {
        this.orderItemQuantity = orderItemQuantity;
    }

    public String getIsImported() {
        return isImported;
    }

    public void setIsImported(String isImported) {
        this.isImported = isImported == null ? null : isImported.trim();
    }

    public String getImportFailorderProcess() {
        return importFailorderProcess;
    }

    public void setImportFailorderProcess(String importFailorderProcess) {
        this.importFailorderProcess = importFailorderProcess == null ? null : importFailorderProcess.trim();
    }

    public String getImportStatus() {
        return importStatus;
    }

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus == null ? null : importStatus.trim();
    }
}