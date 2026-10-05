class Solution {
    public int scoreOfParentheses(String s) 
    {
        int n=s.length();
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                 stack.push(0);   
            }
            else
            {
                int c=stack.pop();
                if(c==0)
                {
                   c=1;
                }
                else
                {
                    c=2*c;
                }
                int previous=stack.pop();
                stack.push(previous+c);       
            }
        }
      return stack.pop();
    }
}