/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.BatchDTO;
import lk.ijse.phoneshop.core.dto.SupplierOrderDTO;
import lk.ijse.phoneshop.core.dto.SupplierOrderDetailDTO;
import lk.ijse.phoneshop.core.dto.SupplierPaymentDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.BatchDAO;
import lk.ijse.phoneshop.dao.custom.SupplierOrderDAO;
import lk.ijse.phoneshop.dao.custom.SupplierOrderDetailDAO;
import lk.ijse.phoneshop.dao.custom.SupplierPaymentDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class SupplierOrderDetailController {

    public static SupplierOrderDetailDAO supplierOrderDetailDAO = (SupplierOrderDetailDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIERORDERDETAIL);
    public static SupplierOrderDAO supplierOrderDAO = (SupplierOrderDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIERORDER);
    public static BatchDAO batchDAO = (BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BATCH);
    public static SupplierPaymentDAO supplierPaymentDAO = (SupplierPaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIERPAYMENT);

    public static boolean addSuplierOrderDetail(SupplierOrderDetailDTO supplierOrderDetailDTO) throws Exception {
        boolean result = supplierOrderDetailDAO.add(supplierOrderDetailDTO);
        return result;
    }

    public static boolean deleteSupplierOrderDetail(SupplierOrderDetailDTO supplierOrderDetailDTO) throws Exception {
        boolean result = supplierOrderDetailDAO.delete(supplierOrderDetailDTO);
        return result;
    }

    public static boolean updateSupplierOrderDetail(SupplierOrderDetailDTO supplierOrderDetailDTO) throws Exception {
        boolean result = supplierOrderDetailDAO.delete(supplierOrderDetailDTO);
        return result;
    }

    public static SupplierOrderDetailDTO searchSupplierOrderDetail(SupplierOrderDetailDTO supplierOrderDetailDTO) throws Exception {
        SupplierOrderDetailDTO result = supplierOrderDetailDAO.search(supplierOrderDetailDTO);
        return result;
    }

    public static ArrayList<SupplierOrderDetailDTO> getSupplierOrderList(SupplierOrderDetailDTO supplierOrderDetailDTO) throws Exception {
        ArrayList<SupplierOrderDetailDTO> getOrderDetail = supplierOrderDetailDAO.getAll();
        return getOrderDetail;

    }

//    public static boolean addDetail(SupplierOrderDTO supplierOrderDTO, BatchDTO batchDTO, ArrayList<SupplierOrderDetailDTO> supOrder, SupplierPaymentDTO supplierPaymentDTO) throws SQLException, Exception  {
//        Connection connection = DBConnection.getInstance().getConnection();
//        connection.setAutoCommit(false);
//        boolean result = supplierOrderDAO.add(supplierOrderDTO);
//        if (result) {
//            result = batchDAO.add(batchDTO);
//            if (result) {
//                for (SupplierOrderDetailDTO supplierOrderDetailDTO : supOrder) {
//                    result = supplierOrderDAO.add(supplierOrderDTO);
//                    if (result) {
//                        result = supplierPaymentDAO.add(supplierPaymentDTO);
//                        if (!result) {
//                            connection.rollback();
//                            connection.setAutoCommit(true);
//                            return false;
//                        }
//
//                    }
//                    
//                }
//                
//            }
//            connection.setAutoCommit(true);
//                return true;
//
//        } else {
//            connection.setAutoCommit(true);
//            return false;
//        }
//
//    }
    public static boolean addDetails(SupplierOrderDTO supplierOrderDTO, ArrayList<SupplierOrderDetailDTO> supOrder, SupplierPaymentDTO supplierPaymentDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        boolean result = supplierOrderDAO.add(supplierOrderDTO);
        System.out.println("result1" + result);
        if (result) {

            result = supplierPaymentDAO.add(supplierPaymentDTO);
            System.out.println("result3" + result);
            if (!result) {
                connection.rollback();
                connection.setAutoCommit(true);
                return false;
            }

            connection.setAutoCommit(true);
            return true;

        } else {
            connection.setAutoCommit(true);
            return false;
        }

    }

    public static ArrayList<BatchDTO> getOrderDetail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static ArrayList<SupplierOrderDetailDTO> getSupplierOrderList() throws SQLException {
        String SQL="Select date,uid,s1.soId,bId,itemCode,qty,buyingPrice,sellingPrice From supOrder s1,batch b1 WHERE s1.soId=b1.soId";
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<SupplierOrderDetailDTO> getOrders=new ArrayList<>();
        while(rst.next()){
            SupplierOrderDetailDTO supplierOrderDetailDTO=new SupplierOrderDetailDTO();
            supplierOrderDetailDTO.setDate(rst.getString(1));
            supplierOrderDetailDTO.setUserId(rst.getString(2));
            supplierOrderDetailDTO.setSupOrderId(rst.getString(3));
            supplierOrderDetailDTO.setBatchId(rst.getString(4));
            supplierOrderDetailDTO.setItemCode(rst.getString(5));
            supplierOrderDetailDTO.setQty(rst.getInt(6));
            supplierOrderDetailDTO.setBuyingPrice(rst.getDouble(7));
            supplierOrderDetailDTO.setSellingPrice(rst.getDouble(8));
            getOrders.add(supplierOrderDetailDTO);
        }
        return getOrders;
    }

}
