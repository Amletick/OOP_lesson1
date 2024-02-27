import Clients.*;
import Clients.Impl.Dolphin;
import Clients.Impl.Duck;
import Clients.Impl.Eagle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Lion murzilka= new Lion("Мурзилка",200, LocalDate.now(),new Owner());
//        Lion myau= new Lion("Мяу",200, LocalDate.now(),new Owner());
//        Dolphin dolp=new Dolphin("Dolp",80,LocalDate.now(),new Owner());
//        Snake gabe=new Snake("Gabe",10,LocalDate.now(),new Owner());
//        Eagle villi=new Eagle("Villi",15,LocalDate.now(),new Owner());
//        Elephant elen=new Elephant("Elen",80,LocalDate.now(),new Owner());
//        Animal bobick = new Dog("Бобик", 20, LocalDate.now(),new Owner());
        Swimable dolp= new Dolphin("Dolp",80,LocalDate.now(),new Owner());
        dolp.sound();
        List<Animal> flyables= new ArrayList<>();
        flyables.add(new Duck("Даки", 20, LocalDate.now(),new Owner()));
        flyables.add(new Eagle("Игл", 20, null,null));
        flyables.add(new Dolphin("Dolp",80,null,null));
        for (Animal animal:flyables){//Идём по всему листу
            if (animal instanceof Flyable){//Проверяем принадлежит ли конкретный элемент листа к Flyable
                ((Flyable) animal).fly();//Кастуем уже отобранные if значения
            }
        }
    }
}