/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.UserDTO;
import lk.ijse.phoneshop.dao.custom.UserDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class UserDAPimpl implements UserDAO {

    @Override
    public boolean add(UserDTO dto) throws Exception {
        String SQL = "Insert into User Values(?,?,?,?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getUserId());
        stm.setObject(2, dto.getUserNic());
        stm.setObject(3, dto.getUserName());
        stm.setObject(4, dto.getUserAddress());
        stm.setObject(5, dto.getMobile());
        stm.setObject(6, dto.getEmail());
        stm.setObject(7, dto.getPassword());
        stm.setObject(8, dto.getPreffer());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(UserDTO dto) throws Exception {
        String SQL = "Update User set uNic=?, uName=?, uAddress=?,mobile=?,email=? WHERE uid=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getUserNic());
        stm.setObject(2, dto.getUserName());
        stm.setObject(3, dto.getUserAddress());
        stm.setObject(4, dto.getMobile());
        stm.setObject(5, dto.getEmail());
        stm.setObject(6, dto.getUserId());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(UserDTO dto) throws Exception {
        String SQL = "Delete from User WHERE uid=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getUserId());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public UserDTO search(UserDTO dto) throws Exception {
        String SQL = "Select * from User WHERE uid=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getUserId());
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new UserDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8)
            );
        }
        return null;

    }

    @Override
    public ArrayList<UserDTO> getAll() throws Exception {
        String SQL = "Select * from User";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ArrayList<UserDTO> getAllUser = new ArrayList<>();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            UserDTO userDTO = new UserDTO();
            userDTO.setUserId(rst.getString(1));
            userDTO.setUserNic(rst.getString(2));
            userDTO.setUserName(rst.getString(3));
            userDTO.setUserAddress(rst.getString(4));
            userDTO.setMobile(rst.getString(5));
            userDTO.setEmail(rst.getString(6));
            userDTO.setPassword(rst.getString(7));
            userDTO.setPreffer(rst.getString(8));
            getAllUser.add(userDTO);
        }
        return getAllUser;
    }

    @Override
    public ArrayList<UserDTO> getAllUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> getUser() throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Select uid from User";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<String> itemCodeList = new ArrayList<>();
        while (rst.next()) {
            itemCodeList.add(rst.getString(1));
        }
        return itemCodeList;
    }

    @Override
    public String getCurrentPass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCurrentPass(String text) throws SQLException {
        String SQL="Select Password FROM USER WHERE prefferedName='"+text+"'";
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        if(rst.next()){
           String pass=rst.getString(1);
           return pass;
        }
        return null;
    }

    @Override
    public boolean changePassword(String text, String text0) throws Exception {
        String SQL="Update User set password='"+text+"' WHERE prefferedName='"+text0+"'";
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        int res=stm.executeUpdate(SQL);
        return res>0;
    }

   
}
