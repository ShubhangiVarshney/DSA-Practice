package PracticeQuestions;

/*You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list. */

public class Q6 {
     public class ListNode {
        int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;}
  }
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
             ListNode temp1=list1;
             ListNode temp2=list2;
             ListNode list3=null;
             ListNode temp3=null;

             while(temp1!=null||temp2!=null) {
                 if (temp1 != null && temp2 != null) {
                     if (temp1.val <= temp2.val) {
                         if (temp3 == null) {
                             temp3 = temp1;
                             temp1 = temp1.next;
                             temp3.next = null;
                             list3 = temp3;

                         } else {
                             temp3.next = temp1;
                             temp1 = temp1.next;
                             temp3 = temp3.next;
                             temp3.next = null;
                         }
                     } else if (temp1.val > temp2.val) {
                         if (temp3 == null) {
                             temp3 = temp2;
                             temp2 = temp2.next;
                             temp3.next = null;
                             list3 = temp3;

                         } else {
                             temp3.next = temp2;
                             temp2 = temp2.next;
                             temp3 = temp3.next;
                             temp3.next = null;
                         }
                     }
                 }
                 else if (temp2 == null){
                     if (temp3 == null) {
                         temp3 = temp1;
                         temp1 = temp1.next;
                         temp3.next = null;
                         list3 = temp3;

                     } else {
                         temp3.next = temp1;
                         temp1 = temp1.next;
                         temp3 = temp3.next;
                         temp3.next = null;
                     }
                 }
                 else if (temp1==null){
                     if (temp3 == null) {
                         temp3 = temp2;
                         temp2 = temp2.next;
                         temp3.next = null;
                         list3 = temp3;

                     } else {
                         temp3.next = temp2;
                         temp2 = temp2.next;
                         temp3 = temp3.next;
                         temp3.next = null;
                     }

                 }
             }
           return list3;
     }

     public static void main(String[] args){

     }
}
