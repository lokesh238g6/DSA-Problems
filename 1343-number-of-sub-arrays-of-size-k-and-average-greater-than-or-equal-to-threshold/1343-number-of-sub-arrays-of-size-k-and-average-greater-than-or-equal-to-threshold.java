class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold)
     {
        int ws=0;
        int ms=0;
         int c=0;
         List<Integer> list=new ArrayList<>();
        for (int i=0;i<k;i++)
        {
            ws+=arr[i];
        }
        ms=ws/k;
        list.add(ms);
        for(int i=k;i<arr.length;i++)
        {
            ws+=arr[i]-arr[i-k];
            ms=ws/k;
            list.add(ms);

        }
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>=threshold)
        {
           c++;
        }
        }
        return c;
        
    }
}