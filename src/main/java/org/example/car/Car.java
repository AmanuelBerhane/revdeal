package org.example.car;

public class Car {
    String name;
    String brand;
    int seat;
    String VIN;

    public Car(String name, String brand, int seat, String VIN){
        this.name = name;
        this.brand = brand;
        this.seat = seat;
        this.VIN = VIN;

    }

    public static String getVIN(String VIN){
        return VIN;
    }

     Car car1 = new Car("e2", "BYD", 5 ,"adghjahdgjsg2343");


}

