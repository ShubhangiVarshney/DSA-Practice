package javaExamples;


class Table {
    synchronized void printTable(int n) {//synchronized method
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

class MyThread_1 extends Thread {
    Table b;

    MyThread_1(Table t) {
        b = t;
    }

    public void run() {
        b.printTable(5);
    }

}

class MyThread_2 extends Thread {
    Table c;

    MyThread_2(Table t) {
        c = t;
    }

    public void run() {
        c.printTable(100);
    }
}

public class TestSynchronisation1 {
    public static void main(String args[]) {
        Table obj = new Table();//only one object
        MyThread_1 t1 = new MyThread_1(obj);
        MyThread_2 t2 = new MyThread_2(obj);
        t1.start();
        t2.start();
    }
}

