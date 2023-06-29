package Algorithms;

import java.util.Scanner;

/**
 * @author 刘祥楠
 * @date 2023-06-27 16:24
 */
public class ValidateInputData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
        int input = 0;
        if (sc.hasNextInt()) {
            input = sc.nextInt();
        }
        System.out.println("Your input is: " + input);
    }
}
