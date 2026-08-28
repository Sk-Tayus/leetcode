class Solution {
    public static boolean isVowel(char ch) {
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') return true;
        return false;
    }
    public String reverseVowels(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);

        int l=0,r=n-1;
        while(l<r) {
            if (!isVowel(sb.charAt(l))) { l++; continue; }//skip non vowel only move l
            if (!isVowel(sb.charAt(r))) { r--; continue; }//skip non vowel only move r
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);
                sb.setCharAt(l,ch2);
                sb.setCharAt(r,ch1);

            l++;
            r--;
        }

        return sb.toString();
    }
}