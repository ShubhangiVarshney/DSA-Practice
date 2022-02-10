package Searching;

public class JumpSearchAlgo {
    public int JumpSearch(int[] arr, int num){
        int len=arr.length;
        int block=(int)Math.sqrt(len);
        int highIndex=block;
        System.out.println(block);

        while(highIndex<len && num>arr[highIndex]){
            highIndex=highIndex+block;
        }
        System.out.println(highIndex);
        for (int i=highIndex-block+1; i<=highIndex && i<len; i++){
            if (arr[i]==num)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr={0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377};
        int num=55;
        JumpSearchAlgo js=new JumpSearchAlgo();
        int index=js.JumpSearch(arr,num);
        if (index>0)
            System.out.println("Element found at: "+index);
        else
            System.out.println("Element not found");

    }
}
