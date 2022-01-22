package javaExamples;

public class Strings {
    public static void main(String[] args) {
        String c = new String("meow");
        String a = "meow";
        String f = "meow";
        String d = a.intern();
        String e = c.intern();
        String ab = a + "deal";
        String abc = "meowdeal";
        String b="meowdeal";

        System.out.println("a==c:"+(a == c));
        System.out.println("a==f:"+(a == f));
        System.out.println("a==d:"+(a == d));
        System.out.println("c==d:"+(c == d));
        System.out.println("c==f:"+(c == f));
        System.out.println("a==e:"+(a == e));
        System.out.println("c==e:"+(c == e));
        System.out.println("d==e:"+(d == e));

        System.out.println(ab.equals(abc));
        System.out.println(ab == abc);
        System.out.println(abc == b);
    }
}
