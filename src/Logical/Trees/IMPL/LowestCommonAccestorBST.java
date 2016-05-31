package Logical.Trees.IMPL;

import Logical.Trees.Model.BinaryTreeIntModel;

/**
 * Created by ishanmalhotra on 27/5/16.
 */
public class LowestCommonAccestorBST {

    public static void main(String... a){

        BinaryTreeIntModel bstree= TreeTraversal.getBSTree();
        LCA(bstree,1,1);
    }

    private static void LCA(BinaryTreeIntModel bstree, int i, int i1) {
        if(bstree==null){
            return;
        }if(bstree.data>i && bstree.data>i1)
            LCA(bstree.left,i,i1);
        else if(bstree.data<i&&bstree.data<i1)
            LCA(bstree.right,i,i1);
        else
            System.out.println("LCA: "+bstree.data);
        return;
    }
}
