package com.five.police.repository;

import com.five.police.model.Policemodify;

public interface PolicemodifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Policemodify record);

    int insertSelective(Policemodify record);

    Policemodify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Policemodify record);

    int updateByPrimaryKey(Policemodify record);
}