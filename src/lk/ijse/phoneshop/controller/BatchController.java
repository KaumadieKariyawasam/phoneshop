/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

import java.util.ArrayList;
import static lk.ijse.phoneshop.controller.EmployeeController.employeeDAO;
import lk.ijse.phoneshop.core.dto.BatchDTO;
import lk.ijse.phoneshop.core.dto.EmployeeDTO;
import lk.ijse.phoneshop.core.dto.ItemDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.BatchDAO;

/**
 *
 * @author HP
 */
public class BatchController {
    // public static EmployeeDAO employeeDAO=(EmployeeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Employee);
    public static BatchDAO batchDAO=(BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BATCH);
    public static boolean addBatch(BatchDTO batchDTO) throws Exception{
        boolean result=batchDAO.add(batchDTO);
        return result;
    }
    public static BatchDTO searchBatch(BatchDTO batchDTO) throws Exception{
        BatchDTO result=batchDAO.search(batchDTO);
        return result;
    }
    
    public static boolean updateBatch(BatchDTO batchDTO) throws Exception{
        boolean result=batchDAO.add(batchDTO);
        return result;
        
    }
    public static boolean deleteBatch(BatchDTO batchDTO) throws Exception{
        boolean result=batchDAO.delete(batchDTO);
        return result;
    }
    public static ArrayList<BatchDTO> viewBatch() throws Exception{
        ArrayList<BatchDTO> batchList=batchDAO.getAll();
        return  batchList;
    }

    public static ArrayList<BatchDTO> searchBatchId(String code) throws Exception {
        ArrayList<BatchDTO> batchList=batchDAO.getBatchId(code);
        return batchList;
    }

   

    public static BatchDTO searchBatchDetails(String batch) throws Exception {
        BatchDTO batchDTO=batchDAO.searchBatchDetails(batch);
        return batchDTO;
    }

    public static boolean updateBatch(String batchId) throws Exception {
         boolean result=batchDAO.addBatch(batchId);
        return result;
    }

    public static boolean update(BatchDTO batchDTO)throws Exception{
         boolean result=batchDAO.update(batchDTO);
        return result;
    }

    public static boolean updateDesc(BatchDTO batchDTO) throws Exception{
         boolean result=batchDAO.updateDesc(batchDTO);
         return result;
    }

    public static int searchQuantity(String batch) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean updateBatchQty(BatchDTO batchDTO) throws Exception{
        boolean result=batchDAO.updateBatchQty(batchDTO);
         return result;
    }

    public static ArrayList<BatchDTO> getBatchList(String supOrderId) throws Exception{
        ArrayList<BatchDTO> getBatch=batchDAO.getBatchList(supOrderId);
        return getBatch;
    }

    public static ArrayList<BatchDTO> getBatchList() throws Exception{
        ArrayList<BatchDTO> getBatchDetail=batchDAO.getBatchList();
        return getBatchDetail;
    }

    
    
}
