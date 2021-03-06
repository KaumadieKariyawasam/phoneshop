/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.view;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.phoneshop.common.IdGenerator;
import lk.ijse.phoneshop.controller.BatchController;
import lk.ijse.phoneshop.controller.CustomerOrderDetailController;
import lk.ijse.phoneshop.controller.ManageCustomerController;
import lk.ijse.phoneshop.controller.ManageItemController;
import lk.ijse.phoneshop.controller.ManageUserController;
import lk.ijse.phoneshop.core.dto.BatchDTO;
import lk.ijse.phoneshop.core.dto.CustomerDTO;
import lk.ijse.phoneshop.core.dto.CustomerOrderDTO;
import lk.ijse.phoneshop.core.dto.CustomerOrderDetailDTO;
import lk.ijse.phoneshop.core.dto.CustomerPaymentDTO;
import lk.ijse.phoneshop.core.dto.ItemDTO;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author HP
 */
public class CustomerOrders extends javax.swing.JFrame {

    private static String id;

    /**
     * Creates new form New
     */
    public CustomerOrders(String userID) {
        initComponents();
        loadCustomerNic();
        loadDate();
        loadCustOrderId();
        loadItemName();
        AutoCompleteDecorator.decorate(cmbNic);
        // AutoCompleteDecorator.decorate(cmbBatchId);
        
        loadBatchDetails();
        loadUsers();
        loadInvoice();
        id = userID;
        txtUserId.setText(id);

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
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        txtQtyOnHand = new javax.swing.JTextField();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        cmbNic = new javax.swing.JComboBox<>();
        txtDate = new javax.swing.JTextField();
        txtOrderId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jXLabel10 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        btnRemove = new javax.swing.JButton();
        txtDiscount = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        txtSellPrice = new org.jdesktop.swingx.JXTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jXLabel12 = new org.jdesktop.swingx.JXLabel();
        jLabel4 = new javax.swing.JLabel();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        txtLastPrice = new org.jdesktop.swingx.JXTextField();
        txtItemCode = new org.jdesktop.swingx.JXTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCusOrder = new org.jdesktop.swingx.JXTable();
        jXLabel11 = new org.jdesktop.swingx.JXLabel();
        txtCusName = new org.jdesktop.swingx.JXTextField();
        txtCash = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBuyPrice = new javax.swing.JTextField();
        txtPayment = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        txtItemName = new org.jdesktop.swingx.JXTextField();
        txtInvoice = new org.jdesktop.swingx.JXTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        txtUserId = new javax.swing.JTextField();
        cmbBatchId = new org.jdesktop.swingx.JXComboBox();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        jButton3 = new javax.swing.JButton();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jXPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXLabel4.setText("Batch ID");
        jXLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jXPanel1.add(jXLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 80, 30));

