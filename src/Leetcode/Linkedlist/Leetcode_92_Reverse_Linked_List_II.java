package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_92_Reverse_Linked_List_II {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1);
        int i = 0;
        ListNode prev = dummy;
        dummy.next = head;
        while(++i < m){
            prev = prev.next;
        }
        ListNode node1 = prev;
        ListNode cur = prev.next;
        while(i++ <= n){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        node1.next.next = cur;
        node1.next = prev;
        return dummy.next;
    }
}
