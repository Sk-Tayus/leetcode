class Solution {
    public boolean isPalindrome(int x) {
        int temp = x,rev = 0;
        while (x!= 0) {
            int r = x % 10;
            rev = rev*10 + r;
            x = x / 10;
        }
        if (temp < 0) return false;
        else if (temp == rev) return true;
        else return false;
    }
}