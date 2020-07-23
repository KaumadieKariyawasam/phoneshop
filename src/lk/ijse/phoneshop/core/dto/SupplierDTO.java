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
public class SupplierDTO extends SuperDTO{
    private String sNic;
    private String sName;
    private String sMobile;
    private String sEmail;
    private String comName;
    private String comTele;

    public SupplierDTO() {
    }

    public SupplierDTO(String sNic, String sName, String sMobile, String sEmail, String comName, String comTele) {
        this.sNic = sNic;
        this.sName = sName;
        this.sMobile = sMobile;
        this.sEmail = sEmail;
        this.comName = comName;
        this.comTele = comTele;
    }

    public SupplierDTO(String sNic) {
        this.sNic=sNic;
    }

    /**
     * @return the sNic
     */
    public String getsNic() {
        return sNic;
    }

    /**
     * @param sNic the sNic to set
     */
    public void setsNic(String sNic) {
        this.sNic = sNic;
    }

    /**
     * @return the sName
     */
    public String getsName() {
        return sName;
    }

    /**
     * @param sName the sName to set
     */
    public void setsName(String sName) {
        this.sName = sName;
    }

    /**
     * @return the sMobile
     */
    public String getsMobile() {
        return sMobile;
    }

    /**
     * @param sMobile the sMobile to set
     */
    public void setsMobile(String sMobile) {
        this.sMobile = sMobile;
    }

    /**
     * @return the sEmail
     */
    public String getsEmail() {
        return sEmail;
    }

    /**
     * @param sEmail the sEmail to set
     */
    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    /**
     * @return the comName
     */
    public String getComName() {
        return comName;
    }

    /**
     * @param comName the comName to set
     */
    public void setComName(String comName) {
        this.comName = comName;
    }

    /**
     * @return the comTele
     */
    public String getComTele() {
        return comTele;
    }

    /**
     * @param comTele the comTele to set
     */
    public void setComTele(String comTele) {
        this.comTele = comTele;
    }
    
    
    
    
}
