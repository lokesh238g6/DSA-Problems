class Solution {
    public int missingMultiple(int[] nums, int k)
     {
        HashSet<Integer> set=new HashSet<>();
        for(int ch:nums)
        {
            set.add(ch);
        }
            int res=k;
            while(set.contains(res))
            {
                res+=k;
            } 
        return res;
    }
}