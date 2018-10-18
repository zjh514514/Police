package com.five.police.repository;

import com.five.police.model.Policemodifylog;

public interface PolicemodifylogMapper {
    int deleteByPrimaryKey(Integer modifyid);

    int insert(Policemodifylog record);

    int insertSelective(Policemodifylog record);

    Policemodifylog selectByPrimaryKey(Integer modifyid);

    int updateByPrimaryKeySelective(Policemodifylog record);

    int updateByPrimaryKey(Policemodifylog record);
}