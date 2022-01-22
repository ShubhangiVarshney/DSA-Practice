package javaExamples.Collections;
import java.util.*;

public class ArrayToList {
    public static void main(String[] args){
        String[] arr={"main","hum","tum","tu","mera"};
        List<String> list=new ArrayList<String>();
        //for(int i=0;i<arr.length;i++){
        //    list.add(arr[i]);
        //}
        for(String j:arr){
            list.add(j);
        }

        System.out.println("Printing list: "+list);
    }
}
