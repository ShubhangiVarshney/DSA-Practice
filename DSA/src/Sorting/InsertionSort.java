package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public int[] insertion(int[] arr){
        int index;
        for (int i=1; i<arr.length; i++){
            index=i;
            for (int j=i-1; j>=0; j--){
                if (arr[index]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[index];
                    arr[index]=temp;
                    index=j;
                }
                else
                    break;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={64, 34, 25,99, 2, 12, 22, 11, 90,2,66,98};
        InsertionSort bs=new InsertionSort();
        arr=bs.insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
