import clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Lion murzilka= new Lion("Мурзилка",200, LocalDate.now(),new Owner());
        Lion myau= new Lion("Мяу",200, LocalDate.now(),new Owner());
        Dog bobick = new Dog("Бобик", 20, LocalDate.now(),new Owner());
//        System.out.println(murzilka.getWeight());
//        murzilka.setWeight(350);
//        System.out.println(murzilka.getWeight());
          Lion test= new Lion();
          murzilka.LifeCycle();
          List<Animal>animals=new ArrayList<>();
          animals.add(murzilka);
          animals.add(myau);
          animals.add(bobick);
          System.out.println(animals);

//        System.out.println(test);
//        System.out.println(myau);
//        System.out.println(murzilka.getType());

//        System.out.println(bobick);
//        System.out.println(bobick.getType());
    }
}