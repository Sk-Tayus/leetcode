class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int len = 0, i = n-1;
        while(i>=0) {
            char ch = s.charAt(i);
            if(ch != ' ') len++;
            i--;
            if( (i < 0) || (ch == ' ' && len!=0) ) break;
        }
        return len;
    }
}