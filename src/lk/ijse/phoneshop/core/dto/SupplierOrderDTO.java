/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.core.dto;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class SupplierOrderDTO extends SuperDTO{
    private String supOrderId;
    private String supNic;
    private String userId;
    private String date;
    private ArrayList<SupplierOrderDetailDTO> orderDetailList;
    public SupplierOrderDTO(){
    }

    public SupplierOrderDTO(String supOrderId, String supNic, String userId, String date) {
        this.supOrderId = supOrderId;
        this.supNic = supNic;
        this.userId = userId;
        this.date = date;
    }

    public SupplierOrderDTO(String orderId, String sNic, String uId, String date, ArrayList<SupplierOrderDetailDTO> orderDetailList) {
        this.supOrderId=orderId;
        this.supNic=sNic;
        this.userId=uId;
        this.date=date;
        this.orderDetailList=orderDetailList;
    }

    public SupplierOrderDTO(String supOrderId) {
        this.supOrderId=supOrderId;
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
     * @return the supNic
     */
    public String getSupNic() {
        return supNic;
    }

    /**
     * @param supNic the supNic to set
     */
    public void setSupNic(String supNic) {
        this.supNic = supNic;
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
     * @return the orderDetailList
     */
    public ArrayList<SupplierOrderDetailDTO> getOrderDetailList() {
        return orderDetailList;
    }

    /**
     * @param orderDetailList the orderDetailList to set
     */
    public void setOrderDetailList(ArrayList<SupplierOrderDetailDTO> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
    
    
}
