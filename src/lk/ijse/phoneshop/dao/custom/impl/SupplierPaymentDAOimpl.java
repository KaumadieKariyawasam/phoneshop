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
import lk.ijse.phoneshop.core.dto.SupplierPaymentDTO;
import lk.ijse.phoneshop.dao.custom.SupplierPaymentDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class SupplierPaymentDAOimpl implements SupplierPaymentDAO{

    @Override
    public boolean add(SupplierPaymentDTO dto) throws Exception {
        String SQL = "Insert into SupplierPayment Values(?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getGrnId());
        stm.setObject(2, dto.getSupOrderId());
        stm.setObject(3, dto.getPayment());
        
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(SupplierPaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(SupplierPaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierPaymentDTO search(SupplierPaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierPaymentDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierPaymentDTO> getSupplierPayment() throws SQLException {
        String SQL="Select * from SupplierPayment";
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ArrayList<SupplierPaymentDTO> getList=new ArrayList<>();
        ResultSet rst=stm.executeQuery(SQL);
        while(rst.next()){
            SupplierPaymentDTO supplierPaymentDTO=new SupplierPaymentDTO();
            supplierPaymentDTO.setGrnId(rst.getString(1));
            supplierPaymentDTO.setSupOrderId(rst.getString(2));
            supplierPaymentDTO.setPayment(rst.getDouble(3));
           getList.add(supplierPaymentDTO);
        }
        return getList;
    }
    
}
