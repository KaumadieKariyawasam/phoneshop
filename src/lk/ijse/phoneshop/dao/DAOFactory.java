/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.dao;

import lk.ijse.phoneshop.dao.custom.impl.BatchDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.CustomerDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.CustomerOrderDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.CustomerOrderDetailDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.CustomerPaymentDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.CustomerReturnDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.EmployeeDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.ItemDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.ItemFormDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.SupplierDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.SupplierOrderDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.SupplierOrderDetailDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.SupplierPaymentDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.SupplierReturnDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.UserDAPimpl;
import lk.ijse.phoneshop.dao.custom.impl.ViewCustomerOrderDAOimpl;
import lk.ijse.phoneshop.dao.custom.impl.ViewSupReturnDAOimpl;
//import lk.ijse.phoneshop.custom.impl.SupplierDAOimpl;

/**
 *
 * @author HP
 */
public class DAOFactory {

    public enum DAOTypes{
        CUSTOMER,SUPPLIER,ITEM,SUPPLIERORDER,SUPPLIERORDERDETAIL,USER,BATCH,ITEMFORM,EMPLOYEE,CUSTOMERORDER,CUSTOMERORDERDETAIL,SUPPLIERPAYMENT,CUSTOMERPAYMENT,
        CUSTOMERRETURN,SUPPLIERRETURN,VIEWCUSTOMERORDER,VIEWSUPRETURN
    }
    private static DAOFactory daoFactory;

    public DAOFactory() {
    }
    
    public static DAOFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    public SuperDAO getDAO(DAOTypes dAOTypes){
        switch(dAOTypes){
            case CUSTOMER:
                return new CustomerDAOimpl();
            case SUPPLIER:
                return new SupplierDAOimpl();
                
            case ITEM:
                return new ItemDAOimpl();
            
            case SUPPLIERORDER:
                return new SupplierOrderDAOimpl();
            case SUPPLIERORDERDETAIL:
                return new SupplierOrderDetailDAOimpl();
            case USER:
                return new UserDAPimpl();
            
            case BATCH:
                return new BatchDAOimpl();
            case ITEMFORM:
                return new ItemFormDAOimpl();
            case EMPLOYEE:
                return new EmployeeDAOimpl();
            case CUSTOMERORDER:
                return new CustomerOrderDAOimpl();
            case CUSTOMERORDERDETAIL:
                return new CustomerOrderDetailDAOimpl();
            case SUPPLIERPAYMENT:
                return new SupplierPaymentDAOimpl();
            case CUSTOMERPAYMENT:
                return new CustomerPaymentDAOimpl();
            case CUSTOMERRETURN:
                return new CustomerReturnDAOimpl();
            case SUPPLIERRETURN:
                return new SupplierReturnDAOimpl();
            case VIEWCUSTOMERORDER:
                return new ViewCustomerOrderDAOimpl();
            case VIEWSUPRETURN:
                return new ViewSupReturnDAOimpl();
                default:
                    return null;
        }
        
    }
    
}
