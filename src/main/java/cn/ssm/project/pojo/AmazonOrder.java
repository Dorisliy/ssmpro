package cn.ssm.project.pojo;

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

    private String name;

    private String amazonOrderId;

    private Date amazonPurchaseDate;

    private Date amazonLastupdatedDate;

    private String amazonOrderStatus;

    private String amazonSalesChannel;

    private String isImported;

    private Integer amazonImportOrderLogId;

    private String description;

    private String importFailorderProcess;

    private String importStatus;

    private String amazonMerchantOrderId;

    private String contentText;

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

    public String getIsImported() {
        return isImported;
    }

    public void setIsImported(String isImported) {
        this.isImported = isImported == null ? null : isImported.trim();
    }

    public Integer getAmazonImportOrderLogId() {
        return amazonImportOrderLogId;
    }

    public void setAmazonImportOrderLogId(Integer amazonImportOrderLogId) {
        this.amazonImportOrderLogId = amazonImportOrderLogId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public String getAmazonMerchantOrderId() {
        return amazonMerchantOrderId;
    }

    public void setAmazonMerchantOrderId(String amazonMerchantOrderId) {
        this.amazonMerchantOrderId = amazonMerchantOrderId == null ? null : amazonMerchantOrderId.trim();
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText == null ? null : contentText.trim();
    }
}