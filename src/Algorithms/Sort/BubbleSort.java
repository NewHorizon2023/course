package Algorithms.Sort;/*
1. 	Start with an unsorted array of elements.
2. 	Compare the first element with the second element.
If the first element is greater than the second element, swap them.
3.	Move to the next pair of adjacent elements and compare them. Repeat the swapping process if necessary.

4. 	Continue this process until you reach the end of the array.
At this point, the largest element is guaranteed to be in the last position.
Repeat steps 2-4 for the remaining elements (excluding the last one) until the entire array is sorted.
*/

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int j = arr.length - 1; j > 0; j--) {
            boolean flag = true;
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (arr.length * Math.random());
        }
        long start = System.currentTimeMillis();
        bubbleSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("Insertion sort time: " + (end - start) + "ms");
        System.out.println(Arrays.toString(arr));
    }
}
/*
In the above code, the bubbleSort method implements the bubble sort algorithm.
It takes an array as input and sorts it in ascending order.
The main method demonstrates how to use the bubbleSort method by providing an example array
and printing the sorted array.
*/
