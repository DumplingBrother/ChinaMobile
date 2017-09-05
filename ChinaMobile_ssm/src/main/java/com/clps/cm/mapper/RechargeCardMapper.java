package com.clps.cm.mapper;

import com.clps.cm.pojo.RechargeCard;

public interface RechargeCardMapper {
    int deleteByPrimaryKey(Integer cardId);

    int insert(RechargeCard record);

    int insertSelective(RechargeCard record);

    RechargeCard selectByPrimaryKey(Integer cardId);

    int updateByPrimaryKeySelective(RechargeCard record);

    int updateByPrimaryKey(RechargeCard record);
}