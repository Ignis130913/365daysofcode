//Question:https://leetcode.com/problems/container-with-most-water/description/
class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int m=0;
        while(l<r){
            int c=Math.min(height[l],height[r])*(r-l);
            m=Math.max(m,c);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return m;
    }
}