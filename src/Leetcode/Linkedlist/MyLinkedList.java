package Leetcode.Linkedlist;

import Leetcode.Linkedlist.ListNode;

public class MyLinkedList {
    /** Initialize your data structure here. */
    private ListNode dummyHead;
    private ListNode headPtr, tailPtr;
    private int cnt = 0;

    public MyLinkedList() {
        this.dummyHead = new ListNode(-1);
        this.headPtr = dummyHead;
        this.tailPtr = dummyHead;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index + 1 > this.cnt)
            return -1;
        else{
            int i = 0;
            while(i++ <= index)
                this.headPtr = this.headPtr.next;
        }
        int value = this.headPtr.val;
        this.headPtr = this.dummyHead;
        return value;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode insertNode = new ListNode(val);
        if(this.cnt == 0){
            this.headPtr.next = insertNode;
            this.tailPtr = insertNode;
        }else{
            ListNode temp = this.headPtr.next;
            this.headPtr.next = insertNode;
            insertNode.next = temp;
        }
        this.cnt++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode insertNode = new ListNode(val);
        this.tailPtr.next = insertNode;
        this.tailPtr = insertNode;
        this.cnt++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > this.cnt)
            return;
        int i = 0;
        ListNode insertNode = new ListNode(val);
        while(i++ < index)
            this.headPtr = this.headPtr.next;
        ListNode temp = this.headPtr.next;
        this.headPtr.next = insertNode;
        insertNode.next = temp;
        this.headPtr = this.dummyHead;
        if(temp == null)
            this.tailPtr = insertNode;
        this.cnt++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index + 1 > this.cnt)
            return;
        int i = 0;
        while(i++ < index)
            this.headPtr = this.headPtr.next;
        this.headPtr.next = this.headPtr.next.next;
        if(this.headPtr.next == null)
            this.tailPtr = this.headPtr;
        this.headPtr = this.dummyHead;
        this.cnt--;
    }

}
