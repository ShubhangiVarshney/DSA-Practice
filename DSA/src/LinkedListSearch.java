public class LinkedListSearch {
    Node head;
    public static class Node {
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }

    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    public void printLL(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public boolean Search(int key){
       Node temp=head;
       int count=0;
        while(temp!=null){
            count=count+1;
            if(temp.data==key) {
                System.out.println("The element is at position: "+count);
                System.out.println("True");
                return true;
            }
            else
                temp=temp.next;
        }
        System.out.println("Element not found");
        return false;

    }

    public static void main (String[] args){
        LinkedListSearch l=new LinkedListSearch();
        l.push(2);
        l.push(41);
        l.push(19);
        l.push(45);
        l.push(79);
        l.push(64);
        l.push(23);
        l.push(87);
        l.push(76);
        l.push(8);
        l.printLL();
        l.Search(64);
    }
}
