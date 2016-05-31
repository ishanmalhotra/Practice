package Logical.LinkedList;

import Logical.LinkedList.Helper.IntLinkedListHelper;
import Logical.LinkedList.Model.LinkedListDataModelInt;

/**
 * Created by ishanmalhotra on 30/4/16.
 */
public class LinkedListMergeAndSort {

    public static void main(String args[]){
        LinkedListDataModelInt linkedListHead = IntLinkedListHelper.createLinkedList(1);
        LinkedListDataModelInt list = IntLinkedListHelper.addElement(linkedListHead,5);
        list = IntLinkedListHelper.addElement(list,7);
        list = IntLinkedListHelper.addElement(list,9);

        LinkedListDataModelInt linkedListHead2 = IntLinkedListHelper.createLinkedList(2);
        LinkedListDataModelInt list2 = IntLinkedListHelper.addElement(linkedListHead2,3);
        list2 = IntLinkedListHelper.addElement(list2,4);
        list2 = IntLinkedListHelper.addElement(list2,6);

        LinkedListDataModelInt MergedHead=MergeAndSort(linkedListHead,linkedListHead2);
        IntLinkedListHelper.printAllElemets(MergedHead);


    }

    public static LinkedListDataModelInt MergeAndSort(LinkedListDataModelInt linkedListHead, LinkedListDataModelInt linkedListHead2) {
        LinkedListDataModelInt newHead=null;
        LinkedListDataModelInt condtuctor1=linkedListHead;
        LinkedListDataModelInt condtuctor2=linkedListHead2;
        LinkedListDataModelInt temp=null;
        newHead=condtuctor1.node<condtuctor2.node?condtuctor1:condtuctor2;
        while (condtuctor1.next !=null && condtuctor2.next!=null){
            if(condtuctor1.node<condtuctor2.node){
                temp=condtuctor1.next;
                condtuctor1.next=temp.node<condtuctor2.node?temp:condtuctor2;
                condtuctor1=temp;
            }else {
                temp=condtuctor2.next;
                condtuctor2.next=temp.node<condtuctor1.node?temp:condtuctor1;
                condtuctor2=temp;
            }
        }
        if(condtuctor1==null){
            condtuctor1=condtuctor2;
        }else condtuctor2=condtuctor1;
        return newHead;
    }
}
