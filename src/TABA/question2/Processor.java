package TABA.question2;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Xiangnan Liu
 * @date 2023-08-25 17:17
 */
public class Processor {

    public static void calculate() {
        // Create a thread pool with 10 threads
        ExecutorService executor = Executors.newFixedThreadPool(10);
        // Generate data
        Drawer.generateData();

        // Process each drawer using separate threads
        for (int i = 0; i < 10; i++) {
            // Capture the value of 'i' for each iteration
            int finalI = i;
            executor.submit(
                    new Runnable() {
                        @Override
                        public void run() {
                            ArrayList<Integer> drawerData = Drawer.drawers[finalI];
                            int sum = 0;
                            int max = drawerData.get(0);
                            int min = drawerData.get(0);

                            // Calculate sum, max, and min of the data in the drawer
                            for (Integer num : drawerData) {
                                sum += num;
                                max = Math.max(max, num);
                                min = Math.min(min, num);
                            }

                            // Calculate average
                            double average = (double) sum / drawerData.size();

                            // Print the results
                            System.out.println("question2.Drawer " + finalI + ": Sum = " + sum +
                                    ", Average = " + average + ", Max = " + max + ", Min = " + min);
                        }
                    }
            );
        }

        // Shut down the thread pool
        executor.shutdown();
    }

    public static void main(String[] args) {
        calculate();
    }
}
