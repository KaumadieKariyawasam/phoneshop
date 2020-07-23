/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.UserDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.UserDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class LoginController {

    public static UserDAO userDAO = (UserDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.USER);

    public static ArrayList<UserDTO> checking() throws Exception {
        return userDAO.getAll();
    }
    
    public static UserDTO searchPassword(String name) throws SQLException{
       String SQL="Select * From User WHERE preffer='"+name+"'";
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        UserDTO userDTO=new UserDTO();
        if(rst.next()){
            userDTO.setUserId(rst.getString(1));
            userDTO.setUserNic(rst.getString(2));
            userDTO.setUserName(rst.getString(3));
            userDTO.setUserAddress(rst.getString(4));
            userDTO.setMobile(rst.getString(5));
            userDTO.setEmail(rst.getString(6));
            userDTO.setPassword(rst.getString(7));
            userDTO.setPreffer(rst.getString(8));
        }
        return userDTO;
    }
    
//     public static Password serchpassword(String id) throws SQLException, ClassNotFoundException {
//        String sql = "select * from passwords where username ='" + id + "'";
//        Connection conn = DBConnection.getDBConnection().getConnection();
//        Statement stm = conn.createStatement();
//        ResultSet rst = stm.executeQuery(sql);
//        Password  Password = null;
//        if (rst.next()) {
//            Password = new Password(rst.getString(1), rst.getString(2));
//
//        }
//        return Password;
//    }  
 
}
