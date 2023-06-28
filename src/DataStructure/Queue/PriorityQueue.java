package DataStructure.Queue;

import java.util.Arrays;

/**
 * PriorityQueue
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-06-28
 */
public class PriorityQueue {
    private final int[] items;
    private int count;

    public PriorityQueue(int size) {
        items = new int[size];
    }

    public void add(int item) {
        int i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    private int shiftItemsToInsert(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item) {
                items[i + 1] = items[i];
            } else {
                break;
            }
        }
        return i + 1;
    }

    public int remove() {
        return items[--count];
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(5);
        queue.add(50);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue);
    }
}
