package cn.ssm.project.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AmazonImportPaymentLog {
    private Integer id;

    private Date createdAt;

    private Integer createdId;

    private Date updatedAt;

    private Integer updatedId;

    private String isactive;

    private String state;

    private String name;

    private Integer clientId;

    private Integer orgId;

    private String reportRequestedId;

    private String generatedReportId;

    private Date requestTimestamp;

    private Date requestEndTimestamp;

    private String reportFilename;

    private BigDecimal totalImportNum;

    private BigDecimal successNum;

    private BigDecimal failNum;

    private BigDecimal totalDealNum;

    private String isInvoicesCreated;

    private BigDecimal invoiceNum;

    private String createShipment;

    private String createInvoice;

    private String generateInvoice;

    private String processing;

    private String generatePayment;

    private String isGeneratePayment;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Date getRequestEndTimestamp() {
        return requestEndTimestamp;
    }

    public void setRequestEndTimestamp(Date requestEndTimestamp) {
        this.requestEndTimestamp = requestEndTimestamp;
    }

    public String getReportFilename() {
        return reportFilename;
    }

    public void setReportFilename(String reportFilename) {
        this.reportFilename = reportFilename == null ? null : reportFilename.trim();
    }

    public BigDecimal getTotalImportNum() {
        return totalImportNum;
    }

    public void setTotalImportNum(BigDecimal totalImportNum) {
        this.totalImportNum = totalImportNum;
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

    public BigDecimal getTotalDealNum() {
        return totalDealNum;
    }

    public void setTotalDealNum(BigDecimal totalDealNum) {
        this.totalDealNum = totalDealNum;
    }

    public String getIsInvoicesCreated() {
        return isInvoicesCreated;
    }

    public void setIsInvoicesCreated(String isInvoicesCreated) {
        this.isInvoicesCreated = isInvoicesCreated == null ? null : isInvoicesCreated.trim();
    }

    public BigDecimal getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(BigDecimal invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getCreateShipment() {
        return createShipment;
    }

    public void setCreateShipment(String createShipment) {
        this.createShipment = createShipment == null ? null : createShipment.trim();
    }

    public String getCreateInvoice() {
        return createInvoice;
    }

    public void setCreateInvoice(String createInvoice) {
        this.createInvoice = createInvoice == null ? null : createInvoice.trim();
    }

    public String getGenerateInvoice() {
        return generateInvoice;
    }

    public void setGenerateInvoice(String generateInvoice) {
        this.generateInvoice = generateInvoice == null ? null : generateInvoice.trim();
    }

    public String getProcessing() {
        return processing;
    }

    public void setProcessing(String processing) {
        this.processing = processing == null ? null : processing.trim();
    }

    public String getGeneratePayment() {
        return generatePayment;
    }

    public void setGeneratePayment(String generatePayment) {
        this.generatePayment = generatePayment == null ? null : generatePayment.trim();
    }

    public String getIsGeneratePayment() {
        return isGeneratePayment;
    }

    public void setIsGeneratePayment(String isGeneratePayment) {
        this.isGeneratePayment = isGeneratePayment == null ? null : isGeneratePayment.trim();
    }
}