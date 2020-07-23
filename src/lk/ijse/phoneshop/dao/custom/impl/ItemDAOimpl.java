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
import lk.ijse.phoneshop.core.dto.ItemDTO;
import lk.ijse.phoneshop.dao.SuperDAO;
import lk.ijse.phoneshop.dao.custom.ItemDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class ItemDAOimpl implements ItemDAO {

    @Override
    public boolean add(ItemDTO dto) throws Exception {
        String SQL = "Insert into Item Values(?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getItemCode());
        stm.setObject(2, dto.getItemName());
        stm.setObject(3, dto.getQtyOnHand());

        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(ItemDTO dto) throws Exception {
        String SQL = "Update Item set itemName=?,qtyOnHand=? where itemCode=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getItemName());
        stm.setObject(2, dto.getQtyOnHand());
        stm.setObject(3, dto.getItemCode());

        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(ItemDTO dto) throws Exception {
        String SQL = "Delete from Item where itemCode=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getItemCode());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public ItemDTO search(ItemDTO dto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Select * from Item WHERE itemName='" + dto.getItemName() + "'";
        //String sql = "SELECT itemCode,itemName,qtyOnHand,bid FROM Item i1,Batch b1 WHERE itemCode='" + dto.getItemCode() + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);

        if (rst.next()) {
            return new ItemDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getInt(3)
            );
        }
        System.out.println("AAAA" + stm);
        return null;
    }

    @Override
    public ArrayList<ItemDTO> getAll() throws Exception {
        String SQL = "Select * from item";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ArrayList<ItemDTO> itemList = new ArrayList<>();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            ItemDTO itemDTO = new ItemDTO();
            itemDTO.setItemCode(rst.getString(1));
            itemDTO.setItemName(rst.getString(2));
            itemDTO.setQtyOnHand(rst.getInt(3));
            itemList.add(itemDTO);
        }
        return itemList;
    }

//    @Override
//    public boolean updateQuantity(String code) {
//        String SQL="Update Item set qtyOnHand=? where itemCode=?";
//        Connection connection=DBConnection.getInstance().getConnection();
//        Statement stm=connection.createStatement();
//        int res=stm.executeUpdate(SQL);
//        return res>0;
//    }
    @Override
    public boolean updateQuantity(String code) throws SQLException {
        String SQL = "Update Item set qtyOnHand=? where itemCode=?";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        int res = stm.executeUpdate(SQL);
        return res > 0;
    }

    @Override
    public int searchCode(String code) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Select qtyOnHand from ItemDTO WHERE itemCode='" + code + "'";
        Statement stm = connection.createStatement();
        ResultSet result = stm.executeQuery(SQL);
        if (result.next()) {
            return result.getInt(3);
        }
        return 0;
    }

    @Override
    public ArrayList<ItemDTO> getItem(String code) throws SQLException {
        String SQL = "Select qtyOnHand from item where itemCode='" + code + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ArrayList<ItemDTO> itemList = new ArrayList<>();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            ItemDTO itemDTO = new ItemDTO();
            itemDTO.setQtyOnHand(rst.getInt(1));

            itemList.add(itemDTO);
        }
        return itemList;
    }

    @Override
    public boolean getAllItem(Object[] ob) throws Exception {
        String SQL = "Update Item set qtyOnHand='" + ob[0] + "' where itemCode='" + ob[1] + "'";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        int res = stm.executeUpdate(SQL);
        return res > 0;
    }

    @Override
    public ItemDTO search(String itemCode) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Select * from Item WHERE itemCode='" + itemCode + "'";
        System.out.println("AB" + itemCode);
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            ItemDTO itemDTO = new ItemDTO();
            itemDTO.setItemCode(rst.getString(1));
            itemDTO.setItemName(rst.getString(2));
            itemDTO.setQtyOnHand(rst.getInt(3));
            System.out.println("bbb" + itemDTO.getItemName());
            System.out.println("bbb" + itemDTO.getQtyOnHand());
            return itemDTO;
        }
        System.out.println("items" + stm);
        return null;

    }

}
