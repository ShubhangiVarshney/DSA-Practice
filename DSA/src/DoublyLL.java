public class DoublyLL {
    Node head;

    class Node{
        int val;
        Node next;
        Node prev;
        Node (int d){
            val=d;
            next=null;
            prev=null;
        }
    }

    public void AddAtFront(int d){
        Node new_node=new Node(d);
        Node temp=head;
        if (temp==null){
            head=new_node;
        }
        else{
            new_node.next=temp;
            temp.prev=new_node;
            head=new_node;
        }
    }
    public void AddAtEnd(int d){
        Node new_node=new Node(d);
        Node temp=head;
        if (temp==null){
            head=new_node;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
            new_node.prev=temp;
            new_node.next=null;
        }
    }

    public void AddAtIndex(int I, int d){
        Node new_node=new Node(d);
        Node temp=head;
        Node c;
        int count=1;
        while (count!=I-1){
            count=count+1;
            temp=temp.next;
        }
        c=temp.next;
        new_node.next=temp.next;
        new_node.prev=temp;
        temp.next=new_node;
        c.prev=new_node;

    }
    public void Delete(int e){
        Node temp=head;
        Node p=null,n=null;
        while(temp!=null){
            if(temp.val==e){
                if(p==null){
                   head=temp.next;
                   temp.next=null;
                    return;
                }
                else{
                    if(n!=null) {
                        p.next = temp.next;
                        n.prev = temp.prev;
                        temp.next = null;
                        temp.prev = null;
                        return;
                    }
                    else{
                        p.next = temp.next;
                        temp.prev = null;
                        return;
                    }
                }

            }
            else{
                p=temp;
                temp=temp.next;
                if(temp.next!=null)
                n=temp.next;
                else
                  n=null;

            }
        }
    }

    public void printLL(){
        Node temp=head;
        Node last=head;
        System.out.println("Forward Direction: ");
        while(temp!=null) {
            System.out.println(temp.val);
            last=temp;
            temp = temp.next;
        }
        /*System.out.println("Reverse Direction: ");
        while(last!=null){
            System.out.println(last.val);
            last=last.prev;
        }*/
    }

    public static void main(String[] args){
        DoublyLL l=new DoublyLL();
        l.AddAtFront(34);
        l.AddAtFront(67);
        l.AddAtFront(12);
        l.AddAtEnd(100);
        l.AddAtEnd(77);
        l.AddAtIndex(3,55);
        l.printLL();
        l.Delete(77);
        l.printLL();


    }
}
