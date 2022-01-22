package javaExamples.Collections;

import java.util.*;

public class JavaCollection5 {
    public static void main(String args[]) {
        // PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder()); //max heap
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();//min heap
        queue.add(44);
        queue.add(29);
        queue.add(35);
        queue.add(19);
        queue.add(14);
        queue.add(81);
        queue.add(56);
        queue.add(77);
        System.out.println("head:" + queue.element());

        System.out.println("head0:" + queue.peek());

        System.out.println("head1:" + queue.element());

        System.out.println("iterating the queue elements:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("head before removing:" + queue.peek());
        System.out.println("Using remove method: "+ queue.remove());
        Iterator itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        System.out.println("head after removing:" + queue.peek());
        System.out.println("Using poll method: "+queue.poll());
        System.out.println("after removing two elements:");
        Iterator itr23 = queue.iterator();
        while (itr23.hasNext()) {
            System.out.println(itr23.next());
        }
    }
}
