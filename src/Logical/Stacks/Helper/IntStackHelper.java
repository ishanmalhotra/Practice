package Logical.Stacks.Helper;

import Logical.Stacks.Model.StackIntMOdel;

/**
 * Created by ishanmalhotra on 24/5/16.
 */
public class IntStackHelper {

    public  static StackIntMOdel createStack(int a){
        return new StackIntMOdel(a,null);
    }

    public static StackIntMOdel push(int a,StackIntMOdel base){
        return new StackIntMOdel(a,base);
    }

    public static StackIntMOdel pop(StackIntMOdel top){
        StackIntMOdel toreturn= top.bottom;
        top=null;
        return toreturn;
    }

    public static void peep(StackIntMOdel top){
        System.out.println("VAlue s : "+top.node);
        return;
    }
}
