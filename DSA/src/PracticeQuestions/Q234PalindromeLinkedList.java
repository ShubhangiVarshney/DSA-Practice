package PracticeQuestions;


public class Q234PalindromeLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(slow.next!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf=reverse(slow.next);
        ListNode firstHalf=head;

        while(secondHalf!=null && firstHalf!=null){
            if (secondHalf.val!=firstHalf.val){
                return false;
            }
            secondHalf=secondHalf.next;
            firstHalf=firstHalf.next;
        }
        return true;
    }

    ListNode reverse(ListNode head){
        ListNode temp1=null;
        ListNode temp2=null;
        while(head!=null){
            temp2=head.next;
            head.next=temp1;
            temp1=head;
            head=temp2;
        }
        return temp1;
    }
}
