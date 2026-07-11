class Solution {
    public int[] runningSum(int[] nums) 
    {
        int[] res=new int[nums.length];
        int idx = 0;
        int val=0;

        for(int curr:nums)
        { 
            val+=curr;
           res[idx++]=val;
        }
        return res;
    }
}