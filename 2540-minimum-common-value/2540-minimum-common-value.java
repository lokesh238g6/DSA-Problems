class Solution {
    public int getCommon(int[] nums1, int[] nums2) 
    {
       Set<Integer> set=new HashSet<>();
       for(int n:nums1)
       {
        set.add(n);
       }
       for(int n1:nums2)
       {
        if(set.contains(n1)) return n1;
       }
       return -1;
    }
}