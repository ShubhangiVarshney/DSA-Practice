package javaExamples;
class TestInterruptingThread2 extends Thread{

    public void run(){
        for(int i=1;i<=5;i++)
            System.out.println(i);
    }

    public static void main(String args[]){
        TestInterruptingThread2 t1=new TestInterruptingThread2();
        t1.start();

        t1.interrupt();

        boolean p=t1.isInterrupted();
        System.out.println("Is thread interrupted: "+p);

    }
}
