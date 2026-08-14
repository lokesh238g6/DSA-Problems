class Solution {
    public List<Integer> intersection(int[][] nums)
    {

        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                int val=nums[i][j];
                map.put(val,map.getOrDefault(val,0)+1);
            }
        }
        for (int key : map.keySet())
        {
            if(map.get(key)==nums.length)
            {
                list.add(key);
            }
        }
        Collections.sort(list);

        return list;
    }
}