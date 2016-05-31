package Implemnataions.CollectionsImpl;

import DataObject.Student;

import java.util.HashMap;

/**
 * Created by ishanmalhotra on 26/4/16.
 */
public class HashMapImpl {

    public static void main(String[] at){
        Student student=new Student(1,"a");
        Student student1=new Student(1,"a");
        HashMap<Student,Student> hashMap=new HashMap<Student, Student>();
        hashMap.put(student,student);

        System.out.println("O1: "+hashMap.containsKey(student)+ " O2: "+hashMap.containsKey(student1));
    }
}
