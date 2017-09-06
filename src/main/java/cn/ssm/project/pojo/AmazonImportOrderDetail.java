package cn.ssm.project.pojo;

import java.util.Date;

public class AmazonImportOrderDetail {
    private Integer id;

    private Date createdAt;

    private Integer createdId;

    private Date updatedAt;

    private Integer updatedId;

    private String state;

    private String isactive;

    private Integer clientId;

    private Integer orgId;

    private String amazonOrderid;

    private Integer amazonImportOrderLogId;

    private Integer amazonOrderId;

    private Integer cOrderId;

    private String description;

    private String importStatus;

    private String isImportAll;

    private String importFailorderProcess;

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

    public String getAmazonOrderid() {
        return amazonOrderid;
    }

    public void setAmazonOrderid(String amazonOrderid) {
        this.amazonOrderid = amazonOrderid == null ? null : amazonOrderid.trim();
    }

    public Integer getAmazonImportOrderLogId() {
        return amazonImportOrderLogId;
    }

    public void setAmazonImportOrderLogId(Integer amazonImportOrderLogId) {
        this.amazonImportOrderLogId = amazonImportOrderLogId;
    }

    public Integer getAmazonOrderId() {
        return amazonOrderId;
    }

    public void setAmazonOrderId(Integer amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    public Integer getcOrderId() {
        return cOrderId;
    }

    public void setcOrderId(Integer cOrderId) {
        this.cOrderId = cOrderId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getImportStatus() {
        return importStatus;
    }

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus == null ? null : importStatus.trim();
    }

    public String getIsImportAll() {
        return isImportAll;
    }

    public void setIsImportAll(String isImportAll) {
        this.isImportAll = isImportAll == null ? null : isImportAll.trim();
    }

    public String getImportFailorderProcess() {
        return importFailorderProcess;
    }

    public void setImportFailorderProcess(String importFailorderProcess) {
        this.importFailorderProcess = importFailorderProcess == null ? null : importFailorderProcess.trim();
    }
}