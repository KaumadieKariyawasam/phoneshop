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
import javax.swing.JPanel;
import lk.ijse.phoneshop.common.IdGenerator;
import lk.ijse.phoneshop.controller.BatchController;
import lk.ijse.phoneshop.controller.ManageItemController;
import lk.ijse.phoneshop.core.dto.BatchDTO;
import lk.ijse.phoneshop.core.dto.ItemDTO;
import lk.ijse.phoneshop.core.dto.ItemFormDTO;
import lk.ijse.phoneshop.core.dto.ManageItemDTO;

/**
 *
 * @author HP
 */
public class ManageItem extends javax.swing.JInternalFrame {

    private static JPanel jPanel;

    /**
     * Creates new form ManageItem
     */
    public ManageItem(JPanel jPanel1) {
        initComponents();
        jPanel = jPanel1;
        batchLoad();
    }

    ManageItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        txtItCode = new org.jdesktop.swingx.JXTextField();
        jButton1 = new javax.swing.JButton();
        txtQty = new org.jdesktop.swingx.JXTextField();
        txtItName = new org.jdesktop.swingx.JXTextField();
        btnView = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        txtBatch = new org.jdesktop.swingx.JXTextField();
        btnRemove = new javax.swing.JButton();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();

        jXPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel1.setText("Manage Item");
        jXLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jXPanel1.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 330, 60));

        jXLabel2.setText("Qty. On Hand");
        jXLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 130, 30));

        jXLabel4.setText("Item Name");
        jXLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 120, 30));

        jXLabel7.setText("Batch ID");
        jXLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 130, 30));

        txtItCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItCodeActionPerformed(evt);
            }
        });
        jXPanel1.add(txtItCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 150, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Clr.png"))); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jXPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 160, 40));

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        jXPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 80, 30));

        txtItName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItNameActionPerformed(evt);
            }
        });
        jXPanel1.add(txtItName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 310, 30));

        btnView.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/View Reports.png"))); // NOI18N
        btnView.setText("View");
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewMouseClicked(evt);
            }
        });
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jXPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 160, 40));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Search1.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jXPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, 40));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/AddItem.png"))); // NOI18N
        btnAdd.setText("Make New");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jXPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 180, 40));

        btnChange.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Change1.png"))); // NOI18N
        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        jXPanel1.add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 160, 40));

        txtBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchActionPerformed(evt);
            }
        });
        jXPanel1.add(txtBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 80, 30));

        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Remove.png"))); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jXPanel1.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 160, 40));

        jXLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        jXPanel1.add(jXLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 870, 360));

        jXLabel9.setText("Item Code");
        jXLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtItCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItCodeActionPerformed
        txtItName.requestFocus();
    }//GEN-LAST:event_txtItCodeActionPerformed

    private void txtItNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItNameActionPerformed
        txtQty.requestFocus();
    }//GEN-LAST:event_txtItNameActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            String itemCode = txtItCode.getText();
            ItemDTO itemDTO = new ItemDTO(itemCode);

            ItemDTO getItem = ManageItemController.searchItem(itemCode);
            System.out.println("AAAA" + getItem.getItemCode());
            System.out.println("AAAA" + getItem.getItemName());
            System.out.println("AAAA" + getItem.getQtyOnHand());

            if (getItem != null) {

                String itemName = getItem.getItemName();
                int itemQty = getItem.getQtyOnHand();
                txtItName.setText(itemName);
                txtQty.setText("" + itemQty);
            } else {
                JOptionPane.showMessageDialog(this, "No such Item");
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            String batch = txtBatch.getText();
            int confirm = JOptionPane.showConfirmDialog(this, "Are You Add?");
            ItemDTO itemDTO = new ItemDTO(txtItCode.getText(), txtItName.getText(), Integer.parseInt(txtQty.getText()));
            int qty = 0;
            double buyingPrice = 0;
            double sellingPrice = 0;
            String date = null;
            String supOrderId = null;
            BatchDTO batchDTO = new BatchDTO();
            batchDTO.setSoId(supOrderId);
            batchDTO.setBid(batch);
            batchDTO.setItemCode(txtItCode.getText());
            batchDTO.setBuyingPrice(buyingPrice);
            batchDTO.setSellingPrice(sellingPrice);
            batchDTO.setQty(qty);

            boolean isAdded = ManageItemController.addItem(itemDTO, batchDTO);
            if (isAdded) {

                JOptionPane.showMessageDialog(this, "Added Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Added Failled");
            }
            /* boolean result=ManageItemController.addItem(itemDTO);
            if(result){
                JOptionPane.showMessageDialog(this,"Added Successfully");
            }else{
                JOptionPane.showMessageDialog(this,"Added Failled");
            }*/
        } catch (SQLException ex) {
            //Logger.getLogger(ManageItem.class.getName()).log(Level.SEVERE, null, ex);
            if (ex.getErrorCode() == 1062) {
                try {
                    int qty = 0;
                    double buyingPrice = 0;
                    double sellingPrice = 0;
                    String supOrderId = null;
                    BatchDTO batchDTO = new BatchDTO();
                    batchDTO.setSoId(supOrderId);
                    batchDTO.setBid(txtBatch.getText());
                    batchDTO.setItemCode(txtItCode.getText());
                    batchDTO.setBuyingPrice(buyingPrice);
                    batchDTO.setSellingPrice(sellingPrice);
                    batchDTO.setQty(qty);
                    BatchController.addBatch(batchDTO);
                } catch (Exception ex1) {
                    Logger.getLogger(ManageItem.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageItem.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Are You sure Delete?");
        if (confirm == 0) {
            try {
                ItemDTO itemDTO = new ItemDTO(txtItCode.getText());
                boolean isAdded = ManageItemController.deleteItem(itemDTO);
                if (isAdded) {
                    JOptionPane.showMessageDialog(this, "Deleted...");
                } else {
                    JOptionPane.showMessageDialog(this, "Delete Failled");
                }
            } catch (Exception ex) {
                Logger.getLogger(ManageItem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed

        int comfirm = JOptionPane.showConfirmDialog(this, "Are You Sure Update?");
        if (comfirm == 0) {

            try {
                ItemDTO itemDTO = new ItemDTO(txtItCode.getText(), txtItName.getText(), Integer.parseInt(txtQty.getText()));
                boolean isAdded = ManageItemController.updateItem(itemDTO);
                if (isAdded) {
                    JOptionPane.showMessageDialog(this, "Update Successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Update Failled..");
                }
            } catch (Exception ex) {
                Logger.getLogger(ManageItem.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseClicked
        ViewItem v1 = new ViewItem();
        v1.setVisible(true);
    }//GEN-LAST:event_btnViewMouseClicked

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtItCode.setText("");
        txtItName.setText("");
        txtQty.setText("");
        txtBatch.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXTextField txtBatch;
    private org.jdesktop.swingx.JXTextField txtItCode;
    private org.jdesktop.swingx.JXTextField txtItName;
    private org.jdesktop.swingx.JXTextField txtQty;
    // End of variables declaration//GEN-END:variables

    private void batchLoad() {
        try {
            String batch = IdGenerator.getNewID("batch", "bId", "B");
            txtBatch.setText(batch);
        } catch (SQLException ex) {
            Logger.getLogger(ManageItem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
