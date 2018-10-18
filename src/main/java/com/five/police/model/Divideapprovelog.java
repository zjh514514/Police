package com.five.police.model;

import java.util.Date;

public class Divideapprovelog {
    private Integer divideid;

    private String approver;

    private Date approvetime;

    private String approve;

    private String opinion;

    public Integer getDivideid() {
        return divideid;
    }

    public void setDivideid(Integer divideid) {
        this.divideid = divideid;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public Date getApprovetime() {
        return approvetime;
    }

    public void setApprovetime(Date approvetime) {
        this.approvetime = approvetime;
    }

    public String getApprove() {
        return approve;
    }

    public void setApprove(String approve) {
        this.approve = approve;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}