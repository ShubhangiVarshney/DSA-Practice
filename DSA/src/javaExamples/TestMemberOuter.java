package javaExamples;

public class TestMemberOuter {
    private static int data = 30;

    void test() {
        Inner obj = new Inner();
        obj.msg();
    }

    static class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String args[]) {
        Inner obj=new Inner();
        obj.msg();
        //TestMemberOuter.Inner in=obj.new Inner();

    }


}
