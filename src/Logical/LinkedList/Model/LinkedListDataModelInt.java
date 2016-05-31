package Logical.LinkedList.Model;

/**
 * Created by ishanmalhotra on 29/4/16.
 */
public class LinkedListDataModelInt {

    public int node;

    public LinkedListDataModelInt next;

    public LinkedListDataModelInt(int node, LinkedListDataModelInt next) {
        this.node = node;
        this.next = next;
    }

    @Override
    public String toString() {
        return "LinkedListDataModelInt{" +
                "node=" + node +
                ", next=" + next +
                '}';
    }
}
