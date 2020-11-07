/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    List<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList<>();
    }

    public void addNewCustomer(Customer customer) {
        customerList.add(customer);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public Customer searchCustomerByName(String name) {
        for (Customer cus : customerList) {
            if (cus.getName().equals(name)) {
                return cus;
            }
        }
        return null;
    }

    public boolean removeCustomer(String name) {
        return customerList.remove(searchCustomerByName(name));
    }

    public Customer searchCustomerByUsername(String username) {
        for (Customer cus : customerList) {
            if (cus.getUsername().equals(username)) {
                return cus;
            }
        }
        return null;
    }
    
    

    
    
    
    
}
