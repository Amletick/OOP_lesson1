package Clients.Impl;

import Clients.Animal;
import Clients.Owner;
import Clients.Types.Swimable;

import java.time.LocalDate;

public class Dolphin extends Animal implements Swimable {
    public Dolphin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType()+" "+name+" Biting");
    }

    @Override
    public double swim() {
        return 12;
    }
}
