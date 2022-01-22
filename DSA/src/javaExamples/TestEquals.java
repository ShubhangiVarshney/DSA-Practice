package javaExamples;

public class TestEquals {

    Integer a;
    Integer b;
    String c;
    Double d;
    Float e;

    public TestEquals(Integer a1, Integer b1, String c1, Double d1, Float e1) {
        this.a = a1;
        this.b = b1;
        this.c = c1;
        this.d = d1;
        this.e = e1;
    }

    //@Override
    public boolean equals(TestEquals ob2){
        //TestEquals ob2 = (TestEquals) ob;
        return this.a.equals(ob2.a) && this.b.equals(ob2.b) && this.c.equals(ob2.c);
    }

    public static void main(String srg[]){
        TestEquals object1 = new TestEquals(2,4,"23",2.3D,2.4f);
        TestEquals object2 = new TestEquals(2,4,"23",1.6D,0f);

        System.out.println("RESULT: "+object1.equals(object2));
    }
}
