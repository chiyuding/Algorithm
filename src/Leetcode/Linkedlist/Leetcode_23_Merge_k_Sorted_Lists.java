package Leetcode.Linkedlist;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Leetcode_23_Merge_k_Sorted_Lists {
    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Object[]> heap = new PriorityQueue<>(new myComparator());
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        for(ListNode node : lists) {
            if(node != null) {
                Object[] temp = {node.val, node};
                heap.add(temp);
            }
        }
        while(!heap.isEmpty()) {
            ListNode popItem = (ListNode)heap.poll()[1];
            cur.next = popItem;
            cur = cur.next;
            if(popItem.next != null) {
                Object[] temp = {popItem.next.val, popItem.next};
                heap.add(temp);
            }
        }
        return dummy.next;
    }
}

class myComparator implements Comparator<Object[]>{
    public int compare(Object[] obj1, Object[] obj2)
    {
        int val1 = (int)obj1[0], val2 = (int)obj2[0];
        if(val1 < val2) {
            return -1;
        } else if(val1 > val2) {
            return 1;
        }
        return 0;
    }
}
