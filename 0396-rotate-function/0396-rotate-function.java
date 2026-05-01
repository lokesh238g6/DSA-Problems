class Solution {
    public int maxRotateFunction(int[] nums) 
    {
       int sum=0;
       int f=0;
       int n=nums.length;
       for(int i=0;i<n;i++)
       {
        sum+=nums[i];
        f+=i*nums[i];
       } 
       int ans=f;
       for(int k=1;k<n;k++)
       {
        f=f+sum-n*nums[n-k];
        ans=Math.max(ans,f);
       }
       
       return ans;
    }
}