package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_237_Delete_Node_in_a_Linked_List {
    public static void deleteNode(ListNode head, ListNode node) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        while(cur.next != node)
            cur = cur.next;
        cur.next = cur.next.next;
        dummy.next = null;
    }

    /*
    public static void deleteNode1(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

     */
}
