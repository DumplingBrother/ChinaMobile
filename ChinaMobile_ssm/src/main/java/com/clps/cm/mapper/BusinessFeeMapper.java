package com.clps.cm.mapper;

import com.clps.cm.pojo.BusinessFee;

public interface BusinessFeeMapper {
    int deleteByPrimaryKey(Integer businessId);

    int insert(BusinessFee record);

    int insertSelective(BusinessFee record);

    BusinessFee selectByPrimaryKey(Integer businessId);

    int updateByPrimaryKeySelective(BusinessFee record);

    int updateByPrimaryKey(BusinessFee record);
}