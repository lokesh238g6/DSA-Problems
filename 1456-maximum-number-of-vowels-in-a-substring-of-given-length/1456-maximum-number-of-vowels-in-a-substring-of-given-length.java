class Solution {
    public int maxVowels(String s, int k) 
    {
        
        int sum=0;
        int max=0;
        for(int i=0;i<k;i++)
        {
            if(isvowel(s.charAt(i)))
            {
             sum++;
            }

        }
        max=sum;
        for(int i=k;i<s.length();i++)
        {
           if( isvowel(s.charAt(i-k)))
           {
                    sum--;
           }
           if(isvowel(s.charAt(i)))
           {
            sum++;
           }
           max=Math.max(sum,max);
           
        }
    
        return max;
    }
    private boolean isvowel(char ch)
    {
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
          {
            return true;
          }
          return false;
    }
}