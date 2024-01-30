package org.example;

public class Car {
    String brand;
    String model;
    String color;
    int yearOfManufacture;
    boolean isStarted = true;
    int speed = 0;

    public Car(){}
    public Car(String brand, String model, String color, int yearOfManufacture){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }
    public Car(String brand){
        this.brand = brand;
    }
    public static void startCar(Car car){
        if(car.isStarted == false){
            car.isStarted = true;
        }
        System.out.println(car.brand+" started.");
    }

    public static int accelerate(Car car, int acceleration){
        car.speed = acceleration;
        return acceleration;
    }
}