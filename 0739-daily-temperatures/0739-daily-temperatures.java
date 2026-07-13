class Solution {
    public int[] dailyTemperatures(int[] nums)
    {
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            while( !stack.isEmpty()  && nums[i]>nums[stack.peek()] )
            {
            
              int d=stack.pop();
              res[d]=i-d;
            }
            stack.push(i);
        }
        return res;
    }
}