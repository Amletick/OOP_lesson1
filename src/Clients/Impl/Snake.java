package Clients.Impl;

import Clients.Animal;
import Clients.Owner;
import Clients.Types.Swimable;

import java.time.LocalDate;

//Предполагаем что у нас есть водоплавающие змеи
public class Snake extends Animal implements Swimable {
    public Snake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);

    }

    @Override
    public void eat() {
        System.out.println(getType()+" "+name+" Swallowing");
    }

    @Override
    public double swim() {
        return 7;
    }
}
