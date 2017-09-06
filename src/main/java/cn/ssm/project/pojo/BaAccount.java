package cn.ssm.project.pojo;

public class BaAccount {
    private Integer id;

    private String account;

    private Integer channelId;

    private String merchantid;

    private Integer areaId;

    private Integer countryId;

    private Integer organisationId;

    private String salesBrandType;

    private Short accountState;

    private String accountRemarks;

    private String mwsMp;

    private String mwsAkey;

    private String mwsSkey;

    private String mwsUrl;

    private Integer createdAt;

    private Integer updatedAt;

    private Integer createdId;

    private Integer updatedId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid == null ? null : merchantid.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(Integer organisationId) {
        this.organisationId = organisationId;
    }

    public String getSalesBrandType() {
        return salesBrandType;
    }

    public void setSalesBrandType(String salesBrandType) {
        this.salesBrandType = salesBrandType == null ? null : salesBrandType.trim();
    }

    public Short getAccountState() {
        return accountState;
    }

    public void setAccountState(Short accountState) {
        this.accountState = accountState;
    }

    public String getAccountRemarks() {
        return accountRemarks;
    }

    public void setAccountRemarks(String accountRemarks) {
        this.accountRemarks = accountRemarks == null ? null : accountRemarks.trim();
    }

    public String getMwsMp() {
        return mwsMp;
    }

    public void setMwsMp(String mwsMp) {
        this.mwsMp = mwsMp == null ? null : mwsMp.trim();
    }

    public String getMwsAkey() {
        return mwsAkey;
    }

    public void setMwsAkey(String mwsAkey) {
        this.mwsAkey = mwsAkey == null ? null : mwsAkey.trim();
    }

    public String getMwsSkey() {
        return mwsSkey;
    }

    public void setMwsSkey(String mwsSkey) {
        this.mwsSkey = mwsSkey == null ? null : mwsSkey.trim();
    }

    public String getMwsUrl() {
        return mwsUrl;
    }

    public void setMwsUrl(String mwsUrl) {
        this.mwsUrl = mwsUrl == null ? null : mwsUrl.trim();
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getCreatedId() {
        return createdId;
    }

    public void setCreatedId(Integer createdId) {
        this.createdId = createdId;
    }

    public Integer getUpdatedId() {
        return updatedId;
    }

    public void setUpdatedId(Integer updatedId) {
        this.updatedId = updatedId;
    }
}