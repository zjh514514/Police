package com.five.police.repository;

import com.five.police.model.Policedaily;

public interface PolicedailyMapper {
    int deleteByPrimaryKey(String policeid);

    int insert(Policedaily record);

    int insertSelective(Policedaily record);

    Policedaily selectByPrimaryKey(String policeid);

    int updateByPrimaryKeySelective(Policedaily record);

    int updateByPrimaryKey(Policedaily record);
}