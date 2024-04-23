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
public class Questions {
    
    private String courseId;
    private int QId;
    private String QText;
    private String correctAnswer;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;

    public Questions() {
    }

    public Questions(String courseId, int QId, String QText, String correctAnswer, String choice1, String choice2, String choice3, String choice4) {
        this.courseId = courseId;
        this.QId = QId;
        this.QText = QText;
        this.correctAnswer = correctAnswer;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setQId(int QId) {
        this.QId = QId;
    }

    public void setQText(String QText) {
        this.QText = QText;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    public void setChoice4(String choice4) {
        this.choice4 = choice4;
    }

    public String getCourseId() {
        return courseId;
    }

    public int getQId() {
        return QId;
    }

    public String getQText() {
        return QText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getChoice1() {
        return choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public String getChoice4() {
        return choice4;
    }
    
    
    
}
