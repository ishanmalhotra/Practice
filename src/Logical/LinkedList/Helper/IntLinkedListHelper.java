package Logical.LinkedList.Helper;

import Logical.LinkedList.Model.LinkedListDataModelInt;

/**
 * Created by ishanmalhotra on 29/4/16.
 */
public class IntLinkedListHelper {

    public static LinkedListDataModelInt createLinkedList(int i){
        LinkedListDataModelInt linkedList=new LinkedListDataModelInt(i,null);
        return linkedList;
    }

    public static LinkedListDataModelInt addElement(LinkedListDataModelInt linkedListHead, int b) {
        LinkedListDataModelInt linkedListDataModelChar=new LinkedListDataModelInt(b,null);
        linkedListHead.next=linkedListDataModelChar;
        return linkedListDataModelChar;
    }

    public static void printAllElemets(LinkedListDataModelInt linkedListHead) {
        LinkedListDataModelInt conductor=linkedListHead;
        while(conductor!=null){
            System.out.println(conductor.node);
            conductor=conductor.next;
        }
    }

    public static LinkedListDataModelInt doReversal(LinkedListDataModelInt linkedListHead) {
        LinkedListDataModelInt prevoius=null;
        LinkedListDataModelInt next=linkedListHead.next;
        LinkedListDataModelInt conductor=linkedListHead;
        while(conductor!=null){
            next=conductor.next;
            conductor.next=prevoius;
            prevoius=conductor;
            conductor=next;
        }
        return prevoius;
    }
}
