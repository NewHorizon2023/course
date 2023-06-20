package LeetCode.Easy;

import java.util.HashSet;
import java.util.Set;

/**
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

}
