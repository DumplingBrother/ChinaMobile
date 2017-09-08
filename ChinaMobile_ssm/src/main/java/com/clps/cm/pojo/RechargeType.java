package com.clps.cm.pojo;
/**
 * 
 *@author qiuming
 *Package_name:com.clps.cm.pojo
 *Time:2017年9月7日下午2:07:01
 *Description:
 */
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