package DataStructure;

import DataStructure.HashTable.HashTable;
import org.junit.jupiter.api.Test;

/**
 * @author 刘祥楠
 * @date 2023-05-30 17:05
 */
public class UnitTest {
    @Test
    public void sizeTest() {
        System.out.println("Hello World");
    }

    @Test
    public void hashTableTest() {
        HashTable table = new HashTable();
        table.put(1, "NCI");
        table.put(2, "IRL");
        table.put(3, "EU");
        System.out.println(table);

        table.put(2, "US");
        System.out.println(table);

        System.out.println(table.get(0));
    }
}
