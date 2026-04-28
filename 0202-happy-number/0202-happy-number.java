class Solution {
    public boolean isHappy(int n) 
    {    
        Set<Integer> set=new HashSet<>();
        while ( !set.contains(n)) 
        {
            set.add(n);
            n=getnext(n);
        }
        return n==1;
    }
     public int getnext(int n)
     {
        int res=0;
        while(n>0)
        {
          int k=n%10;
          res+=k*k;
          n=n/10;
        }
        
        return res;
    }
    
}