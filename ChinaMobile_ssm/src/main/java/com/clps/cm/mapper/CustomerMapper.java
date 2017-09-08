package com.clps.cm.mapper;

import com.clps.cm.pojo.Customer;

/**
 * 
 * @author qiuming Package_name:com.clps.cm.pojo Time:2017年9月7日下午2:07:01
 *         Description:
 */
public interface CustomerMapper {
	/**
	 * 
	 * @param customerId
	 * @return
	 */
	int deleteByPrimaryKey(Integer customerId);

	/**
	 * 
	 * @param record
	 * @return
	 */
	int insert(Customer record);

	/**
	 * 
	 * @param record
	 * @return
	 */
	int insertSelective(Customer record);

	/**
	 * 
	 * @param customerId
	 * @return
	 */
	Customer selectByPrimaryKey(Integer customerId);

	/**
	 * 
	 * @param customerUsername
	 * @return
	 */
	Customer selectByUsername(String customerUsername);

	/**
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(Customer record);

	/**
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(Customer record);
}