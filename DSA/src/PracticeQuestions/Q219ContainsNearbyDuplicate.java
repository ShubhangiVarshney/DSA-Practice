package PracticeQuestions;

import java.util.*;

public class Q219ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
        for (int i=0; i<nums.length; i++){
            if (map1.containsKey(nums[i])){
                int diff=(int) Math.abs(map1.get(nums[i])-i);
                if (diff<=k){
                    return true;
                } else{
                    map1.put(nums[i],i);
                }

            } else {
                map1.put(nums[i],i);
            }

        }
        return false;
    }
}
