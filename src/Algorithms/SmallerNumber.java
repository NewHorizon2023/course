package Algorithms;

import java.util.Scanner;

/**
 * @author 刘祥楠
 * @date 2023-05-26 15:24
 */
public class SmallerNumber {
    public static void main(String[] args) {
        System.out.println("Please input the first number!");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Please input the second number!");
        int num2 = scanner.nextInt();
        long startTime = System.currentTimeMillis();
        int num = Math.min(num1, num2);
        long endTime = System.currentTimeMillis();
        System.out.println("Large number is: " + num);
        System.out.println("Used time: " + (endTime - startTime) + " million seconds");
    }
}
