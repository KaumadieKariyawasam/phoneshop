/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.CustomerPaymentDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.CustomerPaymetDAO;

/**
 *
 * @author HP
 */
public class CustomerPaymentController {
    public static CustomerPaymetDAO customerPaymetDAO=(CustomerPaymetDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMERPAYMENT);

    public static ArrayList<CustomerPaymentDTO> getAllPayment() throws Exception {
        ArrayList<CustomerPaymentDTO> getPayment=customerPaymetDAO.getAll();
        return getPayment;
    }
}
