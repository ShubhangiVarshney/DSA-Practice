package PracticeQuestions;

public class Q83RemoveDuplicatedFromSortedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;
      }
        public ListNode deleteDuplicates(ListNode head) {
            if(head==null)
                return head;
            ListNode i=head;
            ListNode j=null;
            if(i.next!=null)
                j=i.next;

            while(j!=null){
                if(j.val!=i.val){
                    i.next=j;
                    i=i.next;
                }
                j=j.next;
            }
            i.next=j;
            return head;
        }

  }
}
