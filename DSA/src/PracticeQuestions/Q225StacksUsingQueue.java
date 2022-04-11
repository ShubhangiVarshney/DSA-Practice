package PracticeQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q225StacksUsingQueue {

    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    public Q225StacksUsingQueue() {

    }

    public void push(int x) {

        q1.add(x);
    }

    public int pop() {
        while (q1.size()>1){
            q2.add(q1.remove());
        }
        int res= q1.remove();
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
        return res;
    }

    public int top() {
        while (q1.size()>1){
            q2.add(q1.remove());
        }
        int res= q1.peek();
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
        q1.add(res);
        q2.clear();
        return res;
    }

    public boolean empty() {
        if (q1.isEmpty() && q2.isEmpty())
            return true;
        else
            return false;
    }
}
