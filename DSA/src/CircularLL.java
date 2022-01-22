public class CircularLL {
    Node head;

    public static class Node{
        int val;
        Node next;

        Node(int d){
            this.val=d;
            this.next=null;
        }

    }

    public void addAtFront(int d){
        Node new_node=new Node(d);
        Node temp=head;
        if (temp==null){
            new_node.next=new_node;
            head=new_node;
        }
        else{
            new_node.next=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=new_node;
            head=new_node;
        }

    }

    public void AddInBetween(int index,int d){
        Node new_node=new Node(d);
        Node temp=head;
        Node next;
        int count=1;
        while (count!=index){
            count=count+1;
            temp=temp.next;
        }
        next=temp.next;
        temp.next=new_node;
        new_node.next=next;
    }
    public void pushAtLast(int d){
        Node new_node=new Node(d);
        Node temp=head;
        if (temp==null){
            new_node.next=new_node;
            head=new_node;
        }
        else{
             while(temp.next!=head)
            {
             temp=temp.next;
            }
            temp.next = new_node;
            new_node.next = head;
        }

    }
    public void printLL(){
        Node temp=head;
        do {
            System.out.println(temp.val);
            temp=temp.next;
        }while(temp!=head);
    }

    public static void main(String args[]){
     CircularLL l=new CircularLL();
     l.pushAtLast(12);
     l.pushAtLast(44);
     l.pushAtLast(50);
     l.pushAtLast(39);
     l.pushAtLast(566);
     l.addAtFront(67);
     l.AddInBetween(7,123);
        l.printLL();
    }
}
