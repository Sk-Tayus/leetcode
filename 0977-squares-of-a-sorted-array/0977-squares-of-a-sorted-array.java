class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int l = 0, r = n - 1, k = n - 1;
        while (l <= r) {
            int leftSq = arr[l] * arr[l];
            int rightSq = arr[r] * arr[r];
            if (leftSq > rightSq) {
                result[k--] = leftSq;
                l++;
            } else {
                result[k--] = rightSq;
                r--;
            }
        }
        return result;
    }
}