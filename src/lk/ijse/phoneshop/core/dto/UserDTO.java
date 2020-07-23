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
public class UserDTO extends SuperDTO{
    private String userId;
    private String userNic;
    private String userName;
    private String userAddress;
    private String mobile;
    private String email;
    private String password;
    private String preffer;

    public UserDTO() {
    }

    public UserDTO(String userId, String userNic, String userName, String userAddress, String mobile, String email, String password, String preffer) {
        this.userId = userId;
        this.userNic = userNic;
        this.userName = userName;
        this.userAddress = userAddress;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
        this.preffer = preffer;
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
     * @return the userNic
     */
    public String getUserNic() {
        return userNic;
    }

    /**
     * @param userNic the userNic to set
     */
    public void setUserNic(String userNic) {
        this.userNic = userNic;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userAddress
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * @param userAddress the userAddress to set
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the preffer
     */
    public String getPreffer() {
        return preffer;
    }

    /**
     * @param preffer the preffer to set
     */
    public void setPreffer(String preffer) {
        this.preffer = preffer;
    }

    
}
