package com.clps.cm.mapper;

import com.clps.cm.pojo.PackageBusiness;

public interface PackageBusinessMapper {
    int deleteByPrimaryKey(Integer pbId);

    int insert(PackageBusiness record);

    int insertSelective(PackageBusiness record);

    PackageBusiness selectByPrimaryKey(Integer pbId);

    int updateByPrimaryKeySelective(PackageBusiness record);

    int updateByPrimaryKey(PackageBusiness record);
}