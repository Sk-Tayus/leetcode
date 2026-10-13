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
    public void reorderList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp  = head;
        //making stack
        while(temp != null) {
            st.push(temp);
            temp = temp.next;
        }
        int n = st.size(); 
        temp = head;

        for (int i = 0; i < n / 2; i++) {                
            ListNode nxt = temp.next;  // 1. purana next save
            ListNode last = st.pop();  // 2. peeche wala node
            temp.next = last;          // 3. temp -> last
            last.next = nxt;           // 4. last -> purana next
            temp = nxt;                // 5. aage badh
        }
        temp.next = null;  


    }
}