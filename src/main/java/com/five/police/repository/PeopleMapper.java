package com.five.police.repository;

import com.five.police.model.People;

public interface PeopleMapper {
    int deleteByPrimaryKey(String idnum);

    int insert(People record);

    int insertSelective(People record);

    People selectByPrimaryKey(String idnum);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);
}