package com.company;

public class Main {

    public static void main(String[] args) {
        Phone samsung = new Phone("Samsung", "S10", 6.1, "android");

        Animal cat = new Animal("cat", "Jinx");

        Car bmw = new Car("x3", "bmw");

        Human me = new Human("Przemek", "Podlecki", "123456789", cat, bmw);

        Animal dog = new Animal("dog", "Hawana");

        me.getterSalary();
        me.getterSalary();
    }
}
