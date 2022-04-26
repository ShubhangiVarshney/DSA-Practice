package PracticeQuestions.Spare;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public  static List<Integer> getRow(int rowIndex){
        List<Integer> result=new ArrayList<>();
        long first=1;
        result.add((int)first);
        for (int i=1; i<=rowIndex; i++){
            long second= ((first*(rowIndex-i+1))/i);
            result.add((int)second);
            first=second;

        }
        return result;

    }
    public static void main(String args[]){
        int r=7;
        Q1 q=new Q1();
        List<Integer> res=q.getRow(r);
        System.out.println(res.toString());

    }
}
