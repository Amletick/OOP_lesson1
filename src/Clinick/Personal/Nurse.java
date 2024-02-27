package Clinick.Personal;

import java.time.LocalDate;

public class Nurse {
    public String name;
    public LocalDate age;
    public LocalDate workExp;
    public String workState;

    public Nurse(String name, LocalDate age, LocalDate workExp, String workState) {
        this.name = name;
        this.age = age;
        this.workExp = workExp;
        this.workState = workState;
    }

    public void vaccinate(){
        System.out.println("Сделала укол");
    }
    public String toString() {
        return String.format("Nurse name=%s, age=%s, workExp=%s, workState=%s",name,age,workExp,workState);
    }
}
