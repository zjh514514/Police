package com.five.police.model;

public class Policeinfo {
    private String policeid;

    private String name;

    private String idnum;

    private String sex;

    private Integer age;

    private Integer workage;

    private String phone;

    private String address;

    private String record;

    private String photo;

    private String role;

    private Dd ddsex;

    private Dd ddrole;

    public Dd getDdsex() {
        return ddsex;
    }

    public Dd getDdrole() {
        return ddrole;
    }

    public void setDdsex(Dd ddsex) {
        this.ddsex = ddsex;
    }

    public void setDdrole(Dd ddrole) {
        this.ddrole = ddrole;
    }

    public String getPoliceid() {
        return policeid;
    }

    public void setPoliceid(String policeid) {
        this.policeid = policeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWorkage() {
        return workage;
    }

    public void setWorkage(Integer workage) {
        this.workage = workage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}