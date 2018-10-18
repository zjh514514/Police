package com.five.police.repository;

import com.five.police.model.Policeinfo;

public interface PoliceinfoMapper {
    int deleteByPrimaryKey(String policeid);

    int insert(Policeinfo record);

    int insertSelective(Policeinfo record);

    Policeinfo selectByPrimaryKey(String policeid);

    int updateByPrimaryKeySelective(Policeinfo record);

    int updateByPrimaryKey(Policeinfo record);
}