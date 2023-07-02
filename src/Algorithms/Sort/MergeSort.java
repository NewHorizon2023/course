package Algorithms.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        for (; i < newArr.length; i++) {
            newArr[i] = arrSign[indexSign];
            indexSign++;
        }

        return newArr;
    }

    public static int[] mergeSort2(int[] arr) {
        List<int[]> list = new ArrayList<>(arr.length);
        for (int j : arr) {
            list.add(new int[]{j});
        }

        while (list.size() > 1) {
            List<int[]> subList = new ArrayList<>(list.size());
            for (int i = 0; i < list.size(); i = i + 2) {
                if (i + 1 == list.size()) {
                    subList.add(list.get(list.size() - 1));
                    break;
                }
                subList.add(merge(list.get(i), list.get(i + 1)));
            }
            list = subList;
        }

        return list.get(0);
    }

    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (arr.length * Math.random());
        }
        int[] arr1 = Arrays.copyOf(arr, arr.length);

        long start = System.currentTimeMillis();
        arr = mergeSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("Insertion sort time: " + (end - start) + "ms");
        //System.out.println(Arrays.toString(arr));

        long start1 = System.currentTimeMillis();
        arr1 = mergeSort2(arr1);
        long end1 = System.currentTimeMillis();
        System.out.println("Insertion sort2 time: " + (end1 - start1) + "ms");
        //System.out.println(Arrays.toString(arr1));
    }
}

