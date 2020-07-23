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
import lk.ijse.phoneshop.core.dto.CustomerOrderDTO;
import lk.ijse.phoneshop.dao.custom.CustomerOrderDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class CustomerOrderDAOimpl implements CustomerOrderDAO{

    @Override
    public boolean add(CustomerOrderDTO dto) throws Exception {
        String SQL="Insert into CustomerOrder Values(?,?,?,?)";
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(SQL);
        stm.setObject(1,dto.getCusOrderId());
        stm.setObject(2,dto.getCustomerNic());
        stm.setObject(3,dto.getUserId());
        stm.setObject(4,dto.getDate());
        int res=stm.executeUpdate();
        return res>0;
    }

    @Override
    public boolean update(CustomerOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(CustomerOrderDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerOrderDTO search(CustomerOrderDTO dto) throws Exception {
        String SQL="Select * from customerOrder WHERE coId='"+dto.getCusOrderId()+"'";
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        if(rst.next()){
            return new CustomerOrderDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
                    
            );
        }
        return null;
    }

    @Override
    public ArrayList<CustomerOrderDTO> getAll() throws Exception{
       String SQL="Select * FROM CustomerOrder";
       Connection connection=DBConnection.getInstance().getConnection();
       Statement stm=connection.createStatement();
       ArrayList<CustomerOrderDTO> getOrder=new ArrayList<>();
       ResultSet rst=stm.executeQuery(SQL);
       while(rst.next()){
           CustomerOrderDTO customerOrderDTO=new CustomerOrderDTO();
           customerOrderDTO.setCusOrderId(rst.getString(1));
           customerOrderDTO.setCustomerNic(rst.getString(2));
           customerOrderDTO.setUserId(rst.getString(3));
           customerOrderDTO.setDate(rst.getString(4));
           getOrder.add(customerOrderDTO);
       }
       return getOrder;
    }
    
}
