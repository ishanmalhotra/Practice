package Logical.LinkedList.Helper;

import Logical.LinkedList.Model.DobulyIntLinkedList;
import Logical.LinkedList.Model.LinkedListDataModelInt;

/**
 * Created by ishanmalhotra on 2/5/16.
 */
public class IntDobulyLinkedListHelper {

    public static DobulyIntLinkedList createLinkedList(int i){
        DobulyIntLinkedList linkedList=new DobulyIntLinkedList(i,null,null);
        return linkedList;
    }

    public static DobulyIntLinkedList addElement(DobulyIntLinkedList linkedListHead, int b) {
        DobulyIntLinkedList dobulyIntLinkedList=new DobulyIntLinkedList(b,null,linkedListHead);
        linkedListHead.next=dobulyIntLinkedList;
        return dobulyIntLinkedList;
    }

    public static void printAllElementsFromStart(DobulyIntLinkedList linkedListHead) {
        DobulyIntLinkedList conductor=linkedListHead;
        while(conductor!=null){
            System.out.println(conductor.node);
            conductor=conductor.next;
        }
    }

    public static void printAllElementsFromBack(DobulyIntLinkedList list) {
        DobulyIntLinkedList conductor=list;
        while(conductor!=null){
            System.out.println(conductor.node);
            conductor=conductor.prevoius;
        }
    }
}
