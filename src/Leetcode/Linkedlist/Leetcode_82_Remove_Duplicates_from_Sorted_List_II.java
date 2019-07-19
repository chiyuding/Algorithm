package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_82_Remove_Duplicates_from_Sorted_List_II {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(head.val - 1);
        dummy.next = head;
        ListNode slow = dummy, fast;

        while(slow.next != null) {
            fast = slow.next;
            if(fast.next == null || fast.val != fast.next.val) {
                slow = fast;
            }else {
                while(fast.next != null && fast.val == fast.next.val) {
                    fast = fast.next;
                }
                slow.next = fast.next;
            }
        }
        return dummy.next;
    }

}
