package com.five.police.repository;

import com.five.police.model.Bulidingdivide;

public interface BulidingdivideMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bulidingdivide record);

    int insertSelective(Bulidingdivide record);

    Bulidingdivide selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bulidingdivide record);

    int updateByPrimaryKey(Bulidingdivide record);
}