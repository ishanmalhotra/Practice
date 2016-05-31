package Implemnataions.CollectionsImpl;

import DataObject.Student;

import java.util.*;

/**
 * Created by ishanmalhotra on 25/4/16.
 */
public class HashSetImpl {

    public static Set<Student> hashSetImpl(){
        Student student1=new Student(1,"Ishan");
        Student student2=new Student(2,"Suraj");
        Student student3=new Student(3,"Ishan");
        Student student4=new Student(1,"Data");
        Student student5=student2;
        student5.id=10;


        Set<Student> arrayList=new HashSet<Student>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        return arrayList;
    }

    public static void main(String args[]){

        HashSet<Student> hashSet= (HashSet<Student>) hashSetImpl();
//        Collections.sort(hashSet);
        HashMap<String,String> sa=new HashMap<String, String>();
        sa.containsKey("ds");

        Iterator<Student> hashIterator=hashSet.iterator();

        while (hashIterator.hasNext()){
            System.out.println(hashIterator.next());
        }
    }
}
