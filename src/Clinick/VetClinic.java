package Clinick;

import Clients.Animal;
import Clients.Owner;
import Clients.Types.Flyable;
import Clients.Types.Goable;
import Clients.Types.Swimable;
import Clinick.Personal.Doctor;
import Clinick.Personal.Nurse;

import java.time.LocalDate;
import java.util.List;

public class VetClinic {
    // Список больных, список персонала(состояния)
    // Поведение - нанять работника, уволить работника, принять на лечение, выписать
    public List<Doctor> doctors;
    public List<Nurse> nurses;
    public List<Animal> animal;

    public VetClinic(List<Doctor> doctors, List<Nurse> nurses, List<Animal> animal) {
        this.doctors = doctors;
        this.nurses = nurses;
        this.animal = animal;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
    public void Hire(Doctor doctor){
        System.out.println("Принимаем на работу "+ doctor);
        doctors.add(doctor);
    }
    public void Hire(Nurse nurse){
        System.out.println("Принимаем на работу "+ nurse);
        nurses.add(nurse);
    }
    public void Fire(){
        System.out.println("Увольняем с работы");
    }
    public void GetFlyable(List<Animal> flyables){
        for (Animal animal:flyables){
            if (animal instanceof Flyable){
                ((Flyable) animal).fly();
            }
        }
    }
    public void GetSwimable(List<Animal> swimables){
        for (Animal animal:swimables){
            if (animal instanceof Swimable){
                ((Flyable) animal).fly();
            }
        }
    }
    public void GetGoable(List<Animal> goables){
        for (Animal animal:goables){
            if (animal instanceof Goable){
                ((Flyable) animal).fly();
            }
        }
    }
}
