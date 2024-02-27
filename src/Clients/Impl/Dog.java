package Clients.Impl;

import Clients.Animal;
import Clients.Types.Goable;
import Clients.Owner;

import java.time.LocalDate;

public class Dog extends Animal implements Goable {

    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void eat() {
        System.out.println(getType()+" "+name+" Chewing");
    }

    @Override
    public double run() {
        return 15;
    }
}
