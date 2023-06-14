package Algorithms;

/**
 * @author 刘祥楠
 * @date 2023-05-26 15:30
 */
public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 3, 4, 9, 22, 11, 15, 14};
        long startTime = System.nanoTime();
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                temp = Math.max(arr[i], temp);
            }
        }
        long endTime = System.nanoTime();
        System.out.println("The largest number is: " + temp);
        System.out.println("Used time is: " + (endTime - startTime) + " nano seconds.");

    }
}
