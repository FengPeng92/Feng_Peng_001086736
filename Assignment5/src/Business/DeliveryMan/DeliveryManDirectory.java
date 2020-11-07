/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    List<DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
        
        deliveryManList = new ArrayList<>();
    }

    public List<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(List<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }

    public DeliveryMan searchDeliveryManByName(String name) {
        for (DeliveryMan dm : deliveryManList) {
            if (dm.getName().equals(name)) {
                return dm;
            }
        }
        return null;
    }

    public boolean removeDeliveryManByName(String name) {
        return deliveryManList.remove(searchDeliveryManByName(name));
    }

    public void addNewDeliveryMan(DeliveryMan dm) {
        deliveryManList.add(dm);
    }

    public DeliveryMan searchDeliveryManByUsername(String username) {
        for (DeliveryMan dm : deliveryManList) {
            if (dm.getUsername().equals(username)) {
                return dm;
            }
        }
        return null;
    }
    
    
    
}
