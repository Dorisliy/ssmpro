package cn.ssm.project.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AmazonImportOrderLog {
    private Integer id;

    private Date createdAt;

    private Integer createdId;

    private Date updatedAt;

    private Integer updatedId;

    private Integer clientId;

    private Integer orgId;

    private String state;

    private String isactive;

    private String name;

    private String reportRequestedId;

    private String generatedReportId;

    private Date requestTimestamp;

    private String reportFilename;

    private BigDecimal totalOrderNum;

    private BigDecimal successNum;

    private BigDecimal failNum;

    private String description;

    private Integer amazonImportConfigureId;

    private String processing;

    private String errorMessage;

    private String reportProcessingStatus;

    private Date queryStartDate;

    private Date queryEndDate;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getReportRequestedId() {
        return reportRequestedId;
    }

    public void setReportRequestedId(String reportRequestedId) {
        this.reportRequestedId = reportRequestedId == null ? null : reportRequestedId.trim();
    }

    public String getGeneratedReportId() {
        return generatedReportId;
    }

    public void setGeneratedReportId(String generatedReportId) {
        this.generatedReportId = generatedReportId == null ? null : generatedReportId.trim();
    }

    public Date getRequestTimestamp() {
        return requestTimestamp;
    }

    public void setRequestTimestamp(Date requestTimestamp) {
        this.requestTimestamp = requestTimestamp;
    }

    public String getReportFilename() {
        return reportFilename;
    }

    public void setReportFilename(String reportFilename) {
        this.reportFilename = reportFilename == null ? null : reportFilename.trim();
    }

    public BigDecimal getTotalOrderNum() {
        return totalOrderNum;
    }

    public void setTotalOrderNum(BigDecimal totalOrderNum) {
        this.totalOrderNum = totalOrderNum;
    }

    public BigDecimal getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(BigDecimal successNum) {
        this.successNum = successNum;
    }

    public BigDecimal getFailNum() {
        return failNum;
    }

    public void setFailNum(BigDecimal failNum) {
        this.failNum = failNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getAmazonImportConfigureId() {
        return amazonImportConfigureId;
    }

    public void setAmazonImportConfigureId(Integer amazonImportConfigureId) {
        this.amazonImportConfigureId = amazonImportConfigureId;
    }

    public String getProcessing() {
        return processing;
    }

    public void setProcessing(String processing) {
        this.processing = processing == null ? null : processing.trim();
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage == null ? null : errorMessage.trim();
    }

    public String getReportProcessingStatus() {
        return reportProcessingStatus;
    }

    public void setReportProcessingStatus(String reportProcessingStatus) {
        this.reportProcessingStatus = reportProcessingStatus == null ? null : reportProcessingStatus.trim();
    }

    public Date getQueryStartDate() {
        return queryStartDate;
    }

    public void setQueryStartDate(Date queryStartDate) {
        this.queryStartDate = queryStartDate;
    }

    public Date getQueryEndDate() {
        return queryEndDate;
    }

    public void setQueryEndDate(Date queryEndDate) {
        this.queryEndDate = queryEndDate;
    }
}