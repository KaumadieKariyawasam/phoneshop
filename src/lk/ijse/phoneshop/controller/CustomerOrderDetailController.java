/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.controller;

//import com.sun.javafx.scene.control.skin.CustomColorDialog;
import java.sql.Connection;
import java.util.ArrayList;
import static lk.ijse.phoneshop.controller.ManageItemController.itemDAO;
import lk.ijse.phoneshop.core.dto.CustomerOrderDTO;
import lk.ijse.phoneshop.core.dto.CustomerOrderDetailDTO;
import lk.ijse.phoneshop.core.dto.CustomerPaymentDTO;
import lk.ijse.phoneshop.core.dto.ItemDTO;
import lk.ijse.phoneshop.core.dto.ViewCustomerOrderDTO;
import lk.ijse.phoneshop.dao.DAOFactory;
import lk.ijse.phoneshop.dao.custom.BatchDAO;
import lk.ijse.phoneshop.dao.custom.CustomerOrderDAO;
import lk.ijse.phoneshop.dao.custom.CustomerOrderDetailDAO;
import lk.ijse.phoneshop.dao.custom.CustomerPaymetDAO;
import lk.ijse.phoneshop.dao.custom.EmployeeDAO;
import lk.ijse.phoneshop.dao.custom.ViewCustomerOrderDetailDAO;
import lk.ijse.phoneshop.dao.db.DBConnection;

/**
 *
 * @author HP
 */
public class CustomerOrderDetailController {

    //public static CustomerOrderDetailDAO customerOrderDetailDAO;
    public static CustomerOrderDAO customerOrderDAO = (CustomerOrderDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMERORDER);
    public static CustomerOrderDetailDAO customerOrderDetailDAO = (CustomerOrderDetailDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMERORDERDETAIL);
    public static CustomerPaymetDAO customerPaymetDAO = (CustomerPaymetDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMERPAYMENT);
    public static ViewCustomerOrderDetailDAO viewCustomerOrderDetailDAO=(ViewCustomerOrderDetailDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.VIEWCUSTOMERORDER);
    
    public static boolean addCustOrder(CustomerOrderDTO customerOrderDTO, CustomerOrderDetailDTO customerOrderDetailDTO, CustomerPaymentDTO customerPaymentDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            boolean result = customerOrderDAO.add(customerOrderDTO);
            if (result) {

                result = customerOrderDetailDAO.add(customerOrderDetailDTO);
                if (result) {
                    result = customerPaymetDAO.add(customerPaymentDTO);
                    if (result) {
                        connection.commit();
                        return true;
                    }

                }
                connection.setAutoCommit(true);
                return true;
            }
            connection.rollback();
            return false;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    public static ArrayList<ViewCustomerOrderDTO> getAllOrders() throws Exception{
        ArrayList<ViewCustomerOrderDTO> getAllItem=viewCustomerOrderDetailDAO.getAllDetail();
        return getAllItem;
    }

    

    public CustomerOrderDetailController() {
        customerOrderDetailDAO = (CustomerOrderDetailDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMERORDERDETAIL);
    }

    public static ArrayList<CustomerOrderDetailDTO> getBatch() throws Exception {

        return customerOrderDetailDAO.getAll();

    }

}
