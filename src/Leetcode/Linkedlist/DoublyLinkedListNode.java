package Leetcode.Linkedlist;

public class DoublyLinkedListNode {
    public int val;
    public DoublyLinkedListNode prev;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode child;

    public DoublyLinkedListNode() {}

    public DoublyLinkedListNode(int _val,  DoublyLinkedListNode _prev, DoublyLinkedListNode _next, DoublyLinkedListNode _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
}
