class Solution {
    public int[] twoSum(int[] nums, int target)
    {
       int n=nums.length;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++)
       {
        int num=nums[i];
        int moreneeded=target-num;
        if(map.containsKey(moreneeded))
        {
            return new int[]{map.get(moreneeded),i};
        }
        map.put(nums[i],i);
    }
    return new int[] {-1,-1};

    }
}