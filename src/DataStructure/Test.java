package DataStructure;

import java.util.Arrays;

/**
 * Test
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-20
 */
public class Test {

    public static void init(int[] arr) {
        arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0};
        init(arr);
        System.out.println(Arrays.toString(arr));
    }
}
