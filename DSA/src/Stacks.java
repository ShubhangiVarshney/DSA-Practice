public class Stacks {
    int cap;
    int top = -1;
    int bound = 10;
    int[] arr;

    Stacks(int capa){
        this.cap=capa;
        this.arr = new int[cap];
    }


    int[] create_array(int[] arr) {
        int[] new_arr = new int[this.cap + this.bound];
        for (int i = 0; i < cap; i++) {
            new_arr[i] = arr[i];
            }
        System.out.println("New array created");
        this.cap = this.cap + this.bound;
        return new_arr;
    }

    int[] push(int[] a, int e) {
        if (top == cap - 1)
            this.arr = create_array(a);

        arr[++top] = e;
        System.out.println("Index of last element: "+this.top);
        System.out.println("Maximum capacity of an array: "+this.cap);
        return a;

    }

    void pop(int[] a) {
        int x = a[top--];
        System.out.println("Index of last element after removing the element: "+this.top);
    }

    void printStack(int[] a) {
        if (top == -1)
            System.out.println("Stack is empty");
        else {
            for (int i = this.top; i > -1; i--)
                System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Stacks s = new Stacks(10);
        s.push(s.arr, 34);
        s.push(s.arr, 39);
        s.push(s.arr, 1);
        s.push(s.arr, 88);
        s.push(s.arr, 98);
        s.push(s.arr, 47);

        s.pop(s.arr);
        //s.pop(s.arr);
        s.printStack(s.arr);

    }


    //Simple array based implementation
   /* final int cap=5;
    int top=-1;
    int[] arr=new int[cap];



    void push(int x){
        if(top>cap-1){
            System.out.println("Stack is full");
        }
        else {
            arr[++top]=x;
        }
    }
    void pop (){
        if(top<=-1){
        System.out.println("No elements in the stack");
        }
        else{
           int x=arr[--top];
           System.out.println("Index of last element: "+top);
        }
    }
    void isEmpty(){
        if (top<0){
            System.out.println("True:Stack is empty");
        }
        else{
            System.out.println("False: Stack is not empty");
        }
    }
    void isFull(){
        if(top==cap-1){
            System.out.println("True: Stack is Full");
        }
        else{
            System.out.println("False: Stack is not full");
        }
    }
    void print(){
        int i;
        for (i=top; i>-1; i--){
            System.out.println(arr[i]);
        }
    }
    int size(){
        int x=top;
        int a=top+1;
        System.out.println("Number of elements in Stack: "+ a);
        return x;

    }

    public static void main(String args[]){
        Stacks s=new Stacks();
        s.push(67);
        s.push(23);
        s.push(90);
        s.push(2);
        s.pop();
        s.pop();
        s.print();
        s.size();
        s.isEmpty();
        s.isFull();
    } */
}
