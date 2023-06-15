package Algorithms.Sort;/*
1. 	Start with an unsorted array of elements.
2. 	Compare the first element with the second element.
If the first element is greater than the second element, swap them.
3.	Move to the next pair of adjacent elements and compare them. Repeat the swapping process if necessary.

4. 	Continue this process until you reach the end of the array.
At this point, the largest element is guaranteed to be in the last position.
Repeat steps 2-4 for the remaining elements (excluding the last one) until the entire array is sorted.
*/

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1, 6};

        System.out.println("Array before sorting:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        bubbleSort(array);

        System.out.println("Array after sorting:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
/*
In the above code, the bubbleSort method implements the bubble sort algorithm.
It takes an array as input and sorts it in ascending order.
The main method demonstrates how to use the bubbleSort method by providing an example array
and printing the sorted array.
*/
