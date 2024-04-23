/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizquest.model;

/**
 *
 * @author Mulinda Kevin
 */
public class UserResult {
    
    private int userId;
    private String userName;
    private String email;
    private String courseName;
    private int score;
    private String dateTime;

    public UserResult() {
    }

    public UserResult(int userId, String userName, String email, String courseName, int score, String dateTime) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.courseName = courseName;
        this.score = score;
        this.dateTime = dateTime;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
    
    public String getEmail() {
        return email;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getScore() {
        return score;
    }

    public String getDateTime() {
        return dateTime;
    }
    
    
    
    
}
