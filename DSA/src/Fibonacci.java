public class Fibonacci {


    void series(int n, int r, int limit){
        int q=n+r;
        if(q>limit)
            return;
        System.out.print(q+" ");
        series(r,q,limit);
    }

    void printSeries(int limit){
        int n=0;
        int r=1;
        System.out.print(n+" "+r+" ");
        series(n,r,limit);

    }

    public static void main(String args[]){
        Fibonacci f=new Fibonacci();
        f.printSeries(2000);
    }
}
