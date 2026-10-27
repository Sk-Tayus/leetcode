class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];

        res[0] = nums[0] % k;                       // store remainder, not raw sum
        for(int i=1; i<n; i++) {
            res[i] = (nums[i] + res[i-1]) % k;      // keeps value small, no overflow
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);                             // handles subarray starting at index 0

        for(int i=0; i<n; i++) {
            if(map.containsKey(res[i])) {
                if(i - map.get(res[i]) >= 2) return true;   // length >= 2
            } else {
                map.put(res[i], i);                 // store FIRST index only
            }
        }
        return false;
    }
}