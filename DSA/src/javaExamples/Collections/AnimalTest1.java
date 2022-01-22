package javaExamples.Collections;
import java.util.*;
public class AnimalTest1 {
    public int i=12;

    public AnimalTest1(){i=13;}

    public String toString(){return "Animal"+i;}

}

class Test1{
    public static void main(String[] args){
        HashSet<AnimalTest1> s=new HashSet<AnimalTest1>();
        s.add(new AnimalTest1());
        s.add(new AnimalTest1());

        for(AnimalTest1 a: s){
            System.out.println(a);
        }
    }
}
