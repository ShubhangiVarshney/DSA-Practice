package PracticeQuestions;
//Q-28 Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

public class Q9 {
    public int strStr(String haystack, String needle){
        if(needle.isEmpty())
            return 0;
        if(haystack.length()<needle.length())
            return -1;
        int i;
        for( i=0; i<=haystack.length()-needle.length(); i++){
            int j;
            for (j=0;j<needle.length();j++){
                if (haystack.charAt(i+j)!=needle.charAt(j))
                    break;
            }

            if(j==needle.length())
            return i;
        }
        return -1;


    }
    public static void main(String[] args){
        String haystack="Hello World";
        String needle="ld";
        Q9 obj2=new Q9();
        int index=obj2.strStr(haystack,needle);
        System.out.println(index);

    }

}
