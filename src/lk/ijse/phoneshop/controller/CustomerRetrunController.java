/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

import java.util.ArrayList;
import static lk.ijse.phoneshop.controller.ManageCustomerController.customerDAO;
import lk.ijse.phoneshop.core.dto.CustomerReturnDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.BatchDAO;
import lk.ijse.phoneshop.dao.custom.CustomerReturnDAO;
import lk.ijse.phoneshop.dao.custom.impl.CustomerReturnDAOimpl;

/**
 *
 * @author HP
 */
public class CustomerRetrunController {
    public static CustomerReturnDAO customerReturnDAO=(CustomerReturnDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMERRETURN);

    public static boolean addRetuenItem(CustomerReturnDTO customerReturnDTO) throws Exception {
       boolean result=customerReturnDAO.add(customerReturnDTO);
       return result;
    }

    public static ArrayList<CustomerReturnDTO> getAllReturn() throws Exception {
        ArrayList<CustomerReturnDTO> getAllReturn=customerReturnDAO.getAll();
        return getAllReturn;
    }
   
    
}
