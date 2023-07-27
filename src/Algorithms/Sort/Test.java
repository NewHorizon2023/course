package Algorithms.Sort;


import java.util.Arrays;

import static Algorithms.Sort.BubbleSort.bubbleSort;
import static Algorithms.Sort.InsertionSort.insertionSort;
import static Algorithms.Sort.InsertionSortByLinkedList.insertionSortByLinkedList;
import static Algorithms.Sort.InsertionSortImproved.insertionSortImproved;
import static Algorithms.Sort.MergeSort.mergeSort;
import static Algorithms.Sort.MergeSort.mergeSort2;
import static Algorithms.Sort.SelectionSort.selectionSort;

/**
 * @author 刘祥楠
 * @date 2023-06-09 14:25
 */
public class Test {
    public static void main(String[] args) {
        int size = 10000;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (arr.length * Math.random());
        }
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        int[] arr4 = Arrays.copyOf(arr, arr.length);
        int[] arr5 = Arrays.copyOf(arr, arr.length);
        int[] arr7 = Arrays.copyOf(arr, arr.length);

        InsertionSortByLinkedList.Node head = new InsertionSortByLinkedList.Node((int) (size * Math.random()));
        InsertionSortByLinkedList.Node current = head;
        for (int i = 1; i < size; i++) {
            current.next = new InsertionSortByLinkedList.Node((int) (size * Math.random()));
            current = current.next;
        }

        long start1 = System.currentTimeMillis();
        bubbleSort(arr1);
        long end1 = System.currentTimeMillis();
        System.out.println("Bubble sort time: " + (end1 - start1) + "ms");
//        System.out.println(Arrays.toString(arr1));

        long start2 = System.currentTimeMillis();
        insertionSort(arr2);
        long end2 = System.currentTimeMillis();
        System.out.println("Insertion sort time: " + (end2 - start2) + "ms");
//        System.out.println(Arrays.toString(arr2));

        long start5 = System.currentTimeMillis();
        insertionSortImproved(arr5);
        long end5 = System.currentTimeMillis();
        System.out.println("Improved insertion sort time: " + (end5 - start5) + "ms");
//        System.out.println(Arrays.toString(arr5));

        long start6 = System.currentTimeMillis();
        insertionSortByLinkedList(head);
        long end6 = System.currentTimeMillis();
        System.out.println("Insertion by linked list sort time: " + (end6 - start6) + "ms");

        long start3 = System.currentTimeMillis();
        selectionSort(arr3);
        long end3 = System.currentTimeMillis();
        System.out.println("Selection sort time: " + (end3 - start3) + "ms");
//        System.out.println(Arrays.toString(arr3));

        long start4 = System.currentTimeMillis();
        arr4 = mergeSort(arr4);
        long end4 = System.currentTimeMillis();
        System.out.println("Merge sort time: " + (end4 - start4) + "ms");
//        System.out.println(Arrays.toString(arr4));

        long start7 = System.currentTimeMillis();
        arr4 = mergeSort2(arr7);
        long end7 = System.currentTimeMillis();
        System.out.println("Merge sort 2 time: " + (end7 - start7) + "ms");
//        System.out.println(Arrays.toString(arr7));

    }
}
