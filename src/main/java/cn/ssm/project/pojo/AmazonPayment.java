package cn.ssm.project.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AmazonPayment {
    private Integer id;

    private Date createdAt;

    private Integer createdId;

    private Date updatedAt;

    private Integer updatedId;

    private String isactive;

    private String state;

    private Integer clientId;

    private Integer orgId;

    private Integer amazonImportPaymentLogId;

    private Integer cInvoiceId;

    private Integer cInvoiceLineId;

    private Integer mInoutId;

    private Integer mInoutLineId;

    private Integer cOrderId;

    private Integer cOrderLineId;

    private Integer mMovementId;

    private Integer mMovementLineId;

    private Date dateTime;

    private String settleementId;

    private String type;

    private String orderId;

    private String description;

    private BigDecimal quantity;

    private String marketplace;

    private String fulfillment;

    private String orderCity;

    private BigDecimal productSales;

    private BigDecimal shippingCredits;

    private BigDecimal giftWrapCredits;

    private BigDecimal promotionalRebates;

    private BigDecimal salesTaxCollectd;

    private BigDecimal sellingFees;

    private BigDecimal fbaFees;

    private BigDecimal otherTransactionFees;

    private BigDecimal other;

    private BigDecimal total;

    private String importDescription;

    private String isImported;

    private String orderPostal;

    private String orderState;

    private String sku;

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

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive == null ? null : isactive.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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

    public Integer getAmazonImportPaymentLogId() {
        return amazonImportPaymentLogId;
    }

    public void setAmazonImportPaymentLogId(Integer amazonImportPaymentLogId) {
        this.amazonImportPaymentLogId = amazonImportPaymentLogId;
    }

    public Integer getcInvoiceId() {
        return cInvoiceId;
    }

    public void setcInvoiceId(Integer cInvoiceId) {
        this.cInvoiceId = cInvoiceId;
    }

    public Integer getcInvoiceLineId() {
        return cInvoiceLineId;
    }

    public void setcInvoiceLineId(Integer cInvoiceLineId) {
        this.cInvoiceLineId = cInvoiceLineId;
    }

    public Integer getmInoutId() {
        return mInoutId;
    }

    public void setmInoutId(Integer mInoutId) {
        this.mInoutId = mInoutId;
    }

    public Integer getmInoutLineId() {
        return mInoutLineId;
    }

    public void setmInoutLineId(Integer mInoutLineId) {
        this.mInoutLineId = mInoutLineId;
    }

    public Integer getcOrderId() {
        return cOrderId;
    }

    public void setcOrderId(Integer cOrderId) {
        this.cOrderId = cOrderId;
    }

    public Integer getcOrderLineId() {
        return cOrderLineId;
    }

    public void setcOrderLineId(Integer cOrderLineId) {
        this.cOrderLineId = cOrderLineId;
    }

    public Integer getmMovementId() {
        return mMovementId;
    }

    public void setmMovementId(Integer mMovementId) {
        this.mMovementId = mMovementId;
    }

    public Integer getmMovementLineId() {
        return mMovementLineId;
    }

    public void setmMovementLineId(Integer mMovementLineId) {
        this.mMovementLineId = mMovementLineId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getSettleementId() {
        return settleementId;
    }

    public void setSettleementId(String settleementId) {
        this.settleementId = settleementId == null ? null : settleementId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(String marketplace) {
        this.marketplace = marketplace == null ? null : marketplace.trim();
    }

    public String getFulfillment() {
        return fulfillment;
    }

    public void setFulfillment(String fulfillment) {
        this.fulfillment = fulfillment == null ? null : fulfillment.trim();
    }

    public String getOrderCity() {
        return orderCity;
    }

    public void setOrderCity(String orderCity) {
        this.orderCity = orderCity == null ? null : orderCity.trim();
    }

    public BigDecimal getProductSales() {
        return productSales;
    }

    public void setProductSales(BigDecimal productSales) {
        this.productSales = productSales;
    }

    public BigDecimal getShippingCredits() {
        return shippingCredits;
    }

    public void setShippingCredits(BigDecimal shippingCredits) {
        this.shippingCredits = shippingCredits;
    }

    public BigDecimal getGiftWrapCredits() {
        return giftWrapCredits;
    }

    public void setGiftWrapCredits(BigDecimal giftWrapCredits) {
        this.giftWrapCredits = giftWrapCredits;
    }

    public BigDecimal getPromotionalRebates() {
        return promotionalRebates;
    }

    public void setPromotionalRebates(BigDecimal promotionalRebates) {
        this.promotionalRebates = promotionalRebates;
    }

    public BigDecimal getSalesTaxCollectd() {
        return salesTaxCollectd;
    }

    public void setSalesTaxCollectd(BigDecimal salesTaxCollectd) {
        this.salesTaxCollectd = salesTaxCollectd;
    }

    public BigDecimal getSellingFees() {
        return sellingFees;
    }

    public void setSellingFees(BigDecimal sellingFees) {
        this.sellingFees = sellingFees;
    }

    public BigDecimal getFbaFees() {
        return fbaFees;
    }

    public void setFbaFees(BigDecimal fbaFees) {
        this.fbaFees = fbaFees;
    }

    public BigDecimal getOtherTransactionFees() {
        return otherTransactionFees;
    }

    public void setOtherTransactionFees(BigDecimal otherTransactionFees) {
        this.otherTransactionFees = otherTransactionFees;
    }

    public BigDecimal getOther() {
        return other;
    }

    public void setOther(BigDecimal other) {
        this.other = other;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getImportDescription() {
        return importDescription;
    }

    public void setImportDescription(String importDescription) {
        this.importDescription = importDescription == null ? null : importDescription.trim();
    }

    public String getIsImported() {
        return isImported;
    }

    public void setIsImported(String isImported) {
        this.isImported = isImported == null ? null : isImported.trim();
    }

    public String getOrderPostal() {
        return orderPostal;
    }

    public void setOrderPostal(String orderPostal) {
        this.orderPostal = orderPostal == null ? null : orderPostal.trim();
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }
}