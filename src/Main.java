import Clients.*;
import Clients.Impl.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import Clients.Types.Flyable;
import Clients.Types.Goable;
import Clients.Types.Swimable;
import Clinick.VetClinic;

public class Main {
    public static void main(String[] args) {
        Lion murzilka= new Lion("Мурзилка",200, LocalDate.now(),new Owner());
        Lion myau= new Lion("Мяу",200, LocalDate.now(),new Owner());
        Snake gabe=new Snake("Gabe",10,LocalDate.now(),new Owner());
        Eagle villi=new Eagle("Villi",15,LocalDate.now(),new Owner());
        Elephant elen=new Elephant("Elen",80,LocalDate.now(),new Owner());
        Dog bobick = new Dog("Бобик", 20, LocalDate.now(),new Owner());
        Dolphin dolp= new Dolphin("Dolp",80,LocalDate.now(),new Owner());
        Duck duck1=new Duck("ducki1",10,null,null);
        //Проверка интерфейсов
        System.out.println(dolp.swim());
        bobick.eat();
        System.out.println(duck1.run());
        System.out.println(duck1.swim());
        System.out.println(duck1.fly());

        List<Animal> animals= new ArrayList<>();
        animals.add(murzilka);
        animals.add(myau);
        animals.add(gabe);
        animals.add(villi);
        animals.add(elen);
        animals.add(bobick);
        animals.add(dolp);
        animals.add(duck1);

       }
}