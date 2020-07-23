/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.dao.custom.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.ItemFormDTO;
import lk.ijse.phoneshop.core.dto.SupplierDTO;
import lk.ijse.phoneshop.dao.custom.ItemFormDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class ItemFormDAOimpl implements ItemFormDAO{

    @Override
    public boolean add(ItemFormDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ItemFormDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ItemFormDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ItemFormDTO search(ItemFormDTO dto) throws Exception {
        String SQL="Select itemCode,itemName,qtyOnHand From Item WHERE itemCode='"+dto.getItemCode()+"'";
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        if(rst.next()){
            return new ItemFormDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getInt(3)
                    
            );
        }
        return null;
    }

    @Override
    public ArrayList<ItemFormDTO> getAll() throws Exception {
        String SQL="Select b1.itemCode,itemName,qty,bId From Item i1,Batch b1 WHERE i1.itemCode=b1.itemCode";
         Connection connection=DBConnection.getInstance().getConnection();
         Statement stm=connection.createStatement();
         ArrayList<ItemFormDTO> batchList=new ArrayList<>();
         ResultSet rst=stm.executeQuery(SQL);
         while(rst.next()){
             ItemFormDTO itemFormDTO=new ItemFormDTO();
            itemFormDTO.setItemCode(rst.getString(1));
            itemFormDTO.setItemName(rst.getString(2));
            itemFormDTO.setQtyOnHand(rst.getInt(3));
            itemFormDTO.setBatchId(rst.getString(4));
            batchList.add(itemFormDTO);
         }
         return batchList;
    }
    
}
