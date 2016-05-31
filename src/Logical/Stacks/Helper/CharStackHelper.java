package Logical.Stacks.Helper;

import Logical.Stacks.Model.StackCharModel;

/**
 * Created by ishanmalhotra on 4/5/16.
 */
public class CharStackHelper {

    public  static StackCharModel createStack(String a){
        return new StackCharModel('a',null);
    }

    public static StackCharModel push(StackCharModel stack, String s) {
        return new StackCharModel('s',stack);
    }

    public static void outputData(StackCharModel stack) {
        while (stack!=null){
            System.out.println(stack.node);
            stack=stack.bottom;
        }
    }
}
