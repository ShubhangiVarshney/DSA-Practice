package javaExamples.Collections;

import java.util.*;


public class LinkedListTest1 {
    public static void main(String args[]) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ravi");
        ll.add("Ajay");
        System.out.println("// By Iterator Interface");
        Iterator itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("// By for Each loop");
        System.out.println(ll.lastIndexOf("Ravi"));
        for (String str : ll) {
            System.out.println(str);
        }
    }
}
