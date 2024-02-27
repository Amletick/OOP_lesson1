package Clients.Impl;

import Clients.Animal;
import Clients.Owner;

import java.time.LocalDate;

public class Lion extends Animal {

    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);

    }

    public void eat() {
        System.out.println(getType()+" "+name+" Chewing");
    }
}
