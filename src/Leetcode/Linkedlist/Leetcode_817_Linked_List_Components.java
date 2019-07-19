package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Leetcode_817_Linked_List_Components {
    public static int numComponents(ListNode head, int[] G) {
        int res = 0;
        HashSet<Integer> values = new HashSet<>();
        for(int value : G) {
            values.add(value);
        }
        ListNode cur = head;
        while(cur != null) {
            if(!values.contains(cur.val)) {
                cur = cur.next;
            }else {
                ListNode temp = cur.next;
                while(temp != null && values.contains(temp.val)) {
                    temp = temp.next;
                }
                res++;
                cur = temp;
            }
        }
        return res;
    }
}
