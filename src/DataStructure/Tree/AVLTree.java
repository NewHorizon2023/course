package DataStructure.Tree;

/**
 * AVLTree
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-07-23
 */
public class AVLTree {
    private static class Node {
        private final int value;

        private Node leftChild;

        private Node rightChild;

        private int height;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.leftChild = insert(root.leftChild, value);
        } else {
            root.rightChild = insert(root.rightChild, value);
        }

        int leftHeight = root.leftChild == null ? -1 : root.leftChild.height;
        int rightHeight = root.rightChild == null ? -1 : root.rightChild.height;
        root.height = Math.max(leftHeight, rightHeight) + 1;

        return root;
    }
}
