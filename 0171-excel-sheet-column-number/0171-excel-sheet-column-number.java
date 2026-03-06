class Solution {
    public int titleToNumber(String columnTitle)
    {
        int c=0;
        for(char k:columnTitle.toCharArray())
        {
            int r=k-'A'+1;
            c=c*26+r;
        }
        return c;
        
    }
}