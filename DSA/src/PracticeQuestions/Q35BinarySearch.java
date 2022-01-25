package PracticeQuestions;
// Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order

public class Q35BinarySearch {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int number;
        int middleIndex ;
        while (left <= right) {
            middleIndex = (left + right) / 2;
            number = nums[middleIndex];
            if (target < number)
                right = middleIndex - 1;
            else if (target > number)
                left = middleIndex + 1;
            else if (target == number)
                return middleIndex;
        }

            return left ;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        Q35BinarySearch obj1 = new Q35BinarySearch();
        int n = obj1.searchInsert(nums, target);
        System.out.println(n);

    }

}
