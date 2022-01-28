package PracticeQuestions;

public class Q70ClimbingStairs {
    public int climbStairs(int n) {         // Implementation of Fibonacci series
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int[] ways=new int[n+1];

        for ( int i=0; i<=n; i++){
            if(i<=2)
                ways[i]=i;
            else
                ways[i]=ways[i-1]+ways[i-2];
        }
     return ways[n];
    }
    public static void main(String[] args){
        int n=10;
        Q70ClimbingStairs cs=new Q70ClimbingStairs();
        int ans=cs.climbStairs(n);
        System.out.println(ans);


    }
}
