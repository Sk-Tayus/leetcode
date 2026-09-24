class Solution {
    public int strongPasswordChecker(String s) {
        int n = s.length();
        boolean hasDigit = false, hasLower = false, hasUpper = false;
        List<Integer> repeats = new ArrayList<>();

        int i = 0;
        while (i < n) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) hasDigit = true;
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isUpperCase(ch)) hasUpper = true;

            int j = i;
            while (j < n && s.charAt(j) == ch) j++;
            if (j - i >= 3) repeats.add(j - i);
            i = j;
        }

        int missing = 0;
        if (!hasDigit) missing++;
        if (!hasLower) missing++;
        if (!hasUpper) missing++;

        if (n < 6) {
            return Math.max(missing, 6 - n);
        }

        int replace = 0;
        for (int len : repeats) replace += len / 3;

        if (n <= 20) {
            return Math.max(missing, replace);
        }

        int toDelete = n - 20;
        int delete = toDelete;

        for (int idx = 0; idx < repeats.size() && delete > 0; idx++) {
            int len = repeats.get(idx);
            if (len % 3 == 0) {
                int use = 1;
                repeats.set(idx, len - use);
                delete -= use;
            }
        }

        for (int idx = 0; idx < repeats.size() && delete > 0; idx++) {
            int len = repeats.get(idx);
            if (len >= 3 && len % 3 == 1) {
                int use = Math.min(delete, 2);
                repeats.set(idx, len - use);
                delete -= use;
            }
        }

        for (int idx = 0; idx < repeats.size() && delete > 0; idx++) {
            int len = repeats.get(idx);
            if (len >= 3) {
                int use = Math.min(delete, len - 2);
                repeats.set(idx, len - use);
                delete -= use;
            }
        }

        replace = 0;
        for (int len : repeats) if (len >= 3) replace += len / 3;

        return toDelete + Math.max(missing, replace);
    }
}