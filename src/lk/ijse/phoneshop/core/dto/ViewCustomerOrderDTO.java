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
public class ViewCustomerOrderDTO extends SuperDTO{
  private String date;
  private String userId;
  private String coId;
  private String batchId;
  private int qty;
  private double amount;

    public ViewCustomerOrderDTO() {
    }

    public ViewCustomerOrderDTO(String date, String userId, String coId, String batchId, int qty, double amount) {
        this.date = date;
        this.userId = userId;
        this.coId = coId;
        this.batchId = batchId;
        this.qty = qty;
        this.amount = amount;
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

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the coId
     */
    public String getCoId() {
        return coId;
    }

    /**
     * @param coId the coId to set
     */
    public void setCoId(String coId) {
        this.coId = coId;
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
