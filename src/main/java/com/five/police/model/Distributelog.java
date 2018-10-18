package com.five.police.model;

import java.util.Date;

public class Distributelog {
    private Integer distributeid;

    private String operater;

    private Date time;

    public Integer getDistributeid() {
        return distributeid;
    }

    public void setDistributeid(Integer distributeid) {
        this.distributeid = distributeid;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}