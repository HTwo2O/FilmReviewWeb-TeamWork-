package com.FilmReviewWeb.Model;

import java.io.Serializable;

/**
 * @author HTwo2O
 * @date 2020/5/13 19:53
 */
public class User implements Serializable {
    private int userId;
    private String userName;
    private String password;
    //权限 普通用户为0，管理员为1
    private int power;
    private String creatDate;
    private String gender;

    public User() {
    }

    public User(int userId, String userName, String password, int power, String creatDate,String gender) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.power = power;
        this.creatDate = creatDate;
        this.gender = gender;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(String creatDate) {
        this.creatDate = creatDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", power=" + power +
                ", creatDate='" + creatDate + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
