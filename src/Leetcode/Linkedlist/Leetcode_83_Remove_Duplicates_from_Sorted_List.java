package Leetcode.Linkedlist;

public class Leetcode_83_Remove_Duplicates_from_Sorted_List {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = head;
        dummy.next = head;
        while(cur != null) {
            if(cur.next == null) {
                break;
            } else {
                if(cur.val != cur.next.val) {
                    cur = cur.next;
                } else {
                    cur.next = cur.next.next;
                }
            }
        }
        return dummy.next;
    }
}
