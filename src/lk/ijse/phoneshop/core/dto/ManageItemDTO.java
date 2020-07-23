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
public class ManageItemDTO extends SuperDTO{
    private String batchId;
    private String itemCode;
    private String supOrderId;
    private int qty;
    private double buyingPrice;
    private double sellingPrice;
    private String bestBeforeDate;

    public ManageItemDTO() {
    }

    public ManageItemDTO(String batchId, String itemCode, String supOrderId, int qty, double buyingPrice, double sellingPrice, String bestBeforeDate) {
        this.batchId = batchId;
        this.itemCode = itemCode;
        this.supOrderId = supOrderId;
        this.qty = qty;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.bestBeforeDate = bestBeforeDate;
    }

    public ManageItemDTO(String batchId) {
        this.batchId=batchId;
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
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
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
     * @return the buyingPrice
     */
    public double getBuyingPrice() {
        return buyingPrice;
    }

    /**
     * @param buyingPrice the buyingPrice to set
     */
    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    /**
     * @return the sellingPrice
     */
    public double getSellingPrice() {
        return sellingPrice;
    }

    /**
     * @param sellingPrice the sellingPrice to set
     */
    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    /**
     * @return the bestBeforeDate
     */
    public String getBestBeforeDate() {
        return bestBeforeDate;
    }

    /**
     * @param bestBeforeDate the bestBeforeDate to set
     */
    public void setBestBeforeDate(String bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }
    
    
    
}
