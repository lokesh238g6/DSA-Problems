class Solution {
    public int totalFruit(int[] nums)
    {
        int l=0;
        int res=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<nums.length;r++)
        {
            int num=nums[r];
            map.put(num,map.getOrDefault(nums[r],0)+1);
            while(map.size()>2)
            {
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)
                {
                    map.remove(nums[l]);
                }
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
        
        
    }
}