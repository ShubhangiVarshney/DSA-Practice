package Searching;

public class LinearSearch {
    public boolean linearSearchalgo(int[] arr, int num){
        for (int i=0; i<arr.length;i++){
            if(arr[i]==num)
                return true;
        }
        return false;
    }
    public static void main(String[] args ){
        int[] arr={12,34,77,39, 67,44,99, 29, 81};
        int n=100;
        LinearSearch ls=new LinearSearch();
        boolean res=ls.linearSearchalgo(arr,n);
        System.out.println(res);
    }
}
