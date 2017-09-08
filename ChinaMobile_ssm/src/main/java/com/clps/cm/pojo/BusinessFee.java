/**
 * 
 */
package com.clps.cm.pojo;

/**
 * 
 *@author qiuming
 *Package_name:com.clps.cm.pojo
 *Time:2017年9月7日下午2:07:01
 *Description:
 */
public class BusinessFee {

	private Integer business_id;
	private String business_name;
	private String short_name;
	private Integer business_charge;
	private char is_optional;
	private String is_largess;
	private Integer effective_time;
	private Integer end_time;
	/**
	 * @return the business_id
	 */
	public Integer getBusiness_id() {
		return business_id;
	}
	/**
	 * @param business_id the business_id to set
	 */
	public void setBusiness_id(Integer business_id) {
		this.business_id = business_id;
	}
	/**
	 * @return the business_name
	 */
	public String getBusiness_name() {
		return business_name;
	}
	/**
	 * @param business_name the business_name to set
	 */
	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}
	/**
	 * @return the short_name
	 */
	public String getShort_name() {
		return short_name;
	}
	/**
	 * @param short_name the short_name to set
	 */
	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
	/**
	 * @return the business_charge
	 */
	public Integer getBusiness_charge() {
		return business_charge;
	}
	/**
	 * @param business_charge the business_charge to set
	 */
	public void setBusiness_charge(Integer business_charge) {
		this.business_charge = business_charge;
	}
	/**
	 * @return the is_optional
	 */
	public char getIs_optional() {
		return is_optional;
	}
	/**
	 * @param is_optional the is_optional to set
	 */
	public void setIs_optional(char is_optional) {
		this.is_optional = is_optional;
	}
	/**
	 * @return the is_largess
	 */
	public String getIs_largess() {
		return is_largess;
	}
	/**
	 * @param is_largess the is_largess to set
	 */
	public void setIs_largess(String is_largess) {
		this.is_largess = is_largess;
	}
	/**
	 * @return the effective_time
	 */
	public Integer getEffective_time() {
		return effective_time;
	}
	/**
	 * @param effective_time the effective_time to set
	 */
	public void setEffective_time(Integer effective_time) {
		this.effective_time = effective_time;
	}
	/**
	 * @return the end_time
	 */
	public Integer getEnd_time() {
		return end_time;
	}
	/**
	 * @param end_time the end_time to set
	 */
	public void setEnd_time(Integer end_time) {
		this.end_time = end_time;
	}
	
	
}
