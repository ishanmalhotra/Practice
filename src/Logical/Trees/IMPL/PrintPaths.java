package Logical.Trees.IMPL;

import Logical.Trees.Model.BinaryTreeIntModel;

/**
 * Created by ishanmalhotra on 27/5/16.
 */
public class PrintPaths {

    public static void main(String... args){

        BinaryTreeIntModel btree = TreeTraversal.getBTree();
        String a="";
        printPaths(btree,a);
    }

    private static void printPaths(BinaryTreeIntModel btree,String a) {
        if(btree==null){
            System.out.println(a);
            return;
        }
        a=a+" "+btree.data;
        if(btree.left!=null)
            printPaths(btree.left,a);
        if(btree.right!=null)
            printPaths(btree.right,a);
        if(btree.left==null && btree.right==null)
            printPaths(btree.left,a);


    }
}
