class Solution {
    public int findMinArrowShots(int[][] points) 
    {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int a=1;
        int ap=points[0][1];
        for(int i=1;i<points.length;i++)
        {
            if(points[i][0]>ap)
            {
                a++;
                ap=points[i][1];
            }
        }
        return a;
    }
}