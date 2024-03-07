package gb_collections.List;

import gb_collections.GbList;

import java.util.Iterator;

public class GbLinkedList <E> implements GbList<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size =0;

    public GbLinkedList() {
        lastNode= new Node<E>(null,firstNode,null);//Создаём последний элемент, он нулевой, изначально указывает first<-last->null
        firstNode= new Node<E>(null,null,lastNode);//Создаём первый элемент, он нулевой, изначально указывает   null<-first->last
    }

    @Override
    public void add(E value) {
        Node<E> prev=lastNode;
        prev.setCurrentElement(value);
        lastNode= new Node<E>(null,prev,null);
        prev.setNextElement(lastNode);
        //Думаю тут нам уже не нужен отдельный метод для увеличения размера
        size++;
    }

    public void addByIndex(int index, E value) {
        if (index < 0 || index > size) {
            throw new RuntimeException("Element not found");
        }
        //Как-то ничего лучше в голову не пришло, хотя и надо запоминать 2 значения.
        Node<E> newNode = new Node<>(value, null, null);
        Node<E> current = firstNode.getNextElement();

        for (int i = 0; i < index; i++) {
            current = getNextFromCurrent(current);
        }
        Node<E> prev = current.getPrevElement();
        newNode.setPrevElement(prev);
        newNode.setNextElement(current);
        prev.setNextElement(newNode);
        current.setPrevElement(newNode);
        size++;
    }

    @Override
    public E get(int index) {
        Node<E> value=firstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            value=getNextFromCurrent(value);
        }
        return value.getCurrentElement();
    }
    private Node<E> getNextFromCurrent(Node<E> current){
        return current.getNextElement();
    }
    //Вынес в отдельный приватный метод, т.к. у обоих removeBy эта часть одинаковая
    private void removeNode(Node<E> current){
        //Сделал проверку, что мы нашли элемент, на всякий случай, чтобы не улетать в Exception
        if (current != null) {
            // Меняем ссылки у элемента перед ним и после него.
            Node<E> prev = current.getPrevElement();
            Node<E> next = current.getNextElement();
            prev.setNextElement(next);
            next.setPrevElement(prev);
            size--;
            //поменял с exeption чтобы было удобнее тестировать
        } else System.out.println("Элемент не был найден");
    }
    @Override
    public void removeByValue(E value) {
        Node<E> current = firstNode.getNextElement();
        //while (current != null && !current.getCurrentElement().equals(value))
        //Честно говоря это условие подсмотрел в гугле, т.к верхнее всё равно выкидывало в Exception
        //Насколько понимаю дело в том что Нода у нас может быть не пустой, но при этом её значение =null, но звучит сомнительно.
        while (current != null && (current.getCurrentElement() == null || !current.getCurrentElement().equals(value))) {
            current = getNextFromCurrent(current);
        }
        //Дошли до элемента.
        removeNode(current);
    }

    @Override
    public void removeByIndex(int index) {
        Node<E> current=firstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            current=getNextFromCurrent(current);
        }
        //Дошли до элемента.
        //Меняем ссылки у элемента перед ним и после него на друг друга.
        removeNode(current);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new GbLinkedListIterator();
    }

    private class GbLinkedListIterator implements Iterator<E> {
        private Node<E> current = firstNode.getNextElement();

        @Override
        public boolean hasNext() {
            return current != null && current != lastNode;
        }

        @Override
        public E next() {
            E value = current.getCurrentElement();
            current = current.getNextElement();
            return value;
        }
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = firstNode.getNextElement();

        while (current != null && current!=lastNode) {
            result.append(current.getCurrentElement());
            if (current.getNextElement() != lastNode) {
                result.append(", ");
            }
            current = current.getNextElement();
        }

        result.append("]");
        return result.toString();
    }


    private static class Node<E> {
        private E currentElement;
        private Node<E> prevElement;
        private Node<E> nextElement;

        private Node(E element, Node<E> prev, Node<E> next) {
            this.currentElement = element;
            this.prevElement = prev;
            this.nextElement = next;
        }

        public E getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<E> prevElement) {
            this.prevElement = prevElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }
    }
}
