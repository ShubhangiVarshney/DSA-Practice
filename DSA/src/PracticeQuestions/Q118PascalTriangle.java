package PracticeQuestions;
import java.util.*;


public class Q118PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        List<Integer> curr,prev= null;
        for(int i=0; i< numRows ; i++){
            curr= new ArrayList<Integer>() ;
            for(int j=0; j<=i ; j++ ){
                if(j==0 || j==i)
                    curr.add(1);
                else
                    curr.add(prev.get(j-1)+prev.get(j));
            }
            prev=curr;
            list.add(curr);
        }

    return list;
    }
}
