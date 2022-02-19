package PracticeQuestions;

import java.util.HashSet;

public class Q141LinkedListCycle {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public boolean hasCycle(ListNode head) {
    ListNode temp=head;
    HashSet<ListNode> hs=new HashSet<ListNode>();
    while(temp!=null){
        if(hs.contains(temp))
            return true;
        else
            hs.add(temp);
        temp=temp.next;
    }
     return false;
    }
}
