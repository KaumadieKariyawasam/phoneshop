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
import lk.ijse.phoneshop.core.dto.BatchDTO;
import lk.ijse.phoneshop.dao.custom.BatchDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class BatchDAOimpl implements BatchDAO {

    @Override
    public boolean add(BatchDTO dto) throws Exception {
        String SQL = "Insert into Batch Values(?,?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getSoId());
        stm.setObject(2, dto.getBid());
        stm.setObject(3, dto.getItemCode());
        stm.setObject(4, dto.getQty());
        stm.setObject(5, dto.getBuyingPrice());
        stm.setObject(6, dto.getSellingPrice());
        
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(BatchDTO dto) throws Exception {
        String SQL = "Update Batch set bId=?,itemCode=?,qty=?,buyingPrice=?,sellingPrice=? where bId='"+dto.getBid()+"'";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getBid());
        stm.setObject(2, dto.getItemCode());
        stm.setObject(3, dto.getQty());
        stm.setObject(4, dto.getBuyingPrice());
        stm.setObject(5, dto.getSellingPrice());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public boolean delete(BatchDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BatchDTO search(BatchDTO dto) throws Exception {
        String SQL = "Select * from Batch";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            BatchDTO batchDTO = new BatchDTO();
            batchDTO.setSoId(rst.getString(1));
            batchDTO.setBid(rst.getString(2));
            batchDTO.setItemCode(rst.getString(3));
            batchDTO.setQty(rst.getInt(4));
            batchDTO.setBuyingPrice(rst.getDouble(5));
            batchDTO.setSellingPrice(rst.getDouble(6));

            return batchDTO;
        }
        return null;
    }

    @Override
    public ArrayList<BatchDTO> getAll() throws Exception {
        String SQL = "Select * from Batch";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ArrayList<BatchDTO> batchList = new ArrayList<>();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            BatchDTO batchDTO = new BatchDTO();
            batchDTO.setSoId(rst.getString(1));
            batchDTO.setBid(rst.getString(2));
            batchDTO.setItemCode(rst.getString(3));
            batchDTO.setQty(rst.getInt(4));
            batchDTO.setBuyingPrice(rst.getDouble(5));
            batchDTO.setSellingPrice(rst.getDouble(6));

            batchList.add(batchDTO);
        }
        return batchList;
    }

//   /* @Override
//    public ArrayList<BatchDTO> getBatchId(BatchDTO dto) throws Exception {
//        String SQL="Select * from bId WHERE itemCode=?";
//        Connection connection=DBConnection.getInstance().getConnection();
//        PreparedStatement stm=connection.prepareStatement(SQL);
//        stm.setObject(1,dto.getItemCode());
//        ArrayList<BatchDTO> itemList=new ArrayList<>();
//        ResultSet rst=stm.executeQuery();
//        while(rst.next()){
//            BatchDTO batchDTO=new BatchDTO();
//            batchDTO.s
//        }
//        
//                
//    }
    @Override
    public ArrayList<BatchDTO> getBatchId(String code) throws Exception {
        String SQL = "Select bId from Batch  WHERE itemCode='" + code + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ArrayList<BatchDTO> itemList = new ArrayList<>();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            BatchDTO batchDTO = new BatchDTO();
            batchDTO.setBid(rst.getString(1));
            itemList.add(batchDTO);
        }
        return itemList;
    }

//    @Override
//    public ArrayList<BatchDTO> getBatchId(BatchDAO batchDAO) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    @Override
    public BatchDTO searchBatchDetails(String batch) throws SQLException {
        String SQL = "Select * from Batch where bId='" + batch + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        System.out.println(batch+"AAAA");
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            BatchDTO batchDTO = new BatchDTO();
            batchDTO.setSoId(rst.getString(1));
            batchDTO.setBid(rst.getString(2));
            batchDTO.setItemCode(rst.getString(3));
            batchDTO.setQty(rst.getInt(4));
            batchDTO.setBuyingPrice(rst.getDouble(5));
            batchDTO.setSellingPrice(rst.getDouble(6));
            
            
            return batchDTO;
        }
        return null;
    }

    @Override
    public boolean addBatch(String batchId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateDesc(BatchDTO batchDTO) throws SQLException {
        String SQL = "Update Batch set soId=?,bId=?,itemCode=?,qty-=?,buyingPrice=?,sellingPrice=? where bId='"+batchDTO.getBid()+"'";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, batchDTO.getSoId());
        stm.setObject(2,batchDTO.getBid());
        stm.setObject(3,batchDTO.getItemCode());
        stm.setObject(4,batchDTO.getQty());
        stm.setObject(5,batchDTO.getBuyingPrice());
        stm.setObject(6,batchDTO.getSellingPrice());
        int res=stm.executeUpdate();
        return res>0;
    }

    @Override
    public ArrayList<BatchDTO> getBatch(String batch) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateBatchQty(BatchDTO batchDTO) throws SQLException {
        
        Connection connection=DBConnection.getInstance().getConnection();
        String SQL="Update Batch set qty=qty-"+batchDTO.getQty()+" where bId='"+batchDTO.getBid()+"'";
        Statement stm=connection.createStatement();
        int res=stm.executeUpdate(SQL);
        return res>0;
    }

    @Override
    public ArrayList<BatchDTO> getBatchList(String supOrderId) throws SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        String SQL="Select bId from Batch WHERE soId='"+supOrderId+"'";
        Statement stm=connection.createStatement();
        ArrayList<BatchDTO> batchList=new ArrayList<>();
        ResultSet rst=stm.executeQuery(SQL);
        while(rst.next()){
            BatchDTO batchDTO=new BatchDTO();
            batchDTO.setBid(rst.getString(1));
            batchList.add(batchDTO);
        }
        return batchList;
    }

    @Override
    public ArrayList<BatchDTO> getBatchList() throws Exception {
        String SQL="Select * from Batch";
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<BatchDTO> batchList=new ArrayList<>();
        while(rst.next()){
           BatchDTO batchDTO=new BatchDTO();
           batchDTO.setSoId(rst.getString(1));
           batchDTO.setBid(rst.getString(2));
           batchDTO.setItemCode(rst.getString(3));
           batchDTO.setQty(rst.getInt(4));
           batchDTO.setBuyingPrice(rst.getDouble(5));
           batchDTO.setSellingPrice(rst.getDouble(6));
           batchList.add(batchDTO);
        }
        return batchList;
    }

}