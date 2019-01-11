package com.huanleichen.login.demo.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    private int userId;
    private String userPassword;

    public User() {
    }

    public User(String userName, int userId, String userPassword) {
        this.userName = userName;
        this.userId = userId;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
