package javaExamples;

public class MyThread2 implements Runnable{
    public void run(){
        System.out.println("Now the thread is running");
    }
    public static void main(String[] args){
        Runnable r1=new MyThread2();
        Thread t1=new Thread(r1,"Thread_1");
        t1.start();
        System.out.println("t1.getName()");
    }
}
