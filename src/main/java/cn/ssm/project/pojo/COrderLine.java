package cn.ssm.project.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class COrderLine {
    private Integer id;

    private Date createdAt;

    private Integer createdId;

    private Date updatedAt;

    private Integer updatedId;

    private String state;

    private String isactive;

    private Integer clientId;

    private Integer orgId;

    private Integer cOrderId;

    private String amazonAsin;

    private String amazonSku;

    private String amazonItemStatus;

    private String amazonProductName;

    private BigDecimal amazonQuantity;

    private String amazonPromotionPromotionIds;

    private BigDecimal amazonPromotionShipPromotionDiscount;

    private BigDecimal amazonPromotionItemPromotionDiscount;

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

    public Integer getcOrderId() {
        return cOrderId;
    }

    public void setcOrderId(Integer cOrderId) {
        this.cOrderId = cOrderId;
    }

    public String getAmazonAsin() {
        return amazonAsin;
    }

    public void setAmazonAsin(String amazonAsin) {
        this.amazonAsin = amazonAsin == null ? null : amazonAsin.trim();
    }

    public String getAmazonSku() {
        return amazonSku;
    }

    public void setAmazonSku(String amazonSku) {
        this.amazonSku = amazonSku == null ? null : amazonSku.trim();
    }

    public String getAmazonItemStatus() {
        return amazonItemStatus;
    }

    public void setAmazonItemStatus(String amazonItemStatus) {
        this.amazonItemStatus = amazonItemStatus == null ? null : amazonItemStatus.trim();
    }

    public String getAmazonProductName() {
        return amazonProductName;
    }

    public void setAmazonProductName(String amazonProductName) {
        this.amazonProductName = amazonProductName == null ? null : amazonProductName.trim();
    }

    public BigDecimal getAmazonQuantity() {
        return amazonQuantity;
    }

    public void setAmazonQuantity(BigDecimal amazonQuantity) {
        this.amazonQuantity = amazonQuantity;
    }

    public String getAmazonPromotionPromotionIds() {
        return amazonPromotionPromotionIds;
    }

    public void setAmazonPromotionPromotionIds(String amazonPromotionPromotionIds) {
        this.amazonPromotionPromotionIds = amazonPromotionPromotionIds == null ? null : amazonPromotionPromotionIds.trim();
    }

    public BigDecimal getAmazonPromotionShipPromotionDiscount() {
        return amazonPromotionShipPromotionDiscount;
    }

    public void setAmazonPromotionShipPromotionDiscount(BigDecimal amazonPromotionShipPromotionDiscount) {
        this.amazonPromotionShipPromotionDiscount = amazonPromotionShipPromotionDiscount;
    }

    public BigDecimal getAmazonPromotionItemPromotionDiscount() {
        return amazonPromotionItemPromotionDiscount;
    }

    public void setAmazonPromotionItemPromotionDiscount(BigDecimal amazonPromotionItemPromotionDiscount) {
        this.amazonPromotionItemPromotionDiscount = amazonPromotionItemPromotionDiscount;
    }
}