class Solution:
    def findLengthOfLCIS(self, nums: List[int]) -> int:
        m=0
        count=0
        for i in range(len(nums)-1):
            if nums[i]<nums[i+1]:
                count+=1
                m=max(m,count)
            else:
                count=0
        return m+1
        