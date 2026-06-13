class Solution:
    def reverseVowels(self, s: str) -> str:
        c=list(s)
        l=0
        r=len(c)-1;
        v="aeiouAEIOU"
        while(l<r):
            while(l<r and c[l] not in v):
                l+=1
            while(l<r and c[r] not in v):
                r-=1
            c[l],c[r]=c[r],c[l]
            l+=1
            r-=1

        return "".join(c)

        