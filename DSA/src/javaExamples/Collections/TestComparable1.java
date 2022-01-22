package javaExamples.Collections;
import java.util.*;

class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public int compareTo(Student st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return -1;
        else
            return 1;
    }
}

public class TestComparable1 {
    public static void main(String args[]){
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));
        al.add(new Student(103,"Om",25));
        Collections.sort(al);
        for(Student d:al){
            System.out.println(d.rollno+" "+d.name+" "+d.age);
        }
    }
}
