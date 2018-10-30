package com.five.police.repository;

import com.five.police.model.Dd;

public interface DdMapper {
    int deleteByPrimaryKey(String code);

    int insert(Dd record);

    int insertSelective(Dd record);

    Dd selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Dd record);

    int updateByPrimaryKey(Dd record);
}