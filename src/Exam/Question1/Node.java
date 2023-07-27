package Exam.Question1;

/**
 * @author Xiangnan Liu
 * @date 2023-07-27 14:27
 */
public class Node {
    private Appointment value;
    private Node next;

    public Node(Appointment appointment) {
        value = appointment;
    }

    public Appointment getValue() {
        return value;
    }

    public void setValue(Appointment value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value.toString() + '\'' +
                ", next=" + next +
                '}';
    }
}
