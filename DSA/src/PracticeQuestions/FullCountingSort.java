package PracticeQuestions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'countSort' function below.
     *
     * The function accepts 2D_STRING_ARRAY arr as parameter.
     */

    public static void countSort(List<List<String>> arr) {
        // Write your code here
//        List<List<String>> countList=new ArrayList<>();
        String[][] countArray = new String[100][];
        int[] positionOfLastElement = new int[100];
        int halfSize = arr.size() / 2;

        Map<Integer, Integer> levelCount = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.size(); i++) {
            Integer index = Integer.parseInt(arr.get(i).get(0));
            if (levelCount.containsKey(index))
                levelCount.put(index, levelCount.get(index) + 1);
            else
                levelCount.put(index, 1);
//            countList.add(null);
        }
        for (int i = 0; i < arr.size(); i++) {

            Integer index = Integer.parseInt(arr.get(i).get(0));
            String element = arr.get(i).get(1);

            if (i < halfSize)
                element = "-";

            if (countArray[index] != null) {
                positionOfLastElement[index] = positionOfLastElement[index] + 1;
                int position = positionOfLastElement[index];
                countArray[index][position] = element;


                // List<String> existList=countMap.get(index);
                // existList.add(element);
                // countMap.put(index, existList);
//                countList.get(index).add(element);
            } else {
                String[] sameIndexArray = new String[levelCount.get(index)];
                sameIndexArray[0] = element;
                countArray[index] = sameIndexArray;
                positionOfLastElement[index] = 0;

//                List<String> sameIndexElements =new LinkedList<>();
//                sameIndexElements.add(element);
//                countList.set(index,sameIndexElements);
            }

        }

        for (int j = 0; j < countArray.length; j++) {
            if (countArray[j] != null) {
                StringBuilder result = new StringBuilder("");
                for (int k = 0; k < positionOfLastElement[j]; k++) {
                    result.append(countArray[j][k]).append(" ");
                }
                System.out.print(result.toString());
            }

        }


    }

}

public class FullCountingSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\shubh\\OneDrive\\Desktop\\input05.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")));
        }
        long timeBefore = System.currentTimeMillis();
        Result.countSort(arr);
        long timeAfter = System.currentTimeMillis();
        System.out.println("Difference:" + (timeAfter - timeBefore));

        bufferedReader.close();
    }
}

