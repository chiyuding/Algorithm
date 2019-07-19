package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_203_Remove_Linked_List_Elements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while(prev.next != null) {
            if(prev.next.val == val) {
                prev.next = prev.next.next;
            }else {
                prev = prev.next;
            }
        }
        return dummy.next;
    }
}
