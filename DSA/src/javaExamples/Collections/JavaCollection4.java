package javaExamples.Collections;

import java.util.*;


public class JavaCollection4 {
    public static void main(String[] args){
        Stack<String> s= new Stack<String>();
        s.push("ullu"); // push and add both will work
        s.add("Suar");
        s.push("Gadha");
        s.add("hjfdgf");
        System.out.println(s.remove("amit"));
        Iterator<String> itr=s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
