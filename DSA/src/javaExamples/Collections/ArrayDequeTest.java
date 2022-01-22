package javaExamples.Collections;
import java.util.*;

public class ArrayDequeTest {
    public static void main(String[] args) {
//Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.offer("arvind");
        deque.add("Karan");
        deque.offerFirst("jai");
        deque.offerLast("Om");
        deque.add("Ajay");
        deque.addFirst("Ajay");
        deque.addLast("Digambar");
//Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
        System.out.println("First element: "+deque.peek());
        System.out.println("Last element: "+deque.peekLast());

        for (String str1 : deque) {
            System.out.println(str1);
        }

    }
}
