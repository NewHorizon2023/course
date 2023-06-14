package DataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 刘祥楠
 * @date 2023-05-30 17:05
 */
public class Tester {
    public static void main(String[] args) {
//        long begin = System.nanoTime();
//        int x = 0;
//        int y = 10;
//        int sum = x + y;
//        if (x > y) {
//            x = 100;
//        } else {
//            y = y + 50;
//        }
//        long end = System.nanoTime();
//        System.out.println(end - begin);

//        List<Integer> list = new ArrayList<>(3);
//        list.add(1);
//        System.out.println(list.size());
        List<String> fruits = new ArrayList<>(4);
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("pineapple");
        Iterator<String> i = fruits.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
