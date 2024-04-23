/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quizquest.view;

import com.quizquest.model.UserIdentity;
import com.quizquest.Dao.UserIdentityDao;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
public class UserCrudOp extends javax.swing.JFrame {

    String fname,email;
    public UserCrudOp(String name,String email) {
        initComponents();
        this.fname = name;
        this.email = email;
        
        addColumnHeaderName();
        addRowDataToTable();
        
        idTxt.setEditable(false); 
        
        courseRecordTable.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        courseRecordTable.getTableHeader().setOpaque(false);
        courseRecordTable.getTableHeader().setBackground(new Color(51,0,204));;
        courseRecordTable.getTableHeader().setForeground(new Color(255,255,255));
        courseRecordTable.setRowHeight(25); 
    }

    DefaultTableModel tableModel = new DefaultTableModel();
    
    public void addColumnHeaderName(){
        
        tableModel.addColumn("User ID");
        tableModel.addColumn("Full Names");
        tableModel.addColumn("Email");
        tableModel.addColumn("User Type");
        tableModel.addColumn("Status");
        courseRecordTable.setModel(tableModel);
    }
    
    public void addRowDataToTable(){
        
        tableModel.setRowCount(0);
        
        UserIdentityDao dao = new UserIdentityDao();
        
        List<UserIdentity> userList = dao.adminRetrieveUser();
        
        for(UserIdentity theUser : userList){
            tableModel.addRow(new Object[]{
            
                theUser.getId(),
                theUser.getFullName(),
                theUser.getEmail(),
                theUser.getUserType(),
                theUser.getStatus()
            });
        }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseRecordTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pswdTxt = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fNameTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        userTypeCB = new javax.swing.JComboBox<>();
        statusCB = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USERMANAGEMENT");
        setExtendedState(MAXIMIZED_BOTH);
        setPreferredSize(new java.awt.Dimension(1370, 725));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        courseRecordTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        courseRecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        courseRecordTable.setFocusable(false);
        courseRecordTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        courseRecordTable.setRowHeight(25);
        courseRecordTable.setSelectionBackground(new java.awt.Color(102, 102, 255));
        courseRecordTable.setShowVerticalLines(false);
        courseRecordTable.getTableHeader().setReorderingAllowed(false);
        courseRecordTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseRecordTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(courseRecordTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("User ID");

        idTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Email");

        emailTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        pswdTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pswdTxt.setPreferredSize(new java.awt.Dimension(6, 28));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("UserType");

        deleteBtn.setBackground(new java.awt.Color(51, 0, 204));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Full Names");

        fNameTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Status");

        updateBtn.setBackground(new java.awt.Color(51, 0, 204));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        createBtn.setBackground(new java.awt.Color(51, 0, 204));
        createBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        createBtn.setForeground(new java.awt.Color(255, 255, 255));
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        userTypeCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Type", "Admin", "User" }));

        statusCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        statusCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Status", "Active", "Inactive" }));

        backBtn.setBackground(new java.awt.Color(51, 0, 204));
        backBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(51, 0, 204));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        refreshBtn.setBackground(new java.awt.Color(51, 0, 204));
        refreshBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(refreshBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(statusCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(userTypeCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(pswdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(pswdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusCB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static boolean isInvalidEmail(String email){
    
        return !email.contains("@") && !email.contains(".");
    }
    
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        String userEmail = emailTxt.getText();

        if(idTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "The ID is required");
        }else if(fNameTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "The Names are required");
        }else if(emailTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Email is required");
        }else if(isInvalidEmail(userEmail)){
            JOptionPane.showMessageDialog(this, "Email is Invalid"); //second Validation
        }else if(userTypeCB.getSelectedItem().equals("Select User Type")){
            JOptionPane.showMessageDialog(this, "Please Select user Type");
        }else if(statusCB.getSelectedItem().equals("Select User Status")){
            JOptionPane.showMessageDialog(this, "Please Select user Status");
        }else{

                //creating Object of the model class
                UserIdentity theUser = new UserIdentity();
                int id = Integer.parseInt(idTxt.getText());
                theUser.setId(id);
                theUser.setStatus(statusCB.getSelectedItem().toString());                

                //creating an object of dao class
                UserIdentityDao dao = new UserIdentityDao();
                Integer rowsAffected = dao.adminInactiveUser(theUser);

                if(rowsAffected != null){
                    JOptionPane.showMessageDialog(this, "User Status set to Inactive");
                    addRowDataToTable();
                    idTxt.setText("");
                    fNameTxt.setText("");
                    emailTxt.setText("");                    
                    userTypeCB.setSelectedItem("Select User Type");
                    pswdTxt.setText("");
                    statusCB.setSelectedItem("Select User Status");
                }else{
                    JOptionPane.showMessageDialog(this, "User Status update failed");
                }

        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String userEmail = emailTxt.getText();

        if(idTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "The ID is required");
        }else if(fNameTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "The Names are required");
        }else if(emailTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Email is required");
        }else if(isInvalidEmail(userEmail)){
            JOptionPane.showMessageDialog(this, "Email is Invalid"); //second Validation
        }else if(userTypeCB.getSelectedItem().equals("Select User Type")){
            JOptionPane.showMessageDialog(this, "Please Select user Type");
        }else if(pswdTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Password is required");
        }else if(statusCB.getSelectedItem().equals("Select User Status")){
            JOptionPane.showMessageDialog(this, "Please Select user Status");
        }else{

                //creating Object of the model class
                UserIdentity theUser = new UserIdentity();
                int id = Integer.parseInt(idTxt.getText());
                theUser.setId(id);
                theUser.setFullName(fNameTxt.getText());
                theUser.setEmail(emailTxt.getText());
                theUser.setUserType(userTypeCB.getSelectedItem().toString());                
                theUser.setPassword(pswdTxt.getText());
                theUser.setStatus(statusCB.getSelectedItem().toString());                

                //creating an object of dao class
                UserIdentityDao dao = new UserIdentityDao();
                Integer rowsAffected = dao.adminUpdateUser(theUser);

                if(rowsAffected != null){
                    JOptionPane.showMessageDialog(this, "Data Updated");
                    addRowDataToTable();
                    idTxt.setText("");
                    fNameTxt.setText("");
                    emailTxt.setText("");                    
                    userTypeCB.setSelectedItem("Select User Type");
                    pswdTxt.setText("");
                    statusCB.setSelectedItem("Select User Status");
                }else{
                    JOptionPane.showMessageDialog(this, "Data not Updated");
                }

        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        
        String userEmail = emailTxt.getText();

        if(fNameTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "The Names are required");
        }else if(emailTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Email is required");
        }else if(isInvalidEmail(userEmail)){
            JOptionPane.showMessageDialog(this, "Email is Invalid"); //second Validation
        }else if(userTypeCB.getSelectedItem().equals("Select User Type")){
            JOptionPane.showMessageDialog(this, "Please Select user Type");
        }else if(pswdTxt.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Password is required");
        }else if(statusCB.getSelectedItem().equals("Select User Status")){
            JOptionPane.showMessageDialog(this, "Please Select user Status");
        }else{

                //creating Object of the model class
                UserIdentity theUser = new UserIdentity();
                theUser.setFullName(fNameTxt.getText());
                theUser.setEmail(emailTxt.getText());
                theUser.setUserType(userTypeCB.getSelectedItem().toString());                
                theUser.setPassword(pswdTxt.getText());
                theUser.setStatus(statusCB.getSelectedItem().toString());                

                //creating an object of dao class
                UserIdentityDao dao = new UserIdentityDao();
                Integer rowsAffected = dao.adminCreateUser(theUser);

                if(rowsAffected != null){
                    JOptionPane.showMessageDialog(this, "Data Saved");
                    addRowDataToTable();
                    idTxt.setText("");
                    fNameTxt.setText("");
                    emailTxt.setText("");                    
                    userTypeCB.setSelectedItem("Select User Type");
                    pswdTxt.setText("");
                    statusCB.setSelectedItem("Select User Status");
                }else{
                    JOptionPane.showMessageDialog(this, "Data not Saved");
                }

        }
    }//GEN-LAST:event_createBtnActionPerformed

    private void courseRecordTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseRecordTableMouseClicked
        // TODO add your handling code here:
        String tblID = tableModel.getValueAt(courseRecordTable.getSelectedRow(), 0).toString();
        String tblName = tableModel.getValueAt(courseRecordTable.getSelectedRow(), 1).toString();
        String tblEmail = tableModel.getValueAt(courseRecordTable.getSelectedRow(), 2).toString();
        String tblUserType = tableModel.getValueAt(courseRecordTable.getSelectedRow(), 3).toString();
        String tblStatus = tableModel.getValueAt(courseRecordTable.getSelectedRow(), 4).toString();
        
        idTxt.setText(tblID);
        idTxt.setEditable(false);
        fNameTxt.setText(tblName);
        emailTxt.setText(tblEmail);
        emailTxt.setEditable(false);
        userTypeCB.setSelectedItem(tblUserType);
        pswdTxt.setEditable(false);
        statusCB.setSelectedItem(tblStatus);
    }//GEN-LAST:event_courseRecordTableMouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false); 
        new ManageUserDashboard(fname, email).setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
                    idTxt.setText("");
                    fNameTxt.setText("");
                    emailTxt.setText("");                    
                    userTypeCB.setSelectedItem("Select User Type");
                    pswdTxt.setText("");
                    statusCB.setSelectedItem("Select User Status");        
    }//GEN-LAST:event_clearBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
                    idTxt.setText("");
                    fNameTxt.setText("");
                    emailTxt.setText(""); 
                    emailTxt.setEditable(true); 
                    userTypeCB.setSelectedItem("Select User Type");
                    pswdTxt.setText("");
                    pswdTxt.setEditable(true);
                    statusCB.setSelectedItem("Select User Status");   
    }//GEN-LAST:event_refreshBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserCrudOp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserCrudOp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserCrudOp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserCrudOp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserCrudOp("","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTable courseRecordTable;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pswdTxt;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JComboBox<String> statusCB;
    private javax.swing.JButton updateBtn;
    private javax.swing.JComboBox<String> userTypeCB;
    // End of variables declaration//GEN-END:variables
}
