/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.dao.custom;

import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.BatchDTO;
import lk.ijse.phoneshop.dao.SuperDAO;

/**
 *
 * @author HP
 */
public interface BatchDAO extends SuperDAO<BatchDTO>{

    public ArrayList<BatchDTO> getBatchId(String code)throws Exception;

   // public ArrayList<BatchDTO> getBatchId(BatchDAO batchDAO);

    public BatchDTO searchBatchDetails(String batch)throws Exception;

    public boolean addBatch(String batchId)throws Exception;

    public boolean updateDesc(BatchDTO batchDTO) throws Exception;

    public ArrayList<BatchDTO> getBatch(String batch)throws Exception;

    public boolean updateBatchQty(BatchDTO batchDTO)throws Exception;

    public ArrayList<BatchDTO> getBatchList(String supOrderId) throws Exception;

    public ArrayList<BatchDTO> getBatchList() throws Exception;
    
}
