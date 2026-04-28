class Solution {
    public boolean canJump(int[] nums) 
    {
        int j=0;
        for(int n :nums)
        {
            if(j<0)
            {
                 return false;
            }
            else if(n>j)
            {
                j=n;
            }
        j-=1;
        }
      return true;
    }
}