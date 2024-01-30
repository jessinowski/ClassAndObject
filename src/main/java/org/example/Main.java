package org.example;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "1", "black", 2011);
        Car.startCar(bmw);

        Car audi = new Car("Audi");
        System.out.println(audi.brand+" accelarates from "+audi.speed+" to " +Car.accelerate(audi, 50));
        System.out.println(audi.brand+" accelarates from "+audi.speed+" to " +Car.accelerate(audi, 100));

        Person me = new Person("Jessica", 30);
        Person.introduction(me);

        Person brother = new Person("Dennis", 31);
        Person.introduction(brother);

    }
}
