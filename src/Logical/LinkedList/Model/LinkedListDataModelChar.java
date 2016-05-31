package Logical.LinkedList.Model;

/**
 * Created by ishanmalhotra on 29/4/16.
 */
public class LinkedListDataModelChar {

    public char node;
    public LinkedListDataModelChar next;

    public LinkedListDataModelChar(char node, LinkedListDataModelChar next) {
        this.node = node;
        this.next = next;
    }

    @Override
    public String toString() {
        return "LinkedListDataModelChar{" +
                "node=" + node +
                ", next=" + next +
                '}';
    }
}
