class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    { int left=0;
       int crv=0;
       int minl=Integer.MAX_VALUE;
      for(int right=0;right<nums.length;right++)
      {
        crv+=nums[right];
      
      while(crv>=target)
      {
       minl=Math.min(minl,right-left+1);
        crv-=nums[left];
        left++;
      }
      }
      return (minl==Integer.MAX_VALUE) ? 0 : minl;
        
    }
}