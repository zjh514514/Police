package com.five.police.repository;

import com.five.police.model.Placeleadermodify;

public interface PlaceleadermodifyMapper {
    int deleteByPrimaryKey(Integer bulidingmodifyid);

    int insert(Placeleadermodify record);

    int insertSelective(Placeleadermodify record);

    Placeleadermodify selectByPrimaryKey(Integer bulidingmodifyid);

    int updateByPrimaryKeySelective(Placeleadermodify record);

    int updateByPrimaryKey(Placeleadermodify record);
}