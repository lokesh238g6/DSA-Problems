class Solution {
    public int[] findDegrees(int[][] matrix) 
    {
       int  n=matrix.length;
       int  m=matrix[0].length;
        int[]  a=new int[n];
        for(int i=0;i<matrix.length;i++)
        {
            int d=0;
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[i][j]==1)
                {
                    d++;  
                }
            }
            a[i]=d;
        }
        return a;
    }
}