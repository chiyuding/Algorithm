package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_86_Partition_List {
    public static ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1), dummy2 = new ListNode(-1);
        ListNode l1 = dummy1, l2 = dummy2;
        ListNode cur = head;
        while(cur !=  null) {
            ListNode temp = cur.next;
            if(cur.val < x) {
                l1.next = cur;
                l1 = l1.next;
            }else {
                l2.next = cur;
                l2 = l2.next;
            }
            cur.next = null;
            cur = temp;
        }
        l1.next = dummy2.next;
        return dummy1.next;
    }
}
