package com.five.police.repository;

import com.five.police.model.Taskresult;

public interface TaskresultMapper {
    int deleteByPrimaryKey(Integer taskid);

    int insert(Taskresult record);

    int insertSelective(Taskresult record);

    Taskresult selectByPrimaryKey(Integer taskid);

    int updateByPrimaryKeySelective(Taskresult record);

    int updateByPrimaryKey(Taskresult record);
}