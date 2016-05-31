package Implemnataions.CollectionsImpl;

import DataObject.Student;

import java.util.*;

/**
 * Created by ishanmalhotra on 25/4/16.
 */
public class PrioirtyQueueImpl {

    /*public static Queue<Student> priorityQueueImpl(){
        Student student1=new Student(1,"Ishan");
        Student student2=new Student(2,"Suraj");
        Student student3=new Student(3,"Ishan");
        Student student4=new Student(1,"Data");
        Student student5=student2;
        student5.id=10;


        Queue<Student> arrayList=new LinkedList<Student>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        return arrayList;
    }*/

    public static void main(String[] arfs){
        PriorityQueue<Student> queue= new PriorityQueue<Student>(LinkedListImpl.linkedListImpl());
        for (Student student: queue){
            System.out.println(student);
        }
        int i=1/0;

    }

}
