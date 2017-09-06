package cn.ssm.project.pojo;

import java.math.BigDecimal;

public class ToMcffeeDetail {
    private Integer id;

    private Integer createdAt;

    private Integer createdId;

    private Integer updatedAt;

    private Integer updatedId;

    private String isactive;

    private String state;

    private Integer ruleId;

    private Integer line;

    private BigDecimal lengthMax;

    private BigDecimal widthMax;

    private BigDecimal heightMax;

    private BigDecimal lengthAddwmax;

    private BigDecimal weightMax;

    private BigDecimal diagonalMax;

    private String packageType;

    private BigDecimal packageWeight;

    private BigDecimal ykg;

    private BigDecimal ykgPriceShip;

    private BigDecimal ykgPriceExp;

    private BigDecimal ykgPricePri;

    private BigDecimal overweightNum;

    private BigDecimal overweightPriceShip;

    private BigDecimal overweightPriceExp;

    private BigDecimal overweightPricePri;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedId() {
        return createdId;
    }

    public void setCreatedId(Integer createdId) {
        this.createdId = createdId;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
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

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public BigDecimal getLengthMax() {
        return lengthMax;
    }

    public void setLengthMax(BigDecimal lengthMax) {
        this.lengthMax = lengthMax;
    }

    public BigDecimal getWidthMax() {
        return widthMax;
    }

    public void setWidthMax(BigDecimal widthMax) {
        this.widthMax = widthMax;
    }

    public BigDecimal getHeightMax() {
        return heightMax;
    }

    public void setHeightMax(BigDecimal heightMax) {
        this.heightMax = heightMax;
    }

    public BigDecimal getLengthAddwmax() {
        return lengthAddwmax;
    }

    public void setLengthAddwmax(BigDecimal lengthAddwmax) {
        this.lengthAddwmax = lengthAddwmax;
    }

    public BigDecimal getWeightMax() {
        return weightMax;
    }

    public void setWeightMax(BigDecimal weightMax) {
        this.weightMax = weightMax;
    }

    public BigDecimal getDiagonalMax() {
        return diagonalMax;
    }

    public void setDiagonalMax(BigDecimal diagonalMax) {
        this.diagonalMax = diagonalMax;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType == null ? null : packageType.trim();
    }

    public BigDecimal getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(BigDecimal packageWeight) {
        this.packageWeight = packageWeight;
    }

    public BigDecimal getYkg() {
        return ykg;
    }

    public void setYkg(BigDecimal ykg) {
        this.ykg = ykg;
    }

    public BigDecimal getYkgPriceShip() {
        return ykgPriceShip;
    }

    public void setYkgPriceShip(BigDecimal ykgPriceShip) {
        this.ykgPriceShip = ykgPriceShip;
    }

    public BigDecimal getYkgPriceExp() {
        return ykgPriceExp;
    }

    public void setYkgPriceExp(BigDecimal ykgPriceExp) {
        this.ykgPriceExp = ykgPriceExp;
    }

    public BigDecimal getYkgPricePri() {
        return ykgPricePri;
    }

    public void setYkgPricePri(BigDecimal ykgPricePri) {
        this.ykgPricePri = ykgPricePri;
    }

    public BigDecimal getOverweightNum() {
        return overweightNum;
    }

    public void setOverweightNum(BigDecimal overweightNum) {
        this.overweightNum = overweightNum;
    }

    public BigDecimal getOverweightPriceShip() {
        return overweightPriceShip;
    }

    public void setOverweightPriceShip(BigDecimal overweightPriceShip) {
        this.overweightPriceShip = overweightPriceShip;
    }

    public BigDecimal getOverweightPriceExp() {
        return overweightPriceExp;
    }

    public void setOverweightPriceExp(BigDecimal overweightPriceExp) {
        this.overweightPriceExp = overweightPriceExp;
    }

    public BigDecimal getOverweightPricePri() {
        return overweightPricePri;
    }

    public void setOverweightPricePri(BigDecimal overweightPricePri) {
        this.overweightPricePri = overweightPricePri;
    }
}