package Algorithms;

import java.util.Scanner;

/**
 * @author 刘祥楠
 * @date 2023-05-26 15:28
 */
public class LargerNumberNano {
    public static void main(String[] args) {
        System.out.println("Please input the first number!");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Please input the second number!");
        int num2 = scanner.nextInt();
        long startTime = System.nanoTime();
        int num = Math.max(num1, num2);
        long endTime = System.nanoTime();
        System.out.println("Large number is: " + num);
        System.out.println("Used time: " + (endTime - startTime) + "nano seconds.");
    }
}
