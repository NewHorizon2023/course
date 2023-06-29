package DataStructure.LinkedList.SampleProblems;

import org.junit.jupiter.api.Test;

/**
 * @author 刘祥楠
 * @date 2023-06-29 15:53
 */
public class SampleProblemsTest {

    @Test
    public void sizeTest() {
        LinkedList list = new LinkedList();
        list.add("NCI", 100);
        list.add("UCD", 95);
        list.add("TCD", 98);
        System.out.println(list.size());
        System.out.println(list.getAverage());
    }

}
