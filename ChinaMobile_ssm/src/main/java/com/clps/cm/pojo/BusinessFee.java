package com.clps.cm.pojo;

public class BusinessFee {
    private Integer businessId;

    private String businessName;

    private String shortName;

    private Integer businessCharge;

    private String isOptional;

    private String isLargess;

    private Integer effectiveTime;

    private Integer endTime;

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public Integer getBusinessCharge() {
        return businessCharge;
    }

    public void setBusinessCharge(Integer businessCharge) {
        this.businessCharge = businessCharge;
    }

    public String getIsOptional() {
        return isOptional;
    }

    public void setIsOptional(String isOptional) {
        this.isOptional = isOptional == null ? null : isOptional.trim();
    }

    public String getIsLargess() {
        return isLargess;
    }

    public void setIsLargess(String isLargess) {
        this.isLargess = isLargess == null ? null : isLargess.trim();
    }

    public Integer getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Integer effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
}