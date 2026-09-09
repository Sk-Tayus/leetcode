class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );


        int n = s.length();
        int total = 0;

        for(int i=0;i<n-1;i++) {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);

            if(map.get(ch) < map.get(ch2)) {
                total -= (map.get(ch));
            }
            else if(map.get(ch) >= map.get(ch2)) {
                total += map.get(ch);
            }
        }
        total += map.get(s.charAt(n-1));
        return total;
    }
}