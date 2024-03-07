package gb_collections;

public interface GbList<T> extends Iterable<T> {
    void add(T value);
    void addByIndex(int index, T value);
    T get(int index);
    void removeByValue(T value);//удаление по элементу
    void removeByIndex(int index);//удаление по индексу
    int getSize();
}
