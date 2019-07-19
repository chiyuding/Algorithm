package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class Leetcode_725_Split_Linked_List_in_Parts {
    public static ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] res = new ListNode[k];
        ListNode cur = root;
        int len = 0;
        while(cur != null) {
            len++;
            cur = cur.next;
        }
        int cnt = len / k;
        int i = 0;
        cur = root;
        while(cur != null) {
            int j = 1;
            ListNode temp = cur;
            while(j++ < cnt + (i < len % k ? 1 : 0)) {
                temp = temp.next;
            }
            res[i] = cur;
            i++;
            cur = temp.next;
            temp.next = null;
        }
        return res;
    }
}
