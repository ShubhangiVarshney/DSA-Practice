package javaExamples.Collections;

import java.util.*;

public class HashMapTest1 {
    public static void main(String[] args) {
        //Map m1 = new HashMap(); //Non generic
        Map<Integer, String> m1 = new HashMap<Integer, String>(); //Generic
        m1.put(201, "Shubhangi");
        m1.put(202, "Rachita");
        m1.put(203, "Nikita");
        m1.put(301, "Manav");
        m1.put(302, "Yash");
        m1.put(303, "Bhalla");

        Set<Map.Entry<Integer, String>> s1 = m1.entrySet();
        Iterator itr = s1.iterator();

        /*
        while(itr.hasNext()){
            Map.Entry e1=(Map.Entry) itr.next();
            System.out.println(e1.getKey()+" "+e1.getValue());
        } */

        for (Map.Entry<Integer, String> e2 : s1) {
            System.out.println(e2.getKey() + " " + e2.getValue());
        }

        for (Integer key : m1.keySet()) {
            System.out.println(key + " .. " + m1.get(key));
        }

    }
}
