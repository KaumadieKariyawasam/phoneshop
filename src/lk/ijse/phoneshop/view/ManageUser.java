/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.phoneshop.common.IdGenerator;
import lk.ijse.phoneshop.controller.ManageUserController;
import lk.ijse.phoneshop.core.dto.UserDTO;
import lk.ijse.phoneshop.validation.Validation;

/**
 *
 * @author HP
 */
public class ManageUser extends javax.swing.JInternalFrame {

    Validation validation = new Validation();

    /**
     * Creates new form ManageUser
     */
    public ManageUser() {
        initComponents();
        loadUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        txtUserId = new org.jdesktop.swingx.JXTextField();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        txtEmail = new org.jdesktop.swingx.JXTextField();
        txtMobile = new org.jdesktop.swingx.JXTextField();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        txtUserName = new org.jdesktop.swingx.JXTextField();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        txtNic = new org.jdesktop.swingx.JXTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new org.jdesktop.swingx.JXTextArea();
        btnSearch = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnSearch1 = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel2.setText("Manage User");
        jXLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jPanel1.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 290, 70));

        jXLabel3.setText("User NIC");
        jXLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jXLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 110, 30));

        jXLabel4.setText("User e-mail");
        jXLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jXLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 110, 30));

        jXLabel6.setText("User Name ");
        jXLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jXLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 110, 30));

        jXLabel5.setText("User ID");
        jXLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jXLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 110, 30));

        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 160, 30));

        jXLabel8.setText("Mobile No.");
        jXLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jXLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 110, 30));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 370, 30));

        txtMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobileActionPerformed(evt);
            }
        });
        jPanel1.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 160, 30));

        jXLabel7.setText("Address");
        jXLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jXLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 110, 30));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 330, 30));

        jXLabel9.setText("(xxx-xxxxxxx)");
        jXLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jXLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 150, 30));

        txtNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicActionPerformed(evt);
            }
        });
        jPanel1.add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 160, 30));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtAddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 370, 70));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Search1.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 140, 40));

        btnView.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/View Reports.png"))); // NOI18N
        btnView.setText("Show All");
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewMouseClicked(evt);
            }
        });
        jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 170, 40));

        btnSearch1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Clr.png"))); // NOI18N
        btnSearch1.setText("Refresh");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, 40));

        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Remove.png"))); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 170, 40));

        btnChange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Change.png"))); // NOI18N
        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        jPanel1.add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 170, 40));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Change1.png"))); // NOI18N
        btnAdd.setText("Create New");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 133, 170, 40));

        jXLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        jPanel1.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 830, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseClicked
        ViewUser u1 = new ViewUser();
        u1.setVisible(true);

    }//GEN-LAST:event_btnViewMouseClicked

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        txtUserName.requestFocus();
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

//        try {
//            UserDTO userDTO = new UserDTO(txtUserId.getText());
//            UserDTO result = ManageUserController.searchUser(userDTO);
//            if (result != null) {
//                txtUserName.setText(result.getUserName());
//                txtNic.setText(result.getUserNic());
//                txtMobile.setText(result.getMobile());
//                txtAddress.setText(result.getUserAddress());
//                txtEmail.setText(result.getEmail());
//            } else {
//                JOptionPane.showMessageDialog(this, "Invalid User Id");
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
//        boolean isValidation = validation.nicValidation(txtNic);
//        if (isValidation) {
//            isValidation = validation.telephoneValidation(txtMobile);
//            if (isValidation) {
//                isValidation = validation.emailValidation(txtEmail);
//                if (isValidation) {
//
//                    int confirm = JOptionPane.showConfirmDialog(this, "Are You sure add this User?");
//                    if (confirm == 0) {
//                        try {
//                            UserDTO userDTO = new UserDTO(txtUserId.getText(), txtNic.getText(), txtUserName.getText(), txtAddress.getText(), txtMobile.getText(), txtEmail.getText());
//                            boolean result = ManageUserController.addUser(userDTO);
//                            if (result) {
//                                JOptionPane.showMessageDialog(this, "Added Successfully");
//                            } else {
//                                JOptionPane.showMessageDialog(this, "Added Failled");
//                            }
//                        } catch (Exception ex) {
//                            Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(this, "Error: Insert into Correct Email Address");
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "Insert Telephone Number to Correct Format");
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "Insert Correct Nic");
//        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
//        boolean isValidation = validation.nicValidation(txtNic);
//        if (isValidation) {
//            isValidation = validation.telephoneValidation(txtMobile);
//            if (isValidation) {
//                isValidation = validation.emailValidation(txtEmail);
//                if (isValidation) {
//
//                    int confirm = JOptionPane.showConfirmDialog(this, "Are You sure want to User Update?");
//                    if (confirm == 0) {
//                        try {
//                            UserDTO userDTO = new UserDTO(txtUserId.getText(), txtNic.getText(), txtUserName.getText(), txtAddress.getText(), txtMobile.getText(), txtEmail.getText());
//                            boolean result = ManageUserController.updateUser(userDTO);
//                            if (result) {
//                                JOptionPane.showMessageDialog(this, "Update Successfully");
//
//                            } else {
//                                JOptionPane.showMessageDialog(this, "Update Failled. Try Again!");
//                            }
//                        } catch (Exception ex) {
//                            Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(this, "Error: Insert into Correct Email Address");
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "Insert e-mail Address to Correct Format");
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "Insert Correct Nic");
//        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

//        int confirm = JOptionPane.showConfirmDialog(this, "Are You Sure Want to Delete this User?");
//        if (confirm == 0) {
//            try {
//                UserDTO userDTO = new UserDTO(txtUserId.getText());
//                boolean result = ManageUserController.deleteUser(userDTO);
//                if (result) {
//                    JOptionPane.showMessageDialog(this, "Deleted...");
//                    txtUserId.setText("");
//                    txtNic.setText("");
//                    txtUserName.setText("");
//                    txtMobile.setText("");
//                    txtAddress.setText("");
//                    txtEmail.setText("");
//                } else {
//                    JOptionPane.showMessageDialog(this, "Delete Failled");
//                }
//            } catch (Exception ex) {
//                Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        txtUserId.setText("");
        txtNic.setText("");
        txtUserName.setText("");
        txtAddress.setText("");
        txtMobile.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        txtNic.requestFocus();
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicActionPerformed
        txtMobile.requestFocus();
    }//GEN-LAST:event_txtNicActionPerformed

    private void txtMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobileActionPerformed
        txtAddress.requestFocus();
    }//GEN-LAST:event_txtMobileActionPerformed

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        
    }//GEN-LAST:event_txtAddressKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private org.jdesktop.swingx.JXTextArea txtAddress;
    private org.jdesktop.swingx.JXTextField txtEmail;
    private org.jdesktop.swingx.JXTextField txtMobile;
    private org.jdesktop.swingx.JXTextField txtNic;
    private org.jdesktop.swingx.JXTextField txtUserId;
    private org.jdesktop.swingx.JXTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void loadUser() {
        try {
            String text = IdGenerator.getNewID("User", "uId", "U");
            txtUserId.setText(text);
        } catch (SQLException ex) {
            Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}