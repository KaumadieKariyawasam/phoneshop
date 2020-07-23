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
public class CustomerReturnDTO extends SuperDTO{
    private String creturnId;
    private String cusOrderId;
    private String batchId;
    private int returnQty;
    private String date;

    public CustomerReturnDTO() {
    }

    public CustomerReturnDTO(String creturnId, String cusOrderId, String batchId, int returnQty, String date) {
        this.creturnId = creturnId;
        this.cusOrderId = cusOrderId;
        this.batchId = batchId;
        this.returnQty = returnQty;
        this.date = date;
    }

    /**
     * @return the creturnId
     */
    public String getCreturnId() {
        return creturnId;
    }

    /**
     * @param creturnId the creturnId to set
     */
    public void setCreturnId(String creturnId) {
        this.creturnId = creturnId;
    }

    /**
     * @return the cusOrderId
     */
    public String getCusOrderId() {
        return cusOrderId;
    }

    /**
     * @param cusOrderId the cusOrderId to set
     */
    public void setCusOrderId(String cusOrderId) {
        this.cusOrderId = cusOrderId;
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
     * @return the returnQty
     */
    public int getReturnQty() {
        return returnQty;
    }

    /**
     * @param returnQty the returnQty to set
     */
    public void setReturnQty(int returnQty) {
        this.returnQty = returnQty;
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
