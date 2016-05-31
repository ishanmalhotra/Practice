package Logical.LinkedList.Helper;

import Logical.LinkedList.Model.LinkedListDataModelChar;

/**
 * Created by ishanmalhotra on 29/4/16.
 */
public class CharLinkedListHelper {

    public static LinkedListDataModelChar createLinkedList(char i){
        LinkedListDataModelChar linkedList=new LinkedListDataModelChar(i,null);
        return linkedList;
    }

    public static LinkedListDataModelChar addElement(LinkedListDataModelChar linkedListHead, char b) {
        LinkedListDataModelChar linkedListDataModelChar=new LinkedListDataModelChar(b,null);
        linkedListHead.next=linkedListDataModelChar;
        return linkedListDataModelChar;
    }

    public static void printAllElemets(LinkedListDataModelChar linkedListHead) {
        LinkedListDataModelChar conductor=linkedListHead;
        while(conductor!=null){
            System.out.println(conductor.node);
            conductor=conductor.next;
        }
    }
}
