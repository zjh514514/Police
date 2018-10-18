package com.five.police.repository;

import com.five.police.model.Taskdistribute;

public interface TaskdistributeMapper {
    int deleteByPrimaryKey(Integer taskid);

    int insert(Taskdistribute record);

    int insertSelective(Taskdistribute record);

    Taskdistribute selectByPrimaryKey(Integer taskid);

    int updateByPrimaryKeySelective(Taskdistribute record);

    int updateByPrimaryKey(Taskdistribute record);
}