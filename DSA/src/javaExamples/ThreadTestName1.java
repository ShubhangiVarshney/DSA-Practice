package javaExamples;

public class ThreadTestName1 extends Thread {
    public void run(){
        System.out.println("Name of running thread: "+ Thread.currentThread().getName());
        System.out.println("running...");
    }
    public static void main(String args[]){
        ThreadTestName1 t1=new ThreadTestName1();
        ThreadTestName1 t2=new ThreadTestName1();
        System.out.println("Name of t1 before setting:"+t1.getName());
        System.out.println("Name of t2 before setting:"+t2.getName());
        t1.setName("Shubh Thread_1");
        t1.start();
        t2.setName("Shubh Thread_2");
        t2.start();


    }
}
