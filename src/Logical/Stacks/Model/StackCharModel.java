package Logical.Stacks.Model;

/**
 * Created by ishanmalhotra on 4/5/16.
 */
public class StackCharModel {

    public char node;
    public StackCharModel bottom;

    public StackCharModel(char node, StackCharModel bottom) {
        this.node = node;
        this.bottom = bottom;
    }

    @Override
    public String toString() {
        return "StackCharModel{" +
                "node='" + node + '\'' +
                ", bottom=" + bottom +
                '}';
    }
}
