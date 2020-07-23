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
import lk.ijse.phoneshop.controller.ManageItemController;
import lk.ijse.phoneshop.controller.SupplierOrderDetailController;
import lk.ijse.phoneshop.core.dto.SupplierOrderDTO;
import lk.ijse.phoneshop.dao.custom.SupplierOrderDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class SupplierOrderDAOimpl implements SupplierOrderDAO{

    
    @Override
    public boolean update(SupplierOrderDTO dto) throws Exception {
        String SQL="Update suporder set sNic=?,uid=?,date=? WHERE soId=?";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1,dto.getSupOrderId());
        int res=stm.executeUpdate();
        return res>0;
        
    }

    @Override
    public boolean delete(SupplierOrderDTO dto) throws Exception {
        String SQL="Delete from SupOrder WHERE soId=?";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1,dto.getSupOrderId());
        int res=stm.executeUpdate();
        return res>0;
    }

    @Override
    public SupplierOrderDTO search(SupplierOrderDTO dto) throws Exception {
        String SQL="Select * from SupOrder WHERE soId=?";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1,dto.getSupOrderId());
        ResultSet rst=stm.executeQuery();
        if(rst.next()){
            return new SupplierOrderDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
            
            );
        }
        return null;
    }

    @Override
    public ArrayList<SupplierOrderDTO> getAll() throws Exception {
        String SQL="Select * from SupOrder";
        Connection connection=DBConnection.getInstance().getConnection();
        
        ArrayList<SupplierOrderDTO> supOrderList=new ArrayList<>();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        while(rst.next()){
            SupplierOrderDTO supplierOrderDTO=new SupplierOrderDTO();
            supplierOrderDTO.setSupOrderId(rst.getString(1));
            supplierOrderDTO.setSupNic(rst.getString(2));
            supplierOrderDTO.setUserId(rst.getString(3));
            supplierOrderDTO.setDate(rst.getString(4));
            supOrderList.add(supplierOrderDTO);
        }
        return supOrderList;
        
    }

    @Override
    public boolean add(SupplierOrderDTO dto) throws Exception {
        String SQL = "Insert into SupOrder Values(?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getSupOrderId());
        stm.setObject(2, dto.getSupNic());
        stm.setObject(3, dto.getUserId());
        stm.setObject(4, dto.getDate());
        
        int res = stm.executeUpdate();
        System.out.println("aaaaa"+stm);
        return res > 0;
    }

    @Override
    public ArrayList<SupplierOrderDTO> getSupOrder() throws SQLException {
        String SQL="Select * from SupOrder";
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ArrayList<SupplierOrderDTO> getSupplierOrder=new ArrayList<>();
        ResultSet rst=stm.executeQuery(SQL);
        while(rst.next()){
            SupplierOrderDTO supplierOrderDTO=new SupplierOrderDTO();
            supplierOrderDTO.setSupOrderId(rst.getString(1));
            supplierOrderDTO.setSupNic(rst.getString(2));
            supplierOrderDTO.setUserId(rst.getString(3));
            supplierOrderDTO.setDate(rst.getString(4));
            getSupplierOrder.add(supplierOrderDTO);
        }
        return getSupplierOrder;
    }
    
}
