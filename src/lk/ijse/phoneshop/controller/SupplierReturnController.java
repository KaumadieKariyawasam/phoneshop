/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.SupplierReturnDTO;
import lk.ijse.phoneshop.core.dto.ViewSupReturnDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.SupplierReturnDAO;
import lk.ijse.phoneshop.dao.custom.ViewSupReturnDAO;

/**
 *
 * @author HP
 */
public class SupplierReturnController {
    public static SupplierReturnDAO supplierReturnDAO=(SupplierReturnDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIERRETURN);
    public static ViewSupReturnDAO viewSupReturnDAO=(ViewSupReturnDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.VIEWSUPRETURN);
    public static boolean addSupplierReturn(SupplierReturnDTO supplierReturnDTO) throws Exception {
        boolean result=supplierReturnDAO.add(supplierReturnDTO);
        return result;
    }

    

    public static ArrayList<ViewSupReturnDTO> getAllReturn() throws Exception{
        ArrayList<ViewSupReturnDTO> getReturn=viewSupReturnDAO.getAllReturn();
        return getReturn;
    }
}
