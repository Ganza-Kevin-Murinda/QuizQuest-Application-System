/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizquest.Dao;

import com.quizquest.model.UserResult;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mulinda Kevin
 */
public class UserResultDao {
    
    private String jdbc_url="jdbc:mysql://localhost:3306/quiz_quest_application_db";
    private String dbUsername="root";
    private String dbPasswd="Admin1";
    
   public List<UserResult> retrieveUserResult(String email){
    
        try {
            Connection con = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
            String query = "SELECT * FROM USERRESULT WHERE email = '"+email+"'";
            PreparedStatement stm = con.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            
            List<UserResult> resultList = new ArrayList<>();
            
            while(rs.next()){
                
                UserResult theResult = new UserResult();
                
                theResult.setUserId(rs.getInt(1));
                theResult.setUserName(rs.getString(2));
                theResult.setEmail(rs.getString(3));
                theResult.setCourseName(rs.getString(4));
                theResult.setScore(rs.getInt(5));
                theResult.setDateTime(rs.getString(6));
                
                resultList.add(theResult); 
            }
            con.close();
            return resultList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }    

}

