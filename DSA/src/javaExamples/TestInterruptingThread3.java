package javaExamples;

public class TestInterruptingThread3 extends Thread {
    public void run(){
        for(int i=1;i<=2;i++){
            if(Thread.interrupted()){
                System.out.println("code for interrupted thread");
            }
            else{
                System.out.println("code for normal thread");
            }

        }//end of for loop
    }
    public static void main(String[] args){
        TestInterruptingThread3 t1=new TestInterruptingThread3();
        TestInterruptingThread3 t2=new TestInterruptingThread3();
        t1.start();

        t1.interrupt();

        t2.start();

        boolean p=t1.isInterrupted();
        System.out.println("Is thread interrupted: "+p);

        boolean q=t1.interrupted();
        System.out.println("Interrupted flag after interrupted is called: "+q);

        boolean r=t1.isInterrupted();
        System.out.println("Is thread interrupted after calling interrupted: "+r);


    }
}
