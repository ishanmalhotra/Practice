package Logical.LinkedList;

import Logical.LinkedList.Helper.CharLinkedListHelper;
import Logical.LinkedList.Helper.IntLinkedListHelper;
import Logical.LinkedList.Model.LinkedListDataModelChar;
import Logical.LinkedList.Model.LinkedListDataModelInt;

/**
 * Created by ishanmalhotra on 29/4/16.
 */
public class LinkedListPalindrome {

    public static void main(String[] arfs){
        LinkedListDataModelChar linkedListHead= CharLinkedListHelper.createLinkedList('a');
        LinkedListDataModelChar list=CharLinkedListHelper.addElement(linkedListHead,'b');
        list=CharLinkedListHelper.addElement(list,'c');
        list=CharLinkedListHelper.addElement(list,'b');
        list=CharLinkedListHelper.addElement(list,'a');
        CharLinkedListHelper.printAllElemets(linkedListHead);

    }
}
