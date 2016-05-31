package Logical.Trees.IMPL;

import Logical.Trees.Model.BinaryTreeIntModel;

/**
 * Created by ishanmalhotra on 26/5/16.
 */
public class CheckIdenticalTree {

    public static void main(String... args){
        BinaryTreeIntModel btree=TreeTraversal.getBTree();
        boolean isIdentical= checkIdentical(btree);
    }

    public static boolean checkIdentical(BinaryTreeIntModel btree) {
        if(btree==null)
            return true;
        return true;
    }
}
