class Solution {
    public int eraseOverlapIntervals(int[][] intervals)
    {
     int c=0;
     int prev=Integer.MIN_VALUE;
     Arrays.sort(intervals,(a,b)->a[1]-b[1]);
     for(int [] num:intervals)
     {
        if(prev>num[0])
        {
            c++;
        }
        else
        {
            prev=num[1];
        }
     }
     return c;   

    }
}