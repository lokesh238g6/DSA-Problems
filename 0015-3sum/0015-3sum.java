class Solution {
    public List<List<Integer>> threeSum(int[] nums)
     {
        int n=nums.length;
        Set<List<Integer>> result=new HashSet<>();
        for (int i=0;i<n;i++)
        {
            Set<Integer> ans=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int t=-(nums[i]+nums[j]);
                if(ans.contains(t))
                {
                    List<Integer> tr= Arrays.asList(nums[i],nums[j],t);
                    Collections.sort(tr);
                    result.add(tr);
                }
                ans.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
        
    }
}