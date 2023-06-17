package LeetCode.easy;

/**
 * Palindrome Linked List
 * <a href="https://leetcode.com/problems/palindrome-linked-list/description/?envType=featured-list&envId=challenges-for-new-users">...</a>"
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-06-17
 */
public class PalindromeLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        int size = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            size++;
        }

        node = head;
        int sign = 0;
        int mid = size / 2;
        for (int i = 1; i <= mid; i++) {
            sign = sign + i * i * node.val;
            node = node.next;
        }
        if (size % 2 == 1) {
            node = node.next;
        }
        for (int i = mid; i >= 1; i--) {
            sign = sign - i * i * node.val;
            node = node.next;
        }

        return sign == 0;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode((int) (9 * Math.random()));
        ListNode node = head;
        for (int i = 0; i < 1; i++) {
            node.next = new ListNode((int) (9 * Math.random()));
            node = node.next;
        }
        System.out.println(isPalindrome(head));

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(head));
    }

}
