package clients;

import java.time.LocalDate;

public class Elephant extends Animal{
    public Elephant(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void fly()
    {
        System.out.println(getType()+" "+name+" Can't Fly");
    }
    public void swim()
    {
        System.out.println(getType()+" "+name+" Can't Swim");
    }
}
