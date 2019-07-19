package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

import java.util.ArrayList;

public class Leetcode_445_Add_Two_Numbers_II {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> stack1 = new ArrayList<>(), stack2 = new ArrayList<>();
        ListNode cur1 = l1, cur2 = l2;
        while(cur1 != null) {
            stack1.add(cur1.val);
            cur1 = cur1.next;
        }
        while(cur2 != null) {
            stack2.add(cur2.val);
            cur2 = cur2.next;
        }
        ListNode dummy = new ListNode(-1);
        int index1 = stack1.size() - 1, index2 = stack2.size() - 1;
        int flag = 0;
        while(index1 >= 0 || index2 >= 0) {
            int val1 = 0, val2 = 0;
            if(index1 >= 0) {
                val1 = stack1.get(index1);
            }
            if(index2 >= 0) {
                val2 = stack2.get(index2);
            }
            int sum = val1 + val2 + flag;
            flag = sum / 10;
            int value = sum % 10;
            ListNode insertNode = new ListNode(value);
            if(dummy.next == null) {
                dummy.next = insertNode;
            }else {
                ListNode temp = dummy.next;
                dummy.next = insertNode;
                insertNode.next = temp;
            }
            index1--;
            index2--;
        }
        if(flag == 0) {
            return dummy.next;
        }else {
            ListNode newHead = new ListNode(1);
            newHead.next = dummy.next;
            return newHead;
        }
    }
}