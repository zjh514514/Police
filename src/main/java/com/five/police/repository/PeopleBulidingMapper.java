package com.five.police.repository;

import com.five.police.model.PeopleBuliding;

public interface PeopleBulidingMapper {
    int deleteByPrimaryKey(String idnum);

    int insert(PeopleBuliding record);

    int insertSelective(PeopleBuliding record);

    PeopleBuliding selectByPrimaryKey(String idnum);

    int updateByPrimaryKeySelective(PeopleBuliding record);

    int updateByPrimaryKey(PeopleBuliding record);
}