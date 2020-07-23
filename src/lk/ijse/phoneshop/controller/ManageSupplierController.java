/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.CustomerDTO;
import lk.ijse.phoneshop.core.dto.SupplierDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.CustomerDAO;
import lk.ijse.phoneshop.dao.custom.SupplierDAO;

/**
 *
 * @author HP
 */
public class ManageSupplierController {
    public static SupplierDAO supplierDAO=(SupplierDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIER);
   
    public static boolean addSupplier(SupplierDTO supplierDTO) throws Exception{
        boolean result=supplierDAO.add(supplierDTO);
        return result;
       
    }
    public static boolean deleteSupplier(SupplierDTO supplierDTO) throws Exception{
        boolean result=supplierDAO.delete(supplierDTO);
        return result;
    }
    public static boolean updateSupplier(SupplierDTO supplierDTO) throws Exception{
        boolean result=supplierDAO.update(supplierDTO);
        return result;
    }
    public static SupplierDTO searchSupplier(SupplierDTO supplierDTO) throws Exception{
        SupplierDTO result=supplierDAO.search(supplierDTO);
        return result;
    }
    public static ArrayList<SupplierDTO> getAllSupplier() throws Exception{
        ArrayList<SupplierDTO> getAllSupplier=supplierDAO.getAll();
        return getAllSupplier;
    }

    public static boolean deleteSupplier(String nic) throws Exception{
        boolean result=supplierDAO.deleteSupplier(nic);
        return result;
    }
    
}
