class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        int total = l1 + l2;
        int medianPos = total / 2;   
        int i = 0, j = 0;
        int prev = -1, curr = -1;
        for (int count = 0; count <= medianPos; count++) {
            prev = curr;
            if (i < l1 && (j >= l2 || nums1[i] <= nums2[j])) {
                curr = nums1[i];
                i++;
            } else {
                curr = nums2[j];
                j++;
            }
        }
        if (total % 2 == 0) {
            return (prev + curr) / 2.0;
        } else {
            return curr;
        }
    }
}