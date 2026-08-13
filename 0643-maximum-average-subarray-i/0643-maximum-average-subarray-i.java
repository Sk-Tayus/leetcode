class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double windowSum = 0.0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        double maxAvg = windowSum;
        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i-k];
            maxAvg = Math.max(maxAvg, windowSum);
        }
        return maxAvg/k;
    }
}