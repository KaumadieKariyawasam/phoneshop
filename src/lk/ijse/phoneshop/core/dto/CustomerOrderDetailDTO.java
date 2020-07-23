/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.core.dto;

/**
 *
 * @author HP
 */
public class CustomerOrderDetailDTO extends SuperDTO{
    private String custOrderId;
    private String batchId;
    private int qty;
    private double amount;

    public CustomerOrderDetailDTO() {
    }

    public CustomerOrderDetailDTO(String custOrderId, String batchId, int qty, double amount) {
        this.custOrderId = custOrderId;
        this.batchId = batchId;
        this.qty = qty;
        this.amount = amount;
    }

    /**
     * @return the custOrderId
     */
    public String getCustOrderId() {
        return custOrderId;
    }

    /**
     * @param custOrderId the custOrderId to set
     */
    public void setCustOrderId(String custOrderId) {
        this.custOrderId = custOrderId;
    }

    /**
     * @return the batchId
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * @param batchId the batchId to set
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
}
