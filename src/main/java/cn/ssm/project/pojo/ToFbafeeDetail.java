package cn.ssm.project.pojo;

import java.math.BigDecimal;

public class ToFbafeeDetail {
    private Integer id;

    private Integer createdAt;

    private Integer createdId;

    private Integer updatedAt;

    private Integer updatedId;

    private String isactive;

    private String state;

    private Integer ruleId;

    private Integer line;

    private String packageType;

    private BigDecimal packageWeight;

    private BigDecimal lengthMax;

    private BigDecimal widthMax;

    private BigDecimal heightMax;

    private BigDecimal lengthAddwmax;

    private BigDecimal weightMax;

    private BigDecimal diagonalMax;

    private BigDecimal ykg;

    private BigDecimal ykgPrice9;

    private BigDecimal ykgPrice10;

    private BigDecimal overweightNum;

    private BigDecimal overweightPrice9;

    private BigDecimal overweightPrice10;

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

    public BigDecimal getYkg() {
        return ykg;
    }

    public void setYkg(BigDecimal ykg) {
        this.ykg = ykg;
    }

    public BigDecimal getYkgPrice9() {
        return ykgPrice9;
    }

    public void setYkgPrice9(BigDecimal ykgPrice9) {
        this.ykgPrice9 = ykgPrice9;
    }

    public BigDecimal getYkgPrice10() {
        return ykgPrice10;
    }

    public void setYkgPrice10(BigDecimal ykgPrice10) {
        this.ykgPrice10 = ykgPrice10;
    }

    public BigDecimal getOverweightNum() {
        return overweightNum;
    }

    public void setOverweightNum(BigDecimal overweightNum) {
        this.overweightNum = overweightNum;
    }

    public BigDecimal getOverweightPrice9() {
        return overweightPrice9;
    }

    public void setOverweightPrice9(BigDecimal overweightPrice9) {
        this.overweightPrice9 = overweightPrice9;
    }

    public BigDecimal getOverweightPrice10() {
        return overweightPrice10;
    }

    public void setOverweightPrice10(BigDecimal overweightPrice10) {
        this.overweightPrice10 = overweightPrice10;
    }
}