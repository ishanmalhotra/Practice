package Logical.Trees.IMPL;

import Logical.Trees.Model.BinaryTreeIntModel;

/**
 * Created by ishanmalhotra on 28/5/16.
 */
public class ChildrenSumProperty {

    public static void main(String... a){
        BinaryTreeIntModel btree = TreeTraversal.getBTree();
        BinaryTreeIntModel btree2=getBTree();
        System.out.println(isChildrenSumPropertySatisfied(btree2));
    }

    private static boolean isChildrenSumPropertySatisfied(BinaryTreeIntModel btree) {
        if (btree==null || (btree.left==null&&btree.right==null))
            return true;
        if(btree.data !=  (btree.left==null?0:btree.left.data)+(btree.right==null?0:btree.right.data))
            return false;
        return (isChildrenSumPropertySatisfied(btree.left)&&isChildrenSumPropertySatisfied(btree.right));
    }

    public static BinaryTreeIntModel getBTree() {
        BinaryTreeIntModel btree=new BinaryTreeIntModel(10);
        btree.left=new BinaryTreeIntModel(8);
        btree.right=new BinaryTreeIntModel(2);
        btree.left.left=new BinaryTreeIntModel(3);
        btree.right.left=new BinaryTreeIntModel(3);
        btree.left.right=new BinaryTreeIntModel(5);
        return btree;

             /*10
             8      2
           3   5

           */
    }
}
