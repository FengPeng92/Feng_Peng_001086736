/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private List<Restaurant> restaurantList;

    public RestaurantDirectory() {
        restaurantList = new ArrayList<>();
    }
    
    

    public Restaurant searchResByName(String restaurantName) {
        for (Restaurant res : restaurantList) {
            if (res.getResName().equals(restaurantName)) {
                return res;
            }
        }
        return null;
    }

    public Restaurant addNewRes(Restaurant restaurant) {
        restaurantList.add(restaurant);
        return restaurant;
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    public boolean removeResByName(String resName) {
        return restaurantList.remove(searchResByName(resName));
    }

    public Restaurant searchResByManager(String username) {
        for (Restaurant res : restaurantList) {
            if (res.getResManager().equals(username)) {
                return res;
            }
        }
        return null;
    }
    
    
    
}
