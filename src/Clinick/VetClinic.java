package Clinick;

import Clients.Animal;
import Clients.Types.Flyable;
import Clients.Types.Goable;
import Clients.Types.Swimable;
import Clinick.Personal.Doctor;
import Clinick.Personal.Nurse;

import java.util.List;

public class VetClinic {
    // Список больных, список персонала(состояния)
    // Поведение - нанять работника, уволить работника, принять на лечение, выписать
    private List<Doctor> doctors;
    private List<Nurse> nurses;
    private List<Animal> animals;

    public VetClinic(List<Doctor> doctors, List<Nurse> nurses, List<Animal> animal) {
        this.doctors = doctors;
        this.nurses = nurses;
        this.animals = animal;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
    public List<Nurse> getNurses() {
        return nurses;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void hire(Doctor doctor){
        System.out.println("Принимаем на работу "+ doctor);
        doctors.add(doctor);
    }
    public void hire(Nurse nurse){
        System.out.println("Принимаем на работу "+ nurse);
        nurses.add(nurse);
    }
    public void fire(Nurse nurse){
        System.out.println("Увольняем с работы");
        nurses.remove(nurse);
    }
    public void fire(Doctor doctor){
        System.out.println("Увольняем с работы");
        doctors.remove(doctor);
    }

    public void acceptForTreatment(Animal animal){
        System.out.println("Взяли на лечение");
        animals.add(animal);
    }
    public void discharge(Animal animal){
        System.out.println("Выписали");
        animals.remove(animal);
    }
    //Вот тут бы как-то причесать, чтобы можно было сделать без 3 разновидностей instanceof, но я не догадался как
    public void getFlyable(){
        for (Animal animal: animals){
            if (animal instanceof Flyable){
                System.out.println(animal);
            }
        }
    }
    public void getSwimable(){
        for (Animal animal: animals){
            if (animal instanceof Swimable){
                System.out.println(animal);
            }
        }
    }
    public void getGoable(){
        for (Animal animal: animals){
            if (animal instanceof Goable){
                System.out.println(animal);
            }
        }
    }
}
