class Solution {
    public double findMaxAverage(int[] nums, int k)
    {
       int ws=0;
        double maxsum=0;
       for(int i=0;i<k;i++)
       {
        ws+=nums[i];
       } 
       maxsum=ws;
       for(int i=k;i<nums.length;i++)
       {
        ws+=nums[i]-nums[i-k];
        maxsum=Math.max(ws,maxsum);
       }
       return maxsum/k;

    }
}