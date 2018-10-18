package com.five.police.model;

import java.util.Date;

public class Taskdistribute {
    private Integer taskid;

    private String policeid;

    private Date expecttime;

    private String finish;

    private Integer distributeid;

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getPoliceid() {
        return policeid;
    }

    public void setPoliceid(String policeid) {
        this.policeid = policeid;
    }

    public Date getExpecttime() {
        return expecttime;
    }

    public void setExpecttime(Date expecttime) {
        this.expecttime = expecttime;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public Integer getDistributeid() {
        return distributeid;
    }

    public void setDistributeid(Integer distributeid) {
        this.distributeid = distributeid;
    }
}