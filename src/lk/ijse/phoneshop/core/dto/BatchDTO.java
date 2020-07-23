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
public class BatchDTO extends SuperDTO {

    private String soId;
    private String bid;
    private String itemCode;
    private int Qty;
    private double buyingPrice;
    private double sellingPrice;

    public BatchDTO() {
    }

    public BatchDTO(String soId, String bid, String itemCode, int Qty, double buyingPrice, double sellingPrice) {
        this.soId = soId;
        this.bid = bid;
        this.itemCode = itemCode;
        this.Qty = Qty;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public BatchDTO(String batch) {
        this.bid = batch;
    }
    

    public BatchDTO(int qty) {
        this.Qty=qty;
    }

    public BatchDTO(int qty, String batchId) {
        this.Qty=qty;
        this.bid=batchId;
    }

    /**
     * @return the bid
     */
    public String getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(String bid) {
        this.bid = bid;
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
     * @return the Qty
     */
    public int getQty() {
        return Qty;
    }

    /**
     * @param Qty the Qty to set
     */
    public void setQty(int Qty) {
        this.Qty = Qty;
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
     * @return the soId
     */
    public String getSoId() {
        return soId;
    }

    /**
     * @param soId the soId to set
     */
    public void setSoId(String soId) {
        this.soId = soId;
    }

    /**
     * @return the bestBeforeDate
     */
}
