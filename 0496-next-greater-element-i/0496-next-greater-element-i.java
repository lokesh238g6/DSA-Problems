class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
         Stack<Integer> s=new Stack<>();
         Map<Integer,Integer> map=new HashMap<>();
         for(int num:nums2)
         {
            while(!(s.isEmpty()) && s.peek()<num)
            {
                map.put(s.pop(),num);
            }
            s.push(num);
         }    
         int[] a=new int[nums1.length];  
         for(int i=0;i<nums1.length;i++)
         {
              a[i]=map.getOrDefault(nums1[i],-1);
         }
         return a;
    }
}