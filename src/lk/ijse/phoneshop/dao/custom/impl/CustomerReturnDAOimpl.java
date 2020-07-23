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
import lk.ijse.phoneshop.core.dto.CustomerReturnDTO;
import lk.ijse.phoneshop.dao.custom.CustomerReturnDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class CustomerReturnDAOimpl implements CustomerReturnDAO{

    @Override
    public boolean add(CustomerReturnDTO dto) throws Exception {
        String SQL="Insert into CustomerReturn Values(?,?,?,?,?)";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1,dto.getCreturnId());
        stm.setObject(2,dto.getCusOrderId());
        stm.setObject(3,dto.getBatchId());
        stm.setObject(4,dto.getReturnQty());
        stm.setObject(5,dto.getDate());
        int res=stm.executeUpdate();
        return res>0;
    }

    @Override
    public boolean update(CustomerReturnDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(CustomerReturnDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerReturnDTO search(CustomerReturnDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerReturnDTO> getAll() throws Exception {
        String SQL="Select * from CustomerReturn";
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ArrayList<CustomerReturnDTO> getAll=new ArrayList<>();
        ResultSet rst=stm.executeQuery(SQL);
        while(rst.next()){
            CustomerReturnDTO customerReturnDTO=new CustomerReturnDTO();
            customerReturnDTO.setCreturnId(rst.getString(1));
            customerReturnDTO.setCreturnId(rst.getString(2));
            customerReturnDTO.setBatchId(rst.getString(3));
            customerReturnDTO.setReturnQty(rst.getInt(4));
            customerReturnDTO.setDate(rst.getString(5));
            getAll.add(customerReturnDTO);
       }
        return getAll;
    }
    
}
