class Solution {
    public static void swap(int[] arr, int i, int j) {
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int zeros=0,ones=0,twos=0;
        for (int i = 0; i < n; i++) {
            if(nums[i] == 0) zeros++;
            if(nums[i] == 1) ones++;
            if(nums[i] == 2) twos++;
        }

        for (int i = 0; i < n; i++) {
            if(zeros !=0) {
                nums[i] = 0;
                zeros--;
                continue;
            }
            if(ones !=0) {
                nums[i] = 1;
                ones--;
                continue;
            }
            if(twos !=0) {
                nums[i] = 2;
                twos--;
                continue;
            }
        }
    }
}