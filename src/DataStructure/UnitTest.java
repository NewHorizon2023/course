package DataStructure;

import DataStructure.HashTable.HashTable;
import DataStructure.Tree.AVLTree;
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
        BinaryTree tree1 = new BinaryTree();
        tree1.insert(5);
        tree1.insert(3);
        tree1.insert(6);
        tree1.insert(2);
        tree1.insert(4);
        tree1.insert(8);
        tree1.insert(11);
        System.out.println(tree.find(4));
        // tree.breadthTraverse();
        System.out.println("--------------------------------------");
        // tree.depthTraverse();
        //tree.swapRoot();
        //System.out.println(tree.isBinarySearchTree());
        tree.printNodeAtDistance(0);

    }

    @Test
    public void avlTreeTest() {
        AVLTree tree = new AVLTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(6);
        tree.insert(2);
        tree.insert(4);
        tree.insert(8);
        tree.insert(10);
        System.out.println("----");
    }

    @Test
    public void test() {
        Integer i = null;
        test(i);
        System.out.println(i);
    }

    private void test(Integer i) {
        if (i == null) {
            i = 1;
        }
    }
}
