package clients;

import java.time.LocalDate;

public class Dolphin extends Animal{
    public Dolphin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
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

}
