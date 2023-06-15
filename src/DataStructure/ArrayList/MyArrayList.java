package DataStructure.ArrayList;

import java.util.Arrays;

/**
 * @author 刘祥楠
 * @date 2023-06-12 13:40
 */
public class MyArrayList {
    private int[] arr;
    private int size;

    public MyArrayList(int length) {
        arr = new int[length];
    }

    public void insert(int item) {
        if (arr.length == size) {
            int[] newArr = new int[arr.length + 10];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[size] = item;
            arr = newArr;
        } else {
            arr[size] = item;
        }
        size++;
    }

    private void remove(int item){
        
    }

    public int size() {
        return size;
    }

    public void show() {
        System.out.println(Arrays.toString(arr));
    }
}
