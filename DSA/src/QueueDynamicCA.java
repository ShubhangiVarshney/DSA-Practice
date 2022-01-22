public class QueueDynamicCA {
    int cap;
    int front = 0;
    int rear = -1;
    int size = 0;
    int[] arr;

    QueueDynamicCA(int n) {
        this.cap = n;
        this.arr = new int[cap];
    }

    void isEmpty() {
        if (size == 0)
            System.out.println("true");
        else
            System.out.println("false");
    }

    void isFull() {
        if (size == cap)
            System.out.println("true");
        else
            System.out.println("false");
    }

    void enqueue(int n) {
        if (size == cap) {
            createArray();
            System.out.println("New Array created");
        }
        rear = (rear + 1) % this.arr.length;
        this.arr[rear] = n;
        size = size + 1;
    }

    void createArray() {
        int[] newArr = new int[cap * 2];
        int temp = front;
        while (rear != (temp) % this.arr.length) {
            newArr[temp % newArr.length] = arr[temp % this.arr.length];
            temp = temp + 1;
        }
        newArr[temp] = arr[(temp) % this.arr.length];
        this.arr = newArr;
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            int m = this.arr[this.front];
            front = (front + 1) % this.arr.length;
            size = size - 1;
        }
    }

    void displayQueue() {
        if (size == 0)
            System.out.println("Queue is empty");
        else {
            int m = front;
            while (rear != (m) % arr.length) {
                System.out.println(arr[m]);
                m = m + 1;
            }
            System.out.println(arr[m]);
        }
    }

    public static void main(String[] args) {
        QueueDynamicCA qm = new QueueDynamicCA(5);
        qm.enqueue(12);
        qm.enqueue(21);
        qm.enqueue(67);
        qm.enqueue(54);
        qm.enqueue(95);
        System.out.println("Size of array: "+qm.size);
        qm.enqueue(99);
        qm.displayQueue();
        System.out.println("Size of array increased to: "+qm.arr.length);
    }
}
