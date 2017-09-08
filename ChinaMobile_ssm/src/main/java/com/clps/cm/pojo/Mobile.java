package com.clps.cm.pojo;

/**
 * 
 *@author qiuming
 *Package_name:com.clps.cm.pojo
 *Time:2017年9月7日下午2:07:01
 *Description:
 */
public class Mobile {
	private String tel_numb;
	private String tel_type;
	private String tel_add;
	private Integer acc_init_amount;
	private char is_sale;
	public String getTel_numb() {
		return tel_numb;
	}
	public void setTel_numb(String tel_numb) {
		this.tel_numb = tel_numb;
	}
	public String getTel_type() {
		return tel_type;
	}
	public void setTel_type(String tel_type) {
		this.tel_type = tel_type;
	}
	public String getTel_add() {
		return tel_add;
	}
	public void setTel_add(String tel_add) {
		this.tel_add = tel_add;
	}
	public Integer getAcc_init_amount() {
		return acc_init_amount;
	}
	public void setAcc_init_amount(Integer acc_init_amount) {
		this.acc_init_amount = acc_init_amount;
	}
	public char getIs_sale() {
		return is_sale;
	}
	public void setIs_sale(char is_sale) {
		this.is_sale = is_sale;
	}
	
}
