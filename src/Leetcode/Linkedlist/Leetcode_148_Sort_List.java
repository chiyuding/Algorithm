package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_148_Sort_List {
    final static ListNode dummy = new ListNode(-1);

    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode temp = findMiddle(head);
        ListNode middle = temp.next;
        temp.next = null;
        ListNode node1 = sortList(head);
        ListNode node2 = sortList(middle);
        mergeSort(node1, node2);
        return dummy.next;

    }

    private static ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    private static void mergeSort(ListNode node1, ListNode node2) {
        ListNode l1 = node1, l2 = node2;
        ListNode prev = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        if(l1 != null) {
            prev.next = l1;
        }else {
            prev.next = l2;
        }
    }
}
