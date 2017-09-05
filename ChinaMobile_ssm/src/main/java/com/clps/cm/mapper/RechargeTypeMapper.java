package com.clps.cm.mapper;

import com.clps.cm.pojo.RechargeType;

public interface RechargeTypeMapper {
    int deleteByPrimaryKey(Integer rechargeTypeId);

    int insert(RechargeType record);

    int insertSelective(RechargeType record);

    RechargeType selectByPrimaryKey(Integer rechargeTypeId);

    int updateByPrimaryKeySelective(RechargeType record);

    int updateByPrimaryKey(RechargeType record);
}