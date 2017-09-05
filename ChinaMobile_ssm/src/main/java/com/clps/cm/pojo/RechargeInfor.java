package com.clps.cm.pojo;

import java.util.Date;

public class RechargeInfor {
    private Integer rechargeInforId;

    private String telNumb;

    private Date rechargeTime;

    private Integer rechargeTypeId;

    private Integer cardId;

    private Integer bankCardNumb;

    private Integer preferentialId;

    private Integer discountAmount;

    private Integer rechargeMoney;

    public Integer getRechargeInforId() {
        return rechargeInforId;
    }

    public void setRechargeInforId(Integer rechargeInforId) {
        this.rechargeInforId = rechargeInforId;
    }

    public String getTelNumb() {
        return telNumb;
    }

    public void setTelNumb(String telNumb) {
        this.telNumb = telNumb == null ? null : telNumb.trim();
    }

    public Date getRechargeTime() {
        return rechargeTime;
    }

    public void setRechargeTime(Date rechargeTime) {
        this.rechargeTime = rechargeTime;
    }

    public Integer getRechargeTypeId() {
        return rechargeTypeId;
    }

    public void setRechargeTypeId(Integer rechargeTypeId) {
        this.rechargeTypeId = rechargeTypeId;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getBankCardNumb() {
        return bankCardNumb;
    }

    public void setBankCardNumb(Integer bankCardNumb) {
        this.bankCardNumb = bankCardNumb;
    }

    public Integer getPreferentialId() {
        return preferentialId;
    }

    public void setPreferentialId(Integer preferentialId) {
        this.preferentialId = preferentialId;
    }

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Integer getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(Integer rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }
}