package PracticeQuestions;
import java.util.*;

public class Q119PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> al= new ArrayList<List<Integer>>();
        List<Integer> curr, prev=null;

        for (int i=0; i<=rowIndex; i++){
                curr= new ArrayList<Integer>();
            for (int j=0; j<=i; j++){
                if (j==0||j==i)
                    curr.add(1);
                else
                    curr.add(prev.get(j-1)+prev.get(j));
            }
            prev=curr;
            al.add(curr);
        }
        System.out.println(prev);
      return prev;
    }

    public static void main(String[] args){
        int n=4;
        Q119PascalTriangle2 pt2 = new Q119PascalTriangle2();
        List<Integer> row=null;
        row=pt2.getRow(n);
        System.out.println(row);
    }
}
