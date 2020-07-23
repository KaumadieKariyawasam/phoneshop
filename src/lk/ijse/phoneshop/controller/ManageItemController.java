/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

import java.sql.Connection;
import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.BatchDTO;
import lk.ijse.phoneshop.core.dto.ItemDTO;
import lk.ijse.phoneshop.core.dto.ItemFormDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.BatchDAO;
import lk.ijse.phoneshop.dao.custom.ItemDAO;
import lk.ijse.phoneshop.dao.custom.ItemFormDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class ManageItemController {

    public static ItemDAO itemDAO = (ItemDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEM);
    public static BatchDAO batchDAO = (BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BATCH);
    public static ItemFormDAO itemFormDAO = (ItemFormDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ITEMFORM);

    public static boolean addItem(ItemDTO itemDTO) throws Exception {
        boolean result = itemDAO.add(itemDTO);
        return result;
    }

    public static boolean deleteItem(ItemDTO itemDTO) throws Exception {
        boolean result = itemDAO.delete(itemDTO);
        return result;
    }

    public static boolean updateItem(ItemDTO itemDTO) throws Exception {
        boolean result = itemDAO.update(itemDTO);
        return result;
    }

    public static ItemDTO searchItem(ItemDTO itemDTO) throws Exception {
        ItemDTO itemSearch = itemDAO.search(itemDTO);
        return itemSearch;

    }

    public static ArrayList<ItemDTO> getAllItem() throws Exception {
        ArrayList<ItemDTO> getAllItem = itemDAO.getAll();
        return getAllItem;
    }

    public static boolean addItem(ItemDTO itemDTO, BatchDTO batchDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            boolean result = itemDAO.add(itemDTO);
            if (result) {
                result = batchDAO.add(batchDTO);
                if (!result) {
                    connection.rollback();
                    return false;
                }
                return true;
            } else {
                return false;
            }
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public static ItemFormDTO searchItem(ItemFormDTO itemFormDTO) throws Exception {
        ItemFormDTO result = itemFormDAO.search(itemFormDTO);
        return result;

    }

//    public static boolean update(String code) {
//      boolean isdata=ManageItemController.itemDAO.update(code);
//      return isdata;
//    }
    public static boolean updateQuantity(String code) throws Exception {
        boolean isdata = ManageItemController.itemDAO.updateQuantity(code);
        return isdata;
    }

    public static int searchQuamtity(String code) throws Exception {
        int search = ManageItemController.itemDAO.searchCode(code);
        return search;
    }

    public static ArrayList<ItemDTO> serchItemsQuantity(String code) throws Exception {
        ArrayList<ItemDTO> searcgItemQty = ManageItemController.itemDAO.getItem(code);
        return searcgItemQty;
    }

    public static boolean updateQt(Object[] ob) throws Exception {
        boolean searchItemQty = ManageItemController.itemDAO.getAllItem(ob);
        return searchItemQty;
    }

    public static ItemDTO searchItem(String itemCode) throws Exception {
        ItemDTO itemSearch = itemDAO.search(itemCode);
        return itemSearch;
    }

    public static ItemFormDTO searchBatch(ItemFormDTO itemFormDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static ArrayList<ItemFormDTO> getBatch() throws Exception {
        ArrayList<ItemFormDTO> getAll = itemFormDAO.getAll();
        return getAll;
    }

}
