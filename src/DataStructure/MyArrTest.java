package DataStructure;

import DataStructure.MyArrayList;

/**
 * @author 刘祥楠
 * @date 2023-06-12 13:55
 */
public class MyArrTest {
    public static void main(String[] args) {
        MyArrayList arr = new MyArrayList(2);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.show();
        System.out.println(arr.size());
    }
}
