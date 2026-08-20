class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int Rcount = 0, Lcount = 0;
        int n  = s.length();
        int i=0;
        while(i<n) {
            char ch = s.charAt(i);
            if(ch == 'R') Rcount++;

            if(ch == 'L') Lcount++;

            if(Rcount == Lcount) {
                count++;
                Rcount=0;
                Lcount=0;
            }
            i++;

        }
        return count;
    }
}