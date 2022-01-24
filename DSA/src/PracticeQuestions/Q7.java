package PracticeQuestions;

import java.util.*;

public class Q7 {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int k = 0;
        for (Integer element : nums) {
            Integer count = hm.get(element);
            if (hm.containsKey(element))
                hm.put(element, ++count);
            else
                hm.put(element, 1);
        }
        k = hm.size();
        return k;


    }


    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 4};
        Q7 obj1 = new Q7();
        int size= obj1.removeDuplicates(nums);
        System.out.println(size);
    }
}

