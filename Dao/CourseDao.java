/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizquest.Dao;

import com.quizquest.model.Course;
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
public class CourseDao {
    
    private final String jdbc_url="jdbc:mysql://localhost:3306/quiz_quest_application_db";
    private final String dbUsername="root";
    private final String dbPasswd="Admin1";    
    
    public List<Course> retrieveAllCourse(){
    
        try {
            Connection con = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
            String query = "SELECT * FROM COURSE";
            PreparedStatement stm = con.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            
            List<Course> studentList = new ArrayList<>();
            
            while(rs.next()){
                
                Course theCourse = new Course();
                
                theCourse.setCourseId(rs.getString(1));
                theCourse.setCourseName(rs.getString(2));
                
                
                studentList.add(theCourse);
            }
            con.close();
            return studentList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public Integer registerCourse(Course crsObj){
    
            try{
                
              Connection conn = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
              
              String sql= "INSERT INTO COURSE (course_Id,course_Name) VALUES(?,?)";
              
              PreparedStatement stm = conn.prepareStatement(sql);
              
              stm.setString(1, crsObj.getCourseId());
              stm.setString(2, crsObj.getCourseName());
              
               int num = stm.executeUpdate() ;
                conn.close();
                return num;
            }catch(Exception e){e.printStackTrace();}
            
            return null;
    }
    
    public Integer updateCourse(Course crsObj){
    
            try{
                
              Connection conn = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
              
              String sql= "UPDATE COURSE SET course_Name = ? WHERE course_Id = ? ";
              
              PreparedStatement stm = conn.prepareStatement(sql);
              
              stm.setString(1, crsObj.getCourseName());
              stm.setString(2, crsObj.getCourseId());
              
               int num = stm.executeUpdate() ;
                conn.close();
                return num;
            }catch(Exception e){e.printStackTrace();}
            
            return null;
    }
    
}
