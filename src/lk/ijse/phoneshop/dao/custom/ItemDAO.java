/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.dao.custom;

import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.ItemDTO;
import lk.ijse.phoneshop.core.dto.ItemFormDTO;
import lk.ijse.phoneshop.dao.SuperDAO;

/**
 *
 * @author HP
 */
public interface ItemDAO extends SuperDAO<ItemDTO>{

    public boolean updateQuantity(String code)throws Exception;

    public int searchCode(String code)throws Exception;

    public ArrayList<ItemDTO> getItem(String code)throws Exception;

    

    public boolean getAllItem(Object[] ob) throws Exception;

    public ItemDTO search(String itemCode)throws Exception;
    
    
}
