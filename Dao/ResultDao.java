/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizquest.Dao;

import java.sql.*;
import com.quizquest.model.Result;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mulinda Kevin
 */
public class ResultDao {
    
    private final String jdbc_url="jdbc:mysql://localhost:3306/quiz_quest_application_db";
    private final String dbUsername="root";
    private final String dbPasswd="Admin1";
    
    
    public Integer insertResult(Result resObj){
    
            try{
                
              Connection conn = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
              
              String sql= "INSERT INTO RESULT (userName,email,course_Id,course_Name,score,Date_Time) VALUES(?,?,?,?,?,?)";
              
              PreparedStatement stm = conn.prepareStatement(sql);
              
              
              stm.setString(1, resObj.getUserName());
              stm.setString(2, resObj.getEmail());
              stm.setString(3, resObj.getCourseId());
              stm.setString(4, resObj.getCourseName());
              stm.setInt(5, resObj.getScore());
              stm.setString(6, resObj.getDate());
              
              Integer num = stm.executeUpdate() ;
                conn.close();
                return num;
            }catch(Exception e){e.printStackTrace();}
            
            return null;
    }
    
    public List<Result> retrieveAllResult(){
    
        try {
            Connection con = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
            String query = "SELECT * FROM RESULT";
            PreparedStatement stm = con.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            
            List<Result> resulttList = new ArrayList<>();
            
            while(rs.next()){
                
                Result theResult = new Result();
                
                theResult.setResultId(rs.getInt(1));
                theResult.setUserName(rs.getString(2));
                theResult.setEmail(rs.getString(3));
                theResult.setCourseId(rs.getString(4));                
                theResult.setCourseName(rs.getString(5));
                theResult.setScore(rs.getInt(6));
                theResult.setDate(rs.getString(7));
                
                
                resulttList.add(theResult);
            }
            con.close();
            return resulttList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    
}
