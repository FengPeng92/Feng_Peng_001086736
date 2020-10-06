/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fengpeng
 */
public class CarHistory {
    
    private List<Car> carHistory;
    
    //String brand, int manufatureYear, int minSeats, int maxSeats, int serialNumber, String modelNumber, String city, boolean maintenance, boolean isAvailable, String manfaturer
    public CarHistory() {
        carHistory = new ArrayList<Car>();
        Car car1 = new Car("BMW", 2007, 4, 7, 1, "x5", "Boston", true, true, "manfaturer1");
        Car car2 = new Car("BMW", 2008, 2, 4, 2, "x4", "New York", false, true, "manfaturer2");
        Car car3 = new Car("BMW", 2009, 10, 30, 3, "x6", "LA", false, false, "manfaturer3");
        Car car4 = new Car("Toyota", 2007, 14, 27, 4, "S1", "Seatle", true, true, "manfaturer2");
        Car car5 = new Car("Toyota", 2008, 4, 7, 5, "S2", "LA", false, true, "manfaturer3");
        Car car6 = new Car("Toyota", 2009, 5, 7, 6, "S3", "Boston", false, false, "manfaturer1");
        Car car7 = new Car("Honda", 2006, 2, 7, 7, "s4", "Houston", true, true, "manfaturer2");
        Car car8 = new Car("Honda", 2008, 4, 8, 8, "x5", "New York", false, true, "manfaturer2");
        Car car9 = new Car("Honda", 2008, 15, 23, 9, "x6", "Portland", true, true, "manfaturer4");
        Car car10 = new Car("Benz", 2009, 3, 7, 10, "x4", "Seatle", true, false, "manfaturer5");
        Car car11 = new Car("Benz", 2007, 3, 15, 11, "s2", "Houston", false, true, "manfaturer4");
        Car car12 = new Car("Benz", 2010, 2, 6, 12, "s4", "Boston", false, false, "manfaturer1");
        Car car13 = new Car("GM", 2010, 2, 6, 13, "s3", "LA", true, true, "manfaturer5");
        Car car14 = new Car("GM", 2003, 10, 20, 14, "s1", "Portland", true, false, "manfaturer3");
        Car car15 = new Car("GM", 2006, 7, 16, 15, "s2", "Houston", true, true, "manfaturer1");
        Car car16 = new Car("Honda", 2008, 4, 8, 16, "s3", "New York", false, true, "manfaturer2");
        Car car17 = new Car("BMW", 2009, 4, 15, 17, "s1", "Boston", true, true, "manfaturer5");
        
        carHistory.add(car1);
        carHistory.add(car2);
        carHistory.add(car3);
        carHistory.add(car4);
        carHistory.add(car5);
        carHistory.add(car6);
        carHistory.add(car7);
        carHistory.add(car8);
        carHistory.add(car9);
        carHistory.add(car10);
        carHistory.add(car11);
        carHistory.add(car12);
        carHistory.add(car13);
        carHistory.add(car14);
        carHistory.add(car15);
        carHistory.add(car16);
        carHistory.add(car17);
       
    }
    
    public CarHistory(List<Car> carHistory) {
        this.carHistory = carHistory;
    }

    public List<Car> getCarList() {
        return carHistory;
    }

    public void setCarList(List<Car> carHistory) {
        this.carHistory = carHistory;
    }
    
    public Car addCar() {
        Car car = new Car();
        carHistory.add(car);
        return car;
    }
    
    public void deleteCar(Car car) {
        carHistory.remove(car);
    }

    public List<Car> searchCarByBrand(String brand) {
        List<Car> searchCarByBrandList = new ArrayList<>();
        for (Car car : carHistory) {
            if (car.getBrand().equals(brand)) {
                searchCarByBrandList.add(car);
            }
        }
        return searchCarByBrandList;
    }

    public List<Car> searchCarByManuYear(int manuYear) {
        List<Car> searchCarByManuYearList = new ArrayList<>();
        for (Car car : carHistory) {
            if (car.getManufatureYear() == manuYear) {
                searchCarByManuYearList.add(car);
            }
        }
        return searchCarByManuYearList;
    }

    public List<Car> searchCarBySerialNumber(int serialNumber) {
        List<Car> searchCarBySerialNumberList = new ArrayList<>();
        for (Car car : carHistory) {
            if (car.getSerialNumber() == serialNumber) {
                searchCarBySerialNumberList.add(car);
            }
        }
        return searchCarBySerialNumberList;
    }

    public List<Car> searchCarByModelNumber(String modelNumber) {
        List<Car> searchCarByModelNumberList = new ArrayList<>();
        for (Car car : carHistory) {
            if (car.getModelNumber().equals(modelNumber)) {
                searchCarByModelNumberList.add(car);
            }
        }
        return searchCarByModelNumberList;
    }

    public List<Car> searchCarByCity(String city) {
        List<Car> searchCarByCityList = new ArrayList<>();
        for (Car car : carHistory) {
            if (car.getCity().equals(city) && car.isIsAvailable()) {
                searchCarByCityList.add(car);
            }
        }
        return searchCarByCityList;
    }

    public List<Car> searchCarBySeats(int minSeats, int maxSeats) {
        List<Car> searchCarBySeatsList = new ArrayList<>();
        for (Car car : carHistory) {
            if (car.getMinSeats() >= minSeats && car.getMaxSeats() <= maxSeats) {
                searchCarBySeatsList.add(car);
            }
        }
        return searchCarBySeatsList;
    }

    public List<Car> getAvailableCars() {
        List<Car> availableCarsList = new ArrayList<>();
        for (Car car : carHistory) {
            if (car.isIsAvailable()) {
                availableCarsList.add(car);
            }
        }
        return availableCarsList;
    }

    public List<Car> getNonAvailableCars() {
        List<Car> nonAvailableCarsList = new ArrayList<>();
        for (Car car : carHistory) {
            if (!car.isIsAvailable()) {
                nonAvailableCarsList.add(car);
            }
        }
        return nonAvailableCarsList;
    }

    public List<Car> ExpiredCars() {
        List<Car> expiredCarsList = new ArrayList<>();
        for (Car car : carHistory) {
            if (car.isExpired()) {
                expiredCarsList.add(car);
            }
        }
        return expiredCarsList;
    }
    
    public List<Integer> getSerialNumberList() {
        List<Integer> serialNumberList = new ArrayList<>();
        for (Car car : carHistory) {
            serialNumberList.add(car.getSerialNumber());
        }
        return serialNumberList;
    }
    
    
}
