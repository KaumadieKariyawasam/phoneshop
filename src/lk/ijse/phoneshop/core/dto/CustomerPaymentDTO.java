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
public class CustomerPaymentDTO extends SuperDTO{
    private String invoiceNo;
    private String custOrderId;
    private double payment;

    public CustomerPaymentDTO() {
    }

    public CustomerPaymentDTO(String invoiceNo, String custOrderId, double payment) {
        this.invoiceNo = invoiceNo;
        this.custOrderId = custOrderId;
        this.payment = payment;
    }

    /**
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * @param invoiceNo the invoiceNo to set
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
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
