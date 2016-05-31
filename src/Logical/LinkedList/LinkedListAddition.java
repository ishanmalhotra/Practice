package Logical.LinkedList;

import Logical.LinkedList.Helper.IntLinkedListHelper;
import Logical.LinkedList.Model.LinkedListDataModelInt;

/**
 * Created by ishanmalhotra on 29/4/16.
 */
public class LinkedListAddition {

    public static void main(String args[]){
        LinkedListDataModelInt linkedListHead = IntLinkedListHelper.createLinkedList(1);
        LinkedListDataModelInt list = IntLinkedListHelper.addElement(linkedListHead,9);
        list = IntLinkedListHelper.addElement(list,9);
        list = IntLinkedListHelper.addElement(list,9);


        linkedListHead= IntLinkedListHelper.doReversal(linkedListHead);
//        IntLinkedListHelper.printAllElemets(linkedListHead);

        linkedListHead= doSum(linkedListHead,999);
        linkedListHead= IntLinkedListHelper.doReversal(linkedListHead);
        IntLinkedListHelper.printAllElemets(linkedListHead);
    }

    public static LinkedListDataModelInt doSum(LinkedListDataModelInt linkedListHead, int i) {
        LinkedListDataModelInt conductor = linkedListHead;
        int carry=0;
        int j=i;
        int temp=0;
        while (conductor!=null){
            temp=conductor.node+(j%10)+carry;
            if(temp>=10){
                conductor.node=temp%10;
                carry=temp/10;
                j/=10;
            }
            else {
                conductor.node=temp;
                carry=0;
            }
            conductor=conductor.next;
        }
        return linkedListHead;
    }
}
