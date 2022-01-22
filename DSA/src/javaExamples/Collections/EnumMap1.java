package javaExamples.Collections;
import java.security.Key;
import java.util.*;

enum keys{one, two, three, four};

public class EnumMap1 {

    public static void main(String[] args){
        EnumMap<keys,Integer> em=new EnumMap<keys,Integer>(keys.class);
        em.put(keys.one, 1);
        em.put(keys.two, 2);
        em.put(keys.three, 3);
        em.put(keys.four, 4);

        for (keys m1: em.keySet()){
            System.out.println(m1+" "+em.get(m1));
        }

    }
}
