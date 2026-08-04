class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0], max = nums[0];
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
            set.add(x);
        }

        List<Integer> list = new ArrayList<>();
        for (int z = min + 1; z < max; z++) {
            if (!set.contains(z)) {
                list.add(z);
            }
        }
        return list;
    }
}