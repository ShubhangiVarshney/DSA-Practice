package javaExamples.Collections;
import java.util.*;

enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumSet1 {
    public static void main(String[] args) {
        Set<days> set = EnumSet.range(days.WEDNESDAY, days.SATURDAY);
        System.out.println("Range of Days:"+set);
        // Traversing elements
        Iterator<days> iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

        Set<days> set1 = EnumSet.allOf(days.class);
        System.out.println("Week Days:"+set1);
        Set<days> set2 = EnumSet.noneOf(days.class);
        System.out.println("Week Days:"+set2);
    }
}
