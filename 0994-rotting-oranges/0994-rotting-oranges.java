class Solution {
    public int orangesRotting(int[][] grid) 
    {
        if(grid==null || grid.length==0)
        {
            return 0;
        }
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    dfs(grid,i,j,2);
                    
                }
            }
        }
            int max=0;
            for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 )return -1;
                
                max=Math.max(max,grid[i][j]);

            }


           
        }
        if(max==0) return 0;
        return max-2;
    }
     public void dfs(int[][] grid,int i,int j,int min)
    {
        if(i<0 || i>=grid.length || j<0 ||j>=grid[0].length)
        {
            return;
        }
        if(grid[i][j]==0 )return;
        if(grid[i][j]>1 && grid[i][j]<min) return;
        grid[i][j]=min;
        dfs(grid,i+1,j,min+1);
        dfs(grid,i-1,j,min+1);
        dfs(grid,i,j+1,min+1);
        dfs(grid,i,j-1,min+1);

    }
}