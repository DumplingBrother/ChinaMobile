package com.clps.cm.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 *@author qiuming
 *Package_name:com.clps.cm.pojo
 *Time:2017年9月7日下午2:07:01
 *Description:
 */
public class Customer {
    private Integer customerId;

    private String customerUsername;

    private String customerName;

    private String idCardNumb;

    private String telNumb;

    private Date customerBirthday;

    private String customerEmail;

    private String customerPwd;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername == null ? null : customerUsername.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getIdCardNumb() {
        return idCardNumb;
    }

    public void setIdCardNumb(String idCardNumb) {
        this.idCardNumb = idCardNumb == null ? null : idCardNumb.trim();
    }

    public String getTelNumb() {
        return telNumb;
    }

    public void setTelNumb(String telNumb) {
        this.telNumb = telNumb == null ? null : telNumb.trim();
    }

    public String getCustomerBirthday() {
    	if(customerBirthday == null)
			return null;
		else{
			DateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
			return dateFormat.format(customerBirthday);
		}
    }

    public void setCustomerBirthday(Date customerBirthday) {
    	
    	this.customerBirthday=customerBirthday;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail == null ? null : customerEmail.trim();
    }

    public String getCustomerPwd() {
        return customerPwd;
    }

    public void setCustomerPwd(String customerPwd) {
        this.customerPwd = customerPwd == null ? null : customerPwd.trim();
    }
}