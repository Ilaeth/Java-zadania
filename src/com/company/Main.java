package com.company;

public class Main {

    public static void main(String[] args) {
        Phone samsung = new Phone("Samsung", "S10", 6.1, "android");

        Animal cat = new Animal("cat", "Jinx");

        Car bmw = new Car("x3", "bmw", 45000.00);

        Car bmw2 = new Car("5", "bmw", 100000.00);

        Car audi = new Car("4", "audi", 700000.00);

        Human me = new Human("Przemek", "Podlecki", "123456789", cat, bmw);

        Animal dog = new Animal("dog", "Hawana");

        me.setterSalary(50000.00);

        me.setterCar(bmw);
        System.out.println(me.getterCar());
        me.setterCar(bmw2);
        System.out.println(me.getterCar());
        me.setterCar(audi);
    }
}
