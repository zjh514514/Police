package com.five.police.repository;

import com.five.police.model.Distributelog;

public interface DistributelogMapper {
    int deleteByPrimaryKey(Integer distributeid);

    int insert(Distributelog record);

    int insertSelective(Distributelog record);

    Distributelog selectByPrimaryKey(Integer distributeid);

    int updateByPrimaryKeySelective(Distributelog record);

    int updateByPrimaryKey(Distributelog record);
}