class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        StringBuilder sb = new StringBuilder();
        int x = 0;
        for (x = 0; x < strs[0].length(); x++) {
            char ch = strs[0].charAt(x);
            for (int i = 1; i < strs.length; i++) {
                if (x >= strs[i].length()) {
                    return sb.toString();
                }
                char inside = strs[i].charAt(x);
                if (inside != ch)
                    return sb.toString();
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}