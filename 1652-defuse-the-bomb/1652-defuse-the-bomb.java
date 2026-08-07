class Solution {
    public int[] decrypt(int[] code, int k) 
    {
        int n=code.length;
        int[] res=new int[n];
        int c=0;
        if(k==0)
        {
            return res;
        }
        if(k>0)
        {
            for(int i=0;i<n;i++)
            {
               c=0; 
               for(int j=1;j<=k;j++)
               {

                c+=code[(i+j)%n];
               }
               res[i]=c;
            }
        }
        if(k<0)
        {
            k=-k;
             for(int i=0;i<n;i++)
            {
               c=0; 
               for(int j=1;j<=k;j++)
               {

                c+=code[(i-j+n)%n];
               }
               res[i]=c;
            }
        }
        
        return res;
    }
}