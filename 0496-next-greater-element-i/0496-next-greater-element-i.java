class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] next = new int[10001];          // value-as-index, stores (nextGreater + 1), 0 = none
        int[] st = new int[nums2.length];     // int[] stack, no boxing, no Deque overhead
        int top = 0;                          // stack size pointer

        for (int x : nums2) {                 // forward pass
            // x is the next greater for every smaller element on stack
            while (top > 0 && st[top - 1] < x) {
                next[st[--top]] = x + 1;      // +1 trick: 0 stays "not found"
            }
            st[top++] = x;
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = next[nums1[i]] - 1;      // unset 0 gives -1 automatically
        }
        return res;
    }
}