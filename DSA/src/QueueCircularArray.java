// Implementing queue using Circular Array
public class QueueCircularArray {
    int capa;
    int front, size=0;
    int rear=capa-1;
    int[] arr;

    QueueCircularArray(int n){
            this.capa = n;
            this.arr = new int[capa];
    }

    void enqueue(int item){
        if (size==capa){
            System.out.println("Queue is full");
        }
        else{
            rear=(rear+1)%arr.length;
            arr[rear]=item;
            size=size+1;
        }

    }

    void dequeue(){
        if (size==0){
            System.out.println("Queue is empty");
        }
        else{
            front=(front+1)%arr.length;
            size-=1;
        }
    }

    int front(){
        int n=arr[front];
        System.out.println("Front element of the queue: "+n);
        return n;
    }

    int End() {
        int n = arr[rear];
        System.out.println("Last element of the queue: " +n);
        return n;
    }

    int Size(){
        System.out.println("Size of the queue: " +size);
        return size;
    }

    void printQueue() {
        if (size==0)
            System.out.println("Queue is empty===");
        else {
            int m=front;
            while(m!=rear) {
                System.out.println(arr[m]);
                m=(m+1)%arr.length;
            }
            System.out.println(arr[m]);
        }
    }
    public static void main(String[] args) {
        QueueCircularArray q = new QueueCircularArray(10);
        q.enqueue(56);
        q.enqueue(1);
        q.enqueue(88);
        q.enqueue(67);
        q.dequeue();
        q.dequeue();
        q.enqueue(45);
        q.enqueue(123);
        q.front();
        q.End();
        System.out.println("front index:"+q.front);
        System.out.println("rear index:"+q.rear);
        // q.dequeue();
        // q.dequeue();
        q.printQueue();
        q.Size();
    }
}
