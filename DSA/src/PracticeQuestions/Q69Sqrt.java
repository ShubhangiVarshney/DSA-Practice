package PracticeQuestions;

public class Q69Sqrt {
    public int mySqrt(int x) {
        if (x==0)
            return 0;
        if(x==1)
            return 1;
        int left=1,right=x,middle,ans=0;

        while(left<=right){
            middle= (right+left)/2;
            if(middle<=x/middle){
                ans=middle;
                left=middle+1;
            }
            else{
                right=middle-1;
            }
        }
        return ans;
    }
    public static void main (String[] args){
        int x= 2147395599;
        Q69Sqrt sq=new Q69Sqrt();
        int ans=sq.mySqrt(x);
        System.out.println(ans);
    }
}
