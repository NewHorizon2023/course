package Algorithms.TimeCalculate;

import java.util.Arrays;

/**
 * @author 刘祥楠
 * @date 2023-05-26 15:36
 */
public class LargestNumberArray {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] arr = new int[10];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 800);
            if (i == 0) {
                temp = arr[0];
            } else {
                temp = Math.max(arr[i], temp);
            }
        }
        long endTime = System.nanoTime();
        System.out.println("The array is: " + Arrays.toString(arr));
        System.out.println("The largest number is: " + temp);
        System.out.println("Used time is: " + (endTime - startTime) + " nano seconds.");

    }
}
