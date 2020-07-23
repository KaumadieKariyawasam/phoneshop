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
import lk.ijse.phoneshop.core.dto.CustomerPaymentDTO;
import lk.ijse.phoneshop.dao.custom.CustomerPaymetDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class CustomerPaymentDAOimpl implements CustomerPaymetDAO{

    @Override
    public boolean add(CustomerPaymentDTO dto) throws Exception {
        String SQL="Insert into CustomerPayment Values(?,?,?)";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1,dto.getInvoiceNo());
        stm.setObject(2,dto.getCustOrderId());
        stm.setObject(3,dto.getPayment());
        int res=stm.executeUpdate();
        return res>0;
    }

    @Override
    public boolean update(CustomerPaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(CustomerPaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerPaymentDTO search(CustomerPaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomerPaymentDTO> getAll() throws Exception {
        String SQL="Select * from CustomerPayment";
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ArrayList<CustomerPaymentDTO> getAllDetail=new ArrayList<>();
        ResultSet rst=stm.executeQuery(SQL);
        while(rst.next()){
            CustomerPaymentDTO customerPaymentDTO=new CustomerPaymentDTO();
            customerPaymentDTO.setInvoiceNo(rst.getString(1));
            customerPaymentDTO.setCustOrderId(rst.getString(2));
            customerPaymentDTO.setPayment(rst.getDouble(3));
            getAllDetail.add(customerPaymentDTO);
            
        }
        return getAllDetail;
    }
    
}
