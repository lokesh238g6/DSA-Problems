class Solution 
{
    List<String> list=new ArrayList<>();
    public List<String> generateParenthesis(int n) 
    {
        
        StringBuilder sb=new StringBuilder();
        backtrack(sb,0,0,n);
        return list;  
    }
    public void  backtrack(StringBuilder sb,int open,int close,int n)
    {
        if(sb.length()==2*n)
        {
            list.add(sb.toString());
            return;
        }
        if(open<n)
        {
            sb.append('(');
            backtrack(sb,open+1,close,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open)
        {
            sb.append(')');
            backtrack(sb,open,close+1,n);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}