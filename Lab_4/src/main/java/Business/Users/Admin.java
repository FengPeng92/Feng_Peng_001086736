/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.CustomerDirectory;
import Business.SupplierDirectory;

/**
 *
 * @author AEDSpring2019
 */
public class Admin extends User {
    
    public SupplierDirectory suppDir;
    public CustomerDirectory custDir;
    
    public Admin() {
        super("", "", "Admin");
        suppDir = new SupplierDirectory();
        custDir = new CustomerDirectory();
        
        Customer customer1 = new Customer("Customer1@gmail.com", "123456");
        Customer customer2 = new Customer("Customer2@gmail.com", "123456");
        
        System.out.println(customer1.getUserName());
        
        custDir.getCustomerList().add(customer1);
        custDir.getCustomerList().add(customer2);
        
        Supplier supplier1 = new Supplier("Supplier1@gmail.com", "123456");
        Supplier supplier2 = new Supplier("Supplier2@gmail.com", "123456");
        
        suppDir.getSupplierList().add(supplier1);
        suppDir.getSupplierList().add(supplier2);
    }

    public SupplierDirectory getSuppDir() {
        return suppDir;
    }

    public void setSuppDir(SupplierDirectory suppDir) {
        this.suppDir = suppDir;
    }

    public CustomerDirectory getCustDir() {
        return custDir;
    }

    public void setCustDir(CustomerDirectory custDir) {
        this.custDir = custDir;
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}
