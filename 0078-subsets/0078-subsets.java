class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void helper(int[] arr, int no, List<Integer> list) {
        ans.add(new ArrayList<>(list));
        for (int i = no; i < arr.length; i++) {

            list.add(arr[i]);
            helper(arr, i+1, list);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        helper(nums, 0, list);
        return ans;
    }
}