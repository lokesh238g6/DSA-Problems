class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) 
    {
        int n=arr.length;
        int r = 0;
        int l = n-1;
        while(l-r>=k)
        {
            if(Math.abs(arr[r]-x)>Math.abs(arr[l]-x))
            {
                r++;
            }
            else
            {
                l--;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=r;i<=l;i++)
        {
            list.add(arr[i]);
        }
        return list;
    }
}