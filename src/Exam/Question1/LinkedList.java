package Exam.Question1;

import java.util.Objects;

/**
 * @author Xiangnan Liu
 * @date 2023-07-27 14:33
 */
public class LinkedList {
    private Node first;
    private Node last;

    /**
     * If the list is empty
     *
     * @return
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Get appointment by index
     *
     * @param index
     * @return
     */
    public String getAppointment(int index) {
        int i = 0;
        Node node = first;
        while (node != null) {
            // If the specified element is found, return its value
            if (i == index) {
                return node.getValue().toString();
            }
            i++;
            node = node.getNext();
        }

        return null;
    }

    /**
     * Add a new node at the end of the linked list.
     *
     * @param appointment
     */
    public void add(Appointment appointment) {
        if (isEmpty()) {
            first = last = new Node(appointment);
            return;
        }

        last.setNext(new Node(appointment));
        last = last.getNext();
    }

    /**
     * Remove node by patient code.
     * If successfully removed a node, return 1, else return 0.
     * The return value show how many nodes are removed
     *
     * @param patientCode
     * @return
     */
    public int remove(String patientCode) {
        if (isEmpty()) {
            return 0;
        }

        // If the first node is the one found, remove it
        if (Objects.equals(first.getValue().getCode(), patientCode)) {
            // If there is only one node, and it is the one being looked for
            if (first == last) {
                first = last = null;
            } else {
                // delete the pointer of the first node, in order to clear it by the gc
                first.setNext(null);
                first = first.getNext();
            }

            return 1;
        }

        Node previous = first;
        Node current = previous.getNext();
        while (current != null) {
            // Find and remove the node
            if (Objects.equals(current.getValue().getCode(), patientCode)) {
                // If it is the last node
                if (current == last) {
                    last = previous;
                }

                previous.setNext(current.getNext());
                // delete the pointer of the deleted node, in order to clear it by the gc
                current.setNext(null);

                return 1;
            }

            previous = current;
            current = current.getNext();
        }

        return 0;
    }
}
