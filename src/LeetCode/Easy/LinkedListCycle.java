package LeetCode.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/linked-list-cycle/">...</a>
 *
 * @author 刘祥楠
 * @date 2023-06-20 17:18
 */
public class LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode node = head;
        while (true) {
            if (node == null) {
                return false;
            }
            if (set.contains(node)) {
                return true;
            }
            set.add(node);
            node = node.next;
        }
    }

    public boolean hasCycle2(ListNode head) {
        ListNode node = head;
        while (node != null) {
            if (node.val == 100001) {
                return true;
            }
            node.val = 100001;
            node = node.next;
        }

        return false;
    }

}
