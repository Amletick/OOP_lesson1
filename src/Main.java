import gb_collections.GbList;
import gb_collections.List.GbArrayList;
import gb_collections.List.GbLinkedList;

public class Main {
    public static void main(String[] args) {
        GbList<Integer> list= new GbLinkedList<>();
        list.add(56);
        list.add(23);
        list.add(78);
        list.add(615);
        System.out.println(list.getSize());
        System.out.println(list);
        list.removeByValue(748);
        list.removeByValue(78);//не найдём
        list.removeByIndex(1);
        System.out.println(list);
        System.out.println(list.getSize());
        list.add(23);
        list.add(78);
        list.add(615);
        list.addByIndex(3,46);
        System.out.println(list);
        System.out.println(list.getSize());
        System.out.println("Проверка ArrayList");
        GbList<Integer> array= new GbArrayList<>();
        array.add(56);
        array.add(23);
        array.add(78);
        array.add(615);
        System.out.println(array.getSize());
        System.out.println(array);
        array.addByIndex(3,999);
        System.out.println(array.getSize());
        System.out.println(array);

//        MedicineComponent asitron = new Asitromin("Азитро", 40, 60);
//        MedicineComponent penicilinium = new Penicilinium("Пеницилиниум", 30, 9999);
//        MedicineComponent vetbicid = new Vetbicid("Ветбицит", 40, 90);
//        MedicineComponent water = new Water("Вода", 40, 10);
//        MedicineComponent vetc = new VetC("ВетС", 40, 50);
//        MedicineComponent veta = new VetA("ВетА", 40, 95);
//        MedicineComponent vetb = new VetB("ВетB", 40, 10);
//        MedicineComponent vetd = new VetD("ВетD", 40, 60);
//        Medicine med1 = new Medicine();
//        med1.addComponent(asitron).addComponent(vetbicid).addComponent(vetc);
//        Medicine med2 = new Medicine();
//        med2.addComponent(penicilinium).addComponent(water).addComponent(veta);
//        Medicine med3 = new Medicine();
//        med3.addComponent(vetb).addComponent(vetd).addComponent(vetc);
//        ArrayList<Medicine> med123List= new ArrayList<>();
//        med123List.add(med1);
//        med123List.add(med2);
//        med123List.add(med3);
//        // Проверка что compareTo работает(выводится -1, т.к. у Пеницилиниума 9999 power)
//        System.out.println(med123List.get(0).compareTo(med123List.get(1)));
//        System.out.println(med123List.get(1).getSumPower());
//        for (Medicine medicine : med123List) {
//            System.out.println(medicine);
//        }
//        //По возрастанию
//       Collections.sort(med123List,(medic1,medic2)->(int)(medic1.getSumPower()-medic2.getSumPower()));
//        System.out.println("Отсортировано:");
//
//        for (Medicine medicine : med123List) {
//            System.out.println(medicine);
//        }

//        Collections.sort(medList,(comp1,comp2)->(int)(comp1.getWeight() - comp2.getWeight()));
//        Medicine2 medicine1 = new Medicine2();
//        medicine1.addComponent(asitron).addComponent(penicilinium).addComponent(vetbicid);
//        for (MedicineComponent component : medicine1) {
//            System.out.println(component);
//        }
//        ArrayList<MedicineComponent> medList= new ArrayList<>();
//        medList.add(asitron);
//        medList.add(penicilinium);
//        medList.add(vetbicid);
//        System.out.println(medList);
//        Collections.sort(medList,(comp1,comp2)->(int)(comp1.getWeight() - comp2.getWeight()));
//        System.out.println(medList);

//        for(MedicineComponent component: medicine1){
//
//        }
//        Iterator<MedicineComponent> med = medicine1;
////        while (med.hasNext()) System.out.println(med.next());
////    }
//        Lion myau= new Lion("Мяу",200, LocalDate.now(),new Owner());
//        Snake gabe=new Snake("Gabe",10,LocalDate.now(),new Owner());
//        Eagle villi=new Eagle("Villi",15,LocalDate.now(),new Owner());
//        Elephant elen=new Elephant("Elen",80,LocalDate.now(),new Owner());
//        Dog bobick = new Dog("Бобик", 20, LocalDate.now(),new Owner());
//        Dolphin dolp= new Dolphin("Dolp",80,LocalDate.now(),new Owner());
//        Duck duck1=new Duck("ducki1",10,null,null);
//        //Проверка интерфейсов
//        System.out.println(dolp.swim());
//        bobick.eat();
//        System.out.println(duck1.run());
//        System.out.println(duck1.swim());
//        System.out.println(duck1.fly());
//        //Проверка Врачей\медсестёр
//        Doctor vova = new Doctor("Вова",null,null,"working");
//        Nurse samira = new Nurse("Самира",null,null,"assisting");
//        Nurse alexandra = new Nurse("Александра",null,null,"weekend");
//        Doctor vlad = new Doctor("Влад",null,null,"working", samira);
//        samira.vaccinate();
////        System.out.println(vova.toString());
////        System.out.println(samira.toString());
////        System.out.println(vlad.toString());
////        System.out.println(alexandra.toString());
//        //Просто создаю все листы с классами, чтобы можно было создать вет.клинику
//        List<Doctor> doctors= new ArrayList<>();
//        doctors.add(vova);
//        doctors.add(vlad);
//        List<Nurse> nurses= new ArrayList<>();
//        nurses.add(samira);
//        nurses.add(alexandra);
//        List<Animal> animals= new ArrayList<>();
//        animals.add(myau);
//        animals.add(gabe);
//        animals.add(villi);
//        animals.add(elen);
//        animals.add(bobick);
//        animals.add(dolp);
//        animals.add(duck1);
//
//        //Создаём полноценный класс клиники
//        VetClinic med= new VetClinic(doctors,nurses,animals);
//        //Вывод всех медсестер в клинике
//        System.out.println(med.getNurses());
//        //Вывод всех докторов в клинике
//        System.out.println(med.getDoctors());
//        //Вывод всех животных в клинике
//        System.out.println(med.getAnimals());
//        //Увольняем влада
//        med.fire(vlad);
//        //Проверка, что он действительно ушёл из листа
//        System.out.println(med.getDoctors());
//        //Создаем нового доктора
//        Doctor vasiliy = new Doctor("Василий",null,null,"working", null);
//        //Нанимаем его
//        med.hire(vasiliy);
//        //Смотрим что он действительно попал в список
//        System.out.println(med.getDoctors());
//        //Все пациенты по типам
//        System.out.println("Летающие:");
//        med.getFlyable();
//        System.out.println("Бегающие:");
//        med.getGoable();
//        System.out.println("Плавающие:");
//        med.getSwimable();
//        //Взяли на лечение(по сути то же самое что и Hire\fire)
//        Duck duck2=new Duck("ducki2",10,null,null);
//        med.acceptForTreatment(duck2);
//        med.getSwimable();
//        //Выписали
//        med.discharge(duck2);
//        med.getSwimable()
    }
}