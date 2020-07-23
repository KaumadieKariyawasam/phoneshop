/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.dao.custom;

import java.util.ArrayList;
import lk.ijse.phoneshop.core.dto.ViewSupReturnDTO;
import lk.ijse.phoneshop.dao.SuperDAO;

/**
 *
 * @author HP
 */
public interface ViewSupReturnDAO extends SuperDAO<ViewSupReturnDTO>{

    public ArrayList<ViewSupReturnDTO> getAllReturn() throws Exception;
    
}
