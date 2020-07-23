/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.dao.custom;

import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.SupplierPaymentDTO;
import lk.ijse.phoneshop.dao.SuperDAO;

/**
 *
 * @author HP
 */
public interface SupplierPaymentDAO extends SuperDAO<SupplierPaymentDTO>{

    public ArrayList<SupplierPaymentDTO> getSupplierPayment()throws Exception;
    
}
