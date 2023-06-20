package Algorithms;

import javax.swing.*;

/**
 * @author 刘祥楠
 * @date 2023-06-20 16:19
 */
public class SeqSearch {

    public static int sequentialSearch(int[] arr, int searchKey) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchKey) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
        int[] arr = new int[n];
        JOptionPane.showMessageDialog(null, "Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter an element : " + (i + 1) + " :"));
        }

        int searchKey = Integer.parseInt(JOptionPane.showInputDialog("Enter a value to search for "));

        int result = sequentialSearch(arr, searchKey);

        if (result != -1) {
            JOptionPane.showMessageDialog(null, "element found at index " + result);
        } else {
            JOptionPane.showMessageDialog(null, "Not found");
        }

    }

}
