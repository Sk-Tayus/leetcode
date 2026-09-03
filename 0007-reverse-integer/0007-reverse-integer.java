class Solution {
    public int reverse(int x) {
        long temp = 0;
        while (x != 0) {
            int r = x % 10;
            temp = temp * 10 + r;
            if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) return 0;
            x = x / 10;
        }
        return (int)temp;
    }
}