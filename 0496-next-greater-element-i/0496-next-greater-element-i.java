class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int[] map = new int[10001];
        int[] res = new int[l1];

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!dq.isEmpty() && dq.peek() <= nums2[i]) {
                dq.pop();
            }
            if (dq.isEmpty()) map[nums2[i]] = -1;
            else map[nums2[i]] = dq.peek();
            dq.push(nums2[i]);
        }
        for (int i = 0; i < l1; i++) {
            res[i] = map[nums1[i]];
        }
        return res;
    }
}