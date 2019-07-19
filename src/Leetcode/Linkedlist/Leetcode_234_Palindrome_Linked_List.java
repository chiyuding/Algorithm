package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_234_Palindrome_Linked_List {
    public static boolean isPalindrome(ListNode head) {
        if(head == null) {
            return true;
        }
        ListNode middle = findMiddle(head).next;
        ListNode tail = reverseLinkedList(middle);
        while(head != null && tail != null) {
            if(head.val != tail.val) {
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        return true;
    }

    private static ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null, cur = head;
        while(cur != null) {
            ListNode node = cur.next;
            cur.next = prev;
            prev = cur;
            cur = node;
        }
        return prev;
    }
}
