package Logical.LinkedList;

import Logical.LinkedList.Helper.IntLinkedListHelper;
import Logical.LinkedList.Model.LinkedListDataModelInt;

/**
 * Created by ishanmalhotra on 30/5/16.
 */
public class NthNodeFromEnd {

    public static void main(String... a){
        LinkedListDataModelInt linkedListHead = IntLinkedListHelper.createLinkedList(1);
        LinkedListDataModelInt list = IntLinkedListHelper.addElement(linkedListHead,8);
        list = IntLinkedListHelper.addElement(list,9);
        list = IntLinkedListHelper.addElement(list,10);

        System.out.println("nth node from end is "+nthNodeFromEnd(linkedListHead,5));
    }

    private static int nthNodeFromEnd(LinkedListDataModelInt linkedListHead, int n) {
            LinkedListDataModelInt temp=linkedListHead,ret=linkedListHead;
            for(int i=0;i<n;i++){
                temp=temp.next;
            }
        while (temp!=null){
            temp=temp.next;
            ret=ret.next;
        }
        return ret.node;
    }
}
