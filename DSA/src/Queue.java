// Queue implemented by static array
public class Queue {
    int capa;
    int front, size;
    int rear=-1;
    int[] arr;


    Queue(int cap) {
        this.capa = cap;
        this.arr = new int[capa];
    }

    void enqueue(int n) {
        if (rear == capa) {
            System.out.println("Queue is full");
        } else {
            rear++;
            arr[rear] = n;
            size = size + 1;
        }
    }

    void size() {
        System.out.println("Size of the array: " + size);
    }

    void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
        }
        else {
            size = size - 1;
            for (int i = 0; i <= rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
        }

    }

    void frontElement(){
        System.out.println("Element at front: "+arr[front]);
    }

    void rearElement(){
        System.out.println("Element at end: "+arr[rear]);
    }

    void printQueue() {
        if (front == rear)
            System.out.println("Queue is empty");
        else {
            for (int i = 0; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enqueue(56);
        q.enqueue(1);
        q.enqueue(88);
        q.enqueue(67);
        q.dequeue();
        q.dequeue();
        q.enqueue(45);
        q.enqueue(123);
        q.frontElement();
        q.rearElement();
        //q.dequeue();
        //q.dequeue();
        q.printQueue();
        q.size();
    }
}
