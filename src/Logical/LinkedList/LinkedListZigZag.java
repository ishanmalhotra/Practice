package Logical.LinkedList;

import Logical.LinkedList.Helper.IntLinkedListHelper;
import Logical.LinkedList.Model.LinkedListDataModelInt;

/**
 * Created by ishanmalhotra on 29/4/16.
 */

/*Rearrange a Linked List in Zig-Zag fashion
        Given a linked list, rearrange it such that converted list should be of the form a < b > c < d > e < f .. where a, b, c.. are consecutive data node of linked list. Examples :

        Input:  1->2->3->4
        Output: 1->3->2->4

        Input:  11->15->20->5->10
        Output: 11->20->5->15->10*/
public class LinkedListZigZag {

    public static void main(String args[]) {
        LinkedListDataModelInt linkedListHead = IntLinkedListHelper.createLinkedList(11);
        LinkedListDataModelInt list = IntLinkedListHelper.addElement(linkedListHead, 15);
        list = IntLinkedListHelper.addElement(list, 20);
        list = IntLinkedListHelper.addElement(list, 5);
        list = IntLinkedListHelper.addElement(list, 10);

        DoZigZag(linkedListHead);
        IntLinkedListHelper.printAllElemets(linkedListHead);
    }

    public static void DoZigZag(LinkedListDataModelInt linkedListHead) {
        int count=0;
        LinkedListDataModelInt previous=null;
        LinkedListDataModelInt conductor=linkedListHead;
        LinkedListDataModelInt nextN=conductor.next;
        while (conductor.next!=null){
            if(count%2==1){
                previous.next=conductor.next;
                conductor.next=nextN.next;
                nextN.next=conductor;
                conductor=conductor.next;
                count++;
            }else {
                count++;
                previous=conductor;
                conductor=conductor.next;
                nextN=conductor.next;
            }
        }
    }
}
