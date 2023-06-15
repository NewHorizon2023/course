package DataStructure.Queue;

import java.util.ArrayList;

public class QueueByArrayList<T> {
    private ArrayList<T> list;

    public QueueByArrayList() {
        list = new ArrayList<>();
    }

    public QueueByArrayList(int length) {
        list = new ArrayList<>(length);
    }

    public void enqueue(T item) {
        list.add(item);
    }

    public T dequeue() {
        if (list.size() == 0) {
            return null;
        }
        T item = list.get(0);
        list.remove(0);

        return item;
    }

    public int size() {
        return list.size();
    }
}
