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
import lk.ijse.phoneshop.core.dto.CustomerOrderDTO;
import lk.ijse.phoneshop.core.dto.ViewCustomerOrderDTO;
import lk.ijse.phoneshop.dao.custom.CustomerOrderDAO;
import lk.ijse.phoneshop.dao.custom.ViewCustomerOrderDetailDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class ViewCustomerOrderDAOimpl implements ViewCustomerOrderDetailDAO{

    @Override
    public ArrayList<ViewCustomerOrderDTO> getAllDetail() throws SQLException {
        String SQL="Select date,uid,c1.coID,bId,qty,Amount From customerorder c1,custOrderDetail c2 WHERE c1.coID=c2.coID";
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<ViewCustomerOrderDTO> orderList=new ArrayList<>();
        while(rst.next()){
            ViewCustomerOrderDTO viewCustomerOrderDTO=new ViewCustomerOrderDTO();
            viewCustomerOrderDTO.setDate(rst.getString(1));
            viewCustomerOrderDTO.setUserId(rst.getString(2));
            viewCustomerOrderDTO.setCoId(rst.getString(3));
            viewCustomerOrderDTO.setBatchId(rst.getString(4));
            viewCustomerOrderDTO.setQty(rst.getInt(5));
            viewCustomerOrderDTO.setAmount(rst.getDouble(6));
            orderList.add(viewCustomerOrderDTO);
        }
        return orderList;
    }

    @Override
    public boolean add(ViewCustomerOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ViewCustomerOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ViewCustomerOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ViewCustomerOrderDTO search(ViewCustomerOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ViewCustomerOrderDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
