package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_206_Reverse_Linked_List {
    // iteration
    public static ListNode reverseList1(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode prev = head, cur = head.next;
        ListNode temp;
        head.next = null;
        while(cur != null){
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;

        }
        return prev;
    }

    // recursion
    public static ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode next = head.next;
        head.next = null;
        ListNode newHead = reverseList2(next);
        next.next = head;
        return newHead;
    }
}
