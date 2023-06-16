package Algorithms.Sort;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int middle = arr.length / 2;
        int[] left = Arrays.copyOf(arr, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int a = 0, b = 0, i = 0;
        int indexSign;
        int[] arrSign;
        int[] newArr = new int[left.length + right.length];
        while (true) {
            if (left[a] > right[b]) {
                newArr[i] = right[b];
                b++;
            } else {
                newArr[i] = left[a];
                a++;
            }
            i++;

            if (a == left.length) {
                arrSign = right;
                indexSign = b;
                break;
            }

            if (b == right.length) {
                arrSign = left;
                indexSign = a;
                break;
            }
        }

        for (i = i; i < newArr.length; i++) {
            newArr[i] = arrSign[indexSign];
            indexSign++;
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (arr.length * Math.random());
        }
        long start = System.currentTimeMillis();
        mergeSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("Insertion sort time: " + (end - start) + "ms");
        System.out.println(Arrays.toString(arr));
    }
}

