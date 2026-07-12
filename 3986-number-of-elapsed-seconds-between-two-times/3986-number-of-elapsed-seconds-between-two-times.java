class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) 
    {
        String[] st=startTime.split(":");
        String[] et=endTime.split(":");
        
        int res=Integer.parseInt(st[0])*3600 
        + Integer.parseInt(st[1])*60 
        + Integer.parseInt(st[2]);

        int res1=Integer.parseInt(et[0])*3600 
         +Integer.parseInt(et[1])*60 
         +Integer.parseInt(et[2]);

        return Math.abs(res-res1);

        
        


    }
}