package Leetcode.Linkedlist;

import Leetcode.Linkedlist.Leetcode_23_Merge_k_Sorted_Lists;

import java.util.Comparator;
import java.util.stream.Collector;

public class Leetcode_2_Add_Two_Numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int flag = 0;
        while(l1 != null || l2 != null) {
            int val1 = 0, val2 = 0;
            if(l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            int sum = val1 + val2 + flag;
            flag = sum / 10;
            ListNode node = new ListNode(sum % 10);
            cur.next = node;
            cur = node;
        }
        if(flag == 1) {
            cur.next = new ListNode(1);
        }
        return dummy.next;
    }
}
