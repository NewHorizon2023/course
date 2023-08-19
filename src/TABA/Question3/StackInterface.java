package TABA.Question3;

public interface StackInterface<T> {
    void push(T t);

    T pop();

    T peek();

    String toString();
}
