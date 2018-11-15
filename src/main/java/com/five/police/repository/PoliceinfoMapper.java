package com.five.police.repository;

import com.five.police.model.Policeinfo;

import java.util.List;

public interface PoliceinfoMapper {
    int deleteByPrimaryKey(String policeid);

    int insert(Policeinfo record);

    int insertSelective(Policeinfo record);

    Policeinfo selectByPrimaryKey(String policeid);

    int updateByPrimaryKeySelective(Policeinfo record);

    int updateByPrimaryKey(Policeinfo record);

    List<Policeinfo> selectallpolice(Policeinfo record);

    List selectByPolice(String policeid);
}