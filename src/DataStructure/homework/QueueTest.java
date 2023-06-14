package DataStructure.homework;

import DataStructure.homework.QueueByArray;
import DataStructure.homework.QueueByArrayList;

public class QueueTest {
    public static void main(String[] args) {
        QueueByArray<Integer> queueByArray = new QueueByArray<>();
        queueByArray.enqueue(1);
        queueByArray.enqueue(2);
        queueByArray.enqueue(3);
        queueByArray.enqueue(4);
        System.out.println("The size of queueByArray is: " + queueByArray.size());
        System.out.println("The first dequeue is: " + queueByArray.dequeue());
        System.out.println("The second dequeue is: " + queueByArray.dequeue());
        System.out.println("The third dequeue is: " + queueByArray.dequeue());

        //--------------------------------------------------------------------

        QueueByArrayList<Integer> queueByArrayList = new QueueByArrayList<>();
        queueByArrayList.enqueue(1);
        queueByArrayList.enqueue(2);
        queueByArrayList.enqueue(3);
        queueByArrayList.enqueue(4);
        System.out.println("The size of queueByArrayList is: " + queueByArrayList.size());
        System.out.println("The first dequeue is: " + queueByArrayList.dequeue());
        System.out.println("The second dequeue is: " + queueByArrayList.dequeue());
        System.out.println("The third dequeue is: " + queueByArrayList.dequeue());
    }
}
