class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int lp=0,rp=n-1,maxWater=0;
        int width=0,ht=0,area=0;
        while( lp < rp) {
            width = rp-lp;
            ht = Math.min(height[lp], height[rp]);
            area = width*ht;
            maxWater = Math.max(maxWater, area);

            if(height[lp]<height[rp] ) lp++;
            else rp--;
        }
        return maxWater;
    }
}