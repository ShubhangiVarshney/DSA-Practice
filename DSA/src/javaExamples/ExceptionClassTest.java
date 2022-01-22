package javaExamples;

public class ExceptionClassTest {
    public static void aMethod() throws Exception {
        try {
            System.out.println("A");
            throw new Exception();
        } finally {
            System.out.println("B");
        }
    }

    public static void main(String args[]) {
        try {
            aMethod();
        } catch (Exception e) {
        System.out.println("C");
        }
        finally {
            System.out.println("D");

        }
    }
}
