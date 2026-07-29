import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        // Step 1: Create the Roman numeral value map
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        int i = 0;

        while (i < s.length()) {
            char currChar = s.charAt(i);
            int currVal = map.get(currChar);

            // Check for next character
            if (i + 1 < s.length()) {
                char nextChar = s.charAt(i + 1);
                int nextVal = map.get(nextChar);

                if (currVal < nextVal) {
                    sum += (nextVal - currVal);
                    i += 2; // Skip the next char (used already)
                    continue;
                }
            }

            // Regular case
            sum += currVal;
            i++;
        }

        return sum;
    }
}
