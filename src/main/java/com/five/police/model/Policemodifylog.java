package com.five.police.model;

import java.util.Date;

public class Policemodifylog {
    private Integer modifyid;

    private String operater;

    private Date time;

    public Integer getModifyid() {
        return modifyid;
    }

    public void setModifyid(Integer modifyid) {
        this.modifyid = modifyid;
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