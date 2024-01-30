package org.example;

public class Car {
    static String brand;
    static String model;
    static String color;
    static int yearOfManufacture;
    static boolean isStarted = true;
    static int speed = 0;

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
    public static void startCar(){
        if(isStarted == false){
            isStarted = true;
        }
        System.out.println(brand+" started.");
    }

    public static int accelerate(int acceleration){
        speed = acceleration;
        return acceleration;
    }
}