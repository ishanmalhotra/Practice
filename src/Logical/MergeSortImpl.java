package Logical;

/**
 * Created by ishanmalhotra on 2/5/16.
 */
public class MergeSortImpl {

    private int[] array;
    private int[] tempArray;
    public static void main(String args[]){
        int[] inputArray= {45,23,11,89,77,98,4,28,65,43,98};
        int low=0,high=9;
        MergeSortImpl msi=new MergeSortImpl();
        msi.MergeSort(inputArray);
        for(int i: msi.array){
            System.out.println(i);
        }
    }

    private void MergeSort(int[] inputArray) {
        this.array=inputArray;
        this.tempArray =new int[this.array.length];
        doMergeSort(0,this.array.length-1);
    }

    private void doMergeSort(int low, int high) {
        int middle=0;
        if(low<high){
            middle=(low+high)/2;

        doMergeSort(low,middle);
        doMergeSort(middle+1,high);
        merge(low,middle,high);}
    }


    private void merge( int low, int middle, int high) {
        for (int i=low;i<=high;i++){
            tempArray[i] = array[i];
        }
        int i=low;
        int j=middle+1;
        int k=low;
        while (i<=middle && j<=high){
            if(tempArray[i]<tempArray[j]){
                array[k]=tempArray[i];
                i++;
            }else {
                array[k]=tempArray[j];
                j++;
            }
            k++;
        }
        while (i<=middle){
            array[k]=tempArray[i];
            i++;
            k++;
        }while (j<=high){
            array[k]=tempArray[j];
            j++;
            k++;
        }

    }
}
