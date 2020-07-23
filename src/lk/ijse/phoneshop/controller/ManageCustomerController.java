/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.CustomerDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.CustomerDAO;

/**
 *
 * @author HP
 */
public class ManageCustomerController {

    /**
     *
     */
   public static CustomerDAO customerDAO=(CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    
   
   public static boolean addCustomer(CustomerDTO customerDTO) throws Exception{
       boolean result=customerDAO.add(customerDTO);
       return result;
   }
   
   public static boolean deleteCustomer(CustomerDTO customerDTO) throws Exception{
       boolean result=customerDAO.delete(customerDTO);
       return result;
   }
   public static boolean updateCustomer(CustomerDTO customerDTO) throws Exception{
       boolean result=customerDAO.update(customerDTO);
       return result;
   }
   public static CustomerDTO searchCustomer(CustomerDTO customerDTO) throws Exception{
       CustomerDTO searchCustomer=customerDAO.search(customerDTO);
       return searchCustomer;
   }
   public static ArrayList<CustomerDTO> getAllCustomers()throws Exception{
        return customerDAO.getAll();
    }

    public static boolean deleteCustomer(String nic) throws Exception{
        boolean deleteCustoer=customerDAO.deleteCustomer(nic);
         return deleteCustoer;
                
    }
}
