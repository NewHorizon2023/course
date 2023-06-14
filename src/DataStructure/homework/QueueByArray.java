package DataStructure.homework;

public class QueueByArray<T> {

    private T[] arr;
    private int size;

    public QueueByArray() {
        arr = (T[]) new Object[0];
    }

    public QueueByArray(int length) {
        arr = (T[]) new Object[length];
    }

    public void enqueue(T item) {
        if (arr.length == size) {
            T[] newArr = (T[]) new Object[size == 0 ? 10 : size * 2];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
        arr[size] = item;
        size++;
    }

    public T dequeue() {
        if (size == 0) {
            return null;
        }
        T item = arr[0];
        T[] newArr = (T[]) new Object[arr.length];
        System.arraycopy(arr, 1, newArr, 0, size);
        arr = newArr;
        size--;
        return item;
    }

    public int size() {
        return size;
    }

}
