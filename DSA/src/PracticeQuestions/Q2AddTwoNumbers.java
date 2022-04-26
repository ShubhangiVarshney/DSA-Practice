package PracticeQuestions;

public class Q2AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        boolean firstSet = false;
        ListNode head3 = new ListNode();
        ListNode temp = head3;
        int carry = 0;
        int sum = 0;
        while (head1 != null || head2 != null) {

            if (head1 != null && head2 != null) {
                sum = head1.val + head2.val;
                head1 = head1.next;
                head2 = head2.next;
            } else if (head2 != null) {
                sum = head2.val;
                head2 = head2.next;
            } else {
                sum = head1.val;
                head1 = head1.next;
            }
            sum = sum + carry;
            carry = 0;
            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;

            }
            if (!firstSet) {
                temp.val = sum;
                firstSet = true;
            } else {
                temp.next = new ListNode(sum);
                temp = temp.next;
            }

        }
        return head3;

    }


}
