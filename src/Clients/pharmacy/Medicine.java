package Clients.pharmacy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Medicine implements Iterator<MedicineComponent>, Comparable<Medicine>{
    private List<MedicineComponent> components;
    private int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }
    public Medicine addComponent(MedicineComponent component){
        components.add(component);
        return this;
    }

    @Override
    public boolean hasNext() {
        //return components.iterator().hasNext();
        return index< components.size();
    }

    @Override
    public MedicineComponent next() {
        //return components.iterator().next();
        return components.get(index++);
    }
    public String toString(){
        return "Медицины: {"+ components.toString();
    }

    @Override
    public int compareTo(Medicine o) {
        return Float.compare(this.getSumPower(),o.getSumPower());
    }
    public float getSumPower(){
        float sum=0;
        while (hasNext()){
            sum=sum+ next().getPower();
        }
        //обнуляю индекс, т.к иначе он сохраняется между вызовами и после одного выполнения операции всё остальное не работает
        this.index = 0;
        return sum;
    }
}
