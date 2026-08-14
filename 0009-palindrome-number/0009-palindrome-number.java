class Solution {
    public boolean isPalindrome(int x) 
    {
        char[] arr=String.valueOf(x).toCharArray(); 
       int l=0;
       int r=arr.length-1;
      
       while(l<r)
       {
          if(arr[l]==arr[r])
          {
            l++;
            r--;
          }
          else
          {
            return false;
          }
       }
       return true;
    }
}