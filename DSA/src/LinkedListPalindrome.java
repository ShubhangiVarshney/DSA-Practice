import java.util.List;

public class LinkedListPalindrome {
    ListNode head;
    public static class ListNode {
        int data;
        ListNode next;
        ListNode (int d) {
            this.data=d;
            this.next=null;
        }
    }
    public void push(int new_data){
        ListNode new_node=new ListNode(new_data);
        new_node.next=head;
        head=new_node;

    }
    public void printLL(){
        ListNode n=head;
        while (n!=null){
            System.out.println(n.data);
            n=n.next;
        }

    }

    public boolean isPalindrome() {
        String str1="",str2="";
        ListNode n=head,c=head;
        ListNode prev=null;
        ListNode next=null;
        while(n!=null){
            str1=str1+n.data;
            n=n.next;
        }
        //System.out.println("LinkedList: "+ str1);
        while(c!=null){

            next=c.next;
            c.next=prev;
            prev=c;
            c=next;
        }
        head=prev;
        ListNode pres=head;
        while(pres!=null){
            str2=str2+pres.data;
            pres=pres.next;
        }
        //System.out.println("ReversedLinkedList: "+str2);

        if (str1.equals(str2)) {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }

    }
    public static void main(String[] args){
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
}
