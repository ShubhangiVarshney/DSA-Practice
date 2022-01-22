package javaExamples;

public class ThreadPriorityExample1 extends Thread {
    public void run()
    {
// the print statement
        for (int i=1;i<=3;i++){
            try{Thread.sleep(500);}
            catch(InterruptedException e){System.out.println();}
            System.out.println("Thread "+Thread.currentThread().getName()+" is executing at "+i);
        }

    }

    // the main method
    public static void main(String args[])
    {
// Creating threads with the help of ThreadPriorityExample class
        ThreadPriorityExample1 th1 = new ThreadPriorityExample1();
        ThreadPriorityExample1 th2 = new ThreadPriorityExample1();
        ThreadPriorityExample1 th3 = new ThreadPriorityExample1();

// We did not mention the priority of the thread.
// Therefore, the priorities of the thread is 5, the default value

// 1st Thread
// Displaying the priority of the thread
// using the getPriority() method
        System.out.println("Priority of the thread th1 is : " + th1.getPriority());

// 2nd Thread
// Display the priority of the thread
        System.out.println("Priority of the thread th2 is : " + th2.getPriority());

// 3rd Thread
// // Display the priority of the thread
        System.out.println("Priority of the thread th3 is : " + th3.getPriority());

// Setting priorities of above threads by
// passing integer arguments
        th1.setPriority(1);
        th2.setPriority(3);
        th3.setPriority(9);

// 6
        System.out.println("Priority of the thread th1 after setting is : " + th1.getPriority());

// 3
        System.out.println("Priority of the thread th2 after setting is : " + th2.getPriority());

// 9
        System.out.println("Priority of the thread th3 after setting is : " + th3.getPriority());

        th1.start();
        th2.start();
        th3.start();

// Main thread

// Displaying name of the currently executing thread
        System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());

        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());

// Priority of the main thread is 10 now
        Thread.currentThread().setPriority(10);

        System.out.println("Priority of the main thread after setting is : " + Thread.currentThread().getPriority());
    }
}

