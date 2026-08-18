class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int maxLen = 0;
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int currCount = freq.get(num);

            if (freq.containsKey(num + 1)) {
                int nextCount = freq.get(num + 1);
                int total = currCount + nextCount;
                if (total > maxLen) {
                    maxLen = total;
                }
            }
        }

        return maxLen;
    }
}