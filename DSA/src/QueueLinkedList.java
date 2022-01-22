public class QueueLinkedList {
    Node front, rear;
    int length = 0;

    class Node {
        int data;
        Node next;

        Node(int n) {
            this.data = n;
            this.next = null;
        }
    }

    void enqueue(int item) {
        Node newNode = new Node(item);
        Node temp = front;
        if (temp == null) {
            front = newNode;
            rear = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            rear = newNode;
        }
        length = length + 1;
    }

    void dequeue() {
        Node temp = front;
        if (temp == null)
            System.out.println("Queue is empty");
        else if (temp.data == rear.data) {
            front = rear = null;
            length = 0;
            System.out.println("Queue became empty");
        } else {
            {
                front = temp.next;
                temp.next = null;
                length = length - 1;
            }
        }

    }

    void frontElement() {
        if (front == null)
            System.out.println("No front element as Queue is empty");
        else
            System.out.println("Front element of the queue is: " + front.data);
    }

    void lastElement() {
        if (rear == null)
            System.out.println("No last element as Queue is empty");
        else
            System.out.println("Last element of the queue is: " + rear.data);
    }

    void display() {
        Node temp = front;
        if (front == null)
            System.out.println("Display: Queue is empty");
        else {
            while (temp != rear) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {
        QueueLinkedList ql = new QueueLinkedList();
        ql.enqueue(44);
        ql.enqueue(69);
        ql.enqueue(176);
        ql.enqueue(775);
        ql.enqueue(16);
        ql.dequeue();
        ql.dequeue();
        ql.dequeue();
        ql.dequeue();
        ql.enqueue(445);
        ql.dequeue();
        ql.frontElement();
        ql.lastElement();
        ql.display();

    }
}
