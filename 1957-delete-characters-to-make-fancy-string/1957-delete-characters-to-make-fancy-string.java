class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int count = 1;
        sb.append(s.charAt(0));
        for (int i = 1; i < n; i++) {
            char l = s.charAt(i);
            if (l == s.charAt(i-1)) {
                count++;
            } else {
                count = 1;
            }
            if (count < 3) {
                sb.append(l);
            }
        }
        return sb.toString();
    }
}