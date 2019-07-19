package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_143_Reorder_List {
    public static void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }
        ListNode temp = findMiddle(head);
        ListNode middle = temp.next;
        temp.next = null;
        ListNode tail = reverse(middle);
        ListNode prev = head;
        ListNode l1 = head.next, l2 = tail;
        int i = 0;
        while(l1 != null || l2 != null) {
            if(i % 2 == 0) {
                prev.next = l2;
                prev = l2;
                l2 = l2.next;
            }else {
                prev.next = l1;
                prev = l1;
                l1 = l1.next;
            }
            i++;
        }
    }

    private static ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null, cur = head;
        while(cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
