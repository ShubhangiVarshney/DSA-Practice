package PracticeQuestions;

import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HackerrankCountingSort {
    public static void countSort(List<List<String>> arr) {
        // Write your code here
        HashMap<Integer,List<String>> countMap=new HashMap<>();



        for (int i=0; i<arr.size(); i++){
            Integer index= Integer.parseInt(arr.get(i).get(0));
            String element=arr.get(i).get(1);

            if(i<arr.size()/2)
                element="-";

            if (countMap.containsKey(index)){
                List<String> existList=countMap.get(index);
                existList.add(element);
                countMap.put(index, existList);
            } else {
                List<String> sameIndexElements =new ArrayList<>();
                sameIndexElements.add(element);
                countMap.put(index,sameIndexElements);
            }

        }
        for (Map.Entry<Integer,List<String>> printOutput:countMap.entrySet()){
            for (int j=0; j<printOutput.getValue().size();j++){
                System.out.print(printOutput.getValue().get(j)+" ");
            }
        }

    }




    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")));
        }

        HackerrankCountingSort.countSort(arr);

        bufferedReader.close();
    }
    
    
}
