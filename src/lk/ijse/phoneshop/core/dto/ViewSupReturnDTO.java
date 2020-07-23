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
public class ViewSupReturnDTO extends SuperDTO{
    private String supReturnId;
    private String batchId;
    private String supOrderId;
    private int qty;
    private double payment;
    private String date;

    public ViewSupReturnDTO() {
    }

    public ViewSupReturnDTO(String supReturnId, String batchId, String supOrderId, int qty, double payment, String date) {
        this.supReturnId = supReturnId;
        this.batchId = batchId;
        this.supOrderId = supOrderId;
        this.qty = qty;
        this.payment = payment;
        this.date = date;
    }

    /**
     * @return the supReturnId
     */
    public String getSupReturnId() {
        return supReturnId;
    }

    /**
     * @param supReturnId the supReturnId to set
     */
    public void setSupReturnId(String supReturnId) {
        this.supReturnId = supReturnId;
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
     * @return the supOrderId
     */
    public String getSupOrderId() {
        return supOrderId;
    }

    /**
     * @param supOrderId the supOrderId to set
     */
    public void setSupOrderId(String supOrderId) {
        this.supOrderId = supOrderId;
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
     * @return the payment
     */
    public double getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(double payment) {
        this.payment = payment;
    }

    /**
     * @return the date
     */
    
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    
}
