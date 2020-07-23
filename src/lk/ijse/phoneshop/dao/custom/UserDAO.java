/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.dao.custom;

import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.UserDTO;
import lk.ijse.phoneshop.dao.SuperDAO;

/**
 *
 * @author HP
 */
public interface UserDAO extends SuperDAO<UserDTO>{

    public ArrayList<UserDTO> getAllUser()throws Exception;

    public ArrayList<String> getUser()throws Exception;

    public String getCurrentPass()throws Exception;

    public String getCurrentPass(String text)throws Exception;

    public boolean changePassword(String text, String text0)throws Exception;
    
   
}
