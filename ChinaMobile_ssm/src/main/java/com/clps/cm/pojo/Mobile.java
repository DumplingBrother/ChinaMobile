package com.clps.cm.pojo;

public class Mobile {
    private String telNumb;

    private String telType;

    private String telAdd;

    private Integer accInitAmount;

    private String isSale;

    public String getTelNumb() {
        return telNumb;
    }

    public void setTelNumb(String telNumb) {
        this.telNumb = telNumb == null ? null : telNumb.trim();
    }

    public String getTelType() {
        return telType;
    }

    public void setTelType(String telType) {
        this.telType = telType == null ? null : telType.trim();
    }

    public String getTelAdd() {
        return telAdd;
    }

    public void setTelAdd(String telAdd) {
        this.telAdd = telAdd == null ? null : telAdd.trim();
    }

    public Integer getAccInitAmount() {
        return accInitAmount;
    }

    public void setAccInitAmount(Integer accInitAmount) {
        this.accInitAmount = accInitAmount;
    }

    public String getIsSale() {
        return isSale;
    }

    public void setIsSale(String isSale) {
        this.isSale = isSale == null ? null : isSale.trim();
    }
}