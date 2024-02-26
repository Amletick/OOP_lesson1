package clients;

import java.time.LocalDate;

//Предполагаем что у нас есть водоплавающие змеи
public class Snake extends Animal {
    public Snake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);

    }
    public void toGo()
    {
        System.out.println(getType()+" "+name+" Don't have legs");
    }
    public void fly()
    {
        System.out.println(getType()+" "+name+" Can't Fly");
    }
}
