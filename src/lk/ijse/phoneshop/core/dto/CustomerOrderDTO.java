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
public class CustomerOrderDTO extends SuperDTO{
    private String cusOrderId;
    private String customerNic;
    private String userId;
    private String Date;

    public CustomerOrderDTO() {
    }

    public CustomerOrderDTO(String cusOrderId, String customerNic, String userId, String Date) {
        this.cusOrderId = cusOrderId;
        this.customerNic = customerNic;
        this.userId = userId;
        this.Date = Date;
    }

    public CustomerOrderDTO(String cusOrderId) {
        this.cusOrderId=cusOrderId;
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
     * @return the customerNic
     */
    public String getCustomerNic() {
        return customerNic;
    }

    /**
     * @param customerNic the customerNic to set
     */
    public void setCustomerNic(String customerNic) {
        this.customerNic = customerNic;
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
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }
    
    
}
