package Logical.Trees.IMPL;

import Logical.Trees.Model.BinaryTreeIntModel;

/**
 * Created by ishanmalhotra on 27/5/16.
 */
public class ConvertToMirrorTree {

    public static void main(String... args){

        BinaryTreeIntModel btree= TreeTraversal.getBTree();
        BinaryTreeIntModel btree2=null;
        btree2=MirrorTree(btree,btree2);
        MirrorTree2(btree);
        TreeTraversal.preorder(btree2);
        System.out.println("@nd is :");
        TreeTraversal.preorder(btree);
    }

    private static void MirrorTree2(BinaryTreeIntModel A) {
        if(A==null)
            return;
        MirrorTree2(A.left);
        MirrorTree2(A.right);
        BinaryTreeIntModel temp;
        temp=A.left;
        A.left=A.right;
        A.right=temp;

    }

    private static BinaryTreeIntModel MirrorTree(BinaryTreeIntModel A, BinaryTreeIntModel B) {
        if(A==null)
            return null;
        B=new BinaryTreeIntModel(A.data);
        B.left=MirrorTree(A.right,B);
        B.right=MirrorTree(A.left,B);
        return B;
    }


}
