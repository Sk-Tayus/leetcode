class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
         HashSet<String> set = new HashSet<>();
        //put all words in hashset
        for(String x : wordDict) {
            set.add(x);
        }

        int l = s.length();

        // FIX 1: size must be string length + 1, not wordDict.size()
        boolean[] dp = new boolean[l+1];

        // FIX 2: base case, empty prefix is valid
        dp[0] = true;

        // FIX 3: i must reach l (last position), start from 1
        for(int i=1; i<=l; i++) {

            // FIX 4: j goes from 0 to i-1, so j < i (before: j started at i+1, caused substring(1,0) crash)
            for(int j=0; j<i; j++) {

                // FIX 5: use substr here, substring(j,i) now valid since j < i
                String substr = s.substring(j,i);

                if ( (dp[j] == true) && set.contains(substr) ) {
                    dp[i] = true;
                    break; // optional, once true no need to check more j
                }
            }
        }

        // FIX 6: return dp[l], not dp[n]
        return dp[l];




        // |APPROACH|
        // for all psitiosn i --> check every previous j pos
                // take s.substring (j,i)
                    //if (dp[j] == true && set.contains(s.substring(j,i)))
                    //dp[i] = true;
        //return dp[n];   

    }
}