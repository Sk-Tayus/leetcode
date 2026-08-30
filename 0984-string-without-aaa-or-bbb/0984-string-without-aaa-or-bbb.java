class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int total = a+b;
        int acount = 0, bcount =0;
        for(int i=0;i<total;i++) {

            if(a > b) {
                if(acount < 2 && a > 0)
                {
                sb.append("a");
                a--;
                acount++;
                bcount = 0;
                }
                else if(a > 0 && b == 0) {
                    sb.append("a"); a--; acount++;
                    bcount=0;

                } 
                else {
                    sb.append("b"); b--; bcount++; acount = 0;
                }
                
            }
            else {
                if(bcount < 2 && b > 0)
                {
                sb.append("b");
                b--;
                bcount++;
                acount = 0;
                }
                else if(b > 0 && a == 0) {
                    sb.append("b"); b--; bcount++;
                    acount = 0;

                }  
                else {
                    sb.append("a"); a--; acount++; bcount = 0;
                }
            }
        }
        return sb.toString();
    }
}