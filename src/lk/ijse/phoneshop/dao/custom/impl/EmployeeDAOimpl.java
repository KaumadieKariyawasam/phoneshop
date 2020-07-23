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
import lk.ijse.phoneshop.core.dto.CustomerDTO;
import lk.ijse.phoneshop.core.dto.EmployeeDTO;
import lk.ijse.phoneshop.dao.custom.EmployeeDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class EmployeeDAOimpl implements EmployeeDAO{

    @Override
    public boolean add(EmployeeDTO dto) throws Exception {
         String SQL = "Insert into Employees Values(?,?,?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getEmp_Nic());
        stm.setObject(2, dto.getEmp_Name());
        stm.setObject(3, dto.getPost());
        stm.setObject(4, dto.getSalary());
        stm.setObject(5, dto.getTele());
        stm.setObject(6,dto.getAddress());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(EmployeeDTO dto) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String SQL="Update Employees set emp_Name=?,post=?,salary=?,tele=?,address=? WHERE emp_Nic=?";
        PreparedStatement stm=connection.prepareStatement(SQL);
        
        stm.setObject(6,dto.getEmp_Nic());
        stm.setObject(1,dto.getEmp_Name());
        stm.setObject(2,dto.getPost());
        stm.setObject(3,dto.getSalary());
        stm.setObject(4,dto.getTele());
        stm.setObject(5,dto.getAddress());
        int res=stm.executeUpdate();
        return res>0;
    }

    @Override
    public boolean delete(EmployeeDTO dto) throws Exception {
        String SQL = "Delete from Employees where emp_Nic=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(SQL);
        stm.setObject(1, dto.getEmp_Nic());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public EmployeeDTO search(EmployeeDTO dto) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String SQL="Select * from Employees where emp_Nic='"+dto.getEmp_Nic()+"'";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        if(rst.next()){
            return new EmployeeDTO(
                 rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getString(5),
                    rst.getString(6)
            );
        }
        return null;
        
    }

    @Override
    public ArrayList<EmployeeDTO> getAll() throws Exception {
        String SQL = "Select * from Employees";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ArrayList<EmployeeDTO> employeeList = new ArrayList<>();
        ResultSet rst = stm.executeQuery(SQL);
        while (rst.next()) {
            EmployeeDTO employeeDTO=new EmployeeDTO();
            employeeDTO.setEmp_Nic(rst.getString(1));
            employeeDTO.setEmp_Name(rst.getString(2));
            employeeDTO.setPost(rst.getString(3));
            employeeDTO.setSalary(rst.getDouble(4));
            employeeDTO.setTele(rst.getString(5));
            employeeDTO.setAddress(rst.getString(6));
            employeeList.add(employeeDTO);
        }
        return employeeList;
    }
    
}
