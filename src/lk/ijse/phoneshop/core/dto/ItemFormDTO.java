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
public class ItemFormDTO extends SuperDTO{
    private String itemCode;
    private String itemName;
    private int qtyOnHand;
    private String batchId;

    public ItemFormDTO() {
    }

    public ItemFormDTO(String itemCode, String itemName, int qtyOnHand, String batchId) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.qtyOnHand = qtyOnHand;
        this.batchId = batchId;
    }

    public ItemFormDTO(String batchId) {
        this.batchId=batchId;
    }

    public ItemFormDTO(String itemCode, String itemName, int qtyOnHand) {
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.qtyOnHand=qtyOnHand;
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
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the qtyOnHand
     */
    public int getQtyOnHand() {
        return qtyOnHand;
    }

    /**
     * @param qtyOnHand the qtyOnHand to set
     */
    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
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

    public String setItemName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
