package com.five.police.repository;

import com.five.police.model.Bulidingleader;

public interface BulidingleaderMapper {
    int deleteByPrimaryKey(Integer placeid);

    int insert(Bulidingleader record);

    int insertSelective(Bulidingleader record);

    Bulidingleader selectByPrimaryKey(Integer placeid);

    int updateByPrimaryKeySelective(Bulidingleader record);

    int updateByPrimaryKey(Bulidingleader record);
}