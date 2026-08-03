class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;

        int[] ans = new int[m];
        int sum = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                sum+= accounts[i][j];
            }
            ans[i] = sum;
            sum = 0;
        }
        int max = 0;
        for(int x : ans) {
            if(x > max) max = x;
        }
        return max;
    }
}