class Solution {
    public boolean isAnagram(String s, String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] k=s.toCharArray();
        char[] m=t.toCharArray();
        Arrays.sort(k);
        Arrays.sort(m);
        return Arrays.equals(k,m);
 
    }
}