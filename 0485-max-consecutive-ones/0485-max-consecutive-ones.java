class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int x = 0;
        int maxFreq = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] == 1) x++;
            else {
                if(x > maxFreq) maxFreq = x;
                x = 0;
            }
        }
        if(x > maxFreq) maxFreq = x;
        return maxFreq;
    }
}