package javaExamples;

import java.lang.*;


class ThreadNew extends Thread
{
    // constructor of the class
    ThreadNew(String tName, ThreadGroup tgrp)
    {
        super(tgrp, tName);
        start();
    }

    // overriding the run() method
    public void run()
    {

        for (int j = 0; j < 100; j++)
        {
            try
            {
                Thread.sleep(5);
            }
            catch (InterruptedException e)
            {
                System.out.println("The exception has been encountered " + e);
            }

        }

        System.out.println(Thread.currentThread().getName() + " thread has finished executing");
    }
}

public class TGGetMaxPriority
{
    // main method
    public static void main(String args[]) throws SecurityException, InterruptedException
    {
// creating the thread group
        ThreadGroup tg = new ThreadGroup("the parent group");

        ThreadGroup tg1 = new ThreadGroup(tg, "the child group");

        ThreadNew th1 = new ThreadNew("the first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("the second", tg1);
        System.out.println("Starting the second");

        //tg.list();
        th1.checkAccess();

        //tg1.list();
        //int p1 = tg.getMaxPriority();
        //int p2 = tg1.getMaxPriority();
        //ThreadGroup t1=th1.getThreadGroup();
        //ThreadGroup t2=th2.getThreadGroup();


        //System.out.println("The maximum priority of the parent ThreadGroup: " + p1+" "+p2);
        //System.out.println("Thread Groups of thread1 and thread2 are: "+t1+" "+t2);

        //System.out.println("The ParentThreadGroup for " + tg.getName() + " is " + tg.getParent().getName());
        //System.out.println("The ParentThreadGroup for " + tg1.getName() + " is " + tg1.getParent().getName());

    }
}
