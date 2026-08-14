class Solution 
{
    public int missingNumber(int[] nums)
     {
        int n=nums.length;
        int sum=0;
        for(int num:nums)
        {
            sum+=num;
        }
        int k=n*(n+1)/2;
        return Math.abs(sum-k);
     }
}
        
    
