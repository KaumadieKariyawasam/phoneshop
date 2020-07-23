/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.phoneshop.core.dto;

/**
 *
 * @author HP
 */
public class EmployeeDTO extends SuperDTO{
    private String emp_Nic;
    private String emp_Name;
    private String post;
    private double salary;
    private String tele;
    private String address;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String emp_Nic, String emp_Name, String post, double salary, String tele, String address) {
        this.emp_Nic = emp_Nic;
        this.emp_Name = emp_Name;
        this.post = post;
        this.salary = salary;
        this.tele = tele;
        this.address = address;
    }

    public EmployeeDTO(String emp_Nic) {
        this.emp_Nic=emp_Nic;

    }

    /**
     * @return the emp_Nic
     */
    public String getEmp_Nic() {
        return emp_Nic;
    }

    /**
     * @param emp_Nic the emp_Nic to set
     */
    public void setEmp_Nic(String emp_Nic) {
        this.emp_Nic = emp_Nic;
    }

    /**
     * @return the emp_Name
     */
    public String getEmp_Name() {
        return emp_Name;
    }

    /**
     * @param emp_Name the emp_Name to set
     */
    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    /**
     * @return the post
     */
    public String getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the tele
     */
    public String getTele() {
        return tele;
    }

    /**
     * @param tele the tele to set
     */
    public void setTele(String tele) {
        this.tele = tele;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
