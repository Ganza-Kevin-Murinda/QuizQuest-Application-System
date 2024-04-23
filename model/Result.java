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
public class Result {
    
    private String courseId;
    private int resultId;
    private String userName;
    private String email;
    private String courseName;
    private int score;
    private String date;

    public Result() {
    }

    public Result(String courseId, int resultId, String userName, String email, String courseName, int score, String date) {
        this.courseId = courseId;
        this.resultId = resultId;
        this.userName = userName;
        this.email = email;
        this.courseName = courseName;
        this.score = score;
        this.date = date;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCourseId() {
        return courseId;
    }

    public int getResultId() {
        return resultId;
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

    public String getDate() {
        return date;
    }

        
    
}
