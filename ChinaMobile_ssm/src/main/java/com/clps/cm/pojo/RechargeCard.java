package com.clps.cm.pojo;

public class RechargeCard {
    private Integer cardId;

    private String cardPwd;

    private Integer cardCharge;

    private String isAvailable;

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardPwd() {
        return cardPwd;
    }

    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd == null ? null : cardPwd.trim();
    }

    public Integer getCardCharge() {
        return cardCharge;
    }

    public void setCardCharge(Integer cardCharge) {
        this.cardCharge = cardCharge;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable == null ? null : isAvailable.trim();
    }
}