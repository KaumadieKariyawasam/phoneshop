/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.view;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lk.ijse.phoneshop.controller.ManageUserController;
import lk.ijse.phoneshop.core.dto.UserDTO;

/**
 *
 * @author HP
 */
public class PasswordReset extends javax.swing.JInternalFrame {

    private static JPanel jp;

    /**
     * Creates new form PasswordReset
     */
    public PasswordReset(JPanel jPanel) {
        initComponents();
        jp = jPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXPanel3 = new org.jdesktop.swingx.JXPanel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        txtReEnter = new javax.swing.JPasswordField();
        txtNew = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        txtCurrentPass = new javax.swing.JPasswordField();
        txtPrefferName = new org.jdesktop.swingx.JXTextField();

        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jXLabel1.setText("Reset Password");
        jXLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N

        javax.swing.GroupLayout jXPanel2Layout = new javax.swing.GroupLayout(jXPanel2);
        jXPanel2.setLayout(jXPanel2Layout);
        jXPanel2Layout.setHorizontalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(512, Short.MAX_VALUE))
        );
        jXPanel2Layout.setVerticalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jXPanel1.add(jXPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 120));

        jXPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jXLabel3.setText("Current Password");
        jXLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jXLabel2.setText("New Password");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jXLabel4.setText("Re-Enter Password");
        jXLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("RESET");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jXLabel5.setText("Prefferd Name");
        jXLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtCurrentPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXPanel3Layout = new javax.swing.GroupLayout(jXPanel3);
        jXPanel3.setLayout(jXPanel3Layout);
        jXPanel3Layout.setHorizontalGroup(
            jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel3Layout.createSequentialGroup()
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel3Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNew, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txtReEnter, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txtCurrentPass, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txtPrefferName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jXPanel3Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(467, Short.MAX_VALUE))
        );
        jXPanel3Layout.setVerticalGroup(
            jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jXPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtPrefferName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurrentPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jXLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNew, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jXPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jXPanel3Layout.createSequentialGroup()
                        .addComponent(jXLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtReEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jXPanel1.add(jXPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 990, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewActionPerformed

    private void txtCurrentPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentPassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ArrayList<UserDTO> getAll = ManageUserController.getUser();
            String text = txtPrefferName.getText();

            int count = 0;
            for (UserDTO userDTO : getAll) {
                if (text == userDTO.getPreffer()) {
                    count++;

                }
            }
            if (count > 0) {
                JOptionPane.showMessageDialog(this, "Wrong Preffered Name");
            } else {

                String current = String.valueOf(txtCurrentPass.getPassword());
                String reEnterPass = String.valueOf(txtReEnter.getPassword());
                String newPass = String.valueOf(txtNew.getPassword());
                String currentPass = ManageUserController.getCurrenrPass(text);

                if (currentPass.equals(current)) {
                    if (newPass.equals(reEnterPass)) {
                        boolean result = ManageUserController.changePassword(newPass, text);
                        if (result) {
                            JOptionPane.showMessageDialog(this, "Changed Successfully");
                        } else {
                            JOptionPane.showMessageDialog(this, "Change Failled");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Can,t Changed.. \n New Password and Re-Enter Password is not a same");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Current Password is Wrong");
                }

            }
        } catch (Exception ex) {
            Logger.getLogger(PasswordReset.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private org.jdesktop.swingx.JXPanel jXPanel3;
    private javax.swing.JPasswordField txtCurrentPass;
    private javax.swing.JPasswordField txtNew;
    private org.jdesktop.swingx.JXTextField txtPrefferName;
    private javax.swing.JPasswordField txtReEnter;
    // End of variables declaration//GEN-END:variables
}
