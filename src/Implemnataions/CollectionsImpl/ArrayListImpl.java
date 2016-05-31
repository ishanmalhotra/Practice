package Implemnataions.CollectionsImpl;

import DataObject.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by ishanmalhotra on 24/4/16.
 */
public class ArrayListImpl {

    public static List<Student> arrayListImpl(){
        Student student1=new Student(1,"Ishan");
        Student student2=new Student(2,"Suraj");
        Student student3=new Student(3,"Ishan");
        Student student4=new Student(1,"Data");
        Student student5=student2;
        student5.id=10;


        List<Student> arrayList=new ArrayList<Student>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        return arrayList;
    }

    public static void main(String args[]){

        ArrayList<Student> arrayList= (ArrayList<Student>) arrayListImpl();
        Collections.sort(arrayList);

        ListIterator<Student> listIterator=arrayList.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }


}
