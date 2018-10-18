package com.five.police.repository;

import com.five.police.model.Physicsinfo;

public interface PhysicsinfoMapper {
    int deleteByPrimaryKey(Integer physicsid);

    int insert(Physicsinfo record);

    int insertSelective(Physicsinfo record);

    Physicsinfo selectByPrimaryKey(Integer physicsid);

    int updateByPrimaryKeySelective(Physicsinfo record);

    int updateByPrimaryKey(Physicsinfo record);
}