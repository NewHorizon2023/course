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

    public void breadthTraverse() {
        breadthTraverse(root);
    }

    private void breadthTraverse(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value);
        breadthTraverse(node.leftChild);
        breadthTraverse(node.rightChild);
    }

    public void depthTraverse() {
        depthTraverse(root);
    }

    private void depthTraverse(Node node) {
        if (node == null) {
            return;
        }
        depthTraverse(node.leftChild);
        System.out.println(node.value);
        depthTraverse(node.rightChild);
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null) {
            return -1;
        }
        if (root.leftChild == null && root.rightChild == null) {
            return 0;
        }
        return Math.max(height(root.leftChild), height(root.leftChild)) + 1;
    }

    public int min() {
        return min(root);
    }

    private int min(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        if (root.rightChild == null && root.leftChild == null) {
            return root.value;
        }
        return Math.min(Math.min(min(root.leftChild), min(root.rightChild)), root.value);
    }

    public boolean equals(BinaryTree tree) {
        if (tree == null) {
            return false;
        }
        return equals(root, tree.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null) {
            return true;
        }

        if (first != null && second != null) {
            return first.value == second.value && equals(first.leftChild, second.leftChild) && equals(first.rightChild, second.rightChild);
        }

        return false;
    }

    public boolean isBinarySearchTree() {
        return isBinarySearchTree(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private boolean isBinarySearchTree(Node root, int max, int min) {
        if (root == null) {
            return true;
        }

        if (root.value <= min || root.value > max) {
            return false;
        }

        return isBinarySearchTree(root.leftChild, root.value, min) && isBinarySearchTree(root.rightChild, max, root.value);
    }

    public void swapRoot() {
        Node temp = root.rightChild;
        root.rightChild = root.leftChild;
        root.leftChild = temp;
    }

    public void printNodeAtDistance(int distance) {
        printNodeAtDistance(root, distance);
    }

    private void printNodeAtDistance(Node node, int distance) {
        if (node == null) {
            return;
        }
        if (distance == 0) {
            System.out.println(node.value);
            return;
        }
        printNodeAtDistance(node.leftChild, distance - 1);
        printNodeAtDistance(node.rightChild, distance - 1);
    }

}
