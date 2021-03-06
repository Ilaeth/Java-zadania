package com.company;

import java.time.LocalTime;

public class Human {
    public String firstName;
    public String lastName;
    protected String phone;
    public Animal pet;
    private Car car;
    private Double salary;

    public Human(String firstName, String lastName, String phone, Animal pet, Car car){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
        this.car = car;
    }

    public Double getterSalary() {
        System.out.println(LocalTime.now());
        System.out.println(salary);
        return salary;
    }

    public void setterSalary(double salary) {
        if (salary < 0)
            System.out.println("Wynagrodzenie mniejsze niż zero");
        else {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
            System.out.println("Nie zapomnij odebrać aneksu do umowy od pani Hani z kadr.");
            System.out.println("Zus i US już wiedzą o zmianie wypłaty.");
            this.salary = salary;
        }
    }

    public Car getterCar() {
        return car;
    }

    public void setterCar(Car car) {
        if (getterSalary() > car.value) {
            System.out.println("Udało się kupić za gotówkę pojazd.");
            this.car = car;
        } else if (getterSalary() > (car.value / 12)) {
            System.out.println("Udało się kupić pojazd, na kredyt(no trudno).");
            this.car = car;
        } else
            System.out.println("Nie udało się zakupić pojazdu, zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
    }
}
