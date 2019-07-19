package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_876_Middle_of_the_Linked_List {
    public static ListNode middleNode(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
