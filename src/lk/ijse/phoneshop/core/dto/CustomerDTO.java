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
public class CustomerDTO extends SuperDTO{
    private String cNic;
    private String cusName;
    private String cusAddress;
    private String email;
    private String tele;

    public CustomerDTO() {
    }

    public CustomerDTO(String cNic, String cusName, String cusAddress, String email, String tele) {
        this.cNic = cNic;
        this.cusName = cusName;
        this.cusAddress = cusAddress;
        this.email = email;
        this.tele = tele;
    }

    public CustomerDTO(String cNic){
        this.cNic=cNic;
    }

    /**
     * @return the cNic
     */
    public String getcNic() {
        return cNic;
    }

    /**
     * @param cNic the cNic to set
     */
    public void setcNic(String cNic) {
        this.cNic = cNic;
    }

    /**
     * @return the cusName
     */
    public String getCusName() {
        return cusName;
    }

    /**
     * @param cusName the cusName to set
     */
    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    /**
     * @return the cusAddress
     */
    public String getCusAddress() {
        return cusAddress;
    }

    /**
     * @param cusAddress the cusAddress to set
     */
    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the tele
     */
    public String getTele() {
        return tele;
    }

    /**
     * @param tele the tele to set
     */
    public void setTele(String tele) {
        this.tele = tele;
    }
    
    
    
    
}
