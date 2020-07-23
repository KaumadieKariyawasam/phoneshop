/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.SupplierOrderDTO;
import lk.ijse.phoneshop.core.dto.SupplierOrderDetailDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.SupplierOrderDAO;
import lk.ijse.phoneshop.dao.custom.SupplierOrderDetailDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class SupplierOrderController {
  public static SupplierOrderDAO supplierOrderDAO=(SupplierOrderDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIERORDER);
  public static SupplierOrderDetailDAO supplierOrderDetailDAO=(SupplierOrderDetailDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIERORDERDETAIL);

    public static boolean updateSupplierOrder(SupplierOrderDTO supplierOrderDTO) throws Exception{
        boolean result=supplierOrderDAO.update(supplierOrderDTO);
        return result;
    
    }
    public static boolean deleteSupplierOrder(SupplierOrderDTO supplierOrderDTO) throws Exception{
        boolean result=supplierOrderDAO.delete(supplierOrderDTO);
        return result;
    }
    public static SupplierOrderDTO searchSupplierOrder(SupplierOrderDTO supplierOrderDTO) throws Exception{
        SupplierOrderDTO result=supplierOrderDAO.search(supplierOrderDTO);
        return result;
    }
    
    public static ArrayList<SupplierOrderDTO> getAllOrder(SupplierOrderDTO supplierOrderDTO) throws Exception{
        ArrayList<SupplierOrderDTO> orderList=supplierOrderDAO.getAll();
        return orderList;
    }

    public static ArrayList<SupplierOrderDTO> getSupOrder() throws Exception{
        ArrayList<SupplierOrderDTO> getAll=supplierOrderDAO.getSupOrder();
        return getAll;
    }
}
