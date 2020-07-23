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
import lk.ijse.phoneshop.core.dto.SupplierOrderDetailDTO;
import lk.ijse.phoneshop.dao.custom.SupplierOrderDetailDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class SupplierOrderDetailDAOimpl implements SupplierOrderDetailDAO{

    @Override
    public boolean add(SupplierOrderDetailDTO dto) throws Exception {
        String SQL="Insert into SupOrderDetail Values(?,?,?)";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        int res=stm.executeUpdate();
        System.out.println("aaaaaaaa"+stm);
        return res>0;
    }

    @Override
    public boolean update(SupplierOrderDetailDTO dto) throws Exception {
        String SQL="Update SupOrderDetail set bId=?,qty=? WHERE soId=?";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1,dto.getBatchId());
        stm.setObject(1,dto.getQty());
        stm.setObject(3, dto.getSupOrderId());
        int res=stm.executeUpdate();
        return res>0;
        
    }

    @Override
    public boolean delete(SupplierOrderDetailDTO dto) throws Exception {
        String SQL="Delete From SupOrderDetail WHERE soId=?";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        int res=stm.executeUpdate();
        return res>0;
                
    }

    @Override
    public SupplierOrderDetailDTO search(SupplierOrderDetailDTO dto) throws Exception {
        String SQL="Select * from SupOrderDetail WHERE soId=?";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1, dto.getSupOrderId());
        ResultSet rst=stm.executeQuery();
        if(rst.next()){
            return new SupplierOrderDetailDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getInt(3)
            );
        }
        return null;
        
    }

    @Override
    public ArrayList<SupplierOrderDetailDTO> getAll() throws Exception {
        String SQL="Select * from SupOrderDetail";
        Connection connection=DBConnection.getInstance().getConnection();
        ArrayList<SupplierOrderDetailDTO> getOrderDetail=new ArrayList<>();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        while(rst.next()){
            SupplierOrderDetailDTO supplierOrderDetailDTO=new SupplierOrderDetailDTO();
            supplierOrderDetailDTO.setSupOrderId(rst.getString(1));
            supplierOrderDetailDTO.setBatchId(rst.getString(2));
            supplierOrderDetailDTO.setQty(rst.getInt(3));
            getOrderDetail.add(supplierOrderDetailDTO);
        }
        return getOrderDetail;
    }
    
}
