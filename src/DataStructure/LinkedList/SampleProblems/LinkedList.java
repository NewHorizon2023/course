package DataStructure.LinkedList.SampleProblems;

import java.util.Objects;

/**
 * @author 刘祥楠
 * @date 2023-06-29 14:49
 */
public class LinkedList {
    private static class Node {
        private final Record value;
        private Node next;

        private Node(Record record) {
            this.value = record;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int getAverage() {
        if (first == null) {
            return 0;
        }

        int totalMark = 0;
        Node node = first;
        while (node != null) {
            totalMark += node.value.getMark();
            node = node.next;
        }
        return totalMark / size;
    }

    public void add(String subject, int mark) {
        Node[] nodes = findNodeAndBeforeBySubject(subject);
        if (nodes[1] != null) {
            nodes[1].value.setMark(mark);
            return;
        }

        size++;
        Node node = new Node(new Record(subject, mark));
        if (last == null) {
            first = last = node;
            return;
        }
        last.next = node;
        last = node;
    }

    public void remove(String subject) {
        Node[] nodes = findNodeAndBeforeBySubject(subject);
        if (nodes[1] == null) {
            return;
        }

        size--;
        if (nodes[0] == null) {
            first = last = null;
            return;
        }
        nodes[0].next = nodes[1].next;
        nodes[1].next = null;
    }

    private Node[] findNodeAndBeforeBySubject(String subject) {
        Node[] nodeArr = new Node[2];
        if (first == null) {
            return nodeArr;
        }

        if (Objects.equals(first.value.getSubject(), subject)) {
            nodeArr[1] = first;
            return nodeArr;
        }

        Node before = first;
        Node current = before.next;
        while (current != null) {
            if (Objects.equals(current.value.getSubject(), subject)) {
                nodeArr[0] = before;
                nodeArr[1] = current;
                return nodeArr;
            }
            before = current;
            current = current.next;
        }

        return nodeArr;
    }
}
