package Clients.Impl;

import Clients.*;
import Clients.Types.Flyable;
import Clients.Types.Goable;
import Clients.Types.Swimable;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Goable, Swimable {


    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType()+" "+name+" Biting");

    }

    @Override
    public double fly() {
        return 104;
    }

    @Override
    public double swim() {
        return 10;
    }

    @Override
    public double run() {
        return 3;
    }
}
