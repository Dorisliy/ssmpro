package cn.ssm.project.pojo;

import java.util.Date;

public class AmazonImportConfigure {
    private Integer id;

    private Date createdAt;

    private Integer createdId;

    private Date updatedAt;

    private Integer updatedId;

    private String isactive;

    private String state;

    private Integer clientId;

    private Integer orgId;

    private Integer bpartnerId;

    private Integer doctypeId;

    private Integer doctypetargetId;

    private Integer projectId;

    private Integer pricelistId;

    private Integer warehouseId;

    private String url;

    private String mwsAccessKey;

    private String mwsMarketplaceId;

    private String mwsSecretKey;

    private String mwsSellerId;

    private Integer salesrepId;

    private Integer selfWarehouseId;

    private String timeZone;

    private String amazonSalesChannel;

    private String isNonamazonIncluded;

    private String type;

    private String storenameEb;

    private String tokenEb;

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

    public Integer getBpartnerId() {
        return bpartnerId;
    }

    public void setBpartnerId(Integer bpartnerId) {
        this.bpartnerId = bpartnerId;
    }

    public Integer getDoctypeId() {
        return doctypeId;
    }

    public void setDoctypeId(Integer doctypeId) {
        this.doctypeId = doctypeId;
    }

    public Integer getDoctypetargetId() {
        return doctypetargetId;
    }

    public void setDoctypetargetId(Integer doctypetargetId) {
        this.doctypetargetId = doctypetargetId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getPricelistId() {
        return pricelistId;
    }

    public void setPricelistId(Integer pricelistId) {
        this.pricelistId = pricelistId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getMwsAccessKey() {
        return mwsAccessKey;
    }

    public void setMwsAccessKey(String mwsAccessKey) {
        this.mwsAccessKey = mwsAccessKey == null ? null : mwsAccessKey.trim();
    }

    public String getMwsMarketplaceId() {
        return mwsMarketplaceId;
    }

    public void setMwsMarketplaceId(String mwsMarketplaceId) {
        this.mwsMarketplaceId = mwsMarketplaceId == null ? null : mwsMarketplaceId.trim();
    }

    public String getMwsSecretKey() {
        return mwsSecretKey;
    }

    public void setMwsSecretKey(String mwsSecretKey) {
        this.mwsSecretKey = mwsSecretKey == null ? null : mwsSecretKey.trim();
    }

    public String getMwsSellerId() {
        return mwsSellerId;
    }

    public void setMwsSellerId(String mwsSellerId) {
        this.mwsSellerId = mwsSellerId == null ? null : mwsSellerId.trim();
    }

    public Integer getSalesrepId() {
        return salesrepId;
    }

    public void setSalesrepId(Integer salesrepId) {
        this.salesrepId = salesrepId;
    }

    public Integer getSelfWarehouseId() {
        return selfWarehouseId;
    }

    public void setSelfWarehouseId(Integer selfWarehouseId) {
        this.selfWarehouseId = selfWarehouseId;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone == null ? null : timeZone.trim();
    }

    public String getAmazonSalesChannel() {
        return amazonSalesChannel;
    }

    public void setAmazonSalesChannel(String amazonSalesChannel) {
        this.amazonSalesChannel = amazonSalesChannel == null ? null : amazonSalesChannel.trim();
    }

    public String getIsNonamazonIncluded() {
        return isNonamazonIncluded;
    }

    public void setIsNonamazonIncluded(String isNonamazonIncluded) {
        this.isNonamazonIncluded = isNonamazonIncluded == null ? null : isNonamazonIncluded.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStorenameEb() {
        return storenameEb;
    }

    public void setStorenameEb(String storenameEb) {
        this.storenameEb = storenameEb == null ? null : storenameEb.trim();
    }

    public String getTokenEb() {
        return tokenEb;
    }

    public void setTokenEb(String tokenEb) {
        this.tokenEb = tokenEb == null ? null : tokenEb.trim();
    }
}