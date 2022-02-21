package PracticeQuestions;

import java.util.HashMap;
import java.util.Map;

public class Q169MajorityElement {
    public int majorityElement(int[] nums) {
        int max=0;
        int majority=0;
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    for (int i=0; i<nums.length; i++){
        if(hm.containsKey(nums[i])){
           hm.put(nums[i],hm.get(nums[i])+1) ;}
        else
            hm.put(nums[i],1);
        }

    for (Integer en: hm.keySet()){
        int count =hm.get(en);
        if (count>max){
            max=count;
            majority=en;
        }
   }
    return majority;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        Q169MajorityElement me = new Q169MajorityElement();
        int element = me.majorityElement(nums);
        System.out.println(element);
    }
}
