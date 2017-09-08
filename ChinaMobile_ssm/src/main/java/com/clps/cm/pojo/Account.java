package com.clps.cm.pojo;
/**
 * 
 *@author qiuming
 *Package_name:com.clps.cm.pojo
 *Time:2017年9月7日下午2:07:01
 *Description:
 */


public class Account {
	private Integer account_id;
	private String tel_number;
	private Integer account_balance;
	public Integer getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}
	public String getTel_number() {
		return tel_number;
	}
	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}
	public Integer getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(Integer account_balance) {
		this.account_balance = account_balance;
	}
	
}
