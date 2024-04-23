/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizquest.Dao;


import java.sql.*;
import com.quizquest.model.UserIdentity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mulinda Kevin
 */
public class UserIdentityDao {
    
    private final String jdbc_url="jdbc:mysql://localhost:3306/quiz_quest_application_db";
    private final String dbUsername="root";
    private final String dbPasswd="Admin1";
    

//User Part    
public Integer userSignUp(UserIdentity userObj){
    
            try{
                
              Connection conn = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
              
              String sql= "INSERT INTO USERIDENTITY (fullName,email,userType,password,status) VALUES(?,?,'SystemUser',?,'Active')";
              
              PreparedStatement stm = conn.prepareStatement(sql);
              
              
              stm.setString(1, userObj.getFullName());
              stm.setString(2, userObj.getEmail());
              stm.setString(3, userObj.getPassword());
              
               Integer num = stm.executeUpdate() ;
                conn.close();
                return num;
            }catch(Exception e){e.printStackTrace();}
            
            return null;
    }
    
public String[] userLogin(UserIdentity userObj){
    
        String[] isFound = new String[4];
    
            try{
                
              Connection conn = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
              
              String sql= "SELECT * FROM USERIDENTITY WHERE email =? AND password =?";
              
              PreparedStatement stm = conn.prepareStatement(sql);
              
              stm.setString(1, userObj.getEmail());
              stm.setString(2, userObj.getPassword());
              
              ResultSet rs =  stm.executeQuery();
              
               String name,status,userType;
                if(rs.next()){
                    name = rs.getString(2);
                    userType = rs.getString(4);
                    status = rs.getString(6);
                   isFound[0] = "1";
                   if (status.equals("Active")){
                       isFound[1] = "1";
                   }else{
                       isFound[1] = "0";
                   }
                   isFound[2] = name;
                   isFound[3] = userType;
                   conn.close();
                    return isFound;
                }else{
                    isFound[0] = "0";
                    conn.close();
                    return isFound;
                }
                
                
            }catch(SQLException e){e.printStackTrace();}

            return isFound;
}

public List<UserIdentity> retrieveUser(String email){
    
        try {
            Connection con = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
            String query = "SELECT * FROM USERIDENTITY WHERE email = '"+email+"'";
            PreparedStatement stm = con.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            
            List<UserIdentity> userList = new ArrayList<>();
            
            while(rs.next()){
                
                UserIdentity theUser = new UserIdentity();
                
                theUser.setFullName(rs.getString(2));
                theUser.setEmail(rs.getString(3));
                theUser.setPassword(rs.getString(5));
                
                
                userList.add(theUser);
            }
            con.close();
            return userList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }

public Integer updateUser(UserIdentity userObj){
    
            try{
                
              Connection conn = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
              
              String sql= "UPDATE USERIDENTITY SET fullName = ?, email = ?, password = ? WHERE email = ?";
              
              PreparedStatement stm = conn.prepareStatement(sql);
              
              
              stm.setString(1, userObj.getFullName());
              stm.setString(2, userObj.getEmail());
              stm.setString(3, userObj.getPassword());
              stm.setString(4, userObj.getEmail());
              
               Integer num = stm.executeUpdate() ;
                conn.close();
                return num;
            }catch(Exception e){e.printStackTrace();}
            
            return null;
    }

//Admin Part

public Integer adminCreateUser(UserIdentity userObj){
    
            try{
                
              Connection conn = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
              
              String sql= "INSERT INTO USERIDENTITY (fullName,email,userType,password,status) VALUES(?,?,?,?,?)";
              
              PreparedStatement stm = conn.prepareStatement(sql);
              
              
              stm.setString(1, userObj.getFullName());
              stm.setString(2, userObj.getEmail());
              stm.setString(3, userObj.getUserType());              
              stm.setString(4, userObj.getPassword());
              stm.setString(5, userObj.getStatus());
              
               Integer num = stm.executeUpdate() ;
                conn.close();
                return num;
            }catch(Exception e){e.printStackTrace();}
            
            return null;
    }

public List<UserIdentity> adminRetrieveUser(){
    
        try {
            Connection con = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
            String query = "SELECT * FROM USERIDENTITY ORDER BY Id ASC";
            PreparedStatement stm = con.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            
            List<UserIdentity> userList = new ArrayList<>();
            
            while(rs.next()){
                
                UserIdentity theUser = new UserIdentity();
                
                theUser.setId(rs.getInt(1));
                theUser.setFullName(rs.getString(2));
                theUser.setEmail(rs.getString(3));
                theUser.setUserType(rs.getString(4));
                theUser.setPassword(rs.getString(5));
                theUser.setStatus(rs.getString(6));
                
                
                userList.add(theUser);
            }
            con.close();
            return userList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }

public Integer adminInactiveUser(UserIdentity userObj){
    
            try{
            Connection conn = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
              
            String sql= "UPDATE USERIDENTITY SET status = ? WHERE Id = ? ";
              
            PreparedStatement stm = conn.prepareStatement(sql);
              
              stm.setInt(2, userObj.getId());
              stm.setString(1, userObj.getStatus());
              
               int num = stm.executeUpdate() ;
                conn.close();
                return num;
            }catch(Exception e){e.printStackTrace();}
    
            return null;
            }

public Integer adminUpdateUser(UserIdentity userObj){
    
            try{
                
              Connection conn = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
              
              String sql= "UPDATE USERIDENTITY SET fullName = ?, email = ?, password = ?, userType = ?, status = ? WHERE Id = ?";
              
              PreparedStatement stm = conn.prepareStatement(sql);
              
              
              stm.setString(1, userObj.getFullName());
              stm.setString(2, userObj.getEmail());
              stm.setString(3, userObj.getPassword());
              stm.setString(4, userObj.getUserType());
              stm.setString(5, userObj.getStatus());
              stm.setInt(6, userObj.getId());              
              
               Integer num = stm.executeUpdate() ;
                conn.close();
                return num;
            }catch(Exception e){e.printStackTrace();}
            
            return null;
    }

}


