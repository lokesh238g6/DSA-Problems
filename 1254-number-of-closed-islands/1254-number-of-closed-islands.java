class Solution {
    public int closedIsland(int[][] grid)
     {
        if(grid==null|| grid.length==0)
        {
            return 0;
        }
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++)
        {
            dfs(grid,i,0);
            dfs(grid,i,c-1);
        }
            for(int j=0;j<c;j++)
        {
            dfs(grid,0,j);
            dfs(grid,r-1,j);
        }
        int k=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                {
                    k++;
                    dfs(grid,i,j);
                }
            }
        }
        return k;
        
    }
    public void dfs(int[][] grid,int i,int j)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!=0)
        {
            return ;
        }

        grid[i][j]=-1;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);

    }
}