package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_141_Linked_List_Cycle {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}
