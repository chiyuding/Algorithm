package Leetcode.Linkedlist;

public class Leetcode_25_Reverse_Nodes_in_k_Group {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = head;
        ListNode prev = dummy;
        Loop: while(cur != null) {
            int cnt = 1;
            ListNode it = cur;
            while(cnt++ < k) {
                if(it.next == null) {
                    prev.next = cur;
                    break Loop;
                }
                it = it.next;
            }
            ListNode temp = it.next;
            it.next = null;
            prev.next = reverse(cur);
            prev = cur;
            cur = temp;
        }
        return dummy.next;
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode temp = cur.next;
            cur.next= prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
