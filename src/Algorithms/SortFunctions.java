package Algorithms;

import java.util.Arrays;

/**
 * @author 刘祥楠
 * @date 2023-06-09 14:25
 */
public class SortFunctions {

    /**
     * bubble sort
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        boolean flag = true;
        for (int j = arr.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (i < (arr.length - 1) && arr[i] > arr[i + 1]) {
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

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] >= arr[j - 1]) {
                    break;
                }
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    index = j;
                }
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }

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
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        int[] arr4 = Arrays.copyOf(arr, arr.length);

        long start1 = System.nanoTime();
        bubbleSort(arr1);
        long end1 = System.nanoTime();
        System.out.println("Bubble sort time: " + (end1 - start1) / 100000 + "ms");
//        System.out.println(Arrays.toString(arr1));

        long start2 = System.nanoTime();
        insertionSort(arr2);
        long end2 = System.nanoTime();
        System.out.println("Insertion sort time: " + (end2 - start2) / 100000 + "ms");
//        System.out.println(Arrays.toString(arr2));

        long start3 = System.nanoTime();
        selectionSort(arr3);
        long end3 = System.nanoTime();
        System.out.println("Selection sort time: " + (end3 - start3) / 100000 + "ms");
//        System.out.println(Arrays.toString(arr3));

        long start4 = System.nanoTime();
        arr4 = mergeSort(arr4);
        long end4 = System.nanoTime();
        System.out.println("Merge sort time: " + (end4 - start4) / 100000 + "ms");
        System.out.println(Arrays.toString(arr4));


    }
}
