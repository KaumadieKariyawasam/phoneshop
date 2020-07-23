/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.dao.custom.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.ViewSupReturnDTO;
import lk.ijse.phoneshop.dao.custom.ViewSupReturnDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class ViewSupReturnDAOimpl implements ViewSupReturnDAO{

    @Override
    public boolean add(ViewSupReturnDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ViewSupReturnDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ViewSupReturnDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ViewSupReturnDTO search(ViewSupReturnDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ViewSupReturnDTO> getAll() throws Exception {
         String SQL = "Select s1.sReturnId,bId,soId,returnQty,date,srPaymentId from SupplierReturn s1,SupReturnPayment r1 WHERE s1.sReturnId=r1.sReturnId";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ArrayList<ViewSupReturnDTO> getSupplier = new ArrayList<>();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            ViewSupReturnDTO viewSupReturnDTO = new ViewSupReturnDTO();
            viewSupReturnDTO.setSupReturnId(rst.getString(1));
            viewSupReturnDTO.setBatchId(rst.getString(2));
            viewSupReturnDTO.setSupOrderId(rst.getString(3));
            viewSupReturnDTO.setQty(rst.getInt(4));
            viewSupReturnDTO.setPayment(rst.getDouble(5));
            viewSupReturnDTO.setDate(rst.getString(6));
            getSupplier.add(viewSupReturnDTO);
        }
        return getSupplier;
    }

    @Override
    public ArrayList<ViewSupReturnDTO> getAllReturn() throws SQLException {
         String SQL = "Select s1.sReturnId,bId,soId,returnQty,returnPayment,date from SupplierReturn s1,SupReturnPayment r1 WHERE s1.sReturnId=r1.sReturnId";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ArrayList<ViewSupReturnDTO> getSupplier = new ArrayList<>();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            ViewSupReturnDTO viewSupReturnDTO = new ViewSupReturnDTO();
            viewSupReturnDTO.setSupReturnId(rst.getString(1));
            viewSupReturnDTO.setBatchId(rst.getString(2));
            viewSupReturnDTO.setSupOrderId(rst.getString(3));
            viewSupReturnDTO.setQty(rst.getInt(4));
            viewSupReturnDTO.setPayment(rst.getDouble(5));
            viewSupReturnDTO.setDate(rst.getString(6));
            getSupplier.add(viewSupReturnDTO);
        }
        return getSupplier;
        
    }
    
}
