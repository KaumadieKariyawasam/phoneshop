/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.CustomerDTO;
import lk.ijse.phoneshop.core.dto.CustomerOrderDetailDTO;
import lk.ijse.phoneshop.dao.custom.CustomerOrderDetailDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class CustomerOrderDetailDAOimpl implements CustomerOrderDetailDAO{

    @Override
    public boolean add(CustomerOrderDetailDTO dto) throws Exception {
        String SQL="Insert into custOrderDetail Values(?,?,?,?)";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1,dto.getCustOrderId());
        stm.setObject(2,dto.getBatchId());
        stm.setObject(3,dto.getQty());
        stm.setObject(4,dto.getAmount());
        int res=stm.executeUpdate();
        return res>0;
    }
    

    @Override
    public boolean update(CustomerOrderDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(CustomerOrderDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerOrderDetailDTO search(CustomerOrderDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerOrderDetailDTO> getAll() throws Exception {
        String SQL = "Select * from custorderdetail";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ArrayList<CustomerOrderDetailDTO> customerList = new ArrayList<>();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            CustomerOrderDetailDTO coddto = new CustomerOrderDetailDTO();
            coddto.setCustOrderId(rst.getString(1));
            coddto.setBatchId(rst.getString(2));
            coddto.setQty(rst.getInt(3));
            coddto.setAmount(rst.getDouble(4));
            customerList.add(coddto);
        }
        return customerList;
    }
    
}
