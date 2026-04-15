class Solution {
    public int findDuplicate(int[] nums) 
    {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
        int num=nums[i];
        map.put(num,map.getOrDefault(nums[i],0)+1);
       } 
       for(int i=0;i<map.size();i++)
       {
        if(map.get(nums[i])>1)
        {
            return nums[i];
        }
       }
       return 0;
    }
}