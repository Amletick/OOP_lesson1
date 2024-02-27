package Clinick.Personal;

import java.time.LocalDate;

public class Doctor {
    public String name;
    public LocalDate age;
    public LocalDate workExp;
    public String workState;
    public Nurse nurse;

    public Doctor(String name, LocalDate age, LocalDate workExp, String workState, Nurse nurse) {
        this.name = name;
        this.age = age;
        this.workExp = workExp;
        this.workState = workState;
        this.nurse = nurse;
    }
    public Doctor(String name, LocalDate age, LocalDate workExp, String workState) {
        this.name = name;
        this.age = age;
        this.workExp = workExp;
        this.workState = workState;
    }

    public void doc(){
        this.nurse=null;
    }
    public void doc(Nurse nurse){
        this.nurse=nurse;
    }
    public void diagnosis(){
        System.out.println("Поставил диагноз");
    }
    public String toString() {
        return String.format("Doctor name=%s, age=%s, workExp=%s, workState=%s, nurseHelping={%s}",name,age,workExp,workState,nurse);
    }
}
