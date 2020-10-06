/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author fengpeng
 */
public class Car {
    private String brand;
    private int manufatureYear;
    private int minSeats;
    private int maxSeats;
    private int serialNumber;
    private String modelNumber;
    private String city;
    private boolean expired;
    private boolean isAvailable;
    private String manfaturer; 
    private Date lastUpdated;
    
    SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    public Car() {
    }

    public Car(String brand, int manufatureYear, int minSeats, int maxSeats, int serialNumber, String modelNumber, String city, boolean expired, boolean isAvailable, String manfaturer) {
        this.brand = brand;
        this.manufatureYear = manufatureYear;
        this.minSeats = minSeats;
        this.maxSeats = maxSeats;
        this.serialNumber = serialNumber;
        this.modelNumber = modelNumber;
        this.city = city;
        this.expired = expired;
        this.isAvailable = isAvailable;
        this.manfaturer = manfaturer;
        this.lastUpdated = new Date();
        
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getManufatureYear() {
        return manufatureYear;
    }

    public void setManufatureYear(int manufatureYear) {
        this.manufatureYear = manufatureYear;
    }

    public int getMinSeats() {
        return minSeats;
    }

    public void setMinSeats(int minSeats) {
        this.minSeats = minSeats;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getManfaturer() {
        return manfaturer;
    }

    public void setManfaturer(String manfaturer) {
        this.manfaturer = manfaturer;
    }

    public String getLastUpdated() {
        return ft.format(lastUpdated);
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }   
}
