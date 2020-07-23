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
import lk.ijse.phoneshop.core.dto.CustomerDTO;
import lk.ijse.phoneshop.dao.custom.CustomerDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class CustomerDAOimpl implements CustomerDAO {

    @Override
    public boolean add(CustomerDTO dto) throws Exception {
        String SQL = "Insert into Customer Values(?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getcNic());
        stm.setObject(2, dto.getCusName());
        stm.setObject(3, dto.getCusAddress());
        stm.setObject(4, dto.getEmail());
        stm.setObject(5, dto.getTele());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(CustomerDTO dto) throws Exception {
        String SQL = "Update Customer set cName=?,address=?, email=?,tele=? where cNic=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getCusName());
        stm.setObject(2, dto.getCusAddress());
        stm.setObject(3, dto.getEmail());
        stm.setObject(4, dto.getTele());
        stm.setObject(5, dto.getcNic());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(CustomerDTO dto) throws Exception {
        String SQL = "Delete from Customer where cNic=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getcNic());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public CustomerDTO search(CustomerDTO dto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer WHERE cNic='" + dto.getcNic() + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new CustomerDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));
            
        }

        return null;

    }

    @Override
    public ArrayList<CustomerDTO> getAll() throws Exception {
        String SQL = "Select * from Customer";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ArrayList<CustomerDTO> customerList = new ArrayList<>();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setcNic(rst.getString(1));
            customerDTO.setCusName(rst.getString(2));
            customerDTO.setCusAddress(rst.getString(3));
            customerDTO.setEmail(rst.getString(4));
            customerDTO.setTele(rst.getString(5));
            customerList.add(customerDTO);
        }
        return customerList;
    }

    @Override
    public boolean deleteCustomer(String nic) throws SQLException {
        String SQL = "Delete from Customer where cNic='"+nic+"'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        int res=stm.executeUpdate(SQL);
        return res>0;
    }

}
