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
public class SupplierReturnDTO extends SuperDTO{
    private String supReturnId;
    private String batchId;
    private String supOrderId;
    private int returnQty;
    private String date;

    public SupplierReturnDTO() {
    }

    public SupplierReturnDTO(String supReturnId, String batchId, String supOrderId, int returnQty, String date) {
        this.supReturnId = supReturnId;
        this.batchId = batchId;
        this.supOrderId = supOrderId;
        this.returnQty = returnQty;
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
