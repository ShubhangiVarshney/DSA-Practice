package javaExamples;

public class ThreadEg2 implements Runnable {

    public void run() {
        System.out.println("Thread is running");
        System.out.println("State of the thread t1 after starting the execution: " + Thread.currentThread().getState());
    }

    public static void main(String[] args) {
        ThreadEg2 e1 = new ThreadEg2();
        Thread t1 = new Thread(e1);
        System.out.println("State of the thread: " + t1.getState());
        System.out.println("Name of the thread: " + t1.getName());
        t1.start();
    }


}
