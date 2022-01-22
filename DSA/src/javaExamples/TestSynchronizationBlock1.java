package javaExamples;

class Table2 {
    void printTable(int n) {//synchronized method
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }
}

class MyThreadOne extends Thread {
    Table2 b;

    MyThreadOne(Table2 t) {
        b = t;
    }

    public void run() {
        b.printTable(5);
    }

}

class MyThreadTwo extends Thread {
    Table2 c;

    MyThreadTwo(Table2 t) {
        c = t;
    }

    public void run() {
        c.printTable(100);
    }
}

public class TestSynchronizationBlock1 {
    public static void main(String args[]) {
        Table2 obj = new Table2();//only one object
        MyThreadOne t1 = new MyThreadOne(obj);
        MyThreadTwo t2 = new MyThreadTwo(obj);
        t1.start();
        t2.start();
    }
}
