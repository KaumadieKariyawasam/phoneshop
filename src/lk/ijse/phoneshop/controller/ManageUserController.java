/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.UserDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.UserDAO;

/**
 *
 * @author HP
 */
public class ManageUserController {
    public static UserDAO userDAO=(UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.USER);
    
    public static boolean addUser(UserDTO userDTO) throws Exception{
        boolean result=userDAO.add(userDTO);
        return result;
    }
    public static boolean deleteUser(UserDTO userDTO) throws Exception{
        boolean result=userDAO.delete(userDTO);
        return result;
    }
    public static boolean updateUser(UserDTO userDTO) throws Exception{
        boolean result=userDAO.update(userDTO);
        return result;
    }
    
    public static UserDTO searchUser(UserDTO userDTO) throws Exception{
        UserDTO result=userDAO.search(userDTO);
        return result;
    }
    
    public static ArrayList<UserDTO> getUser() throws Exception{
        ArrayList<UserDTO> getUsers=userDAO.getAll();
        return getUsers;
    }

    public static ArrayList<String> getAllUser() throws Exception {
        ArrayList<String> getAllUser=userDAO.getUser();
        return getAllUser;
       
        
    }

    public static String getCurrenrPass(String text) throws Exception{
        String currentPass=userDAO.getCurrentPass(text);
        return currentPass;
    }

    public static boolean changePassword(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean changePassword(String text, String text0) throws Exception{
        boolean change=userDAO.changePassword(text,text0);
        return change;
    }
}
