package PracticeQuestions;
import java.util.*;

// Q1- Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    class Q1 {
        public int[] twoSum(int[] nums, int target) {  //time complexity O(n^2)
            int[] sol=null;
            for(int i=0; i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        sol=new int[]{i,j};

                    }
                }
            }
            return sol;
        }

        public int[] twoSum1(int[] nums, int target){   //time complexity O(n)
            int key,j;
            Integer n=0;
            int[] sol;
            HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
             for(int i=0; i<nums.length; i++){
                 hm.put(nums[i],i);
             }
             System.out.println(hm);

             for(j=0;j<nums.length;j++){
                 key=target-nums[j];
                 n=hm.get(key);

                 if (n!=null&&n!=0&&j!=n)
                     break;

             }
            sol=new int[]{j,n};
             System.out.println(Arrays.toString(sol));
            return sol;
        }

        public static void main(String[] args){
            int[] arr={3,2,4};
            int target=6;
            Q1 obj=new Q1();
            obj.twoSum1(arr,target);
        }

    }

