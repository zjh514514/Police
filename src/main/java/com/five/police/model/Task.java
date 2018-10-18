package com.five.police.model;

import java.util.Date;

public class Task {
    private Integer taskid;

    private String taskname;

    private String tasktype;

    private String taskaddress;

    private String linkman;

    private String source;

    private Date starttime;

    private Date endtime;

    private String level;

    private String distribute;

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getTasktype() {
        return tasktype;
    }

    public void setTasktype(String tasktype) {
        this.tasktype = tasktype;
    }

    public String getTaskaddress() {
        return taskaddress;
    }

    public void setTaskaddress(String taskaddress) {
        this.taskaddress = taskaddress;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDistribute() {
        return distribute;
    }

    public void setDistribute(String distribute) {
        this.distribute = distribute;
    }
}