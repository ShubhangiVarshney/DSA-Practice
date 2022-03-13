package javaExamples;

class MyThread extends Thread{
    public void run(){
        System.out.println("shut down hook task completed..");
    }
}

public class TestShutdown1{
    public static void main(String[] args)throws Exception {

        Runtime r=Runtime.getRuntime();
        MyThread th1=new MyThread();
        r.addShutdownHook(th1);

        System.out.println("Now main sleeping... press ctrl+c to exit");
        try{Thread.sleep(300);}catch (Exception e) {}
    }
}