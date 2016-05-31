package Logical;

import java.util.Scanner;

/**
 * Created by ishanmalhotra on 7/5/16.
 */

/*Given a string
        S
        S of length
        N
        N consisting of only lower-case English alphabets, you will be asked to process
        Q
        Q queries over it . In each query you will be given two lower case characters
        X
        X and
        Y
        Y. Your task is to find out the number of such substrings of the the string
        S
        S which have the characters
        X
        X and
        Y
        Y on either of its end points, both
        X
        X...
        Y
        Y and
        Y
        Y...
        X
        X are considered to be valid.
        Note : Substrings length should be greater than
        1
        1.

        Input:
        The first line of the input will contain
        N
        N , the length of the string.
        Next line will contain as string of length
        N
        N. Next line will will contain
        Q
        Q , the number of queries. Then
        Q
        Q subsequent lines will contain two lowercase characters
        X
        X and
        Y
        Y separated by a space.

        Output:
        For each query , output the answer in a separate line.

        Constraints:
        1
        ≤
        N
        ≤
        10
        6
        1≤N≤106
        1
        ≤
        Q
        ≤
        10
        3
        1≤Q≤103
        SAMPLE INPUT
        5
        aacbb
        2
        a c
        a b
        SAMPLE OUTPUT
        2
        4*/

public class SubstingCount {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int arraySize=scn.nextInt();

        int arr[]=new int[arraySize];
        int arr2[]=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            arr[i]=scn.nextInt();
        }

        for (int i=0;i<arraySize;i++){
            arr2[i]=scn.nextInt();
        }

        int k=0,count=0,temp;
        while(k<arraySize){
            if(arr[k]==arr2[k]){
                k++;
            }
            else{
                count++;
                for (int i=0;i<arraySize-1;i++){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        count+=arraySize;
        System.out.print("K is "+count);
    }
}
