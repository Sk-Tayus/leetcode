class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int l1 = ransomNote.length();
        int l2 = magazine.length();
        if(l1 > l2) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        int i=0;

        while(i < l1 && i < l2) {
            char ch1 = ransomNote.charAt(i);
            char ch2 = magazine.charAt(i);

            freq1[ch1 - 'a']++;
            freq2[ch2 - 'a']++;
            i++;

        }

        while(i < l2) {
            char ch2 = magazine.charAt(i);
            freq2[ch2 - 'a']++;
            i++;
        }

        i=0;
        while(i < 26) {
            if(freq1[i]>freq2[i]) return false; //direct compare if more chars -> false
            i++;
        }


        return true;
    
    }
}