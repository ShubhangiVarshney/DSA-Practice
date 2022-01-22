public class StackLL {
    Node top;
    public class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    void push(int d){
        Node temp=top;
        Node newNode=new Node(d);
        if (temp==null){
            top=newNode;
        }
        else {
            newNode.next=temp;
            top=newNode;
        }
    }
    void pop(){
        Node temp=top;
        if (temp==null){
        System.out.println("Stack is empty");
        }
        else{
            top=temp.next;
            temp.next=null;
        }
    }
    void printStack(){
        Node temp=top;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        StackLL s= new StackLL();
        s.push(67);
        s.push(78);
        s.push(23);
        s.push(9);
        s.push(45);
        s.pop();
        s.pop();
        s.printStack();

    }
}
