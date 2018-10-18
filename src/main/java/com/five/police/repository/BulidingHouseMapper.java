package com.five.police.repository;

import com.five.police.model.BulidingHouse;

public interface BulidingHouseMapper {
    int deleteByPrimaryKey(Integer houseid);

    int insert(BulidingHouse record);

    int insertSelective(BulidingHouse record);

    BulidingHouse selectByPrimaryKey(Integer houseid);

    int updateByPrimaryKeySelective(BulidingHouse record);

    int updateByPrimaryKey(BulidingHouse record);
}