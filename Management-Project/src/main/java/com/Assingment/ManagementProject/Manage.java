package com.Assingment.ManagementProject;



public class Manage {

    private Integer userId;
    private String name;
    private String userName;
    private String address;
    private Long number;
    private boolean mangeStatus; ///is user active

    public Manage(Integer userId, String name, String userName, String address, Long number, boolean mangeStatus) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.address = address;
        this.number = number;
        this.mangeStatus = mangeStatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public boolean isMangeStatus() {
        return mangeStatus;
    }

    public void setMangeStatus(boolean mangeStatus) {
        this.mangeStatus = mangeStatus;
    }
}
