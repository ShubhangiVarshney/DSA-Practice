package javaExamples;

// Memory Test
public class Runtime2 {
    String a = "aaaaaaaaaaaaaaaaaaaaaaaaaa";
    String b = "bbbbbbbbbbbbbbbbbbbbbbbbbb";
    public static void main(String args[])throws Exception{
        Runtime r=Runtime.getRuntime();
        System.out.println("Total Memory: "+r.totalMemory());
        System.out.println("Free Memory: "+r.freeMemory());

        for(int i=0;i<10000;i++){
            new Runtime2();
        }

        System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());
        Runtime.getRuntime().gc();
        System.out.println("After gc(), Free Memory: "+r.freeMemory());
        System.out.println("After gc(), Free Memory: "+r.freeMemory());
    }
}
