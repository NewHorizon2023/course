package Algorithms.Sort;

/**
 * InsertionSortByLinkedList
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-06-17
 */
public class InsertionSortByLinkedList {
    public static SingleLinkedList insertionSortByLinkedList(int[] arr) {
        SingleLinkedList list = new SingleLinkedList(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            SingleLinkedList.Node current = list.first;
            SingleLinkedList.Node previous = null;
            while (current != null && arr[i] > current.item) {
                previous = current;
                current = current.next;
            }

            SingleLinkedList.Node newNode = new SingleLinkedList.Node(arr[i]);
            if (previous == null) {
                newNode.next = list.first;
                list.first = newNode;
            } else if (current == null) {
                previous.next = newNode;
                list.last = newNode;
            } else {
                newNode.next = current;
                previous.next = newNode;
            }
        }
        return list;
    }

    public static class SingleLinkedList {
        private static class Node {
            private final int item;
            private Node next;

            private Node(int item) {
                this.item = item;
            }
        }

        private Node first;
        private Node last;

        public SingleLinkedList(int item) {
            first = last = new Node(item);
        }

        public String toString() {
            if (first == null) {
                return null;
            }
            Node node = first;
            StringBuilder sb = new StringBuilder();
            while (node != null) {
                sb.append(", ").append(node.item);
                node = node.next;
            }
            // replace the beginning character from "," to "[", and add "]" at the end
            sb.replace(0, 1, "[").append("]");

            return sb.toString();
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (arr.length * Math.random());
        }
        long start = System.currentTimeMillis();
        SingleLinkedList list = insertionSortByLinkedList(arr);
        long end = System.currentTimeMillis();
        System.out.println("Insertion sort time: " + (end - start) + "ms");
        System.out.println(list);
    }
}
