class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];

        int l1 = s.length();
        int l2 = t.length();
        int i=0;

        for(i=0;i<l1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            freq[ch1 - 'a']++;
            freq[ch2 - 'a']--;
        }
        freq[t.charAt(i) - 'a']--;

        for(int x=0; x<26; x++) {
            if(freq[x] < 0) {
                return (char)(x + 'a');
            }
        }
        return ' ';
        // return t.charAt(t.length()-1);
    }
}