class Solution 
{
    public boolean isValid(String s) 
    {
        
       Stack<Character> stack=new Stack<>();
        
       for(int i=0;i<s.length();i++)
       {
        char k=s.charAt(i);
        if(k=='(' || k=='[' || k=='{')
        {
            stack.push(k);
        }
        else
        {
            if(stack.isEmpty())
            {
                return false;
            }

            char top=stack.pop();
            if(k==')' && top!='(' || k==']' && top!='[' || k=='}' && top!='{')
            {
                return false;
            }
        }
           
       }
       return stack.isEmpty();

    }
}