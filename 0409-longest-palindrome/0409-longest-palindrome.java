class Solution {
    public int longestPalindrome(String s) 
    {
        int c=0;
        HashSet<Character> map=new HashSet<>();
        for(char k:s.toCharArray())
        {
            if(map.contains(k))
            {
                map.remove(k);
                c+=2;

            }
            else
            {
                map.add(k);
            }
        }
        if(!map.isEmpty())
        {
            c+=1;
        }
        return c;
    }
}
