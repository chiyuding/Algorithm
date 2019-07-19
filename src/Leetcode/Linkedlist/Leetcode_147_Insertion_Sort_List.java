package Leetcode.Linkedlist;

public class Leetcode_147_Insertion_Sort_List {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        while(cur.next != null) {
            ListNode it = cur, smallestPrev = cur;
            int minValue = Integer.MAX_VALUE;
            while(it.next != null) {
                if(it.next.val < minValue) {
                    minValue = it.next.val;
                    smallestPrev = it;
                }
                it = it.next;
            }
            ListNode temp = smallestPrev.next;
            smallestPrev.next = smallestPrev.next.next;
            temp.next = cur.next;
            cur.next = temp;
            cur = temp;
        }
        return dummy.next;
    }
}
