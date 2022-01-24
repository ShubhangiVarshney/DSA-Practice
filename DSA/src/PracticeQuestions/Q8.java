package PracticeQuestions;
//Q8- Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
// The relative order of the elements may be changed.

public class Q8 {
    public int removeElement(int[] nums, int val){
        int i=0;
        for (int j=1; j<nums.length;j++){
            if(nums[i]==val){
                if(nums[i]!=nums[j]) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            else
                i++;
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        Q7 obj1 = new Q7();
        int size= obj1.removeDuplicates(nums);
        System.out.println(size);
    }
}
