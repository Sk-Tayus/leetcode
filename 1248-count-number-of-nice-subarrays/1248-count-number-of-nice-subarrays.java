class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n= nums.length;
        int count = 0;

        for(int i=0; i<n; i++) {
            if(nums[i] % 2 == 0) nums[i] = 0;
            else nums[i] = 1;
        }

        for(int i = 1; i < n; i++) {
            nums[i] = nums[i-1] + nums[i];
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        for(int i =0; i<n; i++) {
            int target = nums[i] - k;
            if (map.containsKey(target)) {
                count += map.get(target);
            }
        }

        return count;


    }
}