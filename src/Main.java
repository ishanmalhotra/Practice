// A Class that represents use-defined expception


import java.util.*;

// A Class that uses above MyException
public class Main
{
    static class Name implements Comparable<Name>{
        int id;
        String name;

        public Name(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Name{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }


        @Override
        public int compareTo(Name o) {
            return this.id-o.id;
        }
    }
    // Driver Program
    public static void main(String args[])
    {
        Map<String,Name> set=new TreeMap<String, Name>();

        Name name1= new Name(1,"Ishan");
        Name name2=new Name(2,"Suraj");
        Name name3=new Name(1,"Prasang");
        Name name4=new Name(4,"Ishan");
        Name name9=new Name(56,"Ishan");
        Name name5=name2;
        name5.id=10;

        set.put("1",name1);
        set.put("2",name2);
        set.put("3",name3);
        set.put("4",name9);
        set.put("5",name4);
        set.put("6",name5);


        for (Map.Entry<String,Name> m:set.entrySet()){
            System.out.println(m);
        }






    }

    private static void SplitAndOutPut(String input) {

    }


}