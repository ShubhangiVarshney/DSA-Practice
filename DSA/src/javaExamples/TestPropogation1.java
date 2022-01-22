package javaExamples;

import java.io.IOException;

public class TestPropogation1 {

    void m() throws ArithmeticException {
        int data = 50 / 0;
    }

    void n() throws ArithmeticException {
        m();
    }

    void p() {

        n();

    }

    public static void main(String args[]) {
        TestPropogation1 obj = new TestPropogation1();
        obj.p();
        System.out.println("normal flow...");
    }
}

