package PracticeQuestions;
import java.util.*;

public class Q160IntersectionLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int countA=0;
        int countB=0;
        int diff=0;
        int count=0;
        ListNode intersection=null;

        while(tempA!=null){
            tempA=tempA.next;
            countA++;
        }
        while (tempB!=null){
            tempB=tempB.next;
            countB++;
        }
        if (countA>=countB){
            diff=countA-countB;
            tempA=headA;
            tempB=headB;
        }
        else  {
            diff=countB-countA;
            tempA=headB;
            tempB=headA;
        }
        while (tempA!=null && tempB!=null){
         if(count<=diff){
             tempA=tempA.next;
             count++;
         }
         else if(tempA==tempB){
             intersection=tempA;
             break;
         }
         else if (tempA!=tempB) {
             tempA=tempA.next;
             tempB=tempB.next;
             count++;
         }
        }
        return intersection;


        /*  ListNode tempA=headA;
        ListNode tempB=headB;
        ListNode intersection=null;

     HashSet<ListNode> hs=new HashSet<ListNode>();
    while (tempA!=null){
        hs.add(tempA);
        tempA=tempA.next;
    }

    while(tempB!=null){
        if(hs.contains(tempB)){
            intersection=tempB;
            break;
        }
        else
            tempB=tempB.next;
    }
    return intersection; */
    }
}
