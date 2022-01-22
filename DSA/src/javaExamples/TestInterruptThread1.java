package javaExamples;

class TestInterruptingThread1 extends Thread{
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("task");
        }catch(InterruptedException e){
            //throw new RuntimeException("Thread interrupted..."+e);   //Example of interrupting a thread that stops working
            System.out.println ("exception handled");                //Example of interrupting a thread that doesn't stop working
        }
        //System.out.println("thread still running");
    }

    public static void main(String args[]){
        TestInterruptingThread1 t1=new TestInterruptingThread1();
        t1.start();
        try{
            t1.interrupt();
        }catch(Exception e){System.out.println("Exception handled "+e);}
        System.out.println("main thread running");

    }
}
