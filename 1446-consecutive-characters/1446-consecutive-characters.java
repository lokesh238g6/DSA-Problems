class Solution {
    public int maxPower(String s) 
    {
        char[] n=s.toCharArray();
        int c=1;
        int m=1;
        for(int i=1;i<n.length;i++)
        {
            if(n[i]==n[i-1])
            {
                c++;
                m=Math.max(c,m);
            }
            else
            {
                c=1;
            }
        }
        return m;
    }
}