package TABA.Question3;

/**
 * Node
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-19
 */
public class Node {
    public String value;
    public Node next;
    public Node previous;

    public Node() {
    }

    public Node(String value) {
        this.value = value;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

}
