package com.clps.cm.mapper;

import com.clps.cm.pojo.PreferentialInfor;

public interface PreferentialInforMapper {
    int deleteByPrimaryKey(Integer preferentialId);

    int insert(PreferentialInfor record);

    int insertSelective(PreferentialInfor record);

    PreferentialInfor selectByPrimaryKey(Integer preferentialId);

    int updateByPrimaryKeySelective(PreferentialInfor record);

    int updateByPrimaryKey(PreferentialInfor record);
}