package PracticeQuestions;


// Q9-Given an integer x, return true if x is palindrome integer.

public class Q2 {
    public boolean isPalindrome(int x) {
        int n=0, i;
        int ori_num = x;

        while (ori_num > 0) {
            i = ori_num % 10;
            ori_num = ori_num / 10;
            n = n * 10 + i;
            System.out.println(n);
        }

        if (n == x)
            return true;
        else
            return false;
    }
    public static void main (String[] args){
        int x=12321;
        Q2 obj1=new Q2();
        boolean decision=obj1.isPalindrome(x);
        System.out.println(decision);
    }
}
