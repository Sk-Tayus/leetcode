class Solution {
    public int candy(int[] ratings) {
        //first loop from left to right
        int n = ratings.length;
        int[] res = new int[n];
        int prev = ratings[0], curr = 0, next = 0;

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            curr = ratings[i];
            if (curr > prev) {
                res[i] = res[i - 1] + 1;
            } else if (prev > curr) {
                res[i] = 1;
            } else {
                res[i] = 1;
            }
            prev = ratings[i];

        }

        //loop from left to right
        curr = 0;
        next = 0;

        int[] res2 = new int[n];
        res2[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                res2[i] = res2[i + 1] + 1;
            } else {
                res2[i] = 1;
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            count = count + Math.max(res[i], res2[i]);
        }

        return count;
    }
}