package com.clps.cm.mapper;

import com.clps.cm.pojo.MobilePackage;

public interface MobilePackageMapper {
    int deleteByPrimaryKey(Integer telPackageId);

    int insert(MobilePackage record);

    int insertSelective(MobilePackage record);

    MobilePackage selectByPrimaryKey(Integer telPackageId);

    int updateByPrimaryKeySelective(MobilePackage record);

    int updateByPrimaryKey(MobilePackage record);
}