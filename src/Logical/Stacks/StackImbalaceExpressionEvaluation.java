package Logical.Stacks;

import Logical.LinkedList.Helper.CharLinkedListHelper;
import Logical.Stacks.Helper.CharStackHelper;
import Logical.Stacks.Model.StackCharModel;

/**
 * Created by ishanmalhotra on 4/5/16.
 */
public class StackImbalaceExpressionEvaluation {

    public static void main(String[] args){

        String evaluation = "{{{}}}{{";

        System.out.println("Total Reversal required are: "+totalNumOfRevrsalsReqired(evaluation));
    }

    private static int totalNumOfRevrsalsReqired(String evaluation) {
        String temp="";
        int k=0;
        if(evaluation.length()%2==1)
            return -1;
        StackCharModel stack=null;
        return 1;
    }
}
