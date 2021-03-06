class Solution {
    public int maxArea(int[] height) {
        
        int ans=0;
        
        int l=0,r=height.length-1;
        
        
        while(l<r)
        {
             ans=Math.max(ans,(r-l)*Math.min(height[r],height[l]));
            if(height[r]<height[l])
            {
                r--;
            }
            else
                l++;
        }
        
        return ans;
    }
}