class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash = new int[26];
        int l = 0, r = 0, maxLen = 0, maxFreq = 0;

        while (r < s.length()) {
            // Update frequency of current character
            hash[s.charAt(r) - 'A']++;
            // Track the maximum frequency in the current window
            maxFreq = Math.max(maxFreq, hash[s.charAt(r) - 'A']);

            // Check if the current window is invalid
            // If length - maxFreq > k, shrink from the left
            if ((r - l + 1) - maxFreq > k) {
                hash[s.charAt(l) - 'A']--;
                l++;
            }

            // After adjustment, the window size is valid or maintained
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}
