class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while ((i < n) && (i < m)) {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            sb.append(ch1);
            sb.append(ch2);
            i++;
        }

        while(i<n) {
            char ch1 = word1.charAt(i);
            sb.append(ch1);
            i++;
        }

        while(i<m) {
            char ch1 = word2.charAt(i);
            sb.append(ch1);
            i++;
        }
        return sb.toString();
    }
}