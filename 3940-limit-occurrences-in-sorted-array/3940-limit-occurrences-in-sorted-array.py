class Solution:
    def limitOccurrences(self, nums, k):
        freq={}
        result=[]
        for num in nums:
            count=freq.get(num, 0)
            if count<k:
                result.append(num)
                freq[num]=count+1
        return result
        