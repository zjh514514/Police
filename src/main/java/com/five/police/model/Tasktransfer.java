package com.five.police.model;

public class Tasktransfer {
    private Integer transferid;

    private Integer taskid;

    private String oldleader;

    private String newleader;

    public Integer getTransferid() {
        return transferid;
    }

    public void setTransferid(Integer transferid) {
        this.transferid = transferid;
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getOldleader() {
        return oldleader;
    }

    public void setOldleader(String oldleader) {
        this.oldleader = oldleader;
    }

    public String getNewleader() {
        return newleader;
    }

    public void setNewleader(String newleader) {
        this.newleader = newleader;
    }
}