/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.EmployeeDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.EmployeeDAO;
import lk.ijse.phoneshop.dao.custom.SupplierOrderDetailDAO;

/**
 *
 * @author HP
 */
public class EmployeeController {
    public static EmployeeDAO employeeDAO=(EmployeeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.EMPLOYEE);
   
    public static boolean addEmployee(EmployeeDTO employeeDTO) throws Exception{
        boolean result=employeeDAO.add(employeeDTO);
        return result;
    }
    public static EmployeeDTO searchEmployee(EmployeeDTO employeeDTO) throws Exception{
        EmployeeDTO resulTO=employeeDAO.search(employeeDTO);
        return resulTO;
    }
    
    public static boolean updateEmployee(EmployeeDTO employeeDTO) throws Exception{
        boolean result=employeeDAO.update(employeeDTO);
        return result;
        
    }
    public static boolean deleteEmployee(EmployeeDTO employeeDTO) throws Exception{
        boolean result=employeeDAO.delete(employeeDTO);
        return result;
    }
    public static ArrayList<EmployeeDTO> viewEmployee() throws Exception{
        ArrayList<EmployeeDTO> employeeList=employeeDAO.getAll();
        return  employeeList;
    }
}
