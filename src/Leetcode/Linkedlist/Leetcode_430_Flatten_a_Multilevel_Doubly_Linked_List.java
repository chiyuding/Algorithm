package Leetcode.Linkedlist;

public class Leetcode_430_Flatten_a_Multilevel_Doubly_Linked_List {

    public static DoublyLinkedListNode flatten(DoublyLinkedListNode head) {
        return dfs(head)[0];
    }

    private static DoublyLinkedListNode[] dfs(DoublyLinkedListNode node) {
        DoublyLinkedListNode[] res = {null, null};
        DoublyLinkedListNode  cur  = node;
        while(cur != null) { DoublyLinkedListNode nex = cur.next;
            if(cur.child == null) {
                if(nex == null) {
                    res[1] = cur;
                    return res;
                }
                cur = nex;
            } else {
                DoublyLinkedListNode child = cur.child;
                cur.child = null;
                DoublyLinkedListNode[] temp = dfs(child);
                cur.next = node;
                node.prev = cur;
                if(nex == null) {
                    return temp;
                }
                temp[1].next = nex;
                nex.prev = temp[1];
                cur = nex;
            }
        }
        return res;
    }
}



