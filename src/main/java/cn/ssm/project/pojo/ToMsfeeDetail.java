package cn.ssm.project.pojo;

import java.math.BigDecimal;

public class ToMsfeeDetail {
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

    private BigDecimal minventoryFee9;

    private BigDecimal minventoryFee10;

    private BigDecimal longtimeFee6;

    private BigDecimal longtimeFee12;

    private BigDecimal packageWeight;

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

    public BigDecimal getMinventoryFee9() {
        return minventoryFee9;
    }

    public void setMinventoryFee9(BigDecimal minventoryFee9) {
        this.minventoryFee9 = minventoryFee9;
    }

    public BigDecimal getMinventoryFee10() {
        return minventoryFee10;
    }

    public void setMinventoryFee10(BigDecimal minventoryFee10) {
        this.minventoryFee10 = minventoryFee10;
    }

    public BigDecimal getLongtimeFee6() {
        return longtimeFee6;
    }

    public void setLongtimeFee6(BigDecimal longtimeFee6) {
        this.longtimeFee6 = longtimeFee6;
    }

    public BigDecimal getLongtimeFee12() {
        return longtimeFee12;
    }

    public void setLongtimeFee12(BigDecimal longtimeFee12) {
        this.longtimeFee12 = longtimeFee12;
    }

    public BigDecimal getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(BigDecimal packageWeight) {
        this.packageWeight = packageWeight;
    }
}