package PracticeQuestions;

public class Q136SingleNumber {
    public int singleNumber(int[] nums) {
        int result=0;
        for (int i=0; i<nums.length; i++){
            result= result^nums[i];
        }
        return result;
    }

    public static void main (String[] args){
        int[] nums={1};
        Q136SingleNumber sn=new Q136SingleNumber();
        int res=sn.singleNumber(nums);
        System.out.println(res);

    }
}
