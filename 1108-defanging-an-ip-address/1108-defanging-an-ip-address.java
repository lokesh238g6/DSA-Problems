class Solution {
    public String defangIPaddr(String address)
    {
      StringBuilder s=new StringBuilder();
      for(char k:address.toCharArray())
      {
        if(k=='.')
        {
            s.append("[.]");
        }
        else
        {
            s.append(k);
        }
      }  
      return s.toString();
    }
}