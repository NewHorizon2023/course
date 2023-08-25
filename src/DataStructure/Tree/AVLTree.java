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

        int leftHeight = height(root.leftChild);
        int rightHeight = height(root.rightChild);
        root.height = Math.max(leftHeight, rightHeight) + 1;

        return root;
    }

    private int height(Node node) {
        return node == null ? -1 : node.height;
    }

    private int balanceFactor(Node node) {
        return node == null ? 0 : height(node.leftChild) - height(node.rightChild);
    }

    private boolean isLeftHeavy(Node root) {
        return balanceFactor(root.leftChild) - balanceFactor(root.rightChild) > 1;
    }

    private boolean isRightHeavy(Node root) {
        return balanceFactor(root.leftChild) - balanceFactor(root.rightChild) < -1;
    }

    private void balance(Node root) {
        if (isLeftHeavy(root)) {
            if (balanceFactor(root.leftChild) < 0) {
                System.out.println("Left rotate" + root.leftChild.value);
            }
            System.out.println("Right rotate" + root.value);
        } else if (isRightHeavy(root)) {
            if (balanceFactor(root.rightChild) > 0) {
                System.out.println("Right rotate" + root.rightChild.value);
            }
            System.out.println("Left rotate" + root.value);
        }
    }
}
