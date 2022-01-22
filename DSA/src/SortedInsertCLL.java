 class SortedInsertCLL {
    Node head;

     static class Node{
        int val;
        Node next;
        Node(int d){
            val=d;
            next=null;
        }
    }

     void print() {
         Node temp = head;
             do {
                 System.out.println(temp.val);
                 temp=temp.next;
             }while(temp!=head);
         }


     void SortInsert(Node new_node){

        Node temp=head;
        if (temp==null){
            new_node.next=new_node;
            head=new_node;

        }
        else if(temp.val>=new_node.val){
            new_node.next=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=new_node;
            head=new_node;
            System.out.println("Loop1 "+new_node.val+" "+head.val);
        }
        else{
            while(temp.next!=head && temp.next.val<=new_node.val){
                temp=temp.next;
            }
            new_node.next=temp.next;
            temp.next=new_node;
            System.out.println("Loop3 "+head.next.val+" "+temp.val);
        }
    }

    public static void main(String[] args){
        SortedInsertCLL cll=new SortedInsertCLL();
        int a[]=new int[] {12,90, 23, 67, 6};
        System.out.println();
        Node temp=null;
        for(int i=0;i<a.length;i++){
            temp=new Node(a[i]);
            cll.SortInsert(temp);
        }
        cll.print();

    }

}

