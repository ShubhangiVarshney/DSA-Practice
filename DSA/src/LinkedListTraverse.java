public class LinkedListTraverse {
    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void printLL() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public void deleteNode(int key) {
        Node temp = head, prev = null;
        while (temp != null) {
            if (temp.data == key) {
                if (prev == null) {
                    head = temp.next;
                    temp.next = null;
                    return;
                } else {
                    prev.next = temp.next;
                    temp.next = null;
                }

            } else {
                prev = temp;
                temp = temp.next;
            }

        }

        System.out.println("Element which needs to be deleted not present in Linked List");

    }

    public void AddInFront(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
        }
        new_node.next = head;
        head = new_node;

    }

    public void AddInBetween(Node prev_node, int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;

    }

    public void AddAtEnd(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            new_node.next = null;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new_node;
        }

    }

    public static void main(String[] args) {
        LinkedListTraverse l = new LinkedListTraverse();

      /* Node one=new Node(6);
      Node two=new Node(12);
      Node three=new Node(17);

      l.head=one;
      one.next=two;
      two.next=three;*/

        l.AddAtEnd(90);
        l.AddAtEnd(33);
        l.AddAtEnd(14);
        l.AddAtEnd(50);
        l.AddInFront(45);
        l.AddInBetween(l.head.next.next.next, 66);
        //l.deleteNode(45);
        l.printLL();
    }

}
