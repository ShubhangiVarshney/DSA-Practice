package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSorting(int[] arr){
        boolean indicator=true;
        for (int i=0; i<arr.length && indicator; i++){
            indicator=false;
            for (int j=0; j<arr.length-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    indicator=true;

                }

            }

        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={64, 34, 25, 12, 22, 11, 90};
        BubbleSort bs=new BubbleSort();
        arr=bs.bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
