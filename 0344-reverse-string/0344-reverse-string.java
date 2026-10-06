class Solution {
    public static void fn(char[] s, int left, int right) {
        if(left >= right) return;
        char temp = s[right];
        s[right] = s[left];
        s[left] = temp;
        fn(s, left+1, right-1);
    }
    public void reverseString(char[] s) {
        int n = s.length;
        fn(s, 0, n-1);
    }
}