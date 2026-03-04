class Solution {
    public int minCost(int n) 
    {int cost=0;
        while(n>0)
        {
            cost+=n-1;
            n--;
        }
        return cost;
    }
}