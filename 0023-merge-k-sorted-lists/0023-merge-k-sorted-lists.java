class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        ArrayList<Integer> arr = new ArrayList<>();

        // Traverse all k lists
        for (int i = 0; i < lists.length; i++) {

            ListNode temp = lists[i];

            while (temp != null) {
                arr.add(temp.val);
                temp = temp.next;
            }
        }

        // Sort all values
        Collections.sort(arr);

        // Create the final linked list
        ListNode head = new ListNode(0);
        ListNode curr = head;

        for (int i = 0; i < arr.size(); i++) {
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }

        return head.next;
    }
}