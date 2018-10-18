package com.five.police.repository;

import com.five.police.model.Tasktransfer;

public interface TasktransferMapper {
    int deleteByPrimaryKey(Integer transferid);

    int insert(Tasktransfer record);

    int insertSelective(Tasktransfer record);

    Tasktransfer selectByPrimaryKey(Integer transferid);

    int updateByPrimaryKeySelective(Tasktransfer record);

    int updateByPrimaryKey(Tasktransfer record);
}