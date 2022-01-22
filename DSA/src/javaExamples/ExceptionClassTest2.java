package javaExamples;

public class ExceptionClassTest2 {
    public void method1() throws Exception {
        method2();
    }

    public void method2() throws Exception {
        throw method3();
    }

    public Exception method3() {
        return new Exception();
    }

    public static void main(String args[]) {
        ExceptionClassTest2 obj1 = new ExceptionClassTest2();
        try {
            obj1.method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
