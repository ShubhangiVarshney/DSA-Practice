package PracticeQuestions;

import java.util.Arrays;

public class CopyArray {
    int[] arrayMerge(int[] a, int[] b){
        int aLength=a.length;
        int bLength=b.length;
        int cLength=aLength+bLength;
        int[] c=new int[cLength];
        System.arraycopy(a,0,c,0,aLength);
        System.arraycopy(b,0,c,aLength,bLength);
        return c;
    }
    public static void main(String[] args){
        int[] a={11,12,13};
        int[] b={17,10,18,4};
        CopyArray ca=new CopyArray();
        System.out.println(Arrays.toString(ca.arrayMerge(a,b)));
    }
}
