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
public class Message {
    
    private int messageId;
    private String senderName;
    private String feedback;

    public Message() {
    }

    public Message(int messageId, String senderName, String feedback) {
        this.messageId = messageId;
        this.senderName = senderName;
        this.feedback = feedback;
    }
     

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getMessageId() {
        return messageId;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getFeedback() {
        return feedback;
    }
    
    
    
}
