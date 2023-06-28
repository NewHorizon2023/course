package DataStructure.Queue;

import java.util.Arrays;

/**
 * QueueByArray2
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-06-28
 */
public class QueueByCircularArray {
    private final int[] items;
    private int count;
    private int front;
    private int rear;

    public QueueByCircularArray(int length) {
        items = new int[length];
    }

    public void enqueue(int item) {
        if (count == items.length) {
            throw new IllegalStateException();
        }
        items[rear % items.length] = item;
        rear++;
        count++;
    }

    public int dequeue() {
        int index = front % items.length;
        int item = items[index];
        items[index] = 0;
        front++;
        count--;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public static void main(String[] args) {
        QueueByCircularArray queue = new QueueByCircularArray(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue);
        queue.enqueue(6);
        System.out.println(queue);
        System.out.println(queue.hashCode());
    }
}
