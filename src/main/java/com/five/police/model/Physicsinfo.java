package com.five.police.model;

import java.util.Date;

public class Physicsinfo {
    private Integer physicsid;

    private String address;

    private Date firsttime;

    private Integer placeid;

    public Integer getPhysicsid() {
        return physicsid;
    }

    public void setPhysicsid(Integer physicsid) {
        this.physicsid = physicsid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getFirsttime() {
        return firsttime;
    }

    public void setFirsttime(Date firsttime) {
        this.firsttime = firsttime;
    }

    public Integer getPlaceid() {
        return placeid;
    }

    public void setPlaceid(Integer placeid) {
        this.placeid = placeid;
    }
}