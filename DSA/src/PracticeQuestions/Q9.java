package PracticeQuestions;
//Q-28 Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

public class Q9 {
    public int strStr(String haystack, String needle){
        if (haystack.contains(needle))
            return haystack.indexOf(needle);
        else if(!haystack.contains(needle))
            return -1;

        return 0;
    }
    public static void main(String[] args){
        String haystack="aaaaaa";
        String needle="ba";
        Q9 obj2=new Q9();
        int index=obj2.strStr(haystack,needle);
        System.out.println(index);

    }

}
