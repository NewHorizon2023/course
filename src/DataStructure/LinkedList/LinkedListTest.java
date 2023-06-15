package DataStructure.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        MySingleLinkedList<Integer> list = new MySingleLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addFirst(-1);
        list.addFirst(-2);
        list.addFirst(-3);
        list.addFirst(-4);
        System.out.println(list.contains(2));
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.remove(-2);
        System.out.println(list);
        list.revert();
        System.out.println(list);
        System.out.println(list.indexOf(0));
    }
}
