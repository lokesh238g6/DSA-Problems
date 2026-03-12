class Solution {
    public int numIslands(char[][] grid) 
    {
        if(grid==null || grid.length==0)
        {
            return 0;
        }
        int c=0;
        for(int k=0;k<grid.length;k++)
        {
            for(int m=0;m<grid[0].length;m++)
            {
                if(grid[k][m]=='1')
                {
                 c++;
                 dfs(grid,k,m);
                }
            }
        }
        return c;
        
        
    }
    public void dfs(char[][] grid,int i,int j)
    {
                if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]!='1')
                {
                    return;
                }
                grid[i][j]='0';
                dfs(grid,i+1,j);
                dfs(grid,i-1,j);
                dfs(grid,i,j+1);
                dfs(grid,i,j-1);
            }
        
    
}