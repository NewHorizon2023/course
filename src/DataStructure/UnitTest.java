package DataStructure;

import DataStructure.HashTable.HashTable;
import DataStructure.Tree.BinaryTree;
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


    @Test
    public void binaryTreeTest() {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(6);
        tree.insert(2);
        tree.insert(4);
        tree.insert(8);
        tree.insert(10);
        System.out.println(tree.find(4));
    }
}
