package com.five.police.repository;

import com.five.police.model.Physicslog;

public interface PhysicslogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Physicslog record);

    int insertSelective(Physicslog record);

    Physicslog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Physicslog record);

    int updateByPrimaryKey(Physicslog record);
}