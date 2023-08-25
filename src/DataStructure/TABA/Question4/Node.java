package DataStructure.TABA.Question4;

/**
 * Node
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-19
 */
public class Node<T> {
    public T value;
    public Node<T> leftChild;
    public Node<T> rightChild;

    public Node(T value) {
        this.value = value;
    }
}
