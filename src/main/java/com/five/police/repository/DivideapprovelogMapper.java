package com.five.police.repository;

import com.five.police.model.Divideapprovelog;

public interface DivideapprovelogMapper {
    int deleteByPrimaryKey(Integer divideid);

    int insert(Divideapprovelog record);

    int insertSelective(Divideapprovelog record);

    Divideapprovelog selectByPrimaryKey(Integer divideid);

    int updateByPrimaryKeySelective(Divideapprovelog record);

    int updateByPrimaryKey(Divideapprovelog record);
}