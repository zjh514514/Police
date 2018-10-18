package com.five.police.repository;

import com.five.police.model.Buliding;

public interface BulidingMapper {
    int deleteByPrimaryKey(Integer placeid);

    int insert(Buliding record);

    int insertSelective(Buliding record);

    Buliding selectByPrimaryKey(Integer placeid);

    int updateByPrimaryKeySelective(Buliding record);

    int updateByPrimaryKey(Buliding record);
}