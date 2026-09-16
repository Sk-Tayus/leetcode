/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;

        while(first != null && second != null) {
            int sum = first.val + second.val + carry;
            carry = 0;
            if(sum > 9) {
                carry = 1;
                sum -= 10;
            }
            ListNode newNode = new ListNode(sum);
            temp.next = newNode;
            temp = temp.next;

            first = first.next;
            second = second.next;
        }

        while(first != null) {
            int sum = first.val + carry;
            carry = 0;
            if(sum > 9) {
                carry = 1;
                sum -= 10;
            }
            ListNode newNode = new ListNode(sum);
            temp.next = newNode;
            temp = temp.next;

            first = first.next;
        }

        while(second != null) {
            int sum = second.val + carry;
            carry = 0;
            if(sum > 9) {
                carry = 1;
                sum -= 10;
            }
            ListNode newNode = new ListNode(sum);
            temp.next = newNode;
            temp = temp.next;

            second = second.next;
        }

        if(carry == 1) {
            ListNode x = new ListNode(1);
            temp.next = x;
        }
        return dummy.next;
    }
}