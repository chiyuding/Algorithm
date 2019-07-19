package Leetcode.Linkedlist;

public class Leetcode_24_Swap_Nodes_in_Pairs {
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy, cur = head;
        while(cur != null && cur.next != null) {
            ListNode temp = cur.next.next;
            prev.next = cur.next;
            cur.next.next = cur;
            cur.next = temp;
            prev = cur;
            cur = temp;
        }
        return dummy.next;
    }
}
