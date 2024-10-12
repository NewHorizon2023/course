package DataStructure.LinkedList;

import java.util.Objects;

public class MySingleLinkedList<T> {
    private static class Node<T> {
        private final T item;
        private Node<T> next;

        private Node(T item) {
            this.item = item;
        }
    }

    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public MySingleLinkedList() {

    }

    public void addFirst(T item) {
        size++;
        if (first == null) {
            first = last = new Node<>(item);
            return;
        }
        Node<T> newNode = new Node<>(item);
        newNode.next = first;
        first = newNode;
    }

    public void addLast(T item) {
        size++;
        if (last == null) {
            first = last = new Node<>(item);
            return;
        }
        Node<T> newNode = new Node<>(item);
        last.next = newNode;
        last = newNode;
    }

    public void removeFirst() {
        // if there is 0 or 1 item in the list
        if (first == last) {
            first = last = null;
            size = 0;
            return;
        }
        Node<T> second = first.next;
        // put first.next to null, in case the first item cannot be cleared by gc
        first.next = null;
        first = second;
        size--;
    }

    public void removeLast() {
        // if there is 0 or 1 item in the list
        if (first == last) {
            first = last = null;
            size = 0;
            return;
        }
        // find the penultimate node
        Node<T> penultimate = first;
        while (penultimate.next != last) {
            penultimate = penultimate.next;
        }
        penultimate.next = null;
        last = penultimate;
        size--;
    }

    public void remove(T item) {
        if (first == null) {
            return;
        }

        if (Objects.equals(first.item, item)) {
            first = first.next;
            return;
        }

        Node<T> previous = first;
        Node<T> current = previous.next;
        while (current != null) {
            if (Objects.equals(current.item, item)) {
                previous.next = current.next;
                // delete the pointer of the deleted item, in order to clear it by the gc
                current.next = null;
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public boolean contains(T item) {
        if (first == null) {
            return false;
        }
        Node<T> node = first;
        while (node.next != null) {
            if (Objects.equals(node.item, item)) {
                return true;
            }
            node = node.next;
        }

        return false;
    }

    public int indexOf(T item) {
        int index = 0;
        Node<T> node = first;
        while (node != null) {
            if (Objects.equals(node.item, item)) {
                return index;
            }
            node = node.next;
            index++;
        }
        return -1;
    }

    public void revert() {
        Node<T> previous = null;
        Node<T> current = first;

        while (current != null) {
            Node<T> nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
    }

    public String toString() {
        if (first == null) {
            return null;
        }
        Node<T> node = first;
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(", ").append(node.item.toString());
            node = node.next;
        }
        // replace the beginning character from "," to "[", and add "]" at the end
        sb.replace(0, 1, "[").append("]");

        return sb.toString();
    }

}
