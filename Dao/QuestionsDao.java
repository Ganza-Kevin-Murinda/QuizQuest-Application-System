/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizquest.Dao;


import com.quizquest.model.Questions;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mulinda Kevin
 */
public class QuestionsDao {
    
    private final String jdbc_url="jdbc:mysql://localhost:3306/quiz_quest_application_db";
    private final String dbUsername="root";
    private final String dbPasswd="Admin1";
    
    
public List<Object[]> fetchQuestionsAndAnswers(String courseName) {
    String course;
    course = courseName;
    List<Object[]> questionsAndAnswersList = new ArrayList<>();

    try {
        Connection conn = DriverManager.getConnection(jdbc_url, dbUsername, dbPasswd);
        String query = "SELECT * FROM QUESTIONS WHERE course_Id IN(SELECT course_Id FROM COURSE WHERE course_Name = '"+course+"');";
        PreparedStatement stm = conn.prepareStatement(query);
        ResultSet rs = stm.executeQuery();

        while (rs.next()) {
            String courseId = rs.getString(1);
            int QId = rs.getInt(2);
            String QText = rs.getString(3);
            String correctAnswer = rs.getString(4);
            String choice1 = rs.getString(5);
            String choice2 = rs.getString(6);
            String choice3 = rs.getString(7);
            String choice4 = rs.getString(8);

            Questions question = new Questions(courseId, QId, QText, correctAnswer, choice1, choice2, choice3, choice4);

            // Store question and choices in an Object array
            Object[] questionAndChoices = { courseId, QText, correctAnswer, choice1, choice2, choice3, choice4 };
            questionsAndAnswersList.add(questionAndChoices);
        }

        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return questionsAndAnswersList;
}

public List<Questions> fetchQuestion() {

    List<Questions> questionsList = new ArrayList<>();

    try {
        Connection conn = DriverManager.getConnection(jdbc_url, dbUsername, dbPasswd);
        String query = "SELECT * FROM QUESTIONS";
        PreparedStatement stm = conn.prepareStatement(query);
        ResultSet rs = stm.executeQuery();

        while (rs.next()) {

            Questions theQuestions = new Questions();
                
                theQuestions.setCourseId(rs.getString(1));
                theQuestions.setQId(rs.getInt(2));
                theQuestions.setQText(rs.getString(3));
                theQuestions.setCorrectAnswer(rs.getString(4));
                theQuestions.setChoice1(rs.getString(5));
                theQuestions.setChoice2(rs.getString(6));
                theQuestions.setChoice3(rs.getString(7));
                theQuestions.setChoice4(rs.getString(8));
                
            questionsList.add(theQuestions);
        }

        conn.close();
        return questionsList;
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return null;
}

public Integer registerQuestion(Questions qtsObj){
    
            try{
                
              Connection conn = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
              
              String sql= "INSERT INTO QUESTION (course_Id,QId,QText,correctAnswer,choice1,choice2,choice3,choice4) VALUES(?,?,?,?,?,?,?,?)";
              
              PreparedStatement stm = conn.prepareStatement(sql);
              
              stm.setString(1, qtsObj.getCourseId());
              stm.setInt(2, qtsObj.getQId());
              stm.setString(3, qtsObj.getQText());
              stm.setString(4, qtsObj.getCorrectAnswer());
              stm.setString(5, qtsObj.getChoice1());
              stm.setString(6, qtsObj.getChoice2());
              stm.setString(7, qtsObj.getChoice3());
              stm.setString(8, qtsObj.getChoice4());
              
               int num = stm.executeUpdate() ;
                conn.close();
                return num;
            }catch(Exception e){e.printStackTrace();}
            
            return null;
    }

public Integer deleteQuestion(Questions qtsObj){
    
            try{
            Connection conn = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
              
            String sql= "DELETE FROM QUESTIONS WHERE QId = ? ";
              
            PreparedStatement stm = conn.prepareStatement(sql);
              
              stm.setInt(1, qtsObj.getQId());
              
               int num = stm.executeUpdate() ;
                conn.close();
                return num;
            }catch(Exception e){e.printStackTrace();}
    
            return null;
            }

public Integer updateQuestions(Questions qtsObj){
    
            try{
                
              Connection conn = DriverManager.getConnection(jdbc_url,dbUsername,dbPasswd);
              
              String sql= "UPDATE QUESTIONS SET course_Id = ?, QText = ?, correctAnswer = ?, "
                      + "choice1 = ?, choice2 = ?, choice3 = ?, choice4 = ? WHERE QId = ? ";
              
              PreparedStatement stm = conn.prepareStatement(sql);
              
              stm.setString(1, qtsObj.getCourseId());              
              stm.setString(2, qtsObj.getQText());
              stm.setString(3, qtsObj.getCorrectAnswer());
              stm.setString(4, qtsObj.getChoice1());
              stm.setString(5, qtsObj.getChoice2());
              stm.setString(6, qtsObj.getChoice3());
              stm.setString(7, qtsObj.getChoice4());
              stm.setInt(8, qtsObj.getQId());
              
               int num = stm.executeUpdate() ;
                conn.close();
                return num;
            }catch(Exception e){e.printStackTrace();}
            
            return null;
    }

    
}
