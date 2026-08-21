class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int l=0,r=n-1;
        
        while (l < r) {
            char ch1 = Character.toLowerCase(s.charAt(l));
            char ch2 = Character.toLowerCase(s.charAt(r));
            if (!Character.isLetterOrDigit(ch1)) { 
                l++; 
                continue;
            }
            if (!Character.isLetterOrDigit(ch2)) { 
                r--;
                continue;
            }
            if(ch1 != ch2) return false;
            l++;
            r--;
        }
        return true;
    }
}