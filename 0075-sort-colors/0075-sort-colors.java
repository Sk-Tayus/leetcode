class Solution {
    public static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i] > nums[j]) {
                    swap(nums,i,j);
                }
            }
        }
    }
}