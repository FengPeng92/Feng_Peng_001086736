/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Order;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class DeliveryMan extends UserAccount{
    private String name;
    private int phone;
    private List<Order> orders;
    
    public DeliveryMan(String name, String username, String password, int phone) {
        setUsername(username);
        setPassword(password);
        setRole(new DeliverManRole());
        this.name = name;
        this.phone = phone;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Order searchOrderByOrderId(String orderId) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }

    public void addNewOrder(Order assignOrder) {
        orders.add(assignOrder);
    }
    
    
    
    
    
}
