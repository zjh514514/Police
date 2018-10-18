package com.five.police.repository;

import com.five.police.model.BulidingWorkplace;

public interface BulidingWorkplaceMapper {
    int deleteByPrimaryKey(Integer workplaceid);

    int insert(BulidingWorkplace record);

    int insertSelective(BulidingWorkplace record);

    BulidingWorkplace selectByPrimaryKey(Integer workplaceid);

    int updateByPrimaryKeySelective(BulidingWorkplace record);

    int updateByPrimaryKey(BulidingWorkplace record);
}