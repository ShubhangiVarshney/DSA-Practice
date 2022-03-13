package PracticeQuestions;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Codility {
    public int sample(int[] A) {
        // write your code in Java SE 11
        if (A.length == 0)
            return 1;
        int i;
        HashSet<Integer> numberSet = new HashSet<Integer>();
        for (int j = 0; j < A.length; j++) {
            numberSet.add(A[j]);
        }
        for (i = 1; i < A.length; i++) {
            if (!numberSet.contains(i))
                return i;
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] A = {};
        Codility code = new Codility();
        //System.out.println(code.sample(A));
        System.out.println(ChronoUnit.MONTHS.between(LocalDateTime.now(),LocalDateTime.now()));
    }
}

