class Solution {
    public int[] arrayRankTransform(int[] arr) 
    {
      int rank=1;
      int[] dup=arr.clone();
      int[] res=new int[arr.length];
      Arrays.sort(dup);
      HashSet<Integer> set=new HashSet<>();
      Map<Integer,Integer> map=new HashMap<>();
      for(int curr:dup)
      {
        if(!set.contains(curr))
        {
            set.add(curr);
            map.put(curr,rank);
            rank++;
        }
      }
      int idx=0;
      for(int curr:arr)
      {
          res[idx++]=map.get(curr);
      }
      return res;
    }
}