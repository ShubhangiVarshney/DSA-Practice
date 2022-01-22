package javaExamples;

public class TestRunCall extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        TestRunCall t1=new TestRunCall();
        TestRunCall t2=new TestRunCall();

        t1.run();
        t2.run();

        //t1.start();
        //t2.start();
    }
}
