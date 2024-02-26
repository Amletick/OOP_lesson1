package clients;

import java.time.LocalDate;

public class Animal {
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

    public Animal() {
        this("ТестовоеИмя",100,LocalDate.now(),new Owner());
    }

    public void toGo()
    {
        System.out.println(getType()+" "+name+" ToGo");
    }
    public void fly()
    {
        System.out.println(getType()+" "+name+" Fly");
    }
    public void swim()
    {
        System.out.println(getType()+" "+name+" Swim");
    }
    private void sleep(){
        System.out.println(getType()+" "+name+" Sleep");
    }
    private void wakeUp(){
        System.out.println(getType()+" "+name+" Wake Up");
    }
    private void wakeUp(int time){
        System.out.println(getType()+" "+name+" Wake Up at "+time);
    }
    private void eat(){
        System.out.println(getType()+" "+name+" Eat");
    }
    private void  play(){
        System.out.println(getType()+" "+name+" Play");
    }
    public void LifeCycle(){
        //Закомментировал, чтобы не было лишних данных в выводе
//        wakeUp(20);
//        play();
//        eat();
        toGo();
        fly();
        swim();
//        sleep();
    }
    public String getName() {
        return name;
    }
    public float getWeight() {
        return weight;
    }
    public LocalDate getAge() {
        return age;
    }
    public Owner getOwner() {
        return owner;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    public String toString() {
        return String.format("name=%s, weight=%s, age=%s, owner=%s",name,weight,age,owner);
    }
    public String getType(){
        return getClass().getSimpleName();
    }
}