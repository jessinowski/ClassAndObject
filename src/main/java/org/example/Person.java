package org.example;

public class Person {
    static String name;
    static int age;
    static String gender;

    public Person(){}
    public Person(String name, int age){
        this.name =name;
        this.age = age;
    }

    public static void introduction(){
        System.out.println("Hello, I am "+ name+" and "+age+" years old.");
    }

}
