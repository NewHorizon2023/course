package Algorithms.Sort;

public class InsertionSortByLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertionSortByLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node sortedHead = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;

            if (sortedHead == null || current.data < sortedHead.data) {
                current.next = sortedHead;
                sortedHead = current;
            } else {
                Node sortedCurrent = sortedHead;
                while (sortedCurrent.next != null && current.data > sortedCurrent.next.data) {
                    sortedCurrent = sortedCurrent.next;
                }

                current.next = sortedCurrent.next;
                sortedCurrent.next = current;
            }

            current = nextNode;
        }

        return sortedHead;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int size = 10000;
        Node head = new Node((int) (size * Math.random()));
        Node current = head;

        for (int i = 1; i < size; i++) {
            current.next = new Node((int) (size * Math.random()));
            current = current.next;
        }

        long start6 = System.currentTimeMillis();
        Node sortedHead = insertionSortByLinkedList(head);
        long end6 = System.currentTimeMillis();
        System.out.println(end6 - start6);
    }
}
