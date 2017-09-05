package com.clps.cm.mapper;

import com.clps.cm.pojo.RechargeInfor;

public interface RechargeInforMapper {
    int deleteByPrimaryKey(Integer rechargeInforId);

    int insert(RechargeInfor record);

    int insertSelective(RechargeInfor record);

    RechargeInfor selectByPrimaryKey(Integer rechargeInforId);

    int updateByPrimaryKeySelective(RechargeInfor record);

    int updateByPrimaryKey(RechargeInfor record);
}