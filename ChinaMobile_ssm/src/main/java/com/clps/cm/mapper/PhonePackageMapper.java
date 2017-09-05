package com.clps.cm.mapper;

import com.clps.cm.pojo.PhonePackage;

public interface PhonePackageMapper {
    int deleteByPrimaryKey(Integer ppId);

    int insert(PhonePackage record);

    int insertSelective(PhonePackage record);

    PhonePackage selectByPrimaryKey(Integer ppId);

    int updateByPrimaryKeySelective(PhonePackage record);

    int updateByPrimaryKey(PhonePackage record);
}