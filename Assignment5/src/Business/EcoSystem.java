/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;

    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        this.restaurantDirectory = new RestaurantDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.deliveryManDirectory = new DeliveryManDirectory();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       
       return false;
    }

    public RestaurantDirectory getRestaurantDirectory() {
        if (this.restaurantDirectory == null) {
            restaurantDirectory = new RestaurantDirectory();
        }
        return restaurantDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        if (this.customerDirectory == null) {
            customerDirectory = new CustomerDirectory();
        }
        return customerDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        if (this.deliveryManDirectory == null) {
            deliveryManDirectory = new DeliveryManDirectory();
        }
        return deliveryManDirectory;
    }
       
}
