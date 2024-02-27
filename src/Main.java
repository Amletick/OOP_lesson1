import Clients.*;
import Clients.Impl.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import Clinick.Personal.Doctor;
import Clinick.Personal.Nurse;
import Clinick.VetClinic;

public class Main {
    public static void main(String[] args) {
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
        //Проверка Врачей\медсестёр
        Doctor vova = new Doctor("Вова",null,null,"working");
        Nurse samira = new Nurse("Самира",null,null,"assisting");
        Nurse alexandra = new Nurse("Александра",null,null,"weekend");
        Doctor vlad = new Doctor("Влад",null,null,"working", samira);
        samira.vaccinate();
//        System.out.println(vova.toString());
//        System.out.println(samira.toString());
//        System.out.println(vlad.toString());
//        System.out.println(alexandra.toString());
        //Просто создаю все листы с классами, чтобы можно было создать вет.клинику
        List<Doctor> doctors= new ArrayList<>();
        doctors.add(vova);
        doctors.add(vlad);
        List<Nurse> nurses= new ArrayList<>();
        nurses.add(samira);
        nurses.add(alexandra);
        List<Animal> animals= new ArrayList<>();
        animals.add(myau);
        animals.add(gabe);
        animals.add(villi);
        animals.add(elen);
        animals.add(bobick);
        animals.add(dolp);
        animals.add(duck1);

        //Создаём полноценный класс клиники
        VetClinic med= new VetClinic(doctors,nurses,animals);
        //Вывод всех медсестер в клинике
        System.out.println(med.getNurses());
        //Вывод всех докторов в клинике
        System.out.println(med.getDoctors());
        //Вывод всех животных в клинике
        System.out.println(med.getAnimals());
        //Увольняем влада
        med.fire(vlad);
        //Проверка, что он действительно ушёл из листа
        System.out.println(med.getDoctors());
        //Создаем нового доктора
        Doctor vasiliy = new Doctor("Василий",null,null,"working", null);
        //Нанимаем его
        med.hire(vasiliy);
        //Смотрим что он действительно попал в список
        System.out.println(med.getDoctors());
        //Все пациенты по типам
        System.out.println("Летающие:");
        med.getFlyable();
        System.out.println("Бегающие:");
        med.getGoable();
        System.out.println("Плавающие:");
        med.getSwimable();
        //Взяли на лечение(по сути то же самое что и Hire\fire)
        Duck duck2=new Duck("ducki2",10,null,null);
        med.acceptForTreatment(duck2);
        med.getSwimable();
        //Выписали
        med.discharge(duck2);
        med.getSwimable();
       }
}