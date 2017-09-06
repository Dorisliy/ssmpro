package cn.ssm.project.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class COrderLine {
    private Integer id;

    private BigDecimal adClientId;

    private BigDecimal adOrgId;

    private String isactive;

    private Date created;

    private BigDecimal createdby;

    private Date updated;

    private BigDecimal updatedby;

    private BigDecimal cOrderId;

    private BigDecimal line;

    private BigDecimal cBpartnerId;

    private BigDecimal cBpartnerLocationId;

    private Date dateordered;

    private Date datepromised;

    private Date datedelivered;

    private Date dateinvoiced;

    private String description;

    private BigDecimal mProductId;

    private BigDecimal mWarehouseId;

    private BigDecimal cUomId;

    private BigDecimal qtyordered;

    private BigDecimal qtyreserved;

    private BigDecimal qtydelivered;

    private BigDecimal qtyinvoiced;

    private BigDecimal mShipperId;

    private BigDecimal cCurrencyId;

    private BigDecimal pricelist;

    private BigDecimal priceactual;

    private BigDecimal pricelimit;

    private BigDecimal linenetamt;

    private BigDecimal discount;

    private BigDecimal freightamt;

    private BigDecimal cChargeId;

    private BigDecimal cTaxId;

    private BigDecimal sResourceassignmentId;

    private BigDecimal refOrderlineId;

    private BigDecimal mAttributesetinstanceId;

    private String isdescription;

    private String processed;

    private BigDecimal qtyentered;

    private BigDecimal priceentered;

    private BigDecimal cProjectId;

    private BigDecimal pricecost;

    private BigDecimal qtylostsales;

    private BigDecimal cProjectphaseId;

    private BigDecimal cProjecttaskId;

    private Date rrstartdate;

    private BigDecimal rramt;

    private BigDecimal cCampaignId;

    private BigDecimal cActivityId;

    private BigDecimal user1Id;

    private BigDecimal user2Id;

    private BigDecimal adOrgtrxId;

    private BigDecimal linkOrderlineId;

    private BigDecimal ppCostCollectorId;

    private BigDecimal mPromotionId;

    private String isconsumesforecast;

    private String createfrom;

    private String createshipment;

    private String amazonasin;

    private String amazonsku;

    private String amazonitemstatus;

    private String amazonproductname;

    private BigDecimal amazonquantity;

    private String amazonpromotionid;

    private BigDecimal amazonpromotiondiscount;

    private BigDecimal itempromotiondiscount;

    private BigDecimal shippromotiondiscount;

    private BigDecimal boxQty;

    private BigDecimal qtyBox;

    private BigDecimal taxamt;

    private BigDecimal chargeamt;

    private BigDecimal linetotalamt;

    private BigDecimal boxwidth;

    private BigDecimal boxlength;

    private BigDecimal boxheight;

    private BigDecimal grossWeight;

    private BigDecimal netWeight;

    private Date inspectiondate;

    private String inspectionstatus;

    private String inspectiondescription;

    private String inspector;

    private BigDecimal boxvolume;

    private String inspectioncontent;

    private String mFnsku;

    private BigDecimal linkProductId;

    private BigDecimal qtytransfer;

    private BigDecimal qtyplanfromv;

    private BigDecimal qtyplanfromc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAdClientId() {
        return adClientId;
    }

    public void setAdClientId(BigDecimal adClientId) {
        this.adClientId = adClientId;
    }

    public BigDecimal getAdOrgId() {
        return adOrgId;
    }

    public void setAdOrgId(BigDecimal adOrgId) {
        this.adOrgId = adOrgId;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive == null ? null : isactive.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public BigDecimal getCreatedby() {
        return createdby;
    }

    public void setCreatedby(BigDecimal createdby) {
        this.createdby = createdby;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public BigDecimal getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(BigDecimal updatedby) {
        this.updatedby = updatedby;
    }

    public BigDecimal getcOrderId() {
        return cOrderId;
    }

    public void setcOrderId(BigDecimal cOrderId) {
        this.cOrderId = cOrderId;
    }

    public BigDecimal getLine() {
        return line;
    }

    public void setLine(BigDecimal line) {
        this.line = line;
    }

    public BigDecimal getcBpartnerId() {
        return cBpartnerId;
    }

    public void setcBpartnerId(BigDecimal cBpartnerId) {
        this.cBpartnerId = cBpartnerId;
    }

    public BigDecimal getcBpartnerLocationId() {
        return cBpartnerLocationId;
    }

    public void setcBpartnerLocationId(BigDecimal cBpartnerLocationId) {
        this.cBpartnerLocationId = cBpartnerLocationId;
    }

    public Date getDateordered() {
        return dateordered;
    }

    public void setDateordered(Date dateordered) {
        this.dateordered = dateordered;
    }

    public Date getDatepromised() {
        return datepromised;
    }

    public void setDatepromised(Date datepromised) {
        this.datepromised = datepromised;
    }

    public Date getDatedelivered() {
        return datedelivered;
    }

    public void setDatedelivered(Date datedelivered) {
        this.datedelivered = datedelivered;
    }

    public Date getDateinvoiced() {
        return dateinvoiced;
    }

    public void setDateinvoiced(Date dateinvoiced) {
        this.dateinvoiced = dateinvoiced;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getmProductId() {
        return mProductId;
    }

    public void setmProductId(BigDecimal mProductId) {
        this.mProductId = mProductId;
    }

    public BigDecimal getmWarehouseId() {
        return mWarehouseId;
    }

    public void setmWarehouseId(BigDecimal mWarehouseId) {
        this.mWarehouseId = mWarehouseId;
    }

    public BigDecimal getcUomId() {
        return cUomId;
    }

    public void setcUomId(BigDecimal cUomId) {
        this.cUomId = cUomId;
    }

    public BigDecimal getQtyordered() {
        return qtyordered;
    }

    public void setQtyordered(BigDecimal qtyordered) {
        this.qtyordered = qtyordered;
    }

    public BigDecimal getQtyreserved() {
        return qtyreserved;
    }

    public void setQtyreserved(BigDecimal qtyreserved) {
        this.qtyreserved = qtyreserved;
    }

    public BigDecimal getQtydelivered() {
        return qtydelivered;
    }

    public void setQtydelivered(BigDecimal qtydelivered) {
        this.qtydelivered = qtydelivered;
    }

    public BigDecimal getQtyinvoiced() {
        return qtyinvoiced;
    }

    public void setQtyinvoiced(BigDecimal qtyinvoiced) {
        this.qtyinvoiced = qtyinvoiced;
    }

    public BigDecimal getmShipperId() {
        return mShipperId;
    }

    public void setmShipperId(BigDecimal mShipperId) {
        this.mShipperId = mShipperId;
    }

    public BigDecimal getcCurrencyId() {
        return cCurrencyId;
    }

    public void setcCurrencyId(BigDecimal cCurrencyId) {
        this.cCurrencyId = cCurrencyId;
    }

    public BigDecimal getPricelist() {
        return pricelist;
    }

    public void setPricelist(BigDecimal pricelist) {
        this.pricelist = pricelist;
    }

    public BigDecimal getPriceactual() {
        return priceactual;
    }

    public void setPriceactual(BigDecimal priceactual) {
        this.priceactual = priceactual;
    }

    public BigDecimal getPricelimit() {
        return pricelimit;
    }

    public void setPricelimit(BigDecimal pricelimit) {
        this.pricelimit = pricelimit;
    }

    public BigDecimal getLinenetamt() {
        return linenetamt;
    }

    public void setLinenetamt(BigDecimal linenetamt) {
        this.linenetamt = linenetamt;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getFreightamt() {
        return freightamt;
    }

    public void setFreightamt(BigDecimal freightamt) {
        this.freightamt = freightamt;
    }

    public BigDecimal getcChargeId() {
        return cChargeId;
    }

    public void setcChargeId(BigDecimal cChargeId) {
        this.cChargeId = cChargeId;
    }

    public BigDecimal getcTaxId() {
        return cTaxId;
    }

    public void setcTaxId(BigDecimal cTaxId) {
        this.cTaxId = cTaxId;
    }

    public BigDecimal getsResourceassignmentId() {
        return sResourceassignmentId;
    }

    public void setsResourceassignmentId(BigDecimal sResourceassignmentId) {
        this.sResourceassignmentId = sResourceassignmentId;
    }

    public BigDecimal getRefOrderlineId() {
        return refOrderlineId;
    }

    public void setRefOrderlineId(BigDecimal refOrderlineId) {
        this.refOrderlineId = refOrderlineId;
    }

    public BigDecimal getmAttributesetinstanceId() {
        return mAttributesetinstanceId;
    }

    public void setmAttributesetinstanceId(BigDecimal mAttributesetinstanceId) {
        this.mAttributesetinstanceId = mAttributesetinstanceId;
    }

    public String getIsdescription() {
        return isdescription;
    }

    public void setIsdescription(String isdescription) {
        this.isdescription = isdescription == null ? null : isdescription.trim();
    }

    public String getProcessed() {
        return processed;
    }

    public void setProcessed(String processed) {
        this.processed = processed == null ? null : processed.trim();
    }

    public BigDecimal getQtyentered() {
        return qtyentered;
    }

    public void setQtyentered(BigDecimal qtyentered) {
        this.qtyentered = qtyentered;
    }

    public BigDecimal getPriceentered() {
        return priceentered;
    }

    public void setPriceentered(BigDecimal priceentered) {
        this.priceentered = priceentered;
    }

    public BigDecimal getcProjectId() {
        return cProjectId;
    }

    public void setcProjectId(BigDecimal cProjectId) {
        this.cProjectId = cProjectId;
    }

    public BigDecimal getPricecost() {
        return pricecost;
    }

    public void setPricecost(BigDecimal pricecost) {
        this.pricecost = pricecost;
    }

    public BigDecimal getQtylostsales() {
        return qtylostsales;
    }

    public void setQtylostsales(BigDecimal qtylostsales) {
        this.qtylostsales = qtylostsales;
    }

    public BigDecimal getcProjectphaseId() {
        return cProjectphaseId;
    }

    public void setcProjectphaseId(BigDecimal cProjectphaseId) {
        this.cProjectphaseId = cProjectphaseId;
    }

    public BigDecimal getcProjecttaskId() {
        return cProjecttaskId;
    }

    public void setcProjecttaskId(BigDecimal cProjecttaskId) {
        this.cProjecttaskId = cProjecttaskId;
    }

    public Date getRrstartdate() {
        return rrstartdate;
    }

    public void setRrstartdate(Date rrstartdate) {
        this.rrstartdate = rrstartdate;
    }

    public BigDecimal getRramt() {
        return rramt;
    }

    public void setRramt(BigDecimal rramt) {
        this.rramt = rramt;
    }

    public BigDecimal getcCampaignId() {
        return cCampaignId;
    }

    public void setcCampaignId(BigDecimal cCampaignId) {
        this.cCampaignId = cCampaignId;
    }

    public BigDecimal getcActivityId() {
        return cActivityId;
    }

    public void setcActivityId(BigDecimal cActivityId) {
        this.cActivityId = cActivityId;
    }

    public BigDecimal getUser1Id() {
        return user1Id;
    }

    public void setUser1Id(BigDecimal user1Id) {
        this.user1Id = user1Id;
    }

    public BigDecimal getUser2Id() {
        return user2Id;
    }

    public void setUser2Id(BigDecimal user2Id) {
        this.user2Id = user2Id;
    }

    public BigDecimal getAdOrgtrxId() {
        return adOrgtrxId;
    }

    public void setAdOrgtrxId(BigDecimal adOrgtrxId) {
        this.adOrgtrxId = adOrgtrxId;
    }

    public BigDecimal getLinkOrderlineId() {
        return linkOrderlineId;
    }

    public void setLinkOrderlineId(BigDecimal linkOrderlineId) {
        this.linkOrderlineId = linkOrderlineId;
    }

    public BigDecimal getPpCostCollectorId() {
        return ppCostCollectorId;
    }

    public void setPpCostCollectorId(BigDecimal ppCostCollectorId) {
        this.ppCostCollectorId = ppCostCollectorId;
    }

    public BigDecimal getmPromotionId() {
        return mPromotionId;
    }

    public void setmPromotionId(BigDecimal mPromotionId) {
        this.mPromotionId = mPromotionId;
    }

    public String getIsconsumesforecast() {
        return isconsumesforecast;
    }

    public void setIsconsumesforecast(String isconsumesforecast) {
        this.isconsumesforecast = isconsumesforecast == null ? null : isconsumesforecast.trim();
    }

    public String getCreatefrom() {
        return createfrom;
    }

    public void setCreatefrom(String createfrom) {
        this.createfrom = createfrom == null ? null : createfrom.trim();
    }

    public String getCreateshipment() {
        return createshipment;
    }

    public void setCreateshipment(String createshipment) {
        this.createshipment = createshipment == null ? null : createshipment.trim();
    }

    public String getAmazonasin() {
        return amazonasin;
    }

    public void setAmazonasin(String amazonasin) {
        this.amazonasin = amazonasin == null ? null : amazonasin.trim();
    }

    public String getAmazonsku() {
        return amazonsku;
    }

    public void setAmazonsku(String amazonsku) {
        this.amazonsku = amazonsku == null ? null : amazonsku.trim();
    }

    public String getAmazonitemstatus() {
        return amazonitemstatus;
    }

    public void setAmazonitemstatus(String amazonitemstatus) {
        this.amazonitemstatus = amazonitemstatus == null ? null : amazonitemstatus.trim();
    }

    public String getAmazonproductname() {
        return amazonproductname;
    }

    public void setAmazonproductname(String amazonproductname) {
        this.amazonproductname = amazonproductname == null ? null : amazonproductname.trim();
    }

    public BigDecimal getAmazonquantity() {
        return amazonquantity;
    }

    public void setAmazonquantity(BigDecimal amazonquantity) {
        this.amazonquantity = amazonquantity;
    }

    public String getAmazonpromotionid() {
        return amazonpromotionid;
    }

    public void setAmazonpromotionid(String amazonpromotionid) {
        this.amazonpromotionid = amazonpromotionid == null ? null : amazonpromotionid.trim();
    }

    public BigDecimal getAmazonpromotiondiscount() {
        return amazonpromotiondiscount;
    }

    public void setAmazonpromotiondiscount(BigDecimal amazonpromotiondiscount) {
        this.amazonpromotiondiscount = amazonpromotiondiscount;
    }

    public BigDecimal getItempromotiondiscount() {
        return itempromotiondiscount;
    }

    public void setItempromotiondiscount(BigDecimal itempromotiondiscount) {
        this.itempromotiondiscount = itempromotiondiscount;
    }

    public BigDecimal getShippromotiondiscount() {
        return shippromotiondiscount;
    }

    public void setShippromotiondiscount(BigDecimal shippromotiondiscount) {
        this.shippromotiondiscount = shippromotiondiscount;
    }

    public BigDecimal getBoxQty() {
        return boxQty;
    }

    public void setBoxQty(BigDecimal boxQty) {
        this.boxQty = boxQty;
    }

    public BigDecimal getQtyBox() {
        return qtyBox;
    }

    public void setQtyBox(BigDecimal qtyBox) {
        this.qtyBox = qtyBox;
    }

    public BigDecimal getTaxamt() {
        return taxamt;
    }

    public void setTaxamt(BigDecimal taxamt) {
        this.taxamt = taxamt;
    }

    public BigDecimal getChargeamt() {
        return chargeamt;
    }

    public void setChargeamt(BigDecimal chargeamt) {
        this.chargeamt = chargeamt;
    }

    public BigDecimal getLinetotalamt() {
        return linetotalamt;
    }

    public void setLinetotalamt(BigDecimal linetotalamt) {
        this.linetotalamt = linetotalamt;
    }

    public BigDecimal getBoxwidth() {
        return boxwidth;
    }

    public void setBoxwidth(BigDecimal boxwidth) {
        this.boxwidth = boxwidth;
    }

    public BigDecimal getBoxlength() {
        return boxlength;
    }

    public void setBoxlength(BigDecimal boxlength) {
        this.boxlength = boxlength;
    }

    public BigDecimal getBoxheight() {
        return boxheight;
    }

    public void setBoxheight(BigDecimal boxheight) {
        this.boxheight = boxheight;
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public BigDecimal getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    public Date getInspectiondate() {
        return inspectiondate;
    }

    public void setInspectiondate(Date inspectiondate) {
        this.inspectiondate = inspectiondate;
    }

    public String getInspectionstatus() {
        return inspectionstatus;
    }

    public void setInspectionstatus(String inspectionstatus) {
        this.inspectionstatus = inspectionstatus == null ? null : inspectionstatus.trim();
    }

    public String getInspectiondescription() {
        return inspectiondescription;
    }

    public void setInspectiondescription(String inspectiondescription) {
        this.inspectiondescription = inspectiondescription == null ? null : inspectiondescription.trim();
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector == null ? null : inspector.trim();
    }

    public BigDecimal getBoxvolume() {
        return boxvolume;
    }

    public void setBoxvolume(BigDecimal boxvolume) {
        this.boxvolume = boxvolume;
    }

    public String getInspectioncontent() {
        return inspectioncontent;
    }

    public void setInspectioncontent(String inspectioncontent) {
        this.inspectioncontent = inspectioncontent == null ? null : inspectioncontent.trim();
    }

    public String getmFnsku() {
        return mFnsku;
    }

    public void setmFnsku(String mFnsku) {
        this.mFnsku = mFnsku == null ? null : mFnsku.trim();
    }

    public BigDecimal getLinkProductId() {
        return linkProductId;
    }

    public void setLinkProductId(BigDecimal linkProductId) {
        this.linkProductId = linkProductId;
    }

    public BigDecimal getQtytransfer() {
        return qtytransfer;
    }

    public void setQtytransfer(BigDecimal qtytransfer) {
        this.qtytransfer = qtytransfer;
    }

    public BigDecimal getQtyplanfromv() {
        return qtyplanfromv;
    }

    public void setQtyplanfromv(BigDecimal qtyplanfromv) {
        this.qtyplanfromv = qtyplanfromv;
    }

    public BigDecimal getQtyplanfromc() {
        return qtyplanfromc;
    }

    public void setQtyplanfromc(BigDecimal qtyplanfromc) {
        this.qtyplanfromc = qtyplanfromc;
    }
}