package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_160_Intersection_of_Two_Linked_Lists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode h1 = headA, h2 = headB;
        while(h1 != h2){
            h1 = h1 == null ? headA : h2.next;
            h2 = h2 == null ? headB : h1.next;
        }
        return h1;
    }
}
