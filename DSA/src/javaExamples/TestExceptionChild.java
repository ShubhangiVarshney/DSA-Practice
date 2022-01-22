package javaExamples;

import java.io.IOException;

class Parent1 {

    // defining th1e method
    void msg() {
        System.out.println("parent method");
    }
}

public class TestExceptionChild extends Parent1 {

    // overriding the method in child class
    // gives compile time error
    void msg() throws NullPointerException{
        System.out.println("TestExceptionChild");
    }

    public static void main(String args[]) {
        Parent1 p = new TestExceptionChild();
        p.msg();
    }
}


