class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low=0,high=n-1;
        int ans = -1;

        while(low<=high) {
            int mid = low + (high-low)/2;
            if(mid == 0) return 1;
            if(mid == n || mid == n-1) return n-1;
            if((arr[mid] > arr[mid-1]) && (arr[mid] > arr[mid+1])) return mid;

            else if(arr[mid] < arr[mid-1]) {
                high = mid-1;
            }
            else if(arr[mid] < arr[mid+1]) {
                ans = mid;
                low = mid+1;
            }
            // else {

            // }
        }
        
        return ans;
    }
}