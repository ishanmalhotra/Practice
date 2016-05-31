package Logical.LinkedList.DoublyLinkedListImpl;

import Logical.LinkedList.Helper.IntDobulyLinkedListHelper;
import Logical.LinkedList.Model.DobulyIntLinkedList;

/**
 * Created by ishanmalhotra on 2/5/16.
 */
public class DLLMergeSort {


        public static void main(String args[]){
            DobulyIntLinkedList linkedListHead = IntDobulyLinkedListHelper.createLinkedList(5);
            DobulyIntLinkedList list = IntDobulyLinkedListHelper.addElement(linkedListHead,4);
            list = IntDobulyLinkedListHelper.addElement(list,3);
            list = IntDobulyLinkedListHelper.addElement(list,4);
            list = IntDobulyLinkedListHelper.addElement(list,5);

            DobulyIntLinkedList list1=DoMergeSort(linkedListHead);
            IntDobulyLinkedListHelper.printAllElementsFromStart(list1);
        }

    private static DobulyIntLinkedList DoMergeSort(DobulyIntLinkedList node) {
        if(node==null || node.next==null){
            return node;
        }
        DobulyIntLinkedList node2= split(node);
        node=DoMergeSort(node);
        node2=DoMergeSort(node2);
        return DoMerge(node,node2);
    }

    private static DobulyIntLinkedList DoMerge(DobulyIntLinkedList first, DobulyIntLinkedList second) {
        if (first == null) {
            return second;
        }

        // If second linked list is empty
        if (second == null) {
            return first;
        }

        // Pick the smaller value
        if (first.node < second.node) {
            first.next = DoMerge(first.next, second);
            first.next.prevoius = first;
            first.prevoius = null;
            return first;
        } else {
            second.next = DoMerge(first, second.next);
            second.next.prevoius = second;
            second.prevoius = null;
            return second;
        }
    }

    private static DobulyIntLinkedList split(DobulyIntLinkedList node) {
        DobulyIntLinkedList fast=node,slow=node,temp=null;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        temp=slow.next;
        slow.next=null;
        temp.prevoius=null;
        return temp;

    }
}
