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
import lk.ijse.phoneshop.core.dto.SupplierDTO;
import lk.ijse.phoneshop.dao.custom.SupplierDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class SupplierDAOimpl implements SupplierDAO{

    @Override
    public boolean add(SupplierDTO dto) throws Exception {
        String SQL="Insert into Supplier Values(?,?,?,?,?,?)";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getsNic());
        stm.setObject(2, dto.getsName());
        stm.setObject(3,dto.getsMobile());
        stm.setObject(4, dto.getsEmail());
        stm.setObject(5, dto.getComName());
        stm.setObject(6,dto.getComTele());
        int res=stm.executeUpdate();
        return res>0;
    }

    @Override
    public boolean update(SupplierDTO dto) throws Exception {
        String SQL="Update Supplier set sName=?,sMobile=?,sEmail=?,company=?,comNo=? WHERE sNic=?";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getsName());
        stm.setObject(2, dto.getsMobile());
        stm.setObject(3, dto.getsEmail());
        stm.setObject(4,dto.getComName());
        stm.setObject(5, dto.getComTele());
        stm.setObject(6, dto.getsNic());
        int res=stm.executeUpdate();
        return res>0;
    }

    @Override
    public boolean delete(SupplierDTO dto) throws Exception {
        String SQL="Delete from Supplier where sNic=?";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getsNic());
        int res=stm.executeUpdate();
        return res>0;
    }

    @Override
    public SupplierDTO search(SupplierDTO dto) throws Exception {
        String SQL="Select * from Supplier where sNic='"+dto.getsNic()+"'";
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        if(rst.next()){
            return new SupplierDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6));
        }
        return null;
    }

    @Override
    public ArrayList<SupplierDTO> getAll() throws Exception {
        String SQL="Select * from Supplier";
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ArrayList<SupplierDTO> supplierList=new ArrayList<>();
        ResultSet rst=stm.executeQuery(SQL);
        while(rst.next()){
            SupplierDTO supplierDTO=new SupplierDTO();
            supplierDTO.setsNic(rst.getString(1));
            supplierDTO.setsName(rst.getString(2));
            supplierDTO.setsMobile(rst.getString(3));
            supplierDTO.setsEmail(rst.getString(4));
            supplierDTO.setComName(rst.getString(5));
            supplierDTO.setComTele(rst.getString(6));
            supplierList.add(supplierDTO);
            
        }
        return supplierList;
    }

    @Override
    public boolean deleteSupplier(String nic) throws SQLException {
        String SQL="Delete from Supplier where sNic='"+nic+"'";
        Connection connection=DBConnection.getInstance().getConnection();
       Statement stm=connection.createStatement();
       int res=stm.executeUpdate(SQL);
       return res>0;
    }
    
}
