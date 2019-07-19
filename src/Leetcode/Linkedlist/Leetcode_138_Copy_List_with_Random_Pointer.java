package Leetcode.Linkedlist;

import java.util.HashMap;

public class Leetcode_138_Copy_List_with_Random_Pointer {
    public Node copyRandomList(Node head) {
        Node dummy1 = new Node(-1, head, head);
        Node dummy2 = new Node(-1, null, null);
        HashMap<Node, Node> visitedNext = new HashMap<>();
        Node cur1 = dummy1, cur2 = dummy2;
        while(cur1 != null) {
            Node newNode = null, newRandom = null;
            if(!visitedNext.containsKey(cur1.next)) {
                if(cur1.next != null) {
                    newNode = new Node(cur1.next.val, null, null);
                    visitedNext.put(cur1.next, newNode);
                }
            }else {
                newNode = visitedNext.get(cur1.next);
            }

            if(!visitedNext.containsKey(cur1.random)) {
                if(cur1.random != null) {
                    newRandom = new Node(cur1.random.val, null, null);
                    visitedNext.put(cur1.random, newRandom);
                }
            }else {
                newRandom = visitedNext.get(cur1.random);
            }
            cur2.next = newNode;
            cur2.random = newRandom;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return dummy2.next;
    }

}
