package TABA.question2;

import java.util.ArrayList;

/**
 * @author eugene mclaughlin
 */
public class ClientCode {
    public static void main(String[] args) {
        // Use this code to generate the data in arraylist of drawers
        ArrayList<Integer>[] drawers = Drawer.generateData();
        // To access the individual drawers use the drawers[index]
        // The following code allows you to get the size of each drawer
        for (ArrayList<Integer> drawer : drawers) {
            System.out.println(drawer.size());
        }
        // To access the elements of a drawer use drawers[0][index]
        for (int i = 0; i < drawers[0].size(); i++) {
            //This prints the individual elements of drawer 0
            System.out.println(drawers[0].get(i));
        }
    }
}
