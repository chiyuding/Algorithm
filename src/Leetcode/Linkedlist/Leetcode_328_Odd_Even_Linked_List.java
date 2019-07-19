package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_328_Odd_Even_Linked_List {
    public static ListNode oddEvenList(ListNode head) {
        ListNode oddDummy = new ListNode(-1), l1 = oddDummy;
        ListNode evenDummy = new ListNode(-1), l2 = evenDummy;
        int i = 1;
        ListNode cur = head;
        while(cur != null) {
            ListNode temp = cur.next;
            cur.next = null;
            if(i % 2 == 1) {
                l1.next = cur;
                l1 = l1.next;
            }else {
                l2.next = cur;
                l2 = l2.next;
            }
            cur = temp;
            i++;
        }
        l1.next = evenDummy.next;
        return oddDummy.next;
    }
}
