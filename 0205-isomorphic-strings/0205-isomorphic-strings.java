class Solution {
    public boolean isIsomorphic(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverse = new HashMap<>();

        for(int i=0;i<l1;i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(!map.containsKey(ch1)) {
                map.put(ch1, ch2);
            } else if(map.get(ch1) != ch2) return false;

            //now we check for this character in t which character from s is it already mapped to

            if(!reverse.containsKey(ch2)) {
                reverse.put(ch2, ch1);
            }
            else if(reverse.get(ch2) != ch1) return false;

        }
        return true;
    }
}