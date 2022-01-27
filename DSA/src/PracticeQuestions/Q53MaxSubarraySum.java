package PracticeQuestions;


public class Q53MaxSubarraySum {
    public int maxSubArray(int[] nums) {
        int size=nums.length;
        int[] maxSum=new int[size];
        int max=0;
        for (int i = 0; i < nums.length;i++){
            if(i==0){
                maxSum[i]=nums[i];
                max=maxSum[i];
            }
            else
            maxSum[i]=Math.max(nums[i],nums[i]+maxSum[i-1]);

            if(max<maxSum[i])
                max=maxSum[i];

        }
        return max;
    }
    public static void main(String[] args){
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        Q53MaxSubarraySum obj=new Q53MaxSubarraySum();
        int n=obj.maxSubArray(nums);
        System.out.println(n);

    }
}
