/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizquest.Dao;

import com.quizquest.model.Message;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mulinda Kevin
 */
public class MessageDao {
    
    private final String jdbc_url="jdbc:mysql://localhost:3306/quiz_quest_application_db";
    private final String dbUsername="root";
    private final String dbPasswd="Admin1";    
    
    public Integer registerMessage(Message smsObj){
    
            try{
                
              Connection conn = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
              
              String sql= "INSERT INTO Message (senderName,feedback) VALUES(?,?)";
              
              PreparedStatement stm = conn.prepareStatement(sql);
              
              stm.setString(1, smsObj.getSenderName());
              stm.setString(2, smsObj.getFeedback());
              
               int num = stm.executeUpdate() ;
                conn.close();
                return num;
            }catch(Exception e){e.printStackTrace();}
            
            return null;
    }
    
    public List<Message> retrieveAllMessage(){
    
        try {
            Connection con = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
            String query = "SELECT * FROM MESSAGE WHERE isRead = ?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setBoolean(1, false);
            ResultSet rs = stm.executeQuery();
            
            List<Message> studentList = new ArrayList<>();
            
            while(rs.next()){
                
                Message theMessage = new Message();
                
                theMessage.setMessageId(rs.getInt(1));
                theMessage.setSenderName(rs.getString(2));
                theMessage.setFeedback(rs.getString(3));
                
                studentList.add(theMessage);
            }
            con.close();
            return studentList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public int countUnReadMessages(){
        
        int readCount = 0;
        
        try {
            Connection con = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
            String query = "SELECT COUNT(*) FROM MESSAGE WHERE isRead = ?";
            PreparedStatement stm = con.prepareStatement(query);
            stm.setBoolean(1, false);
            ResultSet rs = stm.executeQuery();           
            
            while(rs.next()){
                readCount = rs.getInt(1);
            }
            con.close();
            return readCount;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
    
     public Integer updateMessage(){
    
            try{
                
              Connection conn = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
              
              String sql= "UPDATE MESSAGE SET isRead = ? WHERE isRead = ?";
              
              PreparedStatement stm = conn.prepareStatement(sql);
              
              stm.setBoolean(1, true);
              stm.setBoolean(2, false);
              
               int num = stm.executeUpdate() ;
                conn.close();
                return num;
            }catch(Exception e){e.printStackTrace();}
            
            return null;
    }
}
