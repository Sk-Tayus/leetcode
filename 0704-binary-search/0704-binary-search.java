// 78
// 50 -> 75 -> 87 -> 81 -> 78!
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int st = 0, end = n - 1;
        int idx = -1;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (nums[mid] == target) {
                idx = mid;
                return idx;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            }

            else if (target > nums[mid]) {
                st = mid+1;
            }
        }

        return idx;

    }
}