class Solution:
    def isPalindrome(self, x: int) -> bool:
        y=0
        k=x
        if x<0:
            return False
        while x>0:
            y=y*10+x%10
            x=x//10
        return k==y
        
        

            
             
        