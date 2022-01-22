public class CallingClass {
    void LLTraverse(){
        LinkedListTraverse l=new LinkedListTraverse();
        l.AddAtEnd(90);
        l.AddAtEnd(33);
        l.AddAtEnd(14);
        l.AddAtEnd(50);
        l.AddInFront(45);
        l.printLL();
    }
    void LLPalindrome(){
        LinkedListPalindrome l=new LinkedListPalindrome();
        l.push(4);
        l.push(13);
        l.push(223);
        l.push(78);
        l.push(223);
        l.push(13);
        l.push(4);
        l.printLL();
        l.isPalindrome();
    }
    void Queue(){
        Queue q =new Queue(100);


    }


    public static void main(String[] args){
        CallingClass c=new CallingClass();
        //c.LLTraverse();
        //c.LLPalindrome();
        c.Queue();
    }

}
