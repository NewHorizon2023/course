package Algorithms.TimeCalculate;

import java.util.Scanner;

/**
 * @author DELL
 */
public class LargeNumber {
    public static void main(String[] args) {
        System.out.println("Please input the first number!");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Please input the second number!");
        int num2 = scanner.nextInt();
        int num = Math.max(num1, num2);
        System.out.println("Large number is: " + num);
    }
}