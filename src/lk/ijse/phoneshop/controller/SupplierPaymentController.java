/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.SupplierPaymentDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.SupplierOrderDetailDAO;
import lk.ijse.phoneshop.dao.custom.SupplierPaymentDAO;

/**
 *
 * @author HP
 */
public class SupplierPaymentController {
    public static SupplierPaymentDAO supplierPaymentDAO=(SupplierPaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIERPAYMENT);

    public static ArrayList<SupplierPaymentDTO> getSupplierPayment() throws Exception{
        ArrayList<SupplierPaymentDTO> getAll=supplierPaymentDAO.getSupplierPayment();
        return getAll;
    }
}
