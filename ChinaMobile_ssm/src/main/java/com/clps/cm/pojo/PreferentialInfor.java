package com.clps.cm.pojo;

import java.util.Date;

public class PreferentialInfor {
    private Integer preferentialId;

    private String preferentialName;

    private Integer telCharge;

    private Integer discountAmount;

    private Date startTime;

    private Date endtime;

    private String isAvailable;

    public Integer getPreferentialId() {
        return preferentialId;
    }

    public void setPreferentialId(Integer preferentialId) {
        this.preferentialId = preferentialId;
    }

    public String getPreferentialName() {
        return preferentialName;
    }

    public void setPreferentialName(String preferentialName) {
        this.preferentialName = preferentialName == null ? null : preferentialName.trim();
    }

    public Integer getTelCharge() {
        return telCharge;
    }

    public void setTelCharge(Integer telCharge) {
        this.telCharge = telCharge;
    }

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable == null ? null : isAvailable.trim();
    }
}