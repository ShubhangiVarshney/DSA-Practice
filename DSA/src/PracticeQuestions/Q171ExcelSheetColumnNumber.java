package PracticeQuestions;

import javaExamples.Collections.HashMapTest1;
import java.util.*;

public class Q171ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        char ch='A';
        int num=1;
        HashMap<Character,Integer> hp=new HashMap<Character,Integer>();
        for (char i=ch; ch<='Z'; ch++){
            hp.put(ch,num);
            num++;
        }
        int j=columnTitle.length()-1;
        int count=0;
        double res=0;
        while(j>=0 && count<columnTitle.length()){
            int val=hp.get(columnTitle.charAt(j));
            res= res+val*Math.pow(26,count);
            count++;
            j--;
        }
        return (int)res;
    }
    public static void main(String[] args){
        Q171ExcelSheetColumnNumber escn=new Q171ExcelSheetColumnNumber();
        int result=escn.titleToNumber("ZY");
        System.out.println(result);
    }
}
