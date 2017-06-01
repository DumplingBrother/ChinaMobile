/**
 * @Title:Log.java
 * @Package:com.jit.z2206.common.log.model
 * @Description:TODO
 * @author ZhuXiaosi
 * @date 2017年5月31日 下午4:12:56
 * @version V1.0
 */
package com.jit.z2206.common.log.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @ClassName:Log
 * @Description:TODO
 * @author ZhuXiaosi
 * @date 2017年5月31日 下午4:12:56
 * @version V1.0
 */
@Entity
public class Log implements Serializable {
	
	/**
	 * @Fields serialVersionUID:TODO
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userOL_id;//序号
	private String userOL_context;//操作内容
	private Date userOL_date;//操作时间
	private String userOL_result;//操作结果
	private String userOL_user;//操作人
	
	public Log(int userOL_id,String userOL_context,Date userOL_date,String userOL_result,String userOL_user){
		super();
		this.userOL_id=userOL_id;
		this.userOL_context=userOL_context;
		this.userOL_date=userOL_date;
		this.userOL_result=userOL_result;
		this.userOL_user=userOL_user;
	}
	
	
	/**
	 * 
	 */
	public Log() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the userOL_id
	 */
	public int getUserOL_id() {
		return userOL_id;
	}
	/**
	 * @param userOL_id the userOL_id to set
	 */
	public void setUserOL_id(int userOL_id) {
		this.userOL_id = userOL_id;
	}
	/**
	 * @return the userOL_context
	 */
	public String getUserOL_context() {
		return userOL_context;
	}
	/**
	 * @param userOL_context the userOL_context to set
	 */
	public void setUserOL_context(String userOL_context) {
		this.userOL_context = userOL_context;
	}
	/**
	 * @return the userOL_date
	 */
	public Date getUserOL_date() {
		return userOL_date;
	}
	/**
	 * @param userOL_date the userOL_date to set
	 */
	public void setUserOL_date(Date userOL_date) {
		this.userOL_date = userOL_date;
	}
	/**
	 * @return the userOL_result
	 */
	public String getUserOL_result() {
		return userOL_result;
	}
	/**
	 * @param userOL_result the userOL_result to set
	 */
	public void setUserOL_result(String userOL_result) {
		this.userOL_result = userOL_result;
	}
	/**
	 * @return the userOL_user
	 */
	public String getUserOL_user() {
		return userOL_user;
	}
	/**
	 * @param userOL_user the userOL_user to set
	 */
	public void setUserOL_user(String userOL_user) {
		this.userOL_user = userOL_user;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Log [userOL_id=" + userOL_id + ", userOL_context=" + userOL_context + ", userOL_date=" + userOL_date
				+ ", userOL_result=" + userOL_result + ", userOL_user=" + userOL_user + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
