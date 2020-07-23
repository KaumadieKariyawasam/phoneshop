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
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.phoneshop.core.dto.SupplierReturnDTO;
import lk.ijse.phoneshop.core.dto.ViewSupReturnDTO;
import lk.ijse.phoneshop.dao.custom.SupplierReturnDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class SupplierReturnDAOimpl implements SupplierReturnDAO {

    @Override
    public boolean add(SupplierReturnDTO dto) throws Exception {
        String SQL = "Insert into SupplierReturn Values(?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getSupReturnId());
        stm.setObject(2, dto.getBatchId());
        stm.setObject(3, dto.getSupOrderId());
        stm.setObject(4, dto.getReturnQty());
        stm.setObject(5, dto.getDate());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(SupplierReturnDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(SupplierReturnDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierReturnDTO search(SupplierReturnDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<SupplierReturnDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ViewSupReturnDTO> getAllReturn() throws SQLException{

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
