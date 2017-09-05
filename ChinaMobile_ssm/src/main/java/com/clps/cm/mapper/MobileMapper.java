package com.clps.cm.mapper;

import com.clps.cm.pojo.Mobile;

public interface MobileMapper {
    int insert(Mobile record);

    int insertSelective(Mobile record);
}