package Logical.LinkedList.Model;

/**
 * Created by ishanmalhotra on 1/5/16.
 */
public class DobulyIntLinkedList {

    public int node;
    public DobulyIntLinkedList next;
    public DobulyIntLinkedList prevoius;

    public DobulyIntLinkedList(int node, DobulyIntLinkedList next, DobulyIntLinkedList prevoius) {
        this.node = node;
        this.next = next;
        this.prevoius = prevoius;
    }

    @Override
    public String toString() {
        return "DobulyIntLinkedList{" +
                "node=" + node +
                ", next=" + next +
                ", prevoius=" + prevoius +
                '}';
    }
}
