package Algorithms.Sort;

import java.util.Arrays;

public class InsertionSortImproved {
    public static void insertionSortImproved(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int left = 0;
            int right = i;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[i] > arr[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            int insertIndex = left;
            int insertValue = arr[i];

            // Move elements to make room for insertion
            for (int j = i; j > insertIndex; j--) {
                arr[j] = arr[j - 1];
            }
            // Insert the new element
            arr[insertIndex] = insertValue;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (arr.length * Math.random());
        }
        long start = System.currentTimeMillis();
        insertionSortImproved(arr);
        long end = System.currentTimeMillis();
        System.out.println("Insertion sort time: " + (end - start) + "ms");
        System.out.println(Arrays.toString(arr));
    }
}
