package com.five.police.repository;

import com.five.police.model.BulidingWeight;

public interface BulidingWeightMapper {
    int deleteByPrimaryKey(Integer placeid);

    int insert(BulidingWeight record);

    int insertSelective(BulidingWeight record);

    BulidingWeight selectByPrimaryKey(Integer placeid);

    int updateByPrimaryKeySelective(BulidingWeight record);

    int updateByPrimaryKey(BulidingWeight record);
}