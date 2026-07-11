class Solution {
    public int[] leftRightDifference(int[] nums) 
    {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int val=0;
        int idx=0;
        for(int curr:nums)
        {
            left[idx++]=val;
            val+=curr;
        }
        int val1=0;
        int idx1=n-1;
        for(int i=n-1;i>=0;i--)
        {
            right[idx1--]=val1;
            val1+=nums[i];
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++)
        {
           res[i]=Math.abs(left[i]-right[i]);
        }
        return res;
            }
}