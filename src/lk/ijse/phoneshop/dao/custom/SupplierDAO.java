/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.dao.custom;

import lk.ijse.phoneshop.core.dto.SupplierDTO;
import lk.ijse.phoneshop.dao.SuperDAO;

/**
 *
 * @author HP
 */
public interface SupplierDAO extends SuperDAO<SupplierDTO>{

    public boolean deleteSupplier(String nic)throws Exception;
    
}
