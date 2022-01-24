package PracticeQuestions;

//Q26- Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same.
//Return k after placing the final result in the first k slots of nums.

public class Q7 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for (int j=0; j<nums.length; j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }


    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, };
        Q7 obj1 = new Q7();
        int size= obj1.removeDuplicates(nums);
        System.out.println(size);
    }
}

