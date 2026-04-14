class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
          list1.add(nums[i]);
        }
        for(int i=n;i<nums.length;i++)
        {
            list2.add(nums[i]);
        }
        int curr=0;
        for(int i=0;i<list1.size();i++)
        {
            nums[curr]=list1.get(i);
            curr++;
            nums[curr]=list2.get(i);
            curr++;
        }

return nums;

    }
}