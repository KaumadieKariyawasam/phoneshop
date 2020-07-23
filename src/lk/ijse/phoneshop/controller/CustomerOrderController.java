/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.CustomerOrderDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.CustomerOrderDAO;

/**
 *
 * @author HP
 */
public class CustomerOrderController {
   public static CustomerOrderDAO customerOrderDAO=(CustomerOrderDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMERORDER);
    
    
    public static CustomerOrderDTO searchCustomer(CustomerOrderDTO customerOrderDTO) throws Exception {
        CustomerOrderDTO result=customerOrderDAO.search(customerOrderDTO);
        return result;
        
    }

    public static ArrayList<CustomerOrderDTO> getAllOrder() throws Exception {
        ArrayList<CustomerOrderDTO> getDetail=customerOrderDAO.getAll();
        return getDetail;
    }
    
}
