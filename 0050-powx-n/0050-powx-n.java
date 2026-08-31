// x = 2, n = 13 -> x13= x^8 X x^4 X x^1
class Solution {
    public double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1;
        while (N > 0) {

            if (N % 2 == 1) {
                result *= x;
            }
            // squaring those x that needed
            x *= x;
            // Moving to next binary bit
            N /= 2;
        }

        return result;
    }
}