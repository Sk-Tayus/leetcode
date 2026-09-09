class Solution {
    public int romanToInt(String s) {
        int[] map = new int[26]; // A-Z → 0 to 25
        map['I' - 'A'] = 1;
        map['V' - 'A'] = 5;
        map['X' - 'A'] = 10;
        map['L' - 'A'] = 50;
        map['C' - 'A'] = 100;
        map['D' - 'A'] = 500;
        map['M' - 'A'] = 1000;

        int sum = 0;
        int len = s.length();

        for (int i = 0; i < len - 1; i++) {
            int curr = map[s.charAt(i) - 'A'];
            int next = map[s.charAt(i + 1) - 'A'];
            if (curr < next) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }

        // Add last character (always gets added)
        sum += map[s.charAt(len - 1) - 'A'];

        return sum;
    }
}
