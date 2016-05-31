package Logical.Stacks.Model;

/**
 * Created by ishanmalhotra on 24/5/16.
 */
public class StackIntMOdel {

    public int node;

    public StackIntMOdel bottom;

    public StackIntMOdel(int node, StackIntMOdel bottom) {
        this.node = node;
        this.bottom = bottom;
    }

    @Override
    public String toString() {
        return "StackIntMOdel{" +
                "node=" + node +
                ", bottom=" + bottom +
                '}';
    }
}
