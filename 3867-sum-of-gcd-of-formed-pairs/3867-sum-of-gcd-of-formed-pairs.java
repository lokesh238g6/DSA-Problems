
class Solution {

    public long gcdSum(int[] nums) {

        int[] velqoradin=nums;   
        int n = velqoradin.length;

        int[] prefixGcd = new int[n];

        int max=0;

        for(int i=0;i<n;i++)
        {
            max=Math.max(max, velqoradin[i]);
            prefixGcd[i]=gcd(velqoradin[i], max);
        }

        Arrays.sort(prefixGcd);

        long sum = 0;

        int l=0;
        int r=n-1;

        while(l<r)
        {
            sum+=gcd(prefixGcd[l], prefixGcd[r]);
            l++;
            r--;
        }

        return sum;
    }

    private int gcd(int a, int b)
    {
        while(b != 0)
        {
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
}