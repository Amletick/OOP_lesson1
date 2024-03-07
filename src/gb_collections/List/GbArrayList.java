package gb_collections.List;

import gb_collections.GbList;
import gb_collections.List.util.ArrayIterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class GbArrayList<E> implements GbList<E> {

    private E[] values;
    private int size;//текущий размер(сколько лежит в массиве)
    private int capacity;//максимально допустимы размер
    @SuppressWarnings("unchecked")
    public GbArrayList() {
        this.size=0;
        this.capacity=10;//допустим максимум 10 элементов в массиве
        try {
            this.values = (E[]) new Object[capacity];
        } catch (ClassCastException e) {System.out.println(e.getMessage());}

    }

    @Override
    public void add(E value) {
        if (size==capacity){
            addCapacity();
        }
        values[size++]=value;
    }

    @Override
    public void addByIndex(int index, E value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (size == capacity) {
            addCapacity();
        }
        //подумал что проще будет скопировать массив в себя же с определенного места, тем самым
        //сдвинув его и освободив место для того, чтобы вставить наш элемент.
        System.arraycopy(values, index, values, index + 1, size - index);
        values[index] = value;
        size++;
    }


    @SuppressWarnings("unchecked")
    private void addCapacity(){
        capacity=capacity+capacity/2;
       // try {
            E[] array= (E[]) new Object[capacity];
       // }catch (ClassCastException e) {System.out.println(e.getMessage());;}

        System.arraycopy(values,0,array,0,values.length);
        this.values=array;

    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @SuppressWarnings("unchecked")@Override
    public void removeByValue(E value) {
        for (int i=0;i<values.length;i++){
            if(values[i].equals(value)){
                removeByIndex(i);
                return;
            }
        }
        throw new RuntimeException("Element not found");
    }
    @Override
    @SuppressWarnings("unchecked")
    public void removeByIndex(int index) {
        try {
            //По поводу того что было на паре с двумя одинаковыми кодами:
            //В вашем решении мы в temp записываем копию, и потом из копии копируем в основной массив
            //В решении у Константина мы записываем новый массив в temp, а он у нас нигде не сохраняется, поэтому values осталось без изменений.
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElementsAfterIndex);
        } catch (ClassCastException e) {
            throw new RuntimeException(e);
        }
    }
//    public void remove(int index) {
//        capacity=capacity-1;
//        E[] res= (E[]) new Object[capacity];
//        System.arraycopy(values,0,res,0,index-1);
//        int amountElementsAfterIndex = values.length - index - 1;
//        System.arraycopy(values,index+1,res,index,amountElementsAfterIndex);
//        size--;
//    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        int i=0;
        while (values[i] != null) {
            builder.append(values[i]).append(", ");
            i++;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
