class Solution {
    public int calPoints(String[] nums)
    {
        
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums.length;i++)
        {   
            if(nums[i].equals("C"))
            {
            stack.pop();
            }
            else if(nums[i].equals("D"))
            {  
               stack.push(stack.peek()*2);
            }
            else if(nums[i].equals("+"))
            {
                int top=stack.pop();
                int nexttop=top+stack.peek();
                stack.push(top);
                stack.push(nexttop);
            }
            else
            {
                stack.push(Integer.parseInt(nums[i]));
            }
        }
        int total=0;
        for(int s:stack)
        {
            total+=s;
        }
        return total;
    }
}