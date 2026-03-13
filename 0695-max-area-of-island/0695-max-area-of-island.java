class Solution {
    public int maxAreaOfIsland(int[][] grid) 
    {
        if(grid==null||grid.length==0)
        {
            return 0;
        }
        int m=0;
        
        int a=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    
                 a= dfs(grid,i,j);
                   
                    
                }
                 m=Math.max(m,a);

            }


        }
        return m;
    }
    public int dfs(int[][] grid,int i,int j)
    {
        
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!=1)
        {
            return 0;

        }
        
       int c= grid[i][j];
        grid[i][j]=0;
        c+= dfs(grid,i+1,j);
        c+= dfs(grid,i-1,j);
        c+=dfs(grid,i,j+1);
        c+=dfs(grid,i,j-1);
    
    return c;
    }
  
}