package com.five.police.model;

import java.util.Date;

public class Taskresult {
    private Integer taskid;

    private String policeid;

    private Date fillintime;

    private String isnormal;

    private String exceptiontype;

    private String condition;

    private String tip;

    private String process;

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

    public Date getFillintime() {
        return fillintime;
    }

    public void setFillintime(Date fillintime) {
        this.fillintime = fillintime;
    }

    public String getIsnormal() {
        return isnormal;
    }

    public void setIsnormal(String isnormal) {
        this.isnormal = isnormal;
    }

    public String getExceptiontype() {
        return exceptiontype;
    }

    public void setExceptiontype(String exceptiontype) {
        this.exceptiontype = exceptiontype;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }
}