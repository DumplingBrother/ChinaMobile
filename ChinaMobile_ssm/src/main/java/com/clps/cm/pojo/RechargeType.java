package com.clps.cm.pojo;

public class RechargeType {
    private Integer rechargeTypeId;

    private String rechargeTypeName;

    public Integer getRechargeTypeId() {
        return rechargeTypeId;
    }

    public void setRechargeTypeId(Integer rechargeTypeId) {
        this.rechargeTypeId = rechargeTypeId;
    }

    public String getRechargeTypeName() {
        return rechargeTypeName;
    }

    public void setRechargeTypeName(String rechargeTypeName) {
        this.rechargeTypeName = rechargeTypeName == null ? null : rechargeTypeName.trim();
    }
}