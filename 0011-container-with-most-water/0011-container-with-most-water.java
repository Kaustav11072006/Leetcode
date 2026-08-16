class Solution {
    public int maxArea(int[] height) {
        int area=0, l = 0, r = height.length - 1,h=0;
        while(l<r){
            area = Math.max(area,(r-l)*(Math.min(height[l],height[r])));
            if(height[l]<height[r]) l++;
            else r--;
        }
        return area;
    }
}