package com.five.police.model;

import java.util.Date;

public class Physicslog {
    private Integer id;

    private Integer physicsid;

    private String idnum;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPhysicsid() {
        return physicsid;
    }

    public void setPhysicsid(Integer physicsid) {
        this.physicsid = physicsid;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}