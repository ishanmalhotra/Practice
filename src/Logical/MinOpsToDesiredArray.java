package Logical;

import java.util.Scanner;

/**
 * Created by ishanmalhotra on 26/4/16.
 *//*Count minimum steps to get the given desired array
        Consider an array with n elements and value of all the elements is zero. We can perform following operations on the array.

        Incremental operations:Choose 1 element from the array and increment its value by 1.
        Doubling operation: Double the values of all the elements of array.
        We are given desired array target[] containing n elements. Compute and return the smallest possible number of the operations needed to change the array from all zeros to desired array.

        Sample test cases:

        Input: target[] = {2, 3}
        Output: 4
        To get the target array from {0, 0}, we
        first increment both elements by 1 (2
        operations), then double the array (1
        operation). Finally increment second
        element (1 more operation)

        Input: target[] = {2, 1}
        Output: 3
        One of the optimal solution is to apply the
        incremental operation 2 times to first and
        once on second element.

        Input: target[] = {16, 16, 16}
        Output: 7
        The output solution looks as follows. First
        apply an incremental operation to each element.
        Then apply the doubling operation four times.
        Total number of operations is 3+4 = 7*/
public class MinOpsToDesiredArray {

    public static void main(String[] arg){
        Scanner scn=new Scanner(System.in);
        int arraySize=scn.nextInt();

        int arr[]=new int[arraySize];
        int arrCpy[]=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            arr[i]=scn.nextInt();
            arrCpy[i]=arr[i];
        }

        System.out.println("Array Lenght is "+arraySize);
        for (int i=0;i<arraySize;i++){
            System.out.println("Array is "+arr[i]);
        }

        int totalSteps=findTotalSteps(arrCpy,arraySize);
        System.out.println("Total Steps is "+totalSteps);


    }

    private static int findTotalSteps(int[] arrCpy, int arraySize) {
        int Steps=0;
        boolean toReturn=false;
        while (!isComplete(arrCpy,arraySize)){
            if(is2Divisible(arrCpy,arraySize)){
                arrCpy=divideOp(arrCpy,arraySize);
                Steps+=1;
               // isComplete(arrCpy,arraySize);
            }
            if (!is2Divisible(arrCpy,arraySize)){
                arrCpy=SubstractOps(arrCpy,arraySize);
                Steps+=1;
            }
        }
        return Steps;
    }

    private static int[] SubstractOps(int[] arrCpy, int arraySize) {
        for (int i=0;i<arraySize;i++){
            if(arrCpy[i]%2==1){
                arrCpy[i]-=1;
                break;
            }
        }
        return arrCpy;
    }

    private static boolean isComplete(int[] arrCpy, int arraySize) {
        for (int i=0;i<arraySize;i++){
            if(arrCpy[i]!=0)
                return false;
        }
        return true;
    }

    private static int[] divideOp(int[] arrCpy, int arraySize) {
        for (int i=0;i<arraySize;i++){
            arrCpy[i]=arrCpy[i]/2;
        }
        return arrCpy;
    }

    private static boolean is2Divisible(int[] arrCpy, int arraySize) {
        for (int i=0;i<arraySize;i++){
            if(arrCpy[i]%2==1)
                return false;
        }
        return true;
    }
}
