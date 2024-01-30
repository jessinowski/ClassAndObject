package org.example;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "1", "black", 2011);
        bmw.startCar();

        Car audi = new Car("Audi");
        System.out.println(audi.brand+" accelarates from "+audi.speed+" to " +audi.accelerate(50));
        System.out.println(audi.brand+" accelarates from "+audi.speed+" to " +audi.accelerate(100));

        Person me = new Person("Jessica", 30);
        me.introduction();

        Person brother = new Person("Dennis", 31);
        brother.introduction();

    }
}
