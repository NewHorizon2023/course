package TABA.Question4;

/**
 * BinaryTree
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-19
 */
public class BinaryTree implements BinaryTreeInterface<FoodProduct> {
    private Node<FoodProduct> root;

    private int size;

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void add(FoodProduct foodProduct) {
        size++;
        Node<FoodProduct> node = new Node<>(foodProduct);
        if (root == null) {
            root = node;
            return;
        }
        Node<FoodProduct> current = root;
        while (true) {
            if (foodProduct.compareTo(current.value) < 0) {
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

    @Override
    public int count() {
        return size;
    }

    @Override
    public FoodProduct max() {
        return max(root).value;
    }

    private Node<FoodProduct> max(Node<FoodProduct> root) {
        if (root == null) {
            return null;
        }

        if (root.rightChild == null && root.leftChild == null) {
            return root;
        }

        return max(max(max(root.leftChild), max(root.rightChild)), root);
    }

    private Node<FoodProduct> max(Node<FoodProduct> node1, Node<FoodProduct> node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }
        if (node1.value.compareTo(node2.value) < 0) {
            return node2;
        }
        return node1;
    }

    @Override
    public FoodProduct min() {
        return min(root).value;
    }

    /**
     * Find the min node of a sub-root
     *
     * @param root
     * @return
     */
    private Node<FoodProduct> min(Node<FoodProduct> root) {
        if (root == null) {
            return null;
        }

        if (root.rightChild == null && root.leftChild == null) {
            return root;
        }

        return min(min(min(root.leftChild), min(root.rightChild)), root);
    }

    /**
     * Find the smaller node out of 2
     *
     * @param node1
     * @param node2
     * @return
     */
    private Node<FoodProduct> min(Node<FoodProduct> node1, Node<FoodProduct> node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }
        if (node1.value.compareTo(node2.value) > 0) {
            return node2;
        }
        return node1;
    }

}
