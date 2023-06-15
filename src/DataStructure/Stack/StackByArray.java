package DataStructure.Stack;

public class StackByArray<T> {
    private T[] arr;
    private int size;

    public StackByArray() {
        arr = (T[]) new Object[0];
    }

    public StackByArray(int length) {
        arr = (T[]) new Object[length];
    }

    public void push(T item) {
        if (arr.length == size) {
            T[] newArr = (T[]) new Object[size == 0 ? 10 : size * 2];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
        arr[size] = item;
        size++;
    }

    public T pop() {
        if (size == 0) {
            return null;
        }
        T item = arr[size - 1];
        size--;
        return item;
    }

    public int size() {
        return size;
    }

}
