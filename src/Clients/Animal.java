package Clients;

import java.time.LocalDate;

public abstract class Animal {
   protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }
    public abstract void eat();
    public String toString() {
        return String.format("name=%s, weight=%s, age=%s, owner=%s",name,weight,age,owner);
    }
    public String getType(){
        return getClass().getSimpleName();
    }
}