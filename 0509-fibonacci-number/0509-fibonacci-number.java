// 0 1 1 2 3 5 8 13 
class Solution {
    public int fib(int n) {
        int a=0, b=1;
        int c = a+b;

        for(int i=0; i< n; i++) {
            a = b;
            b = c;
            c = a+b;
        }

        return a;
    }
}