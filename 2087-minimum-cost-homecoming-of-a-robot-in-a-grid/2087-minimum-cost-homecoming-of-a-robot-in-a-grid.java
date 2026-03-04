class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
         return dfs(startPos[0],startPos[1],homePos,rowCosts,colCosts);
        
       }
       public int dfs(int r,int c,int[] home,int[] rowCosts,int[] colCosts)
       {
        if(r==home[0] && c==home[1])
        {
            return 0;
        }
        if(r<home[0])
        {
            return rowCosts[r+1]+dfs(r+1,c,home,rowCosts,colCosts);
        }
        if(r>home[0])
        {
            return rowCosts[r-1]+dfs(r-1,c,home,rowCosts,colCosts);
        }
        if(c<home[1])
        {
           return colCosts[c+1]+dfs(r,c+1,home,rowCosts,colCosts); 
        }
                if(c>home[1])
        {
           return colCosts[c-1]+dfs(r,c-1,home,rowCosts,colCosts); 
        }
        return 0;

       }
}