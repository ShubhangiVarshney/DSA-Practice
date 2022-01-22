package javaExamples;

public class MyThread1 {
    public static void main(String argvs[])
    {
// creating an object of the Thread class using the constructor Thread(String name)
        Thread t= new Thread("Thread_1");

// the start() method moves the thread to the active state
        t.start();
// getting the thread name by invoking the getName() method
        String str = t.getName();
        System.out.println("name of the thread: "+str);
    }
}
