package javaExamples.Collections;

import java.util.*;

public class JavaCollection3 {
    public static void main(String[] args){
        Vector<String> vc= new Vector<String>();
        vc.add("Amit");
        vc.add("Kittu");
        vc.add("Patra");
        vc.add("Rutu");
        Iterator<String> itr=vc.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
