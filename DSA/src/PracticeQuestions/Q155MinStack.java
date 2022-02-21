package PracticeQuestions;

public class Q155MinStack {
    Node top;
    public class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }

    public void push(int val) {
        Node temp=top;
        Node newNode=new Node(val);
        if(temp==null)
            top=newNode;
        else{
            newNode.next=temp;
            top=newNode;
        }
    }

    public void pop() {
        Node temp=top;
        if(temp==null)
            return;
        else{
            top=temp.next;
            temp.next=null;
        }

    }

    public int top() {
        Node temp=top;
        if(temp==null)
            return 0;
        else
            return temp.data;
    }

    public int getMin() {
        Node temp=top;
        int min=temp.data;
        while(temp!=null){
            if(temp.data<min)
                min=temp.data;
            temp=temp.next;
        }
        return min;
    }
}
