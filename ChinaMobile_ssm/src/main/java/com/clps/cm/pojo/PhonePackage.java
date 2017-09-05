package com.clps.cm.pojo;

public class PhonePackage {
    private Integer ppId;

    private String ppName;

    private Integer ppFee;

    private String isAvaliable;

    public Integer getPpId() {
        return ppId;
    }

    public void setPpId(Integer ppId) {
        this.ppId = ppId;
    }

    public String getPpName() {
        return ppName;
    }

    public void setPpName(String ppName) {
        this.ppName = ppName == null ? null : ppName.trim();
    }

    public Integer getPpFee() {
        return ppFee;
    }

    public void setPpFee(Integer ppFee) {
        this.ppFee = ppFee;
    }

    public String getIsAvaliable() {
        return isAvaliable;
    }

    public void setIsAvaliable(String isAvaliable) {
        this.isAvaliable = isAvaliable == null ? null : isAvaliable.trim();
    }
}