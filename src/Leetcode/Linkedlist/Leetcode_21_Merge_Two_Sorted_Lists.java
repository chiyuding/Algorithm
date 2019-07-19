package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_21_Merge_Two_Sorted_Lists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
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
        return dummy.next;
    }
}
