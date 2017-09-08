package com.clps.cm.pojo;

/**
 * 
 *@author qiuming
 *Package_name:com.clps.cm.pojo
 *Time:2017年9月7日下午2:07:01
 *Description:
 */
import java.util.Date;

public class MobilePackage {
    private Integer telPackageId;

    private String telNumb;

    private Integer businessId;

    private Integer ppId;

    private Date startTime;

    private Date endTime;

    private Integer status;

    public Integer getTelPackageId() {
        return telPackageId;
    }

    public void setTelPackageId(Integer telPackageId) {
        this.telPackageId = telPackageId;
    }

    public String getTelNumb() {
        return telNumb;
    }

    public void setTelNumb(String telNumb) {
        this.telNumb = telNumb == null ? null : telNumb.trim();
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getPpId() {
        return ppId;
    }

    public void setPpId(Integer ppId) {
        this.ppId = ppId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}