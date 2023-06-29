package DataStructure;

import DataStructure.LinkedList.SampleProblems.LinedList;
import org.junit.jupiter.api.Test;

/**
 * @author 刘祥楠
 * @date 2023-05-30 17:05
 */
public class UnitTest {
    @Test
    public void sizeTest() {
        LinedList list = new LinedList();
        list.add("NCI", 100);
        list.add("UCD", 95);
        list.add("TCD", 98);
        System.out.println(list.size());
        System.out.println(list.getAverage());
    }
}
