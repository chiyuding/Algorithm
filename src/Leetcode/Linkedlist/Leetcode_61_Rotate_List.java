package Leetcode.Linkedlist;

public class Leetcode_61_Rotate_List {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        int size = 1;
        ListNode fast = head, slow = head;

        while(fast.next!=null) {
            size++;
            fast = fast.next;
        }
        for(int i = size - k % size; i > 1; i--) {
            slow = slow.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}
