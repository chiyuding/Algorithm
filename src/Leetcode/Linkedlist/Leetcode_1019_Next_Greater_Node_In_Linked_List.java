package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_1019_Next_Greater_Node_In_Linked_List {
    public static int[] nextLargerNodes(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<int[]> stack = new ArrayList<>();
        int index = 0;
        ListNode cur = head;
        while(cur != null) {
            while(!stack.isEmpty() && stack.get(stack.size() - 1)[1] < cur.val) {
                int[] popItem = stack.remove(stack.size() - 1);
                map.put(popItem[0], cur.val);
            }
            int[] element = {index, cur.val};
            stack.add(element);
            index++;
            cur = cur.next;
        }
        int[] res = new int[index];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            res[key] = value;
        }
        return res;
    }
}
