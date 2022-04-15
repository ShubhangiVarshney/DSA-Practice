package PracticeQuestions;

public class Q231PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n==0 || n<0){
            return false;
        }
        if (n==1) {
            return true;
        }
        int rem=0;

        while(n>1){
            rem=n%2;
            if (rem!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
}
