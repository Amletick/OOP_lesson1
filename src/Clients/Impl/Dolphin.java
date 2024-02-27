package Clients.Impl;

import Clients.Animal;
import Clients.Owner;
import Clients.Swimable;

import java.time.LocalDate;

public class Dolphin extends Animal implements Swimable {
    public Dolphin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println(getType()+" "+name+" Biting");
    }


    //Насколько понимаю под toGo всё же подразумевается движение на ногах, а не просто шевелиться
    public void toGo()
    {
        System.out.println(getType()+" "+name+" Don't have legs");
    }
    public void fly()
    {
        System.out.println(getType()+" "+name+" Can't Fly");
    }

    @Override
    public void swim() {

    }
}
