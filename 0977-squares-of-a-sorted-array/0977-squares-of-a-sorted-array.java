class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l=0,r=n-1;
        for(int i =0; i<n; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}