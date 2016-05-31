package Implemnataions.CollectionsImpl;

import DataObject.Student;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ishanmalhotra on 25/4/16.
 */
public class TreeSetImpl {

    public static void main(String[] args){
        TreeSet<Student> treeSet= new TreeSet<Student>(HashSetImpl.hashSetImpl());

        for (Student student: treeSet){
            System.out.println(student);
        }
    }
}
