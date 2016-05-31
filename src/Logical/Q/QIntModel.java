package Logical.Q;

import java.util.Arrays;

/**
 * Created by ishanmalhotra on 25/5/16.
 */
public class QIntModel {

    public int data[];
    int size;
    int front=-1,back=-1;

    public QIntModel(int size) {
        this.size = size;
        data= new int[size];
    }

    @Override
    public String toString() {
        return "QIntModel{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ", front=" + front +
                '}';
    }

    void enqueue(int a) throws Exception {
        if(this.back==-1){
            front=0;
            back=0;
            this.data[back]=a;
        }else if(this.back+1==this.size){
            throw new Exception("Overflow");
        } else{
            this.data[++this.back]=a;
        }
    }
    int dequeue() throws Exception {
        if(this.size==0){
            throw new Exception("No Element Exists");
        }else {
            this.size--;
            int arr= this.data[this.front];
            if (this.front==this.back){
                this.front=-1;this.back=-1;
            }else {
                front++;
            }return arr;
        }
    }
    void dislay(){
        if(this.size==0){
            System.out.println("Empty Queue");
            return;
        }else {
            for(int i=this.front;i<=this.back;i++){
                System.out.println(this.data[i]);
            }
        }
    }


}
