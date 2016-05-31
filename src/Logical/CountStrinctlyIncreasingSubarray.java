package Logical;

import java.util.Scanner;

/**
 * Created by ishanmalhotra on 27/4/16.
 */
public class CountStrinctlyIncreasingSubarray {

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int arraySize=scn.nextInt();

        int arr[]=new int[arraySize];
        int arrCpy[]=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            arr[i]=scn.nextInt();
            arrCpy[i]=arr[i];
        }

        boolean toCountFurther=false;
        int max=1;
        int count=0;
        for(int i=0;i<arraySize-1;i++){
            if(toCountFurther){
                if(arr[i]<arr[i+1]){

                    count+=max;
                    max+=1;
                }
                else{
                    toCountFurther=false;
                    max=1;
                }
            }else {
                toCountFurther=false;
                if(arr[i]<arr[i+1]){
                    max+=1;
                    count+=1;
                    toCountFurther=true;
                }
            }
        }
        System.out.println("Ou: "+count);
    }
}
