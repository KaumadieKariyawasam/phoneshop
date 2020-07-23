/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.dao.custom;

import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.SupplierOrderDTO;
import lk.ijse.phoneshop.dao.SuperDAO;

/**
 *
 * @author HP
 */
public interface SupplierOrderDAO extends SuperDAO<SupplierOrderDTO>{

    public ArrayList<SupplierOrderDTO> getSupOrder()throws Exception;

    //public static boolean addSupplierOrder(SupplierOrderDTO supplierOrderDTO);
    
}
