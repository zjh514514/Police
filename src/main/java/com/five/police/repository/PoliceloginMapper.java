package com.five.police.repository;

import com.five.police.model.Policelogin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PoliceloginMapper {
    int deleteByPrimaryKey(String policeid);

    int insert(Policelogin record);

    int insertSelective(Policelogin record);

    Policelogin selectByPrimaryKey(String policeid);

    int updateByPrimaryKeySelective(Policelogin record);

    int updateByPrimaryKey(Policelogin record);
}