package com.five.police.repository;

import com.five.police.model.Task;

public interface TaskMapper {
    int deleteByPrimaryKey(Integer taskid);

    int insert(Task record);

    int insertSelective(Task record);

    Task selectByPrimaryKey(Integer taskid);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);
}