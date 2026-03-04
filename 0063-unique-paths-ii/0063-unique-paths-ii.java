class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) 

    {
      int m=obstacleGrid.length;
      int n=obstacleGrid[0].length;
      int count=0;
      int[][] dp=new int[m][n];
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
            dp[i][j]=-1;
        }
      }
       count+= dfs(obstacleGrid,0,0,dp);
       return count;
        
    }
    public int dfs(int [][]obstacleGrid,int r,int c,int[][] dp)
    {
         int rows=obstacleGrid.length;
      int cols=obstacleGrid[0].length;
        if(r>=rows || c>=cols|| obstacleGrid[r][c]==1)
        {
            return 0;
        }
         if(r==rows-1  && c==cols-1)
         {
            return 1;
         }
         if(dp[r][c]!=-1)
         {
            return dp[r][c];
         }
       int d=  dfs(obstacleGrid,r+1,c,dp);
         int l=dfs(obstacleGrid,r,c+1,dp);
         dp[r][c]=l+d;
         return dp[r][c];


    }
}