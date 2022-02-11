package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public int[] selection(int[] arr){
        int min;
        for (int i=0; i<arr.length ;i++){
            min=i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min])
                {
                    int temp=arr[j];
                    arr[j]=arr[min];
                    arr[min]=temp;
                }
            }

        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={64, 34, 25, 12, 22, 11, 90};
        SelectionSort bs=new SelectionSort();
        arr=bs.selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