        jXLabel5.setText("Quantity On Hand");
        jXLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jXPanel1.add(jXLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 280, 140, 30));

        jXLabel6.setText("Customer Name");
        jXLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 150, 30));

        txtQtyOnHand.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQtyOnHand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyOnHandActionPerformed(evt);
            }
        });
        jXPanel1.add(txtQtyOnHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 280, 70, 30));

        jXLabel7.setText("Item Name");
        jXLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jXPanel1.add(jXLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 80, 30));

        jXLabel8.setText("User ID");
        jXLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 90, 30));

        cmbNic.setEditable(true);
        cmbNic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbNic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNic.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNicItemStateChanged(evt);
            }
        });
        cmbNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNicActionPerformed(evt);
            }
        });
        jXPanel1.add(cmbNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 150, 30));

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        jXPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 190, 160, 30));

        txtOrderId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(txtOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Total Amount");
        jXPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 500, 140, 30));

        jXLabel10.setText("Date");
        jXLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 60, 30));

        jXLabel3.setText("Customer NIC");
        jXLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 150, 30));

        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Remove.png"))); // NOI18N
        btnRemove.setText("Remove Row");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jXPanel1.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 210, 40));

        txtDiscount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscountActionPerformed(evt);
            }
        });
        jXPanel1.add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, 130, 30));
        jXPanel1.add(txtBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 580, 130, 30));

        txtSellPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSellPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSellPriceActionPerformed(evt);
            }
        });
        jXPanel1.add(txtSellPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Cash");
        jXPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 90, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Last Issue Price");
        jXPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 330, 150, 30));

        jXLabel12.setText("Order ID");
        jXLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 90, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Buying Price");
        jXPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 120, 30));

        jXLabel9.setText("Item Code");
        jXLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jXPanel1.add(jXLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 80, 30));

        txtLastPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLastPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastPriceActionPerformed(evt);
            }
        });
        jXPanel1.add(txtLastPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 330, 130, 30));

        txtItemCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemCodeActionPerformed(evt);
            }
        });
        jXPanel1.add(txtItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 110, 30));

        tblCusOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Batch ID", "Item Code", "Item Name", "Unit Price", "Quantity", "Amount"
            }
        ));
        jScrollPane2.setViewportView(tblCusOrder);

        jXPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 1220, 120));

        jXLabel11.setText("Quantity");
        jXLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jXPanel1.add(jXLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 70, 30));

        txtCusName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jXPanel1.add(txtCusName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 300, 30));

        txtCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashActionPerformed(evt);
            }
        });
        jXPanel1.add(txtCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, 130, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Invoice No.");
        jXPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 110, 30));
        jXPanel1.add(txtBuyPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 130, 30));
        jXPanel1.add(txtPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 130, 30));

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Cancel.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jXPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 630, 150, 40));
        jXPanel1.add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 280, 200, 30));
        jXPanel1.add(txtInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 130, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Selling Price");
        jXPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 130, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Payment");
        jXPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 90, 30));

        txtQty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });
        jXPanel1.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, 70, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Balance");
        jXPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, 90, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Discount");
        jXPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 100, 30));
        jXPanel1.add(txtTotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 500, 130, 30));

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Change1.png"))); // NOI18N
        btnCreate.setText("Save & Print");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jXPanel1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, 200, 40));
        jXPanel1.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 150, 30));

        cmbBatchId.setEditable(true);
        cmbBatchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBatchIdActionPerformed(evt);
            }
        });
        jXPanel1.add(cmbBatchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 130, 30));

        jXPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jXPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/phoneshop/image/Change.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jXPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 190, 70));

        jXLabel1.setText("Manage Customer Order");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jXPanel2.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 620, 90));

        jXPanel1.add(jXPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1300, 110));

        jXLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jXLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jXLabel2.setOpaque(true);
        jXPanel1.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 1320, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1451, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {
            String cusOrderId = txtOrderId.getText();
            String custId = (String) cmbNic.getSelectedItem();
            String userId = txtUserId.getText();
            String date = txtDate.getText();
            CustomerOrderDTO customerOrderDTO = new CustomerOrderDTO(cusOrderId, custId, userId, date);
            int qty = Integer.parseInt(txtQty.getText());

            String batchId = (String) cmbBatchId.getSelectedItem();
            BatchDTO batchDTO = new BatchDTO(qty, batchId);
            double amount = Double.parseDouble(txtPayment.getText());
            CustomerOrderDetailDTO customerOrderDetailDTO = new CustomerOrderDetailDTO(cusOrderId, batchId, qty, amount);
            String invoiceNo = txtInvoice.getText();
            CustomerPaymentDTO customerPaymentDTO = new CustomerPaymentDTO(invoiceNo, cusOrderId, amount);
            DefaultTableModel dtm = (DefaultTableModel) tblCusOrder.getModel();
            boolean isAdd = CustomerOrderDetailController.addCustOrder(customerOrderDTO, customerOrderDetailDTO, customerPaymentDTO);
            if (isAdd) {
                boolean isUpdate = BatchController.updateBatchQty(batchDTO);
                if (isUpdate) {
                    String code = null;
                    boolean itemUpdate = false;
                    for (int i = 0; i < dtm.getRowCount(); i++) {
                        code = (String) dtm.getValueAt(i, 1);
                        // ItemDTO itemDTO=new ItemDTO(code);
                        // int Qty =ManageItemController.searchQuamtity(code);
                        ArrayList<ItemDTO> itemList = ManageItemController.serchItemsQuantity(code);
                        int itemQuantity = 0;
                        for (ItemDTO itemDTO1 : itemList) {
                            itemQuantity = itemDTO1.getQtyOnHand();
                            System.out.println("QuantityOnHand" + itemQuantity);

                        }
                        itemQuantity -= qty;
                        System.out.println("QuantityOnHand11" + itemQuantity);
                        Object[] ob = {itemQuantity, code};
                        boolean isUpdateItem = ManageItemController.updateQt(ob);
                        JOptionPane.showMessageDialog(this, "Added Successfully");
                    }

                }

            }

        } catch (Exception ex) {
            Logger.getLogger(CustomerOrders.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtQtyOnHandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyOnHandActionPerformed


    }//GEN-LAST:event_txtQtyOnHandActionPerformed

    private void cmbNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNicActionPerformed

    }//GEN-LAST:event_cmbNicActionPerformed

    private void cmbNicItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNicItemStateChanged
        try {
            CustomerDTO cutomerDTO = new CustomerDTO((String) cmbNic.getSelectedItem());
            CustomerDTO searchCustomer = ManageCustomerController.searchCustomer(cutomerDTO);
            if (searchCustomer != null) {
                txtCusName.setText(searchCustomer.getCusName());
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerOrders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbNicItemStateChanged

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtSellPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSellPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSellPriceActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtLastPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastPriceActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        txtDiscount.requestFocus();
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscountActionPerformed
        double price = Double.parseDouble(txtSellPrice.getText());
        double discount = Double.parseDouble(txtDiscount.getText());
        double lastprice = price - discount;
        txtLastPrice.setText("" + lastprice);

        double grandTotal = 0;
        String batchId = (String) cmbBatchId.getSelectedItem();
        String itemCode = txtItemCode.getText();
        String itemName = txtItemName.getText();
        int qty = Integer.parseInt(txtQty.getText());
        double uniPrice = Double.parseDouble(txtLastPrice.getText());
        double amount = uniPrice * qty;
        grandTotal += amount;
        DefaultTableModel dtm = (DefaultTableModel) tblCusOrder.getModel();
        for (int i = 0; i < dtm.getRowCount(); i++) {
            String id = (String) dtm.getValueAt(i, 0);
            if (id.equals(batchId)) {
                int quantity = (int) dtm.getValueAt(i, 4);
                qty += quantity;
                dtm.removeRow(i);

            }

        }
        Object[] rowData = {batchId, itemCode, itemName, uniPrice, qty, amount};
        dtm.addRow(rowData);
        txtPayment.setText("" + grandTotal);
        txtTotalAmount.setText("" + grandTotal);
        txtCash.requestFocus();
        
        
       

    }//GEN-LAST:event_txtDiscountActionPerformed

    private void txtItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemCodeActionPerformed

//            ItemDTO item=ManageItemController.searchItem(new ItemDTO(txtItemCode.getText()));
//            txtItemName.setText(item.getItemName());

    }//GEN-LAST:event_txtItemCodeActionPerformed

    private void cmbBatchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBatchIdActionPerformed

        try {
            String id = (String) cmbBatchId.getSelectedItem();
            BatchDTO batch = BatchController.searchBatchDetails(id);
            txtItemCode.setText(batch.getItemCode());
            txtQtyOnHand.setText(Integer.toString(batch.getQty()));
            txtBuyPrice.setText(Double.toString(batch.getBuyingPrice()));
            txtSellPrice.setText(Double.toString(batch.getSellingPrice()));
            txtQty.requestFocus();
            String itemCode = txtItemCode.getText();
            ItemDTO item = ManageItemController.searchItem(itemCode);
            System.out.println("sds" + item.getItemName());
            txtItemName.setText(item.getItemName());
        } catch (Exception ex) {
            Logger.getLogger(CustomerOrders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbBatchIdActionPerformed

    private void txtCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashActionPerformed
       double cash=Double.parseDouble(txtCash.getText());
      double payment=Double.parseDouble(txtPayment.getText());
      double balance=cash-payment;
      txtBalance.setText(balance+"");
    }//GEN-LAST:event_txtCashActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new CustomerOrders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnRemove;
    private org.jdesktop.swingx.JXComboBox cmbBatchId;
    private javax.swing.JComboBox<String> cmbNic;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel10;
    private org.jdesktop.swingx.JXLabel jXLabel11;
    private org.jdesktop.swingx.JXLabel jXLabel12;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private org.jdesktop.swingx.JXTable tblCusOrder;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBuyPrice;
    private javax.swing.JTextField txtCash;
    private org.jdesktop.swingx.JXTextField txtCusName;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDiscount;
    private org.jdesktop.swingx.JXTextField txtInvoice;
    private org.jdesktop.swingx.JXTextField txtItemCode;
    private org.jdesktop.swingx.JXTextField txtItemName;
    private org.jdesktop.swingx.JXTextField txtLastPrice;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtPayment;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtQtyOnHand;
    private org.jdesktop.swingx.JXTextField txtSellPrice;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables

    private void loadCustomerNic() {
        try {
            ArrayList<CustomerDTO> getAllNic = ManageCustomerController.getAllCustomers();
            cmbNic.removeAllItems();

            if (getAllNic == null) {
                return;
            }
            for (CustomerDTO customerDTO : getAllNic) {

                cmbNic.addItem(customerDTO.getcNic());
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerOrders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadDate() {
        Date d1 = new Date();
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        String date = df.format(d1);
        txtDate.setText(date);
    }

    private void loadCustOrderId() {
        try {
            String orderId = IdGenerator.getNewID("customerOrder", "coID", "CO");
            txtOrderId.setText(orderId);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerOrders.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerOrders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadItemName() {

    }

    private void loadBatchDetails() {
        try {
            ArrayList<BatchDTO> getAll = BatchController.getBatchList();
            for (BatchDTO batchDTO : getAll) {
                cmbBatchId.addItem(batchDTO.getBid());
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerOrders.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void loadUserId() throws Exception {

        ArrayList<String> loadUserId = ManageUserController.getAllUser();
        for (String userId : loadUserId) {
            txtUserId.setText(userId);

        }

    }

    private void loadUsers() {
        try {
            ArrayList<String> loadUserId = ManageUserController.getAllUser();
            for (String userId : loadUserId) {
                txtUserId.setText(userId);

            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerOrders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadInvoice() {
        try {
            String invoice = IdGenerator.getNewID("customerPayment", "invoiceNo", "I");
            txtInvoice.setText(invoice);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerOrders.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerOrders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
