package DataStructure.Stack;

import java.util.ArrayList;

public class StackByArrayList<T> {
    private ArrayList<T> list;

    public StackByArrayList() {
        list = new ArrayList<>();
    }

    public StackByArrayList(int length) {
        list = new ArrayList<>(length);
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.size() == 0) {
            return null;
        }
        T item = list.get(list.size() - 1);
        list.remove(list.size() - 1);

        return item;
    }

    public int size() {
        return list.size();
    }
}
