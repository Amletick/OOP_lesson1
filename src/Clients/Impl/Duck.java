package Clients.Impl;

import Clients.Animal;
import Clients.Flyable;
import Clients.Owner;
import Clients.Swimable;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimable {


    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {

    }

    @Override
    public double fly() {
        return 2;
    }

    @Override
    public void swim() {

    }
}
