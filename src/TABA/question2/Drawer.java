package TABA.question2;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author eugene mclaughlin
 */
public class Drawer {
    static ArrayList<Integer>[] drawers = new ArrayList[10];

    public static ArrayList<Integer>[] generateData() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // Generates 10000 random numbers between -10,000 and 10,000
            int[] numbers = random.ints(10000, -10000, 10000).toArray();
            drawers[i] = new ArrayList<>();
            for (int number : numbers) {
                drawers[i].add(number);
            }
        }
        return drawers;
    }
}
