package Algorithms.Sort;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int i = left, j = right, base = arr[left];
        while (i < j) {
            while (arr[j] >= base && i < j) {
                j--;
            }
            while (arr[i] <= base && i < j) {
                i++;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, i, left);

        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }

    public static void quickSort2(int nums[], int start, int end) {
        //数组有多个元素进行排序
        if (start < end) {
            int base = nums[start];//以要进行排序数组第0个元素为base
            int i = start;//左指针
            int j = end;//右指针
            while (i < j) {
                //从右向左找，比base大，right--
                while (i < j && nums[j] >= base) {
                    j--;
                }
                //比base小，替换left所在位置的数字
                nums[i] = nums[j];
                //从左向右找，比base小，left++
                while (i < j && nums[i] <= base) {
                    i++;
                }
                //比base大，替换right所在位置的数字
                nums[j] = nums[i];
            }
            nums[i] = base;//此时left=right，用base替换这个位置的数字
            //排列比base小的数字的数组
            quickSort2(nums, start, i - 1);
            //排列比base大的数字的数组
            quickSort2(nums, i + 1, end);
        }
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        /*int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }*/

        int[] arr = {5, 3, 7, 4, 2, 8, 6, 1, 0, 9};

        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(Arrays.toString(arr));
    }
}
