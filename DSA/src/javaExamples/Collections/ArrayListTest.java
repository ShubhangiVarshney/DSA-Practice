package javaExamples.Collections;

import java.util.*;

class ArrayListTest {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();//Creating arraylist
        al.add("Ravi");//Adding object in arraylist
        al.add("Vijay");
        al.add("Ajay");
        al.add("Aakash");
        al.add("");

//Traversing list through Iterator
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("After getter and setter and sorting");
        al.get(2);
        al.set(2, "Praneet");
        Collections.sort(al); // Sorting the list
        for (String i : al) {
            System.out.println(i);
        }
        System.out.println("Sorting numbers");
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(45);
        al2.add(66);
        al2.add(1);
        al2.add(90);
        al2.add(18);
        al2.add(18);
        Collections.sort(al2);

        //al2.remove(2);
        for (Integer i : al2) {
            System.out.println(i);
        }
        // Printing list in reverse order
        System.out.println("Print in Reverse order: ");
        ListIterator<Integer> litr = al2.listIterator(al2.size());
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        for (int i = 0; i < al.size(); i++) {
            System.out.println("By for loop: " + al.get(i));
        }

        System.out.println("Initial list of elements: "+al);
        //Adding an element at the specific position
        al.add(1, "Gaurav");
        System.out.println("After invoking add(int index, E element) method: "+al);
        ArrayList<String> al3=new ArrayList<String>();
        al3.add("Sonoo");
        al3.add("Hanumat");
        ///Adding second list elements to the first list
        al.addAll(al3);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);

        ArrayList<String> al4=new ArrayList<String>();
        al4.add("John");
        al4.add("Rahul");
        //Adding second list elements to the first list at specific position
        al.addAll(3, al4);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);

        al.removeAll(al4);
        System.out.println("After invoking remove(Collection<? extends E> c) method: "+al);

        al.retainAll(al3);
        System.out.println("After retain method"+al);

        ArrayList<Integer> al5=new ArrayList<>();
        System.out.println("Is list al5 empty? "+al5.isEmpty());
        System.out.println("Is list al empty? "+al.isEmpty());
    }
}
