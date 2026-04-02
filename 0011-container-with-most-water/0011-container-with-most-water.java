class Solution {
    public int maxArea(int[] height) 
    {
        int n=height.length;
        int i=0;
        int j=n-1;
        int max_area=0;
        while(i<j)
        {
            int w=j-i;
            int min_height=Math.min(height[i],height[j]);
            int ca=w*min_height;
            if(ca>max_area)
            {
                max_area=ca;
            }
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return max_area;
        
        
    }
}