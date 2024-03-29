package Clients.Impl;

import Clients.Animal;
import Clients.Types.Flyable;
import Clients.Owner;

import java.time.LocalDate;

public class Eagle extends Animal implements Flyable {
    public Eagle(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    @Override
    public void eat() {
        System.out.println(getType()+" "+name+" Pecking");
    }
    @Override
    public double fly() {
        return 322;
    }
}
