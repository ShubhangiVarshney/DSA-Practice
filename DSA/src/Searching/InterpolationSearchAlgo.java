package Searching;

public class InterpolationSearchAlgo {
    public int interpolation(int[] arr, int num){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int guess= left+ (right-left)*(num-arr[left])/(arr[right]-arr[left]);
            System.out.println(guess);
            if (arr[guess]==num)
                return guess;
            else if(arr[guess]<num)
                left=guess+1;
            else
                right=guess-1;
           }
        return -1;
        }
        public static void main(String[] args){
        int[] arr={0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int num=90;
        InterpolationSearchAlgo is=new InterpolationSearchAlgo();
        int res= is.interpolation(arr, num);
        if(res!=-1)
        System.out.println("Element found at: "+res);
        else
        System.out.println("Element not found");
        }
    }

