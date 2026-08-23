class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();

        if (l1 != l2)
            return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < l1; i++) {
            char x = s.charAt(i);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < l2; i++) {
            char ch = t.charAt(i);

            if (!map.containsKey(ch))
                return false;

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0)
                map.remove(ch);
        }
        return map.isEmpty();
    }
}