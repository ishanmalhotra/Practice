package Logical.Trees.IMPL;

import Logical.Trees.Model.BinaryTreeIntModel;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by ishanmalhotra on 26/5/16.
 */
public class TreeTraversal {

    public static void main(String... a){

        BinaryTreeIntModel btree = getBTree();

        System.out.println("Inorder");
        inorder(btree);

        System.out.println("prorder");
        preorder(btree);

        System.out.println("postorder");
        postorder(btree);

        System.out.println("Size is "+sizeOfTree(btree));

        System.out.println("Hight is "+hightOfTree(btree));

        System.out.println("Level Order is ");
        levelOrder(btree);

        System.out.println("Total number of leafes is "+totalLeafs(btree));

        System.out.println("Spiral Traversal");
        levelOrderSpiralTraversal(btree);

        System.out.println("Inorder Traversal without Recursion");
        inorderwithoutRecursion(btree);

    }

    public static void levelOrderSpiralTraversal(BinaryTreeIntModel btree) {
        Queue<BinaryTreeIntModel> Q=new LinkedList<BinaryTreeIntModel>();
        Stack<BinaryTreeIntModel> S=new Stack<BinaryTreeIntModel>();
        S.add(btree);
        boolean isStack=true;
        while (!S.isEmpty() || !Q.isEmpty()){
            BinaryTreeIntModel temp;
            if(isStack){
                temp=S.pop();
                System.out.println(temp.data);
                if(temp.left!=null)
                    Q.add(temp.left);
                if(temp.right!=null)
                    Q.add(temp.right);
                if(S.isEmpty())
                    isStack=false;
            }else {
                temp=Q.poll();
                System.out.println(temp.data);
                if(temp.left!=null)
                    S.add(temp.left);
                if(temp.right!=null)
                    S.add(temp.right);
                if(Q.isEmpty())
                    isStack=true;
            }
        }

    }

    public static int totalLeafs(BinaryTreeIntModel btree) {
        if(btree==null)
            return 0;
        if(btree.left==null&&btree.right==null)
            return 1;
        return totalLeafs(btree.left)+totalLeafs(btree.right);
    }

    public static void levelOrder(BinaryTreeIntModel btree) {

        Queue<BinaryTreeIntModel> Q1=new LinkedList<BinaryTreeIntModel>();
        Q1.add(btree);
        while (!Q1.isEmpty()){
            BinaryTreeIntModel temp=Q1.poll();
            System.out.println(temp.data);
            if(temp.left!=null)
                Q1.add(temp.left);
            if(temp.right!=null)
                Q1.add(temp.right);
        }

    }

    private static int hightOfTree(BinaryTreeIntModel btree) {
        /*Higth Of Tree is always max(hightOfleft sub tree+hightOfRoght Sub Tree)+1 (1 to account current node)*/
        if(btree==null){
            return 0;
        }
        return 1+ max(hightOfTree(btree.left),hightOfTree(btree.right));
    }

    private static int max(int i, int i1) {
        return i>i1?i:i1;
    }

    public static BinaryTreeIntModel getBSTree(){
        BinaryTreeIntModel btree=new BinaryTreeIntModel(5);
        btree.left=new BinaryTreeIntModel(2);
        btree.right=new BinaryTreeIntModel(6);
        btree.left.left=new BinaryTreeIntModel(1);
        btree.left.right=new BinaryTreeIntModel(4);
        btree.left.right.left=new BinaryTreeIntModel(3);
        btree.right.right=new BinaryTreeIntModel(7);
        return btree;
        /*
              5
           2      6
         1    4      7
             3
    */}
    public static BinaryTreeIntModel getBTree() {
        BinaryTreeIntModel btree=new BinaryTreeIntModel(1);
        btree.left=new BinaryTreeIntModel(2);
        btree.right=new BinaryTreeIntModel(3);
        btree.left.left=new BinaryTreeIntModel(4);
        btree.left.left.left=new BinaryTreeIntModel(6);
        btree.left.right=new BinaryTreeIntModel(5);
        return btree;

             /*1
             2      3
           4   5
         6
           */
    }


    public static int sizeOfTree(BinaryTreeIntModel btree) {
        //Size Of Tree =SizeOfLeftSubTree+SizeOfRightSubTree+1 (1 to account for current Tree)
        if(btree==null)
            return 0;
        return sizeOfTree(btree.left)+sizeOfTree(btree.right)+1;
    }
    public static void postorder(BinaryTreeIntModel btree) {
        if(btree==null)
            return;
        postorder(btree.left);
        postorder(btree.right);
        System.out.println(btree.data);
    }
    public static void preorder(BinaryTreeIntModel btree) {
        if(btree==null)
            return;
        System.out.println(btree.data);
        preorder(btree.left);
        preorder(btree.right);
    }
    public static void inorder(BinaryTreeIntModel btree) {
        if(btree==null)
            return;
        inorder(btree.left);
        System.out.println(btree.data);
        inorder(btree.right);
    }

    public static void inorderwithoutRecursion(BinaryTreeIntModel btree){
        Stack<BinaryTreeIntModel> Q=new Stack<BinaryTreeIntModel>();
        Q.add(btree);
        while (!Q.isEmpty()){
            BinaryTreeIntModel temp = Q.pop();
            System.out.println(temp.data);
            if(temp.left!=null)
                Q.add(temp.left);
            if(temp.right!=null)
                Q.add(temp.right);
        }
    }
}
