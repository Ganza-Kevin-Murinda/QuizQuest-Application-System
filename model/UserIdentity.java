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
public class UserIdentity {
    
    private int Id;
    private String fullName;
    private String email;
    private String userType;
    private String password;
    private String status;
    
    //constructor without args

    public UserIdentity() {
    }
        
    // constructor with args

    public UserIdentity(int Id, String fullName, String email, String userType, String password, String status) {
        this.Id = Id;
        this.fullName = fullName;
        this.email = email;
        this.userType = userType;
        this.password = password;
        this.status = status;
    }
    
    
    
    //Setters

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    //Getters

    public int getId() {
        return Id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }
    
    
    
}
