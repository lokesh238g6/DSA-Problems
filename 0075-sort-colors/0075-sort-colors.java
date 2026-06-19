class Solution {
    public void sortColors(int[] nums)
    {
        int c1=0;
        int c2=0;
        int c3=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                c1++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                 c2++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==2)
            {
                 c3++;
            }
        }
     
     int k=0;
     for(int i=0;i<c1;i++)
     {
         nums[k++]=0;
     }
     for(int i=0;i<c2;i++)
     {
        nums[k++]=1;
     }
          for(int i=0;i<c3;i++)
     {
        nums[k++]=2;
     }
    }
}