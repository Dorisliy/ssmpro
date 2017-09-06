package cn.ssm.project.pojo;

import java.math.BigDecimal;
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

    private String docStatus;

    private String docAction;

    private String processing;

    private String processed;

    private Integer cDoctpyeId;

    private Integer cDoctypetargetId;

    private String description;

    private String isApproved;

    private String isCreditApproved;

    private String isDelivered;

    private String isInvoiced;

    private String isPrinted;

    private String isTransferred;

    private String isSelected;

    private Integer salesrepId;

    private Date dateOrdered;

    private Date datePromised;

    private Date datePrinted;

    private Date dateAcct;

    private Integer bpartnerId;

    private Integer bpartnerLocationId;

    private String poreference;

    private String isDiscountPrinted;

    private Integer currencyId;

    private String paymentRule;

    private Integer paymentTermId;

    private String invoiceRule;

    private String deliveryRule;

    private String freightcostRule;

    private BigDecimal freightAmt;

    private String deliveryViaRule;

    private Integer shipperId;

    private Integer chargeId;

    private BigDecimal chargeAmt;

    private String priortyRule;

    private BigDecimal totalLines;

    private BigDecimal grandTotal;

    private Integer warehouseId;

    private Integer pricelistId;

    private String isTaxincluded;

    private Integer campaignId;

    private Integer projectId;

    private Integer activityId;

    private String poested;

    private Integer paymentId;

    private Integer cashlineId;

    private String sendEmail;

    private Integer userId;

    private String copyfrom;

    private String isSelfservice;

    private Integer orgtrxId;

    private Integer user1Id;

    private Integer user2Id;

    private Integer conversiontypeId;

    private Integer billBpartnerId;

    private Integer billLocationId;

    private Integer billUserId;

    private Integer payBpartnerId;

    private Integer payLocationId;

    private Integer refOrderId;

    private String isDropship;

    private BigDecimal volume;

    private BigDecimal weight;

    private String orderType;

    private Integer cPosId;

    private BigDecimal amountTendered;

    private BigDecimal amountRefunded;

    private Integer linkOrderId;

    private Integer mFreightcategoryId;

    private Integer dropshipBpartnerId;

    private Integer dropshipLocationId;

    private Integer dropshipUserId;

    private String promotionCode;

    private Integer cOrdersourceId;

    private BigDecimal processdOn;

    private Integer cOpportunityId;

    private String inoutgenfromSo;

    private String inoutgenfromPo;

    private String proformaInvoice;

    private String amazonOrderId;

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

    private String shipmentGenerated;

    private String isInspected;

    private BigDecimal multiplyRate;

    private BigDecimal merchandiserId;

    private Integer checkById;

    private Integer approverId;

    private String genPaymentRequest;

    private String paymentMethod;

    private String isFullpayment;

    private String amazonMerchantOrderId;

    private String isTransfer;

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

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus == null ? null : docStatus.trim();
    }

    public String getDocAction() {
        return docAction;
    }

    public void setDocAction(String docAction) {
        this.docAction = docAction == null ? null : docAction.trim();
    }

    public String getProcessing() {
        return processing;
    }

    public void setProcessing(String processing) {
        this.processing = processing == null ? null : processing.trim();
    }

    public String getProcessed() {
        return processed;
    }

    public void setProcessed(String processed) {
        this.processed = processed == null ? null : processed.trim();
    }

    public Integer getcDoctpyeId() {
        return cDoctpyeId;
    }

    public void setcDoctpyeId(Integer cDoctpyeId) {
        this.cDoctpyeId = cDoctpyeId;
    }

    public Integer getcDoctypetargetId() {
        return cDoctypetargetId;
    }

    public void setcDoctypetargetId(Integer cDoctypetargetId) {
        this.cDoctypetargetId = cDoctypetargetId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(String isApproved) {
        this.isApproved = isApproved == null ? null : isApproved.trim();
    }

    public String getIsCreditApproved() {
        return isCreditApproved;
    }

    public void setIsCreditApproved(String isCreditApproved) {
        this.isCreditApproved = isCreditApproved == null ? null : isCreditApproved.trim();
    }

    public String getIsDelivered() {
        return isDelivered;
    }

    public void setIsDelivered(String isDelivered) {
        this.isDelivered = isDelivered == null ? null : isDelivered.trim();
    }

    public String getIsInvoiced() {
        return isInvoiced;
    }

    public void setIsInvoiced(String isInvoiced) {
        this.isInvoiced = isInvoiced == null ? null : isInvoiced.trim();
    }

    public String getIsPrinted() {
        return isPrinted;
    }

    public void setIsPrinted(String isPrinted) {
        this.isPrinted = isPrinted == null ? null : isPrinted.trim();
    }

    public String getIsTransferred() {
        return isTransferred;
    }

    public void setIsTransferred(String isTransferred) {
        this.isTransferred = isTransferred == null ? null : isTransferred.trim();
    }

    public String getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(String isSelected) {
        this.isSelected = isSelected == null ? null : isSelected.trim();
    }

    public Integer getSalesrepId() {
        return salesrepId;
    }

    public void setSalesrepId(Integer salesrepId) {
        this.salesrepId = salesrepId;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public Date getDatePromised() {
        return datePromised;
    }

    public void setDatePromised(Date datePromised) {
        this.datePromised = datePromised;
    }

    public Date getDatePrinted() {
        return datePrinted;
    }

    public void setDatePrinted(Date datePrinted) {
        this.datePrinted = datePrinted;
    }

    public Date getDateAcct() {
        return dateAcct;
    }

    public void setDateAcct(Date dateAcct) {
        this.dateAcct = dateAcct;
    }

    public Integer getBpartnerId() {
        return bpartnerId;
    }

    public void setBpartnerId(Integer bpartnerId) {
        this.bpartnerId = bpartnerId;
    }

    public Integer getBpartnerLocationId() {
        return bpartnerLocationId;
    }

    public void setBpartnerLocationId(Integer bpartnerLocationId) {
        this.bpartnerLocationId = bpartnerLocationId;
    }

    public String getPoreference() {
        return poreference;
    }

    public void setPoreference(String poreference) {
        this.poreference = poreference == null ? null : poreference.trim();
    }

    public String getIsDiscountPrinted() {
        return isDiscountPrinted;
    }

    public void setIsDiscountPrinted(String isDiscountPrinted) {
        this.isDiscountPrinted = isDiscountPrinted == null ? null : isDiscountPrinted.trim();
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getPaymentRule() {
        return paymentRule;
    }

    public void setPaymentRule(String paymentRule) {
        this.paymentRule = paymentRule == null ? null : paymentRule.trim();
    }

    public Integer getPaymentTermId() {
        return paymentTermId;
    }

    public void setPaymentTermId(Integer paymentTermId) {
        this.paymentTermId = paymentTermId;
    }

    public String getInvoiceRule() {
        return invoiceRule;
    }

    public void setInvoiceRule(String invoiceRule) {
        this.invoiceRule = invoiceRule == null ? null : invoiceRule.trim();
    }

    public String getDeliveryRule() {
        return deliveryRule;
    }

    public void setDeliveryRule(String deliveryRule) {
        this.deliveryRule = deliveryRule == null ? null : deliveryRule.trim();
    }

    public String getFreightcostRule() {
        return freightcostRule;
    }

    public void setFreightcostRule(String freightcostRule) {
        this.freightcostRule = freightcostRule == null ? null : freightcostRule.trim();
    }

    public BigDecimal getFreightAmt() {
        return freightAmt;
    }

    public void setFreightAmt(BigDecimal freightAmt) {
        this.freightAmt = freightAmt;
    }

    public String getDeliveryViaRule() {
        return deliveryViaRule;
    }

    public void setDeliveryViaRule(String deliveryViaRule) {
        this.deliveryViaRule = deliveryViaRule == null ? null : deliveryViaRule.trim();
    }

    public Integer getShipperId() {
        return shipperId;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    public Integer getChargeId() {
        return chargeId;
    }

    public void setChargeId(Integer chargeId) {
        this.chargeId = chargeId;
    }

    public BigDecimal getChargeAmt() {
        return chargeAmt;
    }

    public void setChargeAmt(BigDecimal chargeAmt) {
        this.chargeAmt = chargeAmt;
    }

    public String getPriortyRule() {
        return priortyRule;
    }

    public void setPriortyRule(String priortyRule) {
        this.priortyRule = priortyRule == null ? null : priortyRule.trim();
    }

    public BigDecimal getTotalLines() {
        return totalLines;
    }

    public void setTotalLines(BigDecimal totalLines) {
        this.totalLines = totalLines;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getPricelistId() {
        return pricelistId;
    }

    public void setPricelistId(Integer pricelistId) {
        this.pricelistId = pricelistId;
    }

    public String getIsTaxincluded() {
        return isTaxincluded;
    }

    public void setIsTaxincluded(String isTaxincluded) {
        this.isTaxincluded = isTaxincluded == null ? null : isTaxincluded.trim();
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getPoested() {
        return poested;
    }

    public void setPoested(String poested) {
        this.poested = poested == null ? null : poested.trim();
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getCashlineId() {
        return cashlineId;
    }

    public void setCashlineId(Integer cashlineId) {
        this.cashlineId = cashlineId;
    }

    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String sendEmail) {
        this.sendEmail = sendEmail == null ? null : sendEmail.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCopyfrom() {
        return copyfrom;
    }

    public void setCopyfrom(String copyfrom) {
        this.copyfrom = copyfrom == null ? null : copyfrom.trim();
    }

    public String getIsSelfservice() {
        return isSelfservice;
    }

    public void setIsSelfservice(String isSelfservice) {
        this.isSelfservice = isSelfservice == null ? null : isSelfservice.trim();
    }

    public Integer getOrgtrxId() {
        return orgtrxId;
    }

    public void setOrgtrxId(Integer orgtrxId) {
        this.orgtrxId = orgtrxId;
    }

    public Integer getUser1Id() {
        return user1Id;
    }

    public void setUser1Id(Integer user1Id) {
        this.user1Id = user1Id;
    }

    public Integer getUser2Id() {
        return user2Id;
    }

    public void setUser2Id(Integer user2Id) {
        this.user2Id = user2Id;
    }

    public Integer getConversiontypeId() {
        return conversiontypeId;
    }

    public void setConversiontypeId(Integer conversiontypeId) {
        this.conversiontypeId = conversiontypeId;
    }

    public Integer getBillBpartnerId() {
        return billBpartnerId;
    }

    public void setBillBpartnerId(Integer billBpartnerId) {
        this.billBpartnerId = billBpartnerId;
    }

    public Integer getBillLocationId() {
        return billLocationId;
    }

    public void setBillLocationId(Integer billLocationId) {
        this.billLocationId = billLocationId;
    }

    public Integer getBillUserId() {
        return billUserId;
    }

    public void setBillUserId(Integer billUserId) {
        this.billUserId = billUserId;
    }

    public Integer getPayBpartnerId() {
        return payBpartnerId;
    }

    public void setPayBpartnerId(Integer payBpartnerId) {
        this.payBpartnerId = payBpartnerId;
    }

    public Integer getPayLocationId() {
        return payLocationId;
    }

    public void setPayLocationId(Integer payLocationId) {
        this.payLocationId = payLocationId;
    }

    public Integer getRefOrderId() {
        return refOrderId;
    }

    public void setRefOrderId(Integer refOrderId) {
        this.refOrderId = refOrderId;
    }

    public String getIsDropship() {
        return isDropship;
    }

    public void setIsDropship(String isDropship) {
        this.isDropship = isDropship == null ? null : isDropship.trim();
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public Integer getcPosId() {
        return cPosId;
    }

    public void setcPosId(Integer cPosId) {
        this.cPosId = cPosId;
    }

    public BigDecimal getAmountTendered() {
        return amountTendered;
    }

    public void setAmountTendered(BigDecimal amountTendered) {
        this.amountTendered = amountTendered;
    }

    public BigDecimal getAmountRefunded() {
        return amountRefunded;
    }

    public void setAmountRefunded(BigDecimal amountRefunded) {
        this.amountRefunded = amountRefunded;
    }

    public Integer getLinkOrderId() {
        return linkOrderId;
    }

    public void setLinkOrderId(Integer linkOrderId) {
        this.linkOrderId = linkOrderId;
    }

    public Integer getmFreightcategoryId() {
        return mFreightcategoryId;
    }

    public void setmFreightcategoryId(Integer mFreightcategoryId) {
        this.mFreightcategoryId = mFreightcategoryId;
    }

    public Integer getDropshipBpartnerId() {
        return dropshipBpartnerId;
    }

    public void setDropshipBpartnerId(Integer dropshipBpartnerId) {
        this.dropshipBpartnerId = dropshipBpartnerId;
    }

    public Integer getDropshipLocationId() {
        return dropshipLocationId;
    }

    public void setDropshipLocationId(Integer dropshipLocationId) {
        this.dropshipLocationId = dropshipLocationId;
    }

    public Integer getDropshipUserId() {
        return dropshipUserId;
    }

    public void setDropshipUserId(Integer dropshipUserId) {
        this.dropshipUserId = dropshipUserId;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode == null ? null : promotionCode.trim();
    }

    public Integer getcOrdersourceId() {
        return cOrdersourceId;
    }

    public void setcOrdersourceId(Integer cOrdersourceId) {
        this.cOrdersourceId = cOrdersourceId;
    }

    public BigDecimal getProcessdOn() {
        return processdOn;
    }

    public void setProcessdOn(BigDecimal processdOn) {
        this.processdOn = processdOn;
    }

    public Integer getcOpportunityId() {
        return cOpportunityId;
    }

    public void setcOpportunityId(Integer cOpportunityId) {
        this.cOpportunityId = cOpportunityId;
    }

    public String getInoutgenfromSo() {
        return inoutgenfromSo;
    }

    public void setInoutgenfromSo(String inoutgenfromSo) {
        this.inoutgenfromSo = inoutgenfromSo == null ? null : inoutgenfromSo.trim();
    }

    public String getInoutgenfromPo() {
        return inoutgenfromPo;
    }

    public void setInoutgenfromPo(String inoutgenfromPo) {
        this.inoutgenfromPo = inoutgenfromPo == null ? null : inoutgenfromPo.trim();
    }

    public String getProformaInvoice() {
        return proformaInvoice;
    }

    public void setProformaInvoice(String proformaInvoice) {
        this.proformaInvoice = proformaInvoice == null ? null : proformaInvoice.trim();
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

    public String getShipmentGenerated() {
        return shipmentGenerated;
    }

    public void setShipmentGenerated(String shipmentGenerated) {
        this.shipmentGenerated = shipmentGenerated == null ? null : shipmentGenerated.trim();
    }

    public String getIsInspected() {
        return isInspected;
    }

    public void setIsInspected(String isInspected) {
        this.isInspected = isInspected == null ? null : isInspected.trim();
    }

    public BigDecimal getMultiplyRate() {
        return multiplyRate;
    }

    public void setMultiplyRate(BigDecimal multiplyRate) {
        this.multiplyRate = multiplyRate;
    }

    public BigDecimal getMerchandiserId() {
        return merchandiserId;
    }

    public void setMerchandiserId(BigDecimal merchandiserId) {
        this.merchandiserId = merchandiserId;
    }

    public Integer getCheckById() {
        return checkById;
    }

    public void setCheckById(Integer checkById) {
        this.checkById = checkById;
    }

    public Integer getApproverId() {
        return approverId;
    }

    public void setApproverId(Integer approverId) {
        this.approverId = approverId;
    }

    public String getGenPaymentRequest() {
        return genPaymentRequest;
    }

    public void setGenPaymentRequest(String genPaymentRequest) {
        this.genPaymentRequest = genPaymentRequest == null ? null : genPaymentRequest.trim();
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }

    public String getIsFullpayment() {
        return isFullpayment;
    }

    public void setIsFullpayment(String isFullpayment) {
        this.isFullpayment = isFullpayment == null ? null : isFullpayment.trim();
    }

    public String getAmazonMerchantOrderId() {
        return amazonMerchantOrderId;
    }

    public void setAmazonMerchantOrderId(String amazonMerchantOrderId) {
        this.amazonMerchantOrderId = amazonMerchantOrderId == null ? null : amazonMerchantOrderId.trim();
    }

    public String getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(String isTransfer) {
        this.isTransfer = isTransfer == null ? null : isTransfer.trim();
    }
}