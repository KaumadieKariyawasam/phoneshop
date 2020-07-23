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
public class SupplierPaymentDTO extends SuperDTO{
    private String grnId;
    private String supOrderId;
    private double payment;

    public SupplierPaymentDTO() {
    }

    public SupplierPaymentDTO(String grnId, String supOrderId, double payment) {
        this.grnId = grnId;
        this.supOrderId = supOrderId;
        this.payment = payment;
    }

    /**
     * @return the grnId
     */
    public String getGrnId() {
        return grnId;
    }

    /**
     * @param grnId the grnId to set
     */
    public void setGrnId(String grnId) {
        this.grnId = grnId;
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
    
}
