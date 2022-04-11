package PracticeQuestions;

import java.util.HashMap;
import java.util.HashSet;

public class Q217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map1=new HashSet<>();
        for (int i=0; i<nums.length; i++){
            if (map1.contains(nums[i])){
                return true;
            } else{
                map1.add(nums[i]);
            }
        }
        return true;
    }
}
