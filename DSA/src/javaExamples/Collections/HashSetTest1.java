package javaExamples.Collections;
import java.util.*;

public class HashSetTest1 {
    public static void main(String args[]){
//Creating HashSet and adding elements
        //HashSet<String> set=new HashSet<String>();
        //LinkedHashSet<String> set= new LinkedHashSet<String>();
        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        System.out.println(set.contains("Four"));
//Traversing elements
        Iterator<String> itr=set.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String s:set){
            System.out.println(s);
        }
    }
}
