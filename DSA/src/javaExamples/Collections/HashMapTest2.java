package javaExamples.Collections;
import java.util.*;

public class HashMapTest2 {
    public static void main(String args[]){
        Map<Integer,String> m1=new HashMap<Integer,String>();
        m1.put(201, "Shubhangi");
        m1.put(202,"Rachita");
        m1.put(203,"Nikita");
        m1.put(301, "Manav");
        m1.put(302, "Yash");
        m1.put(303, "Bhalla");
        //Returns a Set view of the mappings contained in this map
        m1.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .sorted(Map.Entry.comparingByValue())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}
