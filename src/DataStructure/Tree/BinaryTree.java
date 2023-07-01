package DataStructure.Tree;

/**
 * BinaryTree
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-07-01
 */
public class BinaryTree {
    private static class Node {
        private final int value;
        private Node leftChild;
        private Node rightChild;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        Node current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    return;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    return;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        Node node = root;
        while (node != null) {
            if (node.value == value) {
                return true;
            }
            node = value < node.value ? node.leftChild : node.rightChild;
        }
        return false;
    }
}