package TABA.Question3;

/**
 * Stack
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-19
 */
public class Stack implements StackInterface<String> {
    private Node first;
    private Node last;
    private int size;

    @Override
    public void push(String value) {
        size++;
        Node node = new Node(value);

        // If the stack is empty
        if (first == null) {
            first = last = node;
            return;
        }

        // If the stack is not empty
        node.previous = last;
        last.next = node;
        last = node;
    }

    @Override
    public String pop() {
        if (first == null) {
            return null;
        }

        size--;
        // If there is only 1 element in the stack
        if (first == last) {
            String value = first.value;
            first = last = null;
            return value;
        }

        // If there are more than 1 element in the stack
        String value = last.value;
        last = last.previous;
        last.next = null;

        return value;
    }

    @Override
    public String peek() {
        if (first == null) {
            return null;
        }
        return last.value;
    }

    @Override
    public String toString() {
        if (first == null) {
            return null;
        }

        Node node = first;
        StringBuilder sb = new StringBuilder();
        // Traverse and append all nodes
        while (node != null) {
            sb.append(',');
            sb.append(node.value);
            node = node.next;
        }

        // Delete the first ","
        sb.deleteCharAt(0);

        return sb.toString();
    }

    public int size() {
        return size;
    }
}
