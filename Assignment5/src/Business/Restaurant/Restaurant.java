/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    private String resName;
    private String resManager;
    private String address;
    private int phone;
    private List<MenuItem> menus;
    private List<Order> orders;

    public Restaurant(String resName, String resManager, String address, int phone) {
        this.resName = resName;
        this.resManager = resManager;
        this.menus = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.address = address;
        this.phone = phone;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }


    public String getResManager() {
        return resManager;
    }

    public void setResManager(String resManager) {
        this.resManager = resManager;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public List<MenuItem> getMenus() {
        return menus;
    }

    public void setMenus(List<MenuItem> menus) {
        this.menus = menus;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public MenuItem searchItemByName(String itemName) {
        for (MenuItem item : menus) {
            if (item.getDishName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    public MenuItem searchMenubyName(String dishName) {
        for (MenuItem item : menus) {
            if (item.getDishName().equals(dishName)) {
                return item;
            }
            
        }
        return null;
    }

    public boolean removeDishByName(String dishName) {
        return menus.remove(searchMenubyName(dishName));
    }

    public boolean addNewDish(String dishName, double price, String description) {
        if (searchItemByName(dishName) != null) {
            return false;
        } else {
            MenuItem newDish = new MenuItem(dishName, price, description);
            menus.add(newDish);
        }
        return true;
    }

    public Order searchOrderById(String orderId) {
        for (Order o : orders) {
            if(o.getOrderId().equals(orderId)) {
                return o;
            }
        }
        return null;
    }

    
    
    
    
}
