/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.view;

import java.awt.Color;

/**
 *
 * @author HP
 */
public class PnlView extends javax.swing.JInternalFrame {

    /**
     * Creates new form PnlView
     */
    public PnlView() {
        initComponents();
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
        lblCusOrder = new javax.swing.JLabel();
        lblItemDetail = new javax.swing.JLabel();
        lblCusDetail = new javax.swing.JLabel();
        lblSupDetail = new javax.swing.JLabel();
        lblBatchDetail = new javax.swing.JLabel();
        lblCusPayment = new javax.swing.JLabel();
        lblEmpDetail = new javax.swing.JLabel();
        lblSupOrder = new javax.swing.JLabel();
        lblCusReturn = new javax.swing.JLabel();
        lblUserDetail = new javax.swing.JLabel();
        lblSupPayment = new javax.swing.JLabel();
        lblSupReturn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCusOrder.setBackground(new java.awt.Color(255, 255, 255));
        lblCusOrder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCusOrder.setForeground(new java.awt.Color(102, 102, 102));
        lblCusOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/CustomerOrder.png"))); // NOI18N
        lblCusOrder.setText("Customer Order");
        lblCusOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblCusOrder.setOpaque(true);
        lblCusOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCusOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCusOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCusOrderMouseExited(evt);
            }
        });
        jPanel1.add(lblCusOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 290, 50));

        lblItemDetail.setBackground(new java.awt.Color(255, 255, 255));
        lblItemDetail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblItemDetail.setForeground(new java.awt.Color(102, 102, 102));
        lblItemDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Item.png"))); // NOI18N
        lblItemDetail.setText("    Item Details");
        lblItemDetail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblItemDetail.setOpaque(true);
        lblItemDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblItemDetailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblItemDetailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblItemDetailMouseExited(evt);
            }
        });
        jPanel1.add(lblItemDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 270, 50));

        lblCusDetail.setBackground(new java.awt.Color(255, 255, 255));
        lblCusDetail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCusDetail.setForeground(new java.awt.Color(102, 102, 102));
        lblCusDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/ManageCus.png"))); // NOI18N
        lblCusDetail.setText("Customer Details");
        lblCusDetail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblCusDetail.setOpaque(true);
        lblCusDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCusDetailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCusDetailMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCusDetailMousePressed(evt);
            }
        });
        jPanel1.add(lblCusDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 270, 50));

        lblSupDetail.setBackground(new java.awt.Color(255, 255, 255));
        lblSupDetail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSupDetail.setForeground(new java.awt.Color(102, 102, 102));
        lblSupDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/ManageSup.png"))); // NOI18N
        lblSupDetail.setText("  Supplier Details");
        lblSupDetail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblSupDetail.setOpaque(true);
        lblSupDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSupDetailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSupDetailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSupDetailMouseExited(evt);
            }
        });
        jPanel1.add(lblSupDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 270, 50));

        lblBatchDetail.setBackground(new java.awt.Color(255, 255, 255));
        lblBatchDetail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBatchDetail.setForeground(new java.awt.Color(102, 102, 102));
        lblBatchDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/ManageBat.png"))); // NOI18N
        lblBatchDetail.setText("     Batch Details");
        lblBatchDetail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblBatchDetail.setOpaque(true);
        lblBatchDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBatchDetailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBatchDetailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBatchDetailMouseExited(evt);
            }
        });
        jPanel1.add(lblBatchDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 270, 50));

        lblCusPayment.setBackground(new java.awt.Color(255, 255, 255));
        lblCusPayment.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCusPayment.setForeground(new java.awt.Color(102, 102, 102));
        lblCusPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Payments.png"))); // NOI18N
        lblCusPayment.setText("Customer Payment");
        lblCusPayment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblCusPayment.setOpaque(true);
        lblCusPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCusPaymentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCusPaymentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCusPaymentMouseExited(evt);
            }
        });
        jPanel1.add(lblCusPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 290, 50));

        lblEmpDetail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmpDetail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEmpDetail.setForeground(new java.awt.Color(102, 102, 102));
        lblEmpDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/ManageSup.png"))); // NOI18N
        lblEmpDetail.setText("Employee Details");
        lblEmpDetail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblEmpDetail.setOpaque(true);
        lblEmpDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEmpDetailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEmpDetailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEmpDetailMouseExited(evt);
            }
        });
        jPanel1.add(lblEmpDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 270, 50));

        lblSupOrder.setBackground(new java.awt.Color(255, 255, 255));
        lblSupOrder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSupOrder.setForeground(new java.awt.Color(102, 102, 102));
        lblSupOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Supplier Order.png"))); // NOI18N
        lblSupOrder.setText("Supplier Order");
        lblSupOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblSupOrder.setOpaque(true);
        lblSupOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSupOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSupOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSupOrderMouseExited(evt);
            }
        });
        jPanel1.add(lblSupOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 290, 50));

        lblCusReturn.setBackground(new java.awt.Color(255, 255, 255));
        lblCusReturn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCusReturn.setForeground(new java.awt.Color(102, 102, 102));
        lblCusReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/CustomerReturn.png"))); // NOI18N
        lblCusReturn.setText("Customer Return");
        lblCusReturn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblCusReturn.setOpaque(true);
        lblCusReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCusReturnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCusReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCusReturnMouseExited(evt);
            }
        });
        jPanel1.add(lblCusReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 290, 50));

        lblUserDetail.setBackground(new java.awt.Color(255, 255, 255));
        lblUserDetail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUserDetail.setForeground(new java.awt.Color(102, 102, 102));
        lblUserDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/ManageCus.png"))); // NOI18N
        lblUserDetail.setText("   User Details");
        lblUserDetail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblUserDetail.setOpaque(true);
        lblUserDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserDetailMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUserDetailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUserDetailMouseExited(evt);
            }
        });
        jPanel1.add(lblUserDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 270, 50));

        lblSupPayment.setBackground(new java.awt.Color(255, 255, 255));
        lblSupPayment.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSupPayment.setForeground(new java.awt.Color(102, 102, 102));
        lblSupPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Payments.png"))); // NOI18N
        lblSupPayment.setText("Supplier Payment");
        lblSupPayment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblSupPayment.setOpaque(true);
        lblSupPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSupPaymentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSupPaymentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSupPaymentMouseExited(evt);
            }
        });
        jPanel1.add(lblSupPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 290, 50));

        lblSupReturn.setBackground(new java.awt.Color(255, 255, 255));
        lblSupReturn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSupReturn.setForeground(new java.awt.Color(102, 102, 102));
        lblSupReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/SupplierReturn.png"))); // NOI18N
        lblSupReturn.setText("Supplier Return");
        lblSupReturn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lblSupReturn.setOpaque(true);
        lblSupReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSupReturnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSupReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSupReturnMouseExited(evt);
            }
        });
        jPanel1.add(lblSupReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 290, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 840, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCusDetailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCusDetailMousePressed
        ViewCustomer c1=new ViewCustomer();
        //this.dispose();
        c1.setVisible(true);
    }//GEN-LAST:event_lblCusDetailMousePressed

    private void lblSupDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupDetailMouseClicked
        ViewSupplier s1=new ViewSupplier();
        s1.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_lblSupDetailMouseClicked

    private void lblItemDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItemDetailMouseClicked
        ViewItem i1=new ViewItem();
        
        i1.setVisible(true);
    }//GEN-LAST:event_lblItemDetailMouseClicked

    private void lblBatchDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBatchDetailMouseClicked
        ViewBatch v1=new ViewBatch();
        //this.dispose();
        v1.setVisible(true);
    }//GEN-LAST:event_lblBatchDetailMouseClicked

    private void lblEmpDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpDetailMouseClicked
        ViewEmployee e1=new ViewEmployee();
        e1.setVisible(true);
        
    }//GEN-LAST:event_lblEmpDetailMouseClicked

    private void lblCusOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCusOrderMouseClicked
        ViewCusOrder o1=new ViewCusOrder();
        o1.setVisible(true);
        
    }//GEN-LAST:event_lblCusOrderMouseClicked

    private void lblSupOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupOrderMouseClicked
        
       
    }//GEN-LAST:event_lblSupOrderMouseClicked

    private void lblCusReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCusReturnMouseClicked
        ViewCustomerReturn c1=new ViewCustomerReturn();
        c1.setVisible(true);
        
    }//GEN-LAST:event_lblCusReturnMouseClicked

    private void lblCusPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCusPaymentMouseClicked
        ViewCustomerPayment1 c1=new ViewCustomerPayment1();
        c1.setVisible(true);
    }//GEN-LAST:event_lblCusPaymentMouseClicked

    private void lblUserDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserDetailMouseClicked
       ViewUser u1=new ViewUser();
       u1.setVisible(true);
       //this.dispose();
    }//GEN-LAST:event_lblUserDetailMouseClicked

    private void lblSupPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupPaymentMouseClicked
        ViewSupplierPayment sp=new ViewSupplierPayment();
        sp.setVisible(true);
    }//GEN-LAST:event_lblSupPaymentMouseClicked

    private void lblSupReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupReturnMouseClicked
        SupplierReturn s1=new SupplierReturn();
        s1.setVisible(true);
    }//GEN-LAST:event_lblSupReturnMouseClicked

    private void lblCusDetailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCusDetailMouseEntered
       lblCusDetail.setBackground(Color.YELLOW);
    }//GEN-LAST:event_lblCusDetailMouseEntered

    private void lblSupDetailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupDetailMouseEntered
       lblSupDetail.setBackground(Color.YELLOW);
    }//GEN-LAST:event_lblSupDetailMouseEntered

    private void lblItemDetailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItemDetailMouseEntered
       lblItemDetail.setBackground(Color.YELLOW);
    }//GEN-LAST:event_lblItemDetailMouseEntered

    private void lblBatchDetailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBatchDetailMouseEntered
        lblBatchDetail.setBackground(Color.YELLOW);
    }//GEN-LAST:event_lblBatchDetailMouseEntered

    private void lblEmpDetailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpDetailMouseEntered
       lblEmpDetail.setBackground(Color.YELLOW);
    }//GEN-LAST:event_lblEmpDetailMouseEntered

    private void lblUserDetailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserDetailMouseEntered
       lblUserDetail.setBackground(Color.YELLOW);
    }//GEN-LAST:event_lblUserDetailMouseEntered

    private void lblCusOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCusOrderMouseEntered
        lblCusOrder.setBackground(Color.YELLOW);
    }//GEN-LAST:event_lblCusOrderMouseEntered

    private void lblSupOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupOrderMouseEntered
        lblSupOrder.setBackground(Color.YELLOW);
    }//GEN-LAST:event_lblSupOrderMouseEntered

    private void lblCusReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCusReturnMouseEntered
        lblCusReturn.setBackground(Color.YELLOW);
    }//GEN-LAST:event_lblCusReturnMouseEntered

    private void lblSupReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupReturnMouseEntered
       lblSupReturn.setBackground(Color.YELLOW);
    }//GEN-LAST:event_lblSupReturnMouseEntered

    private void lblSupPaymentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupPaymentMouseEntered
        lblSupPayment.setBackground(Color.YELLOW);
    }//GEN-LAST:event_lblSupPaymentMouseEntered

    private void lblCusPaymentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCusPaymentMouseEntered
       lblCusPayment.setBackground(Color.YELLOW);
    }//GEN-LAST:event_lblCusPaymentMouseEntered

    private void lblCusDetailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCusDetailMouseExited
       lblCusDetail.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblCusDetailMouseExited

    private void lblSupDetailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupDetailMouseExited
        lblSupDetail.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblSupDetailMouseExited

    private void lblItemDetailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItemDetailMouseExited
        lblItemDetail.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblItemDetailMouseExited

    private void lblBatchDetailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBatchDetailMouseExited
       lblBatchDetail.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblBatchDetailMouseExited

    private void lblEmpDetailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpDetailMouseExited
        lblEmpDetail.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblEmpDetailMouseExited

    private void lblUserDetailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserDetailMouseExited
        lblUserDetail.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblUserDetailMouseExited

    private void lblCusOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCusOrderMouseExited
        lblCusOrder.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblCusOrderMouseExited

    private void lblSupOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupOrderMouseExited
        lblSupOrder.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblSupOrderMouseExited

    private void lblCusReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCusReturnMouseExited
        lblCusReturn.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblCusReturnMouseExited

    private void lblSupReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupReturnMouseExited
        lblSupReturn.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblSupReturnMouseExited

    private void lblSupPaymentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSupPaymentMouseExited
        lblSupPayment.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblSupPaymentMouseExited

    private void lblCusPaymentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCusPaymentMouseExited
        lblCusPayment.setBackground(Color.WHITE);
    }//GEN-LAST:event_lblCusPaymentMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBatchDetail;
    private javax.swing.JLabel lblCusDetail;
    private javax.swing.JLabel lblCusOrder;
    private javax.swing.JLabel lblCusPayment;
    private javax.swing.JLabel lblCusReturn;
    private javax.swing.JLabel lblEmpDetail;
    private javax.swing.JLabel lblItemDetail;
    private javax.swing.JLabel lblSupDetail;
    private javax.swing.JLabel lblSupOrder;
    private javax.swing.JLabel lblSupPayment;
    private javax.swing.JLabel lblSupReturn;
    private javax.swing.JLabel lblUserDetail;
    // End of variables declaration//GEN-END:variables
}