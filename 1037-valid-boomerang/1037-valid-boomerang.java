class Solution {
    public boolean isBoomerang(int[][] nums) 
    {

       int x1=nums[0][0],y1=nums[0][1];
       int x2=nums[1][0],y2=nums[1][1];
       int x3=nums[2][0],y3=nums[2][1];
     return (x1 *(y2-y3)+x2*(y3-y1)+x3*(y1-y2))!=0;
    }
}