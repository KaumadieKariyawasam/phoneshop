/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.view;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class PasswordChange extends javax.swing.JInternalFrame {

    private static JPanel internalFrame;

    /**
     * Creates new form PasswordChange
     */
    public PasswordChange(JPanel frame) {
        initComponents();
        internalFrame = frame;
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
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();

        jXPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jXLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/ChangePassword2.png"))); // NOI18N
        jXLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel1MouseClicked(evt);
            }
        });
        jXPanel2.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, 400));

        jXLabel4.setText("Change");
        jXLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jXPanel2.add(jXLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 180, 70));

        jXLabel5.setText("Prefference Name");
        jXLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jXPanel2.add(jXLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 290, 50));

        jXLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jXLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/PrefferenceName.jpg"))); // NOI18N
        jXLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel3MouseClicked(evt);
            }
        });
        jXPanel2.add(jXLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 380, 400));

        jXLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jXLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jXLabel2.setOpaque(true);
        jXPanel2.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 920, 500));

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void jXLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel1MouseClicked
        PasswordReset pr = new PasswordReset(internalFrame);
        internalFrame.removeAll();
        internalFrame.add(pr);
        pr.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jXLabel1MouseClicked

    private void jXLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel3MouseClicked
        ResetPrefferedName pr = new ResetPrefferedName(internalFrame);
        internalFrame.removeAll();
        internalFrame.add(pr);
        pr.setVisible(true);     }//GEN-LAST:event_jXLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    // End of variables declaration//GEN-END:variables
}
